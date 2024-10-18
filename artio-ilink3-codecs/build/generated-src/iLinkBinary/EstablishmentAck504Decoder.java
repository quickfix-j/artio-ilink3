/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.DirectBuffer;
import org.agrona.sbe.*;


/**
 * EstablishmentAck
 */
@SuppressWarnings("all")
public final class EstablishmentAck504Decoder implements MessageDecoderFlyweight
{
    public static final int BLOCK_LENGTH = 38;
    public static final int TEMPLATE_ID = 504;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final EstablishmentAck504Decoder parentMessage = this;
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
        return "EstablishmentAck";
    }

    public DirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public EstablishmentAck504Decoder wrap(
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

    public EstablishmentAck504Decoder wrapAndApplyHeader(
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

    public EstablishmentAck504Decoder sbeRewind()
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
        return 8;
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
        return buffer.getLong(offset + 8, BYTE_ORDER);
    }


    public static int nextSeqNoId()
    {
        return 39013;
    }

    public static int nextSeqNoSinceVersion()
    {
        return 0;
    }

    public static int nextSeqNoEncodingOffset()
    {
        return 16;
    }

    public static int nextSeqNoEncodingLength()
    {
        return 4;
    }

    public static String nextSeqNoMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long nextSeqNoNullValue()
    {
        return 4294967295L;
    }

    public static long nextSeqNoMinValue()
    {
        return 0L;
    }

    public static long nextSeqNoMaxValue()
    {
        return 4294967294L;
    }

    public long nextSeqNo()
    {
        return (buffer.getInt(offset + 16, BYTE_ORDER) & 0xFFFF_FFFFL);
    }


    public static int previousSeqNoId()
    {
        return 39021;
    }

    public static int previousSeqNoSinceVersion()
    {
        return 0;
    }

    public static int previousSeqNoEncodingOffset()
    {
        return 20;
    }

    public static int previousSeqNoEncodingLength()
    {
        return 4;
    }

    public static String previousSeqNoMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long previousSeqNoNullValue()
    {
        return 4294967295L;
    }

    public static long previousSeqNoMinValue()
    {
        return 0L;
    }

    public static long previousSeqNoMaxValue()
    {
        return 4294967294L;
    }

    public long previousSeqNo()
    {
        return (buffer.getInt(offset + 20, BYTE_ORDER) & 0xFFFF_FFFFL);
    }


    public static int previousUUIDId()
    {
        return 39015;
    }

    public static int previousUUIDSinceVersion()
    {
        return 0;
    }

    public static int previousUUIDEncodingOffset()
    {
        return 24;
    }

    public static int previousUUIDEncodingLength()
    {
        return 8;
    }

    public static String previousUUIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long previousUUIDNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long previousUUIDMinValue()
    {
        return 0x0L;
    }

    public static long previousUUIDMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public long previousUUID()
    {
        return buffer.getLong(offset + 24, BYTE_ORDER);
    }


    public static int keepAliveIntervalId()
    {
        return 39014;
    }

    public static int keepAliveIntervalSinceVersion()
    {
        return 0;
    }

    public static int keepAliveIntervalEncodingOffset()
    {
        return 32;
    }

    public static int keepAliveIntervalEncodingLength()
    {
        return 2;
    }

    public static String keepAliveIntervalMetaAttribute(final MetaAttribute metaAttribute)
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

    public static int keepAliveIntervalNullValue()
    {
        return 65535;
    }

    public static int keepAliveIntervalMinValue()
    {
        return 0;
    }

    public static int keepAliveIntervalMaxValue()
    {
        return 65534;
    }

    public int keepAliveInterval()
    {
        return (buffer.getShort(offset + 32, BYTE_ORDER) & 0xFFFF);
    }


    public static int secretKeySecureIDExpirationId()
    {
        return 39022;
    }

    public static int secretKeySecureIDExpirationSinceVersion()
    {
        return 0;
    }

    public static int secretKeySecureIDExpirationEncodingOffset()
    {
        return 34;
    }

    public static int secretKeySecureIDExpirationEncodingLength()
    {
        return 2;
    }

    public static String secretKeySecureIDExpirationMetaAttribute(final MetaAttribute metaAttribute)
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

    public static int secretKeySecureIDExpirationNullValue()
    {
        return 65535;
    }

    public static int secretKeySecureIDExpirationMinValue()
    {
        return 0;
    }

    public static int secretKeySecureIDExpirationMaxValue()
    {
        return 65534;
    }

    public int secretKeySecureIDExpiration()
    {
        return (buffer.getShort(offset + 34, BYTE_ORDER) & 0xFFFF);
    }


    public static int faultToleranceIndicatorId()
    {
        return 39010;
    }

    public static int faultToleranceIndicatorSinceVersion()
    {
        return 0;
    }

    public static int faultToleranceIndicatorEncodingOffset()
    {
        return 36;
    }

    public static int faultToleranceIndicatorEncodingLength()
    {
        return 1;
    }

    public static String faultToleranceIndicatorMetaAttribute(final MetaAttribute metaAttribute)
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

    public short faultToleranceIndicatorRaw()
    {
        return ((short)(buffer.getByte(offset + 36) & 0xFF));
    }

    public FTI faultToleranceIndicator()
    {
        return FTI.get(((short)(buffer.getByte(offset + 36) & 0xFF)));
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
        return 37;
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

    public short splitMsgRaw()
    {
        return ((short)(buffer.getByte(offset + 37) & 0xFF));
    }

    public SplitMsg splitMsg()
    {
        return SplitMsg.get(((short)(buffer.getByte(offset + 37) & 0xFF)));
    }


    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        final EstablishmentAck504Decoder decoder = new EstablishmentAck504Decoder();
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
        builder.append("[EstablishmentAck504](sbeTemplateId=");
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
        builder.append("requestTimestamp=");
        builder.append(this.requestTimestamp());
        builder.append('|');
        builder.append("nextSeqNo=");
        builder.append(this.nextSeqNo());
        builder.append('|');
        builder.append("previousSeqNo=");
        builder.append(this.previousSeqNo());
        builder.append('|');
        builder.append("previousUUID=");
        builder.append(this.previousUUID());
        builder.append('|');
        builder.append("keepAliveInterval=");
        builder.append(this.keepAliveInterval());
        builder.append('|');
        builder.append("secretKeySecureIDExpiration=");
        builder.append(this.secretKeySecureIDExpiration());
        builder.append('|');
        builder.append("faultToleranceIndicator=");
        builder.append(this.faultToleranceIndicator());
        builder.append('|');
        builder.append("splitMsg=");
        builder.append(this.splitMsg());

        limit(originalLimit);

        return builder;
    }
    
    public EstablishmentAck504Decoder sbeSkip()
    {
        sbeRewind();

        return this;
    }
}
