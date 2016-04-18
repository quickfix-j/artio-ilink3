/*
 * Copyright 2015-2016 Real Logic Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.co.real_logic.fix_gateway.engine.logger;

import org.agrona.DirectBuffer;
import org.agrona.ErrorHandler;
import org.agrona.IoUtil;
import org.agrona.MutableDirectBuffer;
import org.agrona.collections.Long2ObjectCache;
import org.agrona.concurrent.AtomicBuffer;
import org.agrona.concurrent.UnsafeBuffer;
import uk.co.real_logic.fix_gateway.decoder.HeaderDecoder;
import uk.co.real_logic.fix_gateway.messages.*;
import uk.co.real_logic.fix_gateway.util.AsciiBuffer;
import uk.co.real_logic.fix_gateway.util.MutableAsciiBuffer;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.function.LongFunction;

/**
 * Builds an index of a composite key of session id and sequence number for a given stream.
 */
public class ReplayIndex implements Index
{

    static final int REPLAY_BUFFER_SIZE = 128 * 1024;

    static File logFile(final String logFileDir, final long fixSessionId, final int streamId)
    {
        return new File(String.format(logFileDir + File.separator + "replay-index-%d-%d", fixSessionId, streamId));
    }

    static UnsafeBuffer replayBuffer(final String logFileDir, final int streamId)
    {
        final String pathname = logFileDir + File.separator + "replay-positions-"  + streamId;
        return new UnsafeBuffer(LoggerUtil.map(new File(pathname), REPLAY_BUFFER_SIZE));
    }

    private final LongFunction<SessionIndex> newSessionIndex = SessionIndex::new;
    private final AsciiBuffer asciiBuffer = new MutableAsciiBuffer();
    private final MessageHeaderDecoder frameHeaderDecoder = new MessageHeaderDecoder();
    private final FixMessageDecoder messageFrame = new FixMessageDecoder();
    private final HeaderDecoder fixHeader = new HeaderDecoder();
    private final ReplayIndexRecordEncoder replayIndexRecord = new ReplayIndexRecordEncoder();
    private final MessageHeaderEncoder indexHeaderEncoder = new MessageHeaderEncoder();
    private final IndexedPositionWriter positionWriter;
    private final IndexedPositionReader positionReader;

    private final Long2ObjectCache<SessionIndex> sessionToIndex;

    private final String logFileDir;
    private final int requiredStreamId;
    private final int indexFileSize;
    private final BufferFactory bufferFactory;
    private final AtomicBuffer replayBuffer;

    public ReplayIndex(
        final String logFileDir,
        final int requiredStreamId,
        final int indexFileSize,
        final int cacheNumSets,
        final int cacheSetSize,
        final BufferFactory bufferFactory,
        final AtomicBuffer replayBuffer,
        final ErrorHandler errorHandler)
    {
        this.logFileDir = logFileDir;
        this.requiredStreamId = requiredStreamId;
        this.indexFileSize = indexFileSize;
        this.bufferFactory = bufferFactory;
        this.replayBuffer = replayBuffer;
        sessionToIndex = new Long2ObjectCache<>(cacheNumSets, cacheSetSize, SessionIndex::close);
        positionWriter = new IndexedPositionWriter(replayBuffer, errorHandler);
        positionReader = new IndexedPositionReader(replayBuffer);
    }

    public void indexRecord(final DirectBuffer srcBuffer,
                            final int srcOffset,
                            final int srcLength,
                            final int streamId,
                            final int aeronSessionId,
                            final long position)
    {
        int offset = srcOffset;
        frameHeaderDecoder.wrap(srcBuffer, offset);
        if (frameHeaderDecoder.templateId() == FixMessageEncoder.TEMPLATE_ID)
        {
            final int actingBlockLength = frameHeaderDecoder.blockLength();
            offset += frameHeaderDecoder.encodedLength();

            messageFrame.wrap(srcBuffer, offset, actingBlockLength, frameHeaderDecoder.version());

            offset += actingBlockLength + 2;

            asciiBuffer.wrap(srcBuffer);
            fixHeader.decode(asciiBuffer, offset, messageFrame.bodyLength());

            sessionToIndex
                .computeIfAbsent(messageFrame.session(), newSessionIndex)
                .onRecord(streamId, aeronSessionId, srcOffset, srcLength, position, fixHeader.msgSeqNum());
        }
    }

    public void close()
    {
        sessionToIndex.clear();
    }

    public void readLastPosition(final IndexedPositionConsumer consumer)
    {
        positionReader.readLastPosition(consumer);
    }

    private final class SessionIndex implements AutoCloseable
    {
        private final ByteBuffer wrappedBuffer;
        private final MutableDirectBuffer buffer;

        private int offset = indexHeaderEncoder.encodedLength();

        private SessionIndex(final long sessionId)
        {
            this.wrappedBuffer = bufferFactory.map(logFile(logFileDir, sessionId, requiredStreamId), indexFileSize);
            this.buffer = new UnsafeBuffer(wrappedBuffer);
            indexHeaderEncoder
                .wrap(buffer, 0)
                .blockLength(replayIndexRecord.sbeBlockLength())
                .templateId(replayIndexRecord.sbeTemplateId())
                .schemaId(replayIndexRecord.sbeSchemaId())
                .version(replayIndexRecord.sbeSchemaVersion());
        }

        void onRecord(final int streamId,
                      final int aeronSessionId,
                      final long offset,
                      final int length,
                      final long position,
                      final int sequenceNumber)
        {
            replayIndexRecord
                .wrap(buffer, this.offset)
                .streamId(streamId)
                .aeronSessionId(aeronSessionId)
                .position(offset)
                .sequenceNumber(sequenceNumber);

            positionWriter.indexedUpTo(aeronSessionId, position + length);
            positionWriter.updateChecksums();

            this.offset = replayIndexRecord.limit();
        }

        public void close()
        {
            IoUtil.unmap(wrappedBuffer);
            IoUtil.unmap(replayBuffer.byteBuffer());
        }
    }
}
