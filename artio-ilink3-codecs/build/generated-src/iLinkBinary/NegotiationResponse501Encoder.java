/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;
import org.agrona.sbe.*;


/**
 * NegotiationResponse
 */
@SuppressWarnings("all")
public final class NegotiationResponse501Encoder implements MessageEncoderFlyweight
{
    public static final int BLOCK_LENGTH = 32;
    public static final int TEMPLATE_ID = 501;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final NegotiationResponse501Encoder parentMessage = this;
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
        return "NegotiationResponse";
    }

    public MutableDirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public NegotiationResponse501Encoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public NegotiationResponse501Encoder wrapAndApplyHeader(
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

    public static int serverFlowId()
    {
        return 39009;
    }

    public static int serverFlowSinceVersion()
    {
        return 0;
    }

    public static int serverFlowEncodingOffset()
    {
        return 0;
    }

    public static int serverFlowEncodingLength()
    {
        return 0;
    }

    public static String serverFlowMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "constant";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "String";
        }

        return "";
    }

    public static byte serverFlowNullValue()
    {
        return (byte)0;
    }

    public static byte serverFlowMinValue()
    {
        return (byte)32;
    }

    public static byte serverFlowMaxValue()
    {
        return (byte)126;
    }


    private static final byte[] SERVERFLOW_VALUE = { 82, 69, 67, 79, 86, 69, 82, 65, 66, 76, 69 };

    public static int serverFlowLength()
    {
        return 11;
    }


    public byte serverFlow(final int index)
    {
        return SERVERFLOW_VALUE[index];
    }

    public int getServerFlow(final byte[] dst, final int offset, final int length)
    {
        final int bytesCopied = Math.min(length, 11);
        System.arraycopy(SERVERFLOW_VALUE, 0, dst, offset, bytesCopied);

        return bytesCopied;
    }

    public String serverFlow()
    {
        return "RECOVERABLE";
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

    public NegotiationResponse501Encoder uUID(final long value)
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

    public NegotiationResponse501Encoder requestTimestamp(final long value)
    {
        buffer.putLong(offset + 8, value, BYTE_ORDER);
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
        return 16;
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

    public NegotiationResponse501Encoder secretKeySecureIDExpiration(final int value)
    {
        buffer.putShort(offset + 16, (short)value, BYTE_ORDER);
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
        return 18;
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

    public NegotiationResponse501Encoder faultToleranceIndicator(final FTI value)
    {
        buffer.putByte(offset + 18, (byte)value.value());
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
        return 19;
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

    public NegotiationResponse501Encoder splitMsg(final SplitMsg value)
    {
        buffer.putByte(offset + 19, (byte)value.value());
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

    public NegotiationResponse501Encoder previousSeqNo(final long value)
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

    public NegotiationResponse501Encoder previousUUID(final long value)
    {
        buffer.putLong(offset + 24, value, BYTE_ORDER);
        return this;
    }


    public static int credentialsId()
    {
        return 39008;
    }

    public static String credentialsCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public static String credentialsMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "data";
        }

        return "";
    }

    public static int credentialsHeaderLength()
    {
        return 2;
    }

    public NegotiationResponse501Encoder putCredentials(final DirectBuffer src, final int srcOffset, final int length)
    {
        if (length > 65534)
        {
            throw new IllegalStateException("length > maxValue for type: " + length);
        }

        final int headerLength = 2;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + headerLength + length);
        buffer.putShort(limit, (short)length, BYTE_ORDER);
        buffer.putBytes(limit + headerLength, src, srcOffset, length);

        return this;
    }

    public NegotiationResponse501Encoder putCredentials(final byte[] src, final int srcOffset, final int length)
    {
        if (length > 65534)
        {
            throw new IllegalStateException("length > maxValue for type: " + length);
        }

        final int headerLength = 2;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + headerLength + length);
        buffer.putShort(limit, (short)length, BYTE_ORDER);
        buffer.putBytes(limit + headerLength, src, srcOffset, length);

        return this;
    }

    public NegotiationResponse501Encoder credentials(final String value)
    {
        final int length = null == value ? 0 : value.length();
        if (length > 65534)
        {
            throw new IllegalStateException("length > maxValue for type: " + length);
        }

        final int headerLength = 2;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + headerLength + length);
        buffer.putShort(limit, (short)length, BYTE_ORDER);
        buffer.putStringWithoutLengthAscii(limit + headerLength, value);

        return this;
    }

    public NegotiationResponse501Encoder credentials(final CharSequence value)
    {
        final int length = null == value ? 0 : value.length();
        if (length > 65534)
        {
            throw new IllegalStateException("length > maxValue for type: " + length);
        }

        final int headerLength = 2;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + headerLength + length);
        buffer.putShort(limit, (short)length, BYTE_ORDER);
        buffer.putStringWithoutLengthAscii(limit + headerLength, value);

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

        final NegotiationResponse501Decoder decoder = new NegotiationResponse501Decoder();
        decoder.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return decoder.appendTo(builder);
    }
}
