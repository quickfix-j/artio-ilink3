/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.MutableDirectBuffer;
import org.agrona.sbe.*;


/**
 * EstablishmentAck
 */
@SuppressWarnings("all")
public final class EstablishmentAck504Encoder implements MessageEncoderFlyweight
{
    public static final int BLOCK_LENGTH = 38;
    public static final int TEMPLATE_ID = 504;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final EstablishmentAck504Encoder parentMessage = this;
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
        return "EstablishmentAck";
    }

    public MutableDirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public EstablishmentAck504Encoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public EstablishmentAck504Encoder wrapAndApplyHeader(
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

    public EstablishmentAck504Encoder uUID(final long value)
    {
        buffer.putLong(offset + 0, value, BYTE_ORDER);
        return this;
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

    public EstablishmentAck504Encoder requestTimestamp(final long value)
    {
        buffer.putLong(offset + 8, value, BYTE_ORDER);
        return this;
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

    public EstablishmentAck504Encoder nextSeqNo(final long value)
    {
        buffer.putInt(offset + 16, (int)value, BYTE_ORDER);
        return this;
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

    public EstablishmentAck504Encoder previousSeqNo(final long value)
    {
        buffer.putInt(offset + 20, (int)value, BYTE_ORDER);
        return this;
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

    public EstablishmentAck504Encoder previousUUID(final long value)
    {
        buffer.putLong(offset + 24, value, BYTE_ORDER);
        return this;
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

    public EstablishmentAck504Encoder keepAliveInterval(final int value)
    {
        buffer.putShort(offset + 32, (short)value, BYTE_ORDER);
        return this;
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

    public EstablishmentAck504Encoder secretKeySecureIDExpiration(final int value)
    {
        buffer.putShort(offset + 34, (short)value, BYTE_ORDER);
        return this;
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

    public EstablishmentAck504Encoder faultToleranceIndicator(final FTI value)
    {
        buffer.putByte(offset + 36, (byte)value.value());
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

    public EstablishmentAck504Encoder splitMsg(final SplitMsg value)
    {
        buffer.putByte(offset + 37, (byte)value.value());
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

        final EstablishmentAck504Decoder decoder = new EstablishmentAck504Decoder();
        decoder.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return decoder.appendTo(builder);
    }
}
