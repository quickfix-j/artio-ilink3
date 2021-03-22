/*
 * Copyright 2021 Monotonic Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.co.real_logic.artio.binary_entrypoint;

import b3.entrypoint.fixp.sbe.*;
import org.agrona.DirectBuffer;
import uk.co.real_logic.artio.fixp.AbstractFixPParser;
import uk.co.real_logic.artio.fixp.SimpleOpenFramingHeader;

import static uk.co.real_logic.artio.fixp.SimpleOpenFramingHeader.SOFH_LENGTH;

public class BinaryEntryPointParser extends AbstractFixPParser
{
    private final MessageHeaderDecoder header = new MessageHeaderDecoder();
    private final NegotiateDecoder negotiate = new NegotiateDecoder();
    private final EstablishDecoder establish = new EstablishDecoder();
    private final TerminateDecoder terminate = new TerminateDecoder();
    private final SequenceDecoder sequence = new SequenceDecoder();
    private final FinishedSendingDecoder finishedSending = new FinishedSendingDecoder();
    private final FinishedReceivingDecoder finishedReceiving = new FinishedReceivingDecoder();

    private final InternalBinaryEntrypointConnection handler;

    public BinaryEntryPointParser(final InternalBinaryEntrypointConnection handler)
    {
        this.handler = handler;
    }

    public int templateId(final DirectBuffer buffer, final int offset)
    {
        header.wrap(buffer, offset);
        return header.templateId();
    }

    public int blockLength(final DirectBuffer buffer, final int offset)
    {
        header.wrap(buffer, offset);
        return header.blockLength();
    }

    public int version(final DirectBuffer buffer, final int offset)
    {
        header.wrap(buffer, offset);
        return header.version();
    }

    public long onMessage(final DirectBuffer buffer, final int start)
    {
        int offset = start + SOFH_LENGTH;

        header.wrap(buffer, offset);
        final int templateId = header.templateId();
        final int blockLength = header.blockLength();
        final int version = header.version();

        offset += MessageHeaderDecoder.ENCODED_LENGTH;

        switch (templateId)
        {
            case NegotiateDecoder.TEMPLATE_ID:
                return onNegotiate(buffer, offset, blockLength, version);

            case EstablishDecoder.TEMPLATE_ID:
                return onEstablish(buffer, offset, blockLength, version);

            case TerminateDecoder.TEMPLATE_ID:
                return onTerminate(buffer, offset, blockLength, version);

            case SequenceDecoder.TEMPLATE_ID:
                return onSequence(buffer, offset, blockLength, version);

            case FinishedSendingDecoder.TEMPLATE_ID:
                return onFinishedSending(buffer, offset, blockLength, version);

            case FinishedReceivingDecoder.TEMPLATE_ID:
                return onFinishedReceiving(buffer, offset, blockLength, version);

            default:
            {
                final int sofhMessageSize = SimpleOpenFramingHeader.readSofhMessageSize(buffer, start);
                return handler.onMessage(buffer, offset, templateId, blockLength, version, sofhMessageSize);
            }
        }
    }

    private long onFinishedSending(
        final DirectBuffer buffer, final int offset, final int blockLength, final int version)
    {
        final FinishedSendingDecoder finishedSending = this.finishedSending;
        finishedSending.wrap(buffer, offset, blockLength, version);

        return handler.onFinishedSending(
            finishedSending.sessionID(),
            finishedSending.sessionVerID(),
            finishedSending.lastSeqNo());
    }

    private long onFinishedReceiving(
        final DirectBuffer buffer, final int offset, final int blockLength, final int version)
    {
        final FinishedReceivingDecoder finishedReceiving = this.finishedReceiving;
        finishedReceiving.wrap(buffer, offset, blockLength, version);

        return handler.onFinishedReceiving(
            finishedReceiving.sessionID(),
            finishedReceiving.sessionVerID());
    }

    private long onSequence(final DirectBuffer buffer, final int offset, final int blockLength, final int version)
    {
        sequence.wrap(buffer, offset, blockLength, version);

        return handler.onSequence(sequence.nextSeqNo());
    }

    private long onTerminate(final DirectBuffer buffer, final int offset, final int blockLength, final int version)
    {
        terminate.wrap(buffer, offset, blockLength, version);

        return handler.onTerminate(
            terminate.sessionID(),
            terminate.sessionVerID(),
            terminate.terminationCode());
    }

    private long onEstablish(final DirectBuffer buffer, final int offset, final int blockLength, final int version)
    {
        establish.wrap(buffer, offset, blockLength, version);

        return handler.onEstablish(
            establish.sessionID(),
            establish.sessionVerID(),
            establish.timestamp().time(),
            establish.keepAliveInterval().time(),
            establish.nextSeqNo(),
            establish.cancelOnDisconnectType(),
            establish.codTimeoutWindow().time());
    }

    private long onNegotiate(final DirectBuffer buffer, final int offset, final int blockLength, final int version)
    {
        negotiate.wrap(buffer, offset, blockLength, version);

        return handler.onNegotiate(
            negotiate.sessionID(),
            negotiate.sessionVerID(),
            negotiate.timestamp().time(),
            negotiate.enteringFirm(),
            negotiate.onbehalfFirm(),
            negotiate.senderLocation());
    }

    public BinaryEntryPointContext lookupIdentification(
        final DirectBuffer messageBuffer,
        final int messageOffset,
        final int messageLength)
    {
        int offset = messageOffset + SOFH_LENGTH;

        header.wrap(messageBuffer, offset);
        final int templateId = header.templateId();
        final int blockLength = header.blockLength();
        final int version = header.version();

        offset += MessageHeaderDecoder.ENCODED_LENGTH;

        switch (templateId)
        {
            case NegotiateDecoder.TEMPLATE_ID:
                negotiate.wrap(messageBuffer, offset, blockLength, version);
                return new BinaryEntryPointContext(
                    negotiate.sessionID(),
                    negotiate.sessionVerID(),
                    negotiate.timestamp().time(),
                    negotiate.enteringFirm(),
                    true);

            case EstablishDecoder.TEMPLATE_ID:
                establish.wrap(messageBuffer, offset, blockLength, version);
                return new BinaryEntryPointContext(
                    establish.sessionID(),
                    establish.sessionVerID(),
                    establish.timestamp().time(),
                    NegotiateDecoder.enteringFirmNullValue(),
                    false);
        }

        // TODO: deal with this scenario more politely
        throw new IllegalArgumentException("Template id: " + templateId + " isn't a negotiate or establish");
    }

    public long sessionId(final DirectBuffer buffer, final int start)
    {
        int offset = start + SOFH_LENGTH;

        header.wrap(buffer, offset);
        final int templateId = header.templateId();
        final int blockLength = header.blockLength();
        final int version = header.version();

        offset += MessageHeaderDecoder.ENCODED_LENGTH;

        switch (templateId)
        {
            case NegotiateDecoder.TEMPLATE_ID:
                negotiate.wrap(buffer, offset, blockLength, version);
                return negotiate.sessionID();

            case EstablishDecoder.TEMPLATE_ID:
                establish.wrap(buffer, offset, blockLength, version);
                return establish.sessionID();
        }

        throw new IllegalArgumentException("Template id: " + templateId + " isn't a negotiate or establish");
    }
}
