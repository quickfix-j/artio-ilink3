/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.MutableDirectBuffer;
import org.agrona.sbe.*;


/**
 * NotApplied
 */
@SuppressWarnings("all")
public final class NotApplied513Encoder implements MessageEncoderFlyweight
{
    public static final int BLOCK_LENGTH = 17;
    public static final int TEMPLATE_ID = 513;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final NotApplied513Encoder parentMessage = this;
    private MutableDirectBuffer buffer;
    private int offset;
    private int limit;

    public int sbeBlockLength()
    {
        return BLOCK_LENGTH;
    }

    public int sbeTemplateId()
    {
        return TEMPLATE_ID;
    }

    public int sbeSchemaId()
    {
        return SCHEMA_ID;
    }

    public int sbeSchemaVersion()
    {
        return SCHEMA_VERSION;
    }

    public String sbeSemanticType()
    {
        return "NotApplied";
    }

    public MutableDirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public NotApplied513Encoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public NotApplied513Encoder wrapAndApplyHeader(
        final MutableDirectBuffer buffer, final int offset, final MessageHeaderEncoder headerEncoder)
    {
        headerEncoder
            .wrap(buffer, offset)
            .blockLength(BLOCK_LENGTH)
            .templateId(TEMPLATE_ID)
            .schemaId(SCHEMA_ID)
            .version(SCHEMA_VERSION);

        return wrap(buffer, offset + MessageHeaderEncoder.ENCODED_LENGTH);
    }

    public int encodedLength()
    {
        return limit - offset;
    }

    public int limit()
    {
        return limit;
    }

    public void limit(final int limit)
    {
        this.limit = limit;
    }

    public static int uUIDId()
    {
        return 39001;
    }

    public static int uUIDSinceVersion()
    {
        return 0;
    }

    public static int uUIDEncodingOffset()
    {
        return 0;
    }

    public static int uUIDEncodingLength()
    {
        return 8;
    }

    public static String uUIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "int";
        }

        return "";
    }

    public static long uUIDNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long uUIDMinValue()
    {
        return 0x0L;
    }

    public static long uUIDMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public NotApplied513Encoder uUID(final long value)
    {
        buffer.putLong(offset + 0, value, BYTE_ORDER);
        return this;
    }


    public static int fromSeqNoId()
    {
        return 39018;
    }

    public static int fromSeqNoSinceVersion()
    {
        return 0;
    }

    public static int fromSeqNoEncodingOffset()
    {
        return 8;
    }

    public static int fromSeqNoEncodingLength()
    {
        return 4;
    }

    public static String fromSeqNoMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "int";
        }

        return "";
    }

    public static long fromSeqNoNullValue()
    {
        return 4294967295L;
    }

    public static long fromSeqNoMinValue()
    {
        return 0L;
    }

    public static long fromSeqNoMaxValue()
    {
        return 4294967294L;
    }

    public NotApplied513Encoder fromSeqNo(final long value)
    {
        buffer.putInt(offset + 8, (int)value, BYTE_ORDER);
        return this;
    }


    public static int msgCountId()
    {
        return 39019;
    }

    public static int msgCountSinceVersion()
    {
        return 0;
    }

    public static int msgCountEncodingOffset()
    {
        return 12;
    }

    public static int msgCountEncodingLength()
    {
        return 4;
    }

    public static String msgCountMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "int";
        }

        return "";
    }

    public static long msgCountNullValue()
    {
        return 4294967295L;
    }

    public static long msgCountMinValue()
    {
        return 0L;
    }

    public static long msgCountMaxValue()
    {
        return 4294967294L;
    }

    public NotApplied513Encoder msgCount(final long value)
    {
        buffer.putInt(offset + 12, (int)value, BYTE_ORDER);
        return this;
    }


    public static int splitMsgId()
    {
        return 9553;
    }

    public static int splitMsgSinceVersion()
    {
        return 0;
    }

    public static int splitMsgEncodingOffset()
    {
        return 16;
    }

    public static int splitMsgEncodingLength()
    {
        return 1;
    }

    public static String splitMsgMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "int";
        }

        return "";
    }

    public NotApplied513Encoder splitMsg(final SplitMsg value)
    {
        buffer.putByte(offset + 16, (byte)value.value());
        return this;
    }

    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        return appendTo(new StringBuilder()).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        if (null == buffer)
        {
            return builder;
        }

        final NotApplied513Decoder decoder = new NotApplied513Decoder();
        decoder.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return decoder.appendTo(builder);
    }
}
