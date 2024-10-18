/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.MutableDirectBuffer;
import org.agrona.sbe.*;


/**
 * EstablishmentReject
 */
@SuppressWarnings("all")
public final class EstablishmentReject505Encoder implements MessageEncoderFlyweight
{
    public static final int BLOCK_LENGTH = 72;
    public static final int TEMPLATE_ID = 505;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final EstablishmentReject505Encoder parentMessage = this;
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
        return "EstablishmentReject";
    }

    public MutableDirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public EstablishmentReject505Encoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public EstablishmentReject505Encoder wrapAndApplyHeader(
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

    public static int reasonId()
    {
        return 39011;
    }

    public static int reasonSinceVersion()
    {
        return 0;
    }

    public static int reasonEncodingOffset()
    {
        return 0;
    }

    public static int reasonEncodingLength()
    {
        return 48;
    }

    public static String reasonMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "String";
        }

        return "";
    }

    public static byte reasonNullValue()
    {
        return (byte)0;
    }

    public static byte reasonMinValue()
    {
        return (byte)32;
    }

    public static byte reasonMaxValue()
    {
        return (byte)126;
    }

    public static int reasonLength()
    {
        return 48;
    }


    public EstablishmentReject505Encoder reason(final int index, final byte value)
    {
        if (index < 0 || index >= 48)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 0 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String reasonCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public EstablishmentReject505Encoder putReason(final byte[] src, final int srcOffset)
    {
        final int length = 48;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 0, src, srcOffset, length);

        return this;
    }

    public EstablishmentReject505Encoder reason(final String src)
    {
        final int length = 48;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 0, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 0 + start, (byte)0);
        }

        return this;
    }

    public EstablishmentReject505Encoder reason(final CharSequence src)
    {
        final int length = 48;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 0, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 0 + start, (byte)0);
        }

        return this;
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
        return 48;
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

    public EstablishmentReject505Encoder uUID(final long value)
    {
        buffer.putLong(offset + 48, value, BYTE_ORDER);
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
        return 56;
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

    public EstablishmentReject505Encoder requestTimestamp(final long value)
    {
        buffer.putLong(offset + 56, value, BYTE_ORDER);
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
        return 64;
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

    public EstablishmentReject505Encoder nextSeqNo(final long value)
    {
        buffer.putInt(offset + 64, (int)value, BYTE_ORDER);
        return this;
    }


    public static int errorCodesId()
    {
        return 39012;
    }

    public static int errorCodesSinceVersion()
    {
        return 0;
    }

    public static int errorCodesEncodingOffset()
    {
        return 68;
    }

    public static int errorCodesEncodingLength()
    {
        return 2;
    }

    public static String errorCodesMetaAttribute(final MetaAttribute metaAttribute)
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

    public static int errorCodesNullValue()
    {
        return 65535;
    }

    public static int errorCodesMinValue()
    {
        return 0;
    }

    public static int errorCodesMaxValue()
    {
        return 65534;
    }

    public EstablishmentReject505Encoder errorCodes(final int value)
    {
        buffer.putShort(offset + 68, (short)value, BYTE_ORDER);
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
        return 70;
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

    public EstablishmentReject505Encoder faultToleranceIndicator(final FTI value)
    {
        buffer.putByte(offset + 70, (byte)value.value());
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
        return 71;
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

    public EstablishmentReject505Encoder splitMsg(final SplitMsg value)
    {
        buffer.putByte(offset + 71, (byte)value.value());
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

        final EstablishmentReject505Decoder decoder = new EstablishmentReject505Decoder();
        decoder.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return decoder.appendTo(builder);
    }
}
