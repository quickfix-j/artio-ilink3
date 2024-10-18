/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.DirectBuffer;
import org.agrona.sbe.*;


/**
 * RetransmitRequest
 */
@SuppressWarnings("all")
public final class RetransmitRequest508Decoder implements MessageDecoderFlyweight
{
    public static final int BLOCK_LENGTH = 30;
    public static final int TEMPLATE_ID = 508;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final RetransmitRequest508Decoder parentMessage = this;
    private DirectBuffer buffer;
    private int offset;
    private int limit;
    int actingBlockLength;
    int actingVersion;

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
        return "RetransmitRequest";
    }

    public DirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public RetransmitRequest508Decoder wrap(
        final DirectBuffer buffer,
        final int offset,
        final int actingBlockLength,
        final int actingVersion)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        this.actingBlockLength = actingBlockLength;
        this.actingVersion = actingVersion;
        limit(offset + actingBlockLength);

        return this;
    }

    public RetransmitRequest508Decoder wrapAndApplyHeader(
        final DirectBuffer buffer,
        final int offset,
        final MessageHeaderDecoder headerDecoder)
    {
        headerDecoder.wrap(buffer, offset);

        final int templateId = headerDecoder.templateId();
        if (TEMPLATE_ID != templateId)
        {
            throw new IllegalStateException("Invalid TEMPLATE_ID: " + templateId);
        }

        return wrap(
            buffer,
            offset + MessageHeaderDecoder.ENCODED_LENGTH,
            headerDecoder.blockLength(),
            headerDecoder.version());
    }

    public RetransmitRequest508Decoder sbeRewind()
    {
        return wrap(buffer, offset, actingBlockLength, actingVersion);
    }

    public int sbeDecodedLength()
    {
        final int currentLimit = limit();
        sbeSkip();
        final int decodedLength = encodedLength();
        limit(currentLimit);

        return decodedLength;
    }

    public int actingVersion()
    {
        return actingVersion;
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

    public long uUID()
    {
        return buffer.getLong(offset + 0, BYTE_ORDER);
    }


    public static int lastUUIDId()
    {
        return 39017;
    }

    public static int lastUUIDSinceVersion()
    {
        return 0;
    }

    public static int lastUUIDEncodingOffset()
    {
        return 8;
    }

    public static int lastUUIDEncodingLength()
    {
        return 8;
    }

    public static String lastUUIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "int";
        }

        return "";
    }

    public static long lastUUIDNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long lastUUIDMinValue()
    {
        return 0x0L;
    }

    public static long lastUUIDMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public long lastUUID()
    {
        return buffer.getLong(offset + 8, BYTE_ORDER);
    }


    public static int requestTimestampId()
    {
        return 39002;
    }

    public static int requestTimestampSinceVersion()
    {
        return 0;
    }

    public static int requestTimestampEncodingOffset()
    {
        return 16;
    }

    public static int requestTimestampEncodingLength()
    {
        return 8;
    }

    public static String requestTimestampMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long requestTimestampNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long requestTimestampMinValue()
    {
        return 0x0L;
    }

    public static long requestTimestampMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public long requestTimestamp()
    {
        return buffer.getLong(offset + 16, BYTE_ORDER);
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
        return 24;
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

    public long fromSeqNo()
    {
        return (buffer.getInt(offset + 24, BYTE_ORDER) & 0xFFFF_FFFFL);
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
        return 28;
    }

    public static int msgCountEncodingLength()
    {
        return 2;
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

    public static int msgCountNullValue()
    {
        return 65535;
    }

    public static int msgCountMinValue()
    {
        return 0;
    }

    public static int msgCountMaxValue()
    {
        return 65534;
    }

    public int msgCount()
    {
        return (buffer.getShort(offset + 28, BYTE_ORDER) & 0xFFFF);
    }


    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        final RetransmitRequest508Decoder decoder = new RetransmitRequest508Decoder();
        decoder.wrap(buffer, offset, actingBlockLength, actingVersion);

        return decoder.appendTo(new StringBuilder()).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        if (null == buffer)
        {
            return builder;
        }

        final int originalLimit = limit();
        limit(offset + actingBlockLength);
        builder.append("[RetransmitRequest508](sbeTemplateId=");
        builder.append(TEMPLATE_ID);
        builder.append("|sbeSchemaId=");
        builder.append(SCHEMA_ID);
        builder.append("|sbeSchemaVersion=");
        if (parentMessage.actingVersion != SCHEMA_VERSION)
        {
            builder.append(parentMessage.actingVersion);
            builder.append('/');
        }
        builder.append(SCHEMA_VERSION);
        builder.append("|sbeBlockLength=");
        if (actingBlockLength != BLOCK_LENGTH)
        {
            builder.append(actingBlockLength);
            builder.append('/');
        }
        builder.append(BLOCK_LENGTH);
        builder.append("):");
        builder.append("uUID=");
        builder.append(this.uUID());
        builder.append('|');
        builder.append("lastUUID=");
        builder.append(this.lastUUID());
        builder.append('|');
        builder.append("requestTimestamp=");
        builder.append(this.requestTimestamp());
        builder.append('|');
        builder.append("fromSeqNo=");
        builder.append(this.fromSeqNo());
        builder.append('|');
        builder.append("msgCount=");
        builder.append(this.msgCount());

        limit(originalLimit);

        return builder;
    }
    
    public RetransmitRequest508Decoder sbeSkip()
    {
        sbeRewind();

        return this;
    }
}
