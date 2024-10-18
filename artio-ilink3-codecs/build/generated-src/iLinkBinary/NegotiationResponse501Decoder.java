/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;
import org.agrona.sbe.*;


/**
 * NegotiationResponse
 */
@SuppressWarnings("all")
public final class NegotiationResponse501Decoder implements MessageDecoderFlyweight
{
    public static final int BLOCK_LENGTH = 32;
    public static final int TEMPLATE_ID = 501;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final NegotiationResponse501Decoder parentMessage = this;
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
        return "NegotiationResponse";
    }

    public DirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public NegotiationResponse501Decoder wrap(
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

    public NegotiationResponse501Decoder wrapAndApplyHeader(
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

    public NegotiationResponse501Decoder sbeRewind()
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

    public int secretKeySecureIDExpiration()
    {
        return (buffer.getShort(offset + 16, BYTE_ORDER) & 0xFFFF);
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

    public short faultToleranceIndicatorRaw()
    {
        return ((short)(buffer.getByte(offset + 18) & 0xFF));
    }

    public FTI faultToleranceIndicator()
    {
        return FTI.get(((short)(buffer.getByte(offset + 18) & 0xFF)));
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

    public short splitMsgRaw()
    {
        return ((short)(buffer.getByte(offset + 19) & 0xFF));
    }

    public SplitMsg splitMsg()
    {
        return SplitMsg.get(((short)(buffer.getByte(offset + 19) & 0xFF)));
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


    public static int credentialsId()
    {
        return 39008;
    }

    public static int credentialsSinceVersion()
    {
        return 0;
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

    public int credentialsLength()
    {
        final int limit = parentMessage.limit();
        return (buffer.getShort(limit, BYTE_ORDER) & 0xFFFF);
    }

    public int skipCredentials()
    {
        final int headerLength = 2;
        final int limit = parentMessage.limit();
        final int dataLength = (buffer.getShort(limit, BYTE_ORDER) & 0xFFFF);
        final int dataOffset = limit + headerLength;
        parentMessage.limit(dataOffset + dataLength);

        return dataLength;
    }

    public int getCredentials(final MutableDirectBuffer dst, final int dstOffset, final int length)
    {
        final int headerLength = 2;
        final int limit = parentMessage.limit();
        final int dataLength = (buffer.getShort(limit, BYTE_ORDER) & 0xFFFF);
        final int bytesCopied = Math.min(length, dataLength);
        parentMessage.limit(limit + headerLength + dataLength);
        buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

        return bytesCopied;
    }

    public int getCredentials(final byte[] dst, final int dstOffset, final int length)
    {
        final int headerLength = 2;
        final int limit = parentMessage.limit();
        final int dataLength = (buffer.getShort(limit, BYTE_ORDER) & 0xFFFF);
        final int bytesCopied = Math.min(length, dataLength);
        parentMessage.limit(limit + headerLength + dataLength);
        buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

        return bytesCopied;
    }

    public void wrapCredentials(final DirectBuffer wrapBuffer)
    {
        final int headerLength = 2;
        final int limit = parentMessage.limit();
        final int dataLength = (buffer.getShort(limit, BYTE_ORDER) & 0xFFFF);
        parentMessage.limit(limit + headerLength + dataLength);
        wrapBuffer.wrap(buffer, limit + headerLength, dataLength);
    }

    public String credentials()
    {
        final int headerLength = 2;
        final int limit = parentMessage.limit();
        final int dataLength = (buffer.getShort(limit, BYTE_ORDER) & 0xFFFF);
        parentMessage.limit(limit + headerLength + dataLength);

        if (0 == dataLength)
        {
            return "";
        }

        final byte[] tmp = new byte[dataLength];
        buffer.getBytes(limit + headerLength, tmp, 0, dataLength);

        return new String(tmp, java.nio.charset.StandardCharsets.US_ASCII);
    }

    public int getCredentials(final Appendable appendable)
    {
        final int headerLength = 2;
        final int limit = parentMessage.limit();
        final int dataLength = (buffer.getShort(limit, BYTE_ORDER) & 0xFFFF);
        final int dataOffset = limit + headerLength;

        parentMessage.limit(dataOffset + dataLength);
        buffer.getStringWithoutLengthAscii(dataOffset, dataLength, appendable);

        return dataLength;
    }

    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        final NegotiationResponse501Decoder decoder = new NegotiationResponse501Decoder();
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
        builder.append("[NegotiationResponse501](sbeTemplateId=");
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
        builder.append("secretKeySecureIDExpiration=");
        builder.append(this.secretKeySecureIDExpiration());
        builder.append('|');
        builder.append("faultToleranceIndicator=");
        builder.append(this.faultToleranceIndicator());
        builder.append('|');
        builder.append("splitMsg=");
        builder.append(this.splitMsg());
        builder.append('|');
        builder.append("previousSeqNo=");
        builder.append(this.previousSeqNo());
        builder.append('|');
        builder.append("previousUUID=");
        builder.append(this.previousUUID());
        builder.append('|');
        builder.append("credentials=");
        builder.append('\'');
        getCredentials(builder);
        builder.append('\'');

        limit(originalLimit);

        return builder;
    }
    
    public NegotiationResponse501Decoder sbeSkip()
    {
        sbeRewind();
        skipCredentials();

        return this;
    }
}
