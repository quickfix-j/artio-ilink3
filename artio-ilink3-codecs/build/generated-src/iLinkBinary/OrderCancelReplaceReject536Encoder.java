/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.MutableDirectBuffer;
import org.agrona.sbe.*;


/**
 * OrderCancelReplaceReject
 */
@SuppressWarnings("all")
public final class OrderCancelReplaceReject536Encoder implements MessageEncoderFlyweight
{
    public static final int BLOCK_LENGTH = 409;
    public static final int TEMPLATE_ID = 536;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final OrderCancelReplaceReject536Encoder parentMessage = this;
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
        return "9";
    }

    public MutableDirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public OrderCancelReplaceReject536Encoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public OrderCancelReplaceReject536Encoder wrapAndApplyHeader(
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

    public static int seqNumId()
    {
        return 9726;
    }

    public static int seqNumSinceVersion()
    {
        return 0;
    }

    public static int seqNumEncodingOffset()
    {
        return 0;
    }

    public static int seqNumEncodingLength()
    {
        return 4;
    }

    public static String seqNumMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long seqNumNullValue()
    {
        return 4294967295L;
    }

    public static long seqNumMinValue()
    {
        return 0L;
    }

    public static long seqNumMaxValue()
    {
        return 4294967294L;
    }

    public OrderCancelReplaceReject536Encoder seqNum(final long value)
    {
        buffer.putInt(offset + 0, (int)value, BYTE_ORDER);
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
        return 4;
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

    public OrderCancelReplaceReject536Encoder uUID(final long value)
    {
        buffer.putLong(offset + 4, value, BYTE_ORDER);
        return this;
    }


    public static int textId()
    {
        return 58;
    }

    public static int textSinceVersion()
    {
        return 0;
    }

    public static int textEncodingOffset()
    {
        return 12;
    }

    public static int textEncodingLength()
    {
        return 256;
    }

    public static String textMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte textNullValue()
    {
        return (byte)0;
    }

    public static byte textMinValue()
    {
        return (byte)32;
    }

    public static byte textMaxValue()
    {
        return (byte)126;
    }

    public static int textLength()
    {
        return 256;
    }


    public OrderCancelReplaceReject536Encoder text(final int index, final byte value)
    {
        if (index < 0 || index >= 256)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 12 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String textCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public OrderCancelReplaceReject536Encoder putText(final byte[] src, final int srcOffset)
    {
        final int length = 256;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 12, src, srcOffset, length);

        return this;
    }

    public OrderCancelReplaceReject536Encoder text(final String src)
    {
        final int length = 256;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 12, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 12 + start, (byte)0);
        }

        return this;
    }

    public OrderCancelReplaceReject536Encoder text(final CharSequence src)
    {
        final int length = 256;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 12, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 12 + start, (byte)0);
        }

        return this;
    }

    public static int execIDId()
    {
        return 17;
    }

    public static int execIDSinceVersion()
    {
        return 0;
    }

    public static int execIDEncodingOffset()
    {
        return 268;
    }

    public static int execIDEncodingLength()
    {
        return 40;
    }

    public static String execIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "String";
        }

        return "";
    }

    public static byte execIDNullValue()
    {
        return (byte)0;
    }

    public static byte execIDMinValue()
    {
        return (byte)32;
    }

    public static byte execIDMaxValue()
    {
        return (byte)126;
    }

    public static int execIDLength()
    {
        return 40;
    }


    public OrderCancelReplaceReject536Encoder execID(final int index, final byte value)
    {
        if (index < 0 || index >= 40)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 268 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String execIDCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public OrderCancelReplaceReject536Encoder putExecID(final byte[] src, final int srcOffset)
    {
        final int length = 40;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 268, src, srcOffset, length);

        return this;
    }

    public OrderCancelReplaceReject536Encoder execID(final String src)
    {
        final int length = 40;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 268, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 268 + start, (byte)0);
        }

        return this;
    }

    public OrderCancelReplaceReject536Encoder execID(final CharSequence src)
    {
        final int length = 40;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 268, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 268 + start, (byte)0);
        }

        return this;
    }

    public static int senderIDId()
    {
        return 5392;
    }

    public static int senderIDSinceVersion()
    {
        return 0;
    }

    public static int senderIDEncodingOffset()
    {
        return 308;
    }

    public static int senderIDEncodingLength()
    {
        return 20;
    }

    public static String senderIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "String";
        }

        return "";
    }

    public static byte senderIDNullValue()
    {
        return (byte)0;
    }

    public static byte senderIDMinValue()
    {
        return (byte)32;
    }

    public static byte senderIDMaxValue()
    {
        return (byte)126;
    }

    public static int senderIDLength()
    {
        return 20;
    }


    public OrderCancelReplaceReject536Encoder senderID(final int index, final byte value)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 308 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String senderIDCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public OrderCancelReplaceReject536Encoder putSenderID(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 308, src, srcOffset, length);

        return this;
    }

    public OrderCancelReplaceReject536Encoder senderID(final String src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 308, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 308 + start, (byte)0);
        }

        return this;
    }

    public OrderCancelReplaceReject536Encoder senderID(final CharSequence src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 308, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 308 + start, (byte)0);
        }

        return this;
    }

    public static int clOrdIDId()
    {
        return 11;
    }

    public static int clOrdIDSinceVersion()
    {
        return 0;
    }

    public static int clOrdIDEncodingOffset()
    {
        return 328;
    }

    public static int clOrdIDEncodingLength()
    {
        return 20;
    }

    public static String clOrdIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "String";
        }

        return "";
    }

    public static byte clOrdIDNullValue()
    {
        return (byte)0;
    }

    public static byte clOrdIDMinValue()
    {
        return (byte)32;
    }

    public static byte clOrdIDMaxValue()
    {
        return (byte)126;
    }

    public static int clOrdIDLength()
    {
        return 20;
    }


    public OrderCancelReplaceReject536Encoder clOrdID(final int index, final byte value)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 328 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String clOrdIDCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public OrderCancelReplaceReject536Encoder putClOrdID(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 328, src, srcOffset, length);

        return this;
    }

    public OrderCancelReplaceReject536Encoder clOrdID(final String src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 328, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 328 + start, (byte)0);
        }

        return this;
    }

    public OrderCancelReplaceReject536Encoder clOrdID(final CharSequence src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 328, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 328 + start, (byte)0);
        }

        return this;
    }

    public static int partyDetailsListReqIDId()
    {
        return 1505;
    }

    public static int partyDetailsListReqIDSinceVersion()
    {
        return 0;
    }

    public static int partyDetailsListReqIDEncodingOffset()
    {
        return 348;
    }

    public static int partyDetailsListReqIDEncodingLength()
    {
        return 8;
    }

    public static String partyDetailsListReqIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long partyDetailsListReqIDNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long partyDetailsListReqIDMinValue()
    {
        return 0x0L;
    }

    public static long partyDetailsListReqIDMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public OrderCancelReplaceReject536Encoder partyDetailsListReqID(final long value)
    {
        buffer.putLong(offset + 348, value, BYTE_ORDER);
        return this;
    }


    public static int orderIDId()
    {
        return 37;
    }

    public static int orderIDSinceVersion()
    {
        return 0;
    }

    public static int orderIDEncodingOffset()
    {
        return 356;
    }

    public static int orderIDEncodingLength()
    {
        return 8;
    }

    public static String orderIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long orderIDNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long orderIDMinValue()
    {
        return 0x0L;
    }

    public static long orderIDMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public OrderCancelReplaceReject536Encoder orderID(final long value)
    {
        buffer.putLong(offset + 356, value, BYTE_ORDER);
        return this;
    }


    public static int transactTimeId()
    {
        return 60;
    }

    public static int transactTimeSinceVersion()
    {
        return 0;
    }

    public static int transactTimeEncodingOffset()
    {
        return 364;
    }

    public static int transactTimeEncodingLength()
    {
        return 8;
    }

    public static String transactTimeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long transactTimeNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long transactTimeMinValue()
    {
        return 0x0L;
    }

    public static long transactTimeMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public OrderCancelReplaceReject536Encoder transactTime(final long value)
    {
        buffer.putLong(offset + 364, value, BYTE_ORDER);
        return this;
    }


    public static int sendingTimeEpochId()
    {
        return 5297;
    }

    public static int sendingTimeEpochSinceVersion()
    {
        return 0;
    }

    public static int sendingTimeEpochEncodingOffset()
    {
        return 372;
    }

    public static int sendingTimeEpochEncodingLength()
    {
        return 8;
    }

    public static String sendingTimeEpochMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long sendingTimeEpochNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long sendingTimeEpochMinValue()
    {
        return 0x0L;
    }

    public static long sendingTimeEpochMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public OrderCancelReplaceReject536Encoder sendingTimeEpoch(final long value)
    {
        buffer.putLong(offset + 372, value, BYTE_ORDER);
        return this;
    }


    public static int orderRequestIDId()
    {
        return 2422;
    }

    public static int orderRequestIDSinceVersion()
    {
        return 0;
    }

    public static int orderRequestIDEncodingOffset()
    {
        return 380;
    }

    public static int orderRequestIDEncodingLength()
    {
        return 8;
    }

    public static String orderRequestIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long orderRequestIDNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long orderRequestIDMinValue()
    {
        return 0x0L;
    }

    public static long orderRequestIDMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public OrderCancelReplaceReject536Encoder orderRequestID(final long value)
    {
        buffer.putLong(offset + 380, value, BYTE_ORDER);
        return this;
    }


    public static int locationId()
    {
        return 9537;
    }

    public static int locationSinceVersion()
    {
        return 0;
    }

    public static int locationEncodingOffset()
    {
        return 388;
    }

    public static int locationEncodingLength()
    {
        return 5;
    }

    public static String locationMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "String";
        }

        return "";
    }

    public static byte locationNullValue()
    {
        return (byte)0;
    }

    public static byte locationMinValue()
    {
        return (byte)32;
    }

    public static byte locationMaxValue()
    {
        return (byte)126;
    }

    public static int locationLength()
    {
        return 5;
    }


    public OrderCancelReplaceReject536Encoder location(final int index, final byte value)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 388 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String locationCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public OrderCancelReplaceReject536Encoder putLocation(final byte[] src, final int srcOffset)
    {
        final int length = 5;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 388, src, srcOffset, length);

        return this;
    }

    public OrderCancelReplaceReject536Encoder location(final String src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 388, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 388 + start, (byte)0);
        }

        return this;
    }

    public OrderCancelReplaceReject536Encoder location(final CharSequence src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 388, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 388 + start, (byte)0);
        }

        return this;
    }

    public static int cxlRejReasonId()
    {
        return 102;
    }

    public static int cxlRejReasonSinceVersion()
    {
        return 0;
    }

    public static int cxlRejReasonEncodingOffset()
    {
        return 393;
    }

    public static int cxlRejReasonEncodingLength()
    {
        return 2;
    }

    public static String cxlRejReasonMetaAttribute(final MetaAttribute metaAttribute)
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

    public static int cxlRejReasonNullValue()
    {
        return 65535;
    }

    public static int cxlRejReasonMinValue()
    {
        return 0;
    }

    public static int cxlRejReasonMaxValue()
    {
        return 65534;
    }

    public OrderCancelReplaceReject536Encoder cxlRejReason(final int value)
    {
        buffer.putShort(offset + 393, (short)value, BYTE_ORDER);
        return this;
    }


    public static int delayDurationId()
    {
        return 5904;
    }

    public static int delayDurationSinceVersion()
    {
        return 0;
    }

    public static int delayDurationEncodingOffset()
    {
        return 395;
    }

    public static int delayDurationEncodingLength()
    {
        return 2;
    }

    public static String delayDurationMetaAttribute(final MetaAttribute metaAttribute)
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

    public static int delayDurationNullValue()
    {
        return 65535;
    }

    public static int delayDurationMinValue()
    {
        return 0;
    }

    public static int delayDurationMaxValue()
    {
        return 65534;
    }

    public OrderCancelReplaceReject536Encoder delayDuration(final int value)
    {
        buffer.putShort(offset + 395, (short)value, BYTE_ORDER);
        return this;
    }


    public static int ordStatusId()
    {
        return 39;
    }

    public static int ordStatusSinceVersion()
    {
        return 0;
    }

    public static int ordStatusEncodingOffset()
    {
        return 397;
    }

    public static int ordStatusEncodingLength()
    {
        return 0;
    }

    public static String ordStatusMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "constant";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "char";
        }

        return "";
    }

    public static byte ordStatusNullValue()
    {
        return (byte)0;
    }

    public static byte ordStatusMinValue()
    {
        return (byte)32;
    }

    public static byte ordStatusMaxValue()
    {
        return (byte)126;
    }


    private static final byte[] ORDSTATUS_VALUE = { 85 };

    public static int ordStatusLength()
    {
        return 1;
    }


    public byte ordStatus(final int index)
    {
        return ORDSTATUS_VALUE[index];
    }

    public int getOrdStatus(final byte[] dst, final int offset, final int length)
    {
        final int bytesCopied = Math.min(length, 1);
        System.arraycopy(ORDSTATUS_VALUE, 0, dst, offset, bytesCopied);

        return bytesCopied;
    }

    public byte ordStatus()
    {
        return (byte)85;
    }


    public static int cxlRejResponseToId()
    {
        return 434;
    }

    public static int cxlRejResponseToSinceVersion()
    {
        return 0;
    }

    public static int cxlRejResponseToEncodingOffset()
    {
        return 397;
    }

    public static int cxlRejResponseToEncodingLength()
    {
        return 0;
    }

    public static String cxlRejResponseToMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "constant";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "char";
        }

        return "";
    }

    public static byte cxlRejResponseToNullValue()
    {
        return (byte)0;
    }

    public static byte cxlRejResponseToMinValue()
    {
        return (byte)32;
    }

    public static byte cxlRejResponseToMaxValue()
    {
        return (byte)126;
    }


    private static final byte[] CXLREJRESPONSETO_VALUE = { 50 };

    public static int cxlRejResponseToLength()
    {
        return 1;
    }


    public byte cxlRejResponseTo(final int index)
    {
        return CXLREJRESPONSETO_VALUE[index];
    }

    public int getCxlRejResponseTo(final byte[] dst, final int offset, final int length)
    {
        final int bytesCopied = Math.min(length, 1);
        System.arraycopy(CXLREJRESPONSETO_VALUE, 0, dst, offset, bytesCopied);

        return bytesCopied;
    }

    public byte cxlRejResponseTo()
    {
        return (byte)50;
    }


    public static int manualOrderIndicatorId()
    {
        return 1028;
    }

    public static int manualOrderIndicatorSinceVersion()
    {
        return 0;
    }

    public static int manualOrderIndicatorEncodingOffset()
    {
        return 397;
    }

    public static int manualOrderIndicatorEncodingLength()
    {
        return 1;
    }

    public static String manualOrderIndicatorMetaAttribute(final MetaAttribute metaAttribute)
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

    public OrderCancelReplaceReject536Encoder manualOrderIndicator(final ManualOrdIndReq value)
    {
        buffer.putByte(offset + 397, (byte)value.value());
        return this;
    }

    public static int possRetransFlagId()
    {
        return 9765;
    }

    public static int possRetransFlagSinceVersion()
    {
        return 0;
    }

    public static int possRetransFlagEncodingOffset()
    {
        return 398;
    }

    public static int possRetransFlagEncodingLength()
    {
        return 1;
    }

    public static String possRetransFlagMetaAttribute(final MetaAttribute metaAttribute)
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

    public OrderCancelReplaceReject536Encoder possRetransFlag(final BooleanFlag value)
    {
        buffer.putByte(offset + 398, (byte)value.value());
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
        return 399;
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

    public OrderCancelReplaceReject536Encoder splitMsg(final SplitMsg value)
    {
        buffer.putByte(offset + 399, (byte)value.value());
        return this;
    }

    public static int liquidityFlagId()
    {
        return 9373;
    }

    public static int liquidityFlagSinceVersion()
    {
        return 0;
    }

    public static int liquidityFlagEncodingOffset()
    {
        return 400;
    }

    public static int liquidityFlagEncodingLength()
    {
        return 1;
    }

    public static String liquidityFlagMetaAttribute(final MetaAttribute metaAttribute)
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

    public OrderCancelReplaceReject536Encoder liquidityFlag(final BooleanNULL value)
    {
        buffer.putByte(offset + 400, (byte)value.value());
        return this;
    }

    public static int delayToTimeId()
    {
        return 7552;
    }

    public static int delayToTimeSinceVersion()
    {
        return 4;
    }

    public static int delayToTimeEncodingOffset()
    {
        return 401;
    }

    public static int delayToTimeEncodingLength()
    {
        return 8;
    }

    public static String delayToTimeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long delayToTimeNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long delayToTimeMinValue()
    {
        return 0x0L;
    }

    public static long delayToTimeMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public OrderCancelReplaceReject536Encoder delayToTime(final long value)
    {
        buffer.putLong(offset + 401, value, BYTE_ORDER);
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

        final OrderCancelReplaceReject536Decoder decoder = new OrderCancelReplaceReject536Decoder();
        decoder.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return decoder.appendTo(builder);
    }
}
