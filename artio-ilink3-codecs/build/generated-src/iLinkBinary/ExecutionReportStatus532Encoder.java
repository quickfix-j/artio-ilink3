/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.MutableDirectBuffer;
import org.agrona.sbe.*;


/**
 * ExecutionReportStatus
 */
@SuppressWarnings("all")
public final class ExecutionReportStatus532Encoder implements MessageEncoderFlyweight
{
    public static final int BLOCK_LENGTH = 513;
    public static final int TEMPLATE_ID = 532;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final ExecutionReportStatus532Encoder parentMessage = this;
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
        return "8";
    }

    public MutableDirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public ExecutionReportStatus532Encoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public ExecutionReportStatus532Encoder wrapAndApplyHeader(
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

    public ExecutionReportStatus532Encoder seqNum(final long value)
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

    public ExecutionReportStatus532Encoder uUID(final long value)
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


    public ExecutionReportStatus532Encoder text(final int index, final byte value)
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

    public ExecutionReportStatus532Encoder putText(final byte[] src, final int srcOffset)
    {
        final int length = 256;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 12, src, srcOffset, length);

        return this;
    }

    public ExecutionReportStatus532Encoder text(final String src)
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

    public ExecutionReportStatus532Encoder text(final CharSequence src)
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


    public ExecutionReportStatus532Encoder execID(final int index, final byte value)
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

    public ExecutionReportStatus532Encoder putExecID(final byte[] src, final int srcOffset)
    {
        final int length = 40;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 268, src, srcOffset, length);

        return this;
    }

    public ExecutionReportStatus532Encoder execID(final String src)
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

    public ExecutionReportStatus532Encoder execID(final CharSequence src)
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


    public ExecutionReportStatus532Encoder senderID(final int index, final byte value)
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

    public ExecutionReportStatus532Encoder putSenderID(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 308, src, srcOffset, length);

        return this;
    }

    public ExecutionReportStatus532Encoder senderID(final String src)
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

    public ExecutionReportStatus532Encoder senderID(final CharSequence src)
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


    public ExecutionReportStatus532Encoder clOrdID(final int index, final byte value)
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

    public ExecutionReportStatus532Encoder putClOrdID(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 328, src, srcOffset, length);

        return this;
    }

    public ExecutionReportStatus532Encoder clOrdID(final String src)
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

    public ExecutionReportStatus532Encoder clOrdID(final CharSequence src)
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

    public ExecutionReportStatus532Encoder partyDetailsListReqID(final long value)
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

    public ExecutionReportStatus532Encoder orderID(final long value)
    {
        buffer.putLong(offset + 356, value, BYTE_ORDER);
        return this;
    }


    public static int priceId()
    {
        return 44;
    }

    public static int priceSinceVersion()
    {
        return 0;
    }

    public static int priceEncodingOffset()
    {
        return 364;
    }

    public static int priceEncodingLength()
    {
        return 8;
    }

    public static String priceMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "Price";
        }

        return "";
    }

    private final PRICENULL9Encoder price = new PRICENULL9Encoder();

    /**
     * Price per share or contract
     *
     * @return PRICENULL9Encoder : Price per share or contract
     */
    public PRICENULL9Encoder price()
    {
        price.wrap(buffer, offset + 364);
        return price;
    }

    public static int stopPxId()
    {
        return 99;
    }

    public static int stopPxSinceVersion()
    {
        return 0;
    }

    public static int stopPxEncodingOffset()
    {
        return 372;
    }

    public static int stopPxEncodingLength()
    {
        return 8;
    }

    public static String stopPxMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "Price";
        }

        return "";
    }

    private final PRICENULL9Encoder stopPx = new PRICENULL9Encoder();

    /**
     * The stop price of a stop protect or stop limit order. (Conditionally required if OrdType = 3 or 4).
     *
     * @return PRICENULL9Encoder : The stop price of a stop protect or stop limit order. (Conditionally required if OrdType = 3 or 4).
     */
    public PRICENULL9Encoder stopPx()
    {
        stopPx.wrap(buffer, offset + 372);
        return stopPx;
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
        return 380;
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

    public ExecutionReportStatus532Encoder transactTime(final long value)
    {
        buffer.putLong(offset + 380, value, BYTE_ORDER);
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
        return 388;
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

    public ExecutionReportStatus532Encoder sendingTimeEpoch(final long value)
    {
        buffer.putLong(offset + 388, value, BYTE_ORDER);
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
        return 396;
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

    public ExecutionReportStatus532Encoder orderRequestID(final long value)
    {
        buffer.putLong(offset + 396, value, BYTE_ORDER);
        return this;
    }


    public static int ordStatusReqIDId()
    {
        return 790;
    }

    public static int ordStatusReqIDSinceVersion()
    {
        return 0;
    }

    public static int ordStatusReqIDEncodingOffset()
    {
        return 404;
    }

    public static int ordStatusReqIDEncodingLength()
    {
        return 8;
    }

    public static String ordStatusReqIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long ordStatusReqIDNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long ordStatusReqIDMinValue()
    {
        return 0x0L;
    }

    public static long ordStatusReqIDMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public ExecutionReportStatus532Encoder ordStatusReqID(final long value)
    {
        buffer.putLong(offset + 404, value, BYTE_ORDER);
        return this;
    }


    public static int massStatusReqIDId()
    {
        return 584;
    }

    public static int massStatusReqIDSinceVersion()
    {
        return 0;
    }

    public static int massStatusReqIDEncodingOffset()
    {
        return 412;
    }

    public static int massStatusReqIDEncodingLength()
    {
        return 8;
    }

    public static String massStatusReqIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long massStatusReqIDNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long massStatusReqIDMinValue()
    {
        return 0x0L;
    }

    public static long massStatusReqIDMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public ExecutionReportStatus532Encoder massStatusReqID(final long value)
    {
        buffer.putLong(offset + 412, value, BYTE_ORDER);
        return this;
    }


    public static int crossIDId()
    {
        return 548;
    }

    public static int crossIDSinceVersion()
    {
        return 0;
    }

    public static int crossIDEncodingOffset()
    {
        return 420;
    }

    public static int crossIDEncodingLength()
    {
        return 8;
    }

    public static String crossIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long crossIDNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long crossIDMinValue()
    {
        return 0x0L;
    }

    public static long crossIDMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public ExecutionReportStatus532Encoder crossID(final long value)
    {
        buffer.putLong(offset + 420, value, BYTE_ORDER);
        return this;
    }


    public static int hostCrossIDId()
    {
        return 961;
    }

    public static int hostCrossIDSinceVersion()
    {
        return 0;
    }

    public static int hostCrossIDEncodingOffset()
    {
        return 428;
    }

    public static int hostCrossIDEncodingLength()
    {
        return 8;
    }

    public static String hostCrossIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long hostCrossIDNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long hostCrossIDMinValue()
    {
        return 0x0L;
    }

    public static long hostCrossIDMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public ExecutionReportStatus532Encoder hostCrossID(final long value)
    {
        buffer.putLong(offset + 428, value, BYTE_ORDER);
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
        return 436;
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


    public ExecutionReportStatus532Encoder location(final int index, final byte value)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 436 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String locationCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public ExecutionReportStatus532Encoder putLocation(final byte[] src, final int srcOffset)
    {
        final int length = 5;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 436, src, srcOffset, length);

        return this;
    }

    public ExecutionReportStatus532Encoder location(final String src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 436, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 436 + start, (byte)0);
        }

        return this;
    }

    public ExecutionReportStatus532Encoder location(final CharSequence src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 436, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 436 + start, (byte)0);
        }

        return this;
    }

    public static int securityIDId()
    {
        return 48;
    }

    public static int securityIDSinceVersion()
    {
        return 0;
    }

    public static int securityIDEncodingOffset()
    {
        return 441;
    }

    public static int securityIDEncodingLength()
    {
        return 4;
    }

    public static String securityIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static int securityIDNullValue()
    {
        return -2147483648;
    }

    public static int securityIDMinValue()
    {
        return -2147483647;
    }

    public static int securityIDMaxValue()
    {
        return 2147483647;
    }

    public ExecutionReportStatus532Encoder securityID(final int value)
    {
        buffer.putInt(offset + 441, value, BYTE_ORDER);
        return this;
    }


    public static int orderQtyId()
    {
        return 38;
    }

    public static int orderQtySinceVersion()
    {
        return 0;
    }

    public static int orderQtyEncodingOffset()
    {
        return 445;
    }

    public static int orderQtyEncodingLength()
    {
        return 4;
    }

    public static String orderQtyMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long orderQtyNullValue()
    {
        return 4294967295L;
    }

    public static long orderQtyMinValue()
    {
        return 0L;
    }

    public static long orderQtyMaxValue()
    {
        return 4294967294L;
    }

    public ExecutionReportStatus532Encoder orderQty(final long value)
    {
        buffer.putInt(offset + 445, (int)value, BYTE_ORDER);
        return this;
    }


    public static int cumQtyId()
    {
        return 14;
    }

    public static int cumQtySinceVersion()
    {
        return 0;
    }

    public static int cumQtyEncodingOffset()
    {
        return 449;
    }

    public static int cumQtyEncodingLength()
    {
        return 4;
    }

    public static String cumQtyMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long cumQtyNullValue()
    {
        return 4294967295L;
    }

    public static long cumQtyMinValue()
    {
        return 0L;
    }

    public static long cumQtyMaxValue()
    {
        return 4294967294L;
    }

    public ExecutionReportStatus532Encoder cumQty(final long value)
    {
        buffer.putInt(offset + 449, (int)value, BYTE_ORDER);
        return this;
    }


    public static int leavesQtyId()
    {
        return 151;
    }

    public static int leavesQtySinceVersion()
    {
        return 0;
    }

    public static int leavesQtyEncodingOffset()
    {
        return 453;
    }

    public static int leavesQtyEncodingLength()
    {
        return 4;
    }

    public static String leavesQtyMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long leavesQtyNullValue()
    {
        return 4294967295L;
    }

    public static long leavesQtyMinValue()
    {
        return 0L;
    }

    public static long leavesQtyMaxValue()
    {
        return 4294967294L;
    }

    public ExecutionReportStatus532Encoder leavesQty(final long value)
    {
        buffer.putInt(offset + 453, (int)value, BYTE_ORDER);
        return this;
    }


    public static int minQtyId()
    {
        return 110;
    }

    public static int minQtySinceVersion()
    {
        return 0;
    }

    public static int minQtyEncodingOffset()
    {
        return 457;
    }

    public static int minQtyEncodingLength()
    {
        return 4;
    }

    public static String minQtyMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long minQtyNullValue()
    {
        return 4294967295L;
    }

    public static long minQtyMinValue()
    {
        return 0L;
    }

    public static long minQtyMaxValue()
    {
        return 4294967294L;
    }

    public ExecutionReportStatus532Encoder minQty(final long value)
    {
        buffer.putInt(offset + 457, (int)value, BYTE_ORDER);
        return this;
    }


    public static int displayQtyId()
    {
        return 1138;
    }

    public static int displayQtySinceVersion()
    {
        return 0;
    }

    public static int displayQtyEncodingOffset()
    {
        return 461;
    }

    public static int displayQtyEncodingLength()
    {
        return 4;
    }

    public static String displayQtyMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long displayQtyNullValue()
    {
        return 4294967295L;
    }

    public static long displayQtyMinValue()
    {
        return 0L;
    }

    public static long displayQtyMaxValue()
    {
        return 4294967294L;
    }

    public ExecutionReportStatus532Encoder displayQty(final long value)
    {
        buffer.putInt(offset + 461, (int)value, BYTE_ORDER);
        return this;
    }


    public static int expireDateId()
    {
        return 432;
    }

    public static int expireDateSinceVersion()
    {
        return 0;
    }

    public static int expireDateEncodingOffset()
    {
        return 465;
    }

    public static int expireDateEncodingLength()
    {
        return 2;
    }

    public static String expireDateMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "LocalMktDate";
        }

        return "";
    }

    public static int expireDateNullValue()
    {
        return 65535;
    }

    public static int expireDateMinValue()
    {
        return 0;
    }

    public static int expireDateMaxValue()
    {
        return 65534;
    }

    public ExecutionReportStatus532Encoder expireDate(final int value)
    {
        buffer.putShort(offset + 465, (short)value, BYTE_ORDER);
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
        return 467;
    }

    public static int ordStatusEncodingLength()
    {
        return 1;
    }

    public static String ordStatusMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "char";
        }

        return "";
    }

    public ExecutionReportStatus532Encoder ordStatus(final OrderStatus value)
    {
        buffer.putByte(offset + 467, value.value());
        return this;
    }

    public static int execTypeId()
    {
        return 150;
    }

    public static int execTypeSinceVersion()
    {
        return 0;
    }

    public static int execTypeEncodingOffset()
    {
        return 468;
    }

    public static int execTypeEncodingLength()
    {
        return 0;
    }

    public static String execTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte execTypeNullValue()
    {
        return (byte)0;
    }

    public static byte execTypeMinValue()
    {
        return (byte)32;
    }

    public static byte execTypeMaxValue()
    {
        return (byte)126;
    }


    private static final byte[] EXECTYPE_VALUE = { 73 };

    public static int execTypeLength()
    {
        return 1;
    }


    public byte execType(final int index)
    {
        return EXECTYPE_VALUE[index];
    }

    public int getExecType(final byte[] dst, final int offset, final int length)
    {
        final int bytesCopied = Math.min(length, 1);
        System.arraycopy(EXECTYPE_VALUE, 0, dst, offset, bytesCopied);

        return bytesCopied;
    }

    public byte execType()
    {
        return (byte)73;
    }


    public static int ordTypeId()
    {
        return 40;
    }

    public static int ordTypeSinceVersion()
    {
        return 0;
    }

    public static int ordTypeEncodingOffset()
    {
        return 468;
    }

    public static int ordTypeEncodingLength()
    {
        return 1;
    }

    public static String ordTypeMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "char";
        }

        return "";
    }

    public ExecutionReportStatus532Encoder ordType(final OrderType value)
    {
        buffer.putByte(offset + 468, value.value());
        return this;
    }

    public static int sideId()
    {
        return 54;
    }

    public static int sideSinceVersion()
    {
        return 0;
    }

    public static int sideEncodingOffset()
    {
        return 469;
    }

    public static int sideEncodingLength()
    {
        return 1;
    }

    public static String sideMetaAttribute(final MetaAttribute metaAttribute)
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

    public ExecutionReportStatus532Encoder side(final SideReq value)
    {
        buffer.putByte(offset + 469, (byte)value.value());
        return this;
    }

    public static int timeInForceId()
    {
        return 59;
    }

    public static int timeInForceSinceVersion()
    {
        return 0;
    }

    public static int timeInForceEncodingOffset()
    {
        return 470;
    }

    public static int timeInForceEncodingLength()
    {
        return 1;
    }

    public static String timeInForceMetaAttribute(final MetaAttribute metaAttribute)
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

    public ExecutionReportStatus532Encoder timeInForce(final TimeInForce value)
    {
        buffer.putByte(offset + 470, (byte)value.value());
        return this;
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
        return 471;
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

    public ExecutionReportStatus532Encoder manualOrderIndicator(final ManualOrdIndReq value)
    {
        buffer.putByte(offset + 471, (byte)value.value());
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
        return 472;
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

    public ExecutionReportStatus532Encoder possRetransFlag(final BooleanFlag value)
    {
        buffer.putByte(offset + 472, (byte)value.value());
        return this;
    }

    public static int lastRptRequestedId()
    {
        return 912;
    }

    public static int lastRptRequestedSinceVersion()
    {
        return 0;
    }

    public static int lastRptRequestedEncodingOffset()
    {
        return 473;
    }

    public static int lastRptRequestedEncodingLength()
    {
        return 1;
    }

    public static String lastRptRequestedMetaAttribute(final MetaAttribute metaAttribute)
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

    public ExecutionReportStatus532Encoder lastRptRequested(final BooleanNULL value)
    {
        buffer.putByte(offset + 473, (byte)value.value());
        return this;
    }

    public static int crossTypeId()
    {
        return 549;
    }

    public static int crossTypeSinceVersion()
    {
        return 0;
    }

    public static int crossTypeEncodingOffset()
    {
        return 474;
    }

    public static int crossTypeEncodingLength()
    {
        return 1;
    }

    public static String crossTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static short crossTypeNullValue()
    {
        return (short)255;
    }

    public static short crossTypeMinValue()
    {
        return (short)0;
    }

    public static short crossTypeMaxValue()
    {
        return (short)254;
    }

    public ExecutionReportStatus532Encoder crossType(final short value)
    {
        buffer.putByte(offset + 474, (byte)value);
        return this;
    }


    public static int execInstId()
    {
        return 18;
    }

    public static int execInstSinceVersion()
    {
        return 0;
    }

    public static int execInstEncodingOffset()
    {
        return 475;
    }

    public static int execInstEncodingLength()
    {
        return 1;
    }

    public static String execInstMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "MultipleCharValue";
        }

        return "";
    }

    private final ExecInstEncoder execInst = new ExecInstEncoder();

    /**
     * Instructions for order handling on exchange. Since more than one instruction is applicable to an order, this field can be represented as a bitset.
     *
     * @return ExecInstEncoder : Instructions for order handling on exchange. Since more than one instruction is applicable to an order, this field can be represented as a bitset.
     */
    public ExecInstEncoder execInst()
    {
        execInst.wrap(buffer, offset + 475);
        return execInst;
    }

    public static int executionModeId()
    {
        return 5906;
    }

    public static int executionModeSinceVersion()
    {
        return 0;
    }

    public static int executionModeEncodingOffset()
    {
        return 476;
    }

    public static int executionModeEncodingLength()
    {
        return 1;
    }

    public static String executionModeMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "char";
        }

        return "";
    }

    public ExecutionReportStatus532Encoder executionMode(final ExecMode value)
    {
        buffer.putByte(offset + 476, value.value());
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
        return 477;
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

    public ExecutionReportStatus532Encoder liquidityFlag(final BooleanNULL value)
    {
        buffer.putByte(offset + 477, (byte)value.value());
        return this;
    }

    public static int managedOrderId()
    {
        return 6881;
    }

    public static int managedOrderSinceVersion()
    {
        return 0;
    }

    public static int managedOrderEncodingOffset()
    {
        return 478;
    }

    public static int managedOrderEncodingLength()
    {
        return 1;
    }

    public static String managedOrderMetaAttribute(final MetaAttribute metaAttribute)
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

    public ExecutionReportStatus532Encoder managedOrder(final BooleanNULL value)
    {
        buffer.putByte(offset + 478, (byte)value.value());
        return this;
    }

    public static int shortSaleTypeId()
    {
        return 5409;
    }

    public static int shortSaleTypeSinceVersion()
    {
        return 0;
    }

    public static int shortSaleTypeEncodingOffset()
    {
        return 479;
    }

    public static int shortSaleTypeEncodingLength()
    {
        return 1;
    }

    public static String shortSaleTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    public ExecutionReportStatus532Encoder shortSaleType(final ShortSaleType value)
    {
        buffer.putByte(offset + 479, (byte)value.value());
        return this;
    }

    public static int discretionPriceId()
    {
        return 845;
    }

    public static int discretionPriceSinceVersion()
    {
        return 6;
    }

    public static int discretionPriceEncodingOffset()
    {
        return 480;
    }

    public static int discretionPriceEncodingLength()
    {
        return 8;
    }

    public static String discretionPriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "Price";
        }

        return "";
    }

    private final PRICENULL9Encoder discretionPrice = new PRICENULL9Encoder();

    /**
     * The presence of DiscretionPrice on an order indicates that the trader wishes to display one price but will accept trades at another price
     *
     * @return PRICENULL9Encoder : The presence of DiscretionPrice on an order indicates that the trader wishes to display one price but will accept trades at another price
     */
    public PRICENULL9Encoder discretionPrice()
    {
        discretionPrice.wrap(buffer, offset + 480);
        return discretionPrice;
    }

    public static int reservationPriceId()
    {
        return 9562;
    }

    public static int reservationPriceSinceVersion()
    {
        return 8;
    }

    public static int reservationPriceEncodingOffset()
    {
        return 488;
    }

    public static int reservationPriceEncodingLength()
    {
        return 8;
    }

    public static String reservationPriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "Price";
        }

        return "";
    }

    private final PRICENULL9Encoder reservationPrice = new PRICENULL9Encoder();

    /**
     * This field specifies the highest (for a buy) or lowest (for a sell) price at which the order may trade. This price must be better than the limit price and should be multiple of reservation price tick
     *
     * @return PRICENULL9Encoder : This field specifies the highest (for a buy) or lowest (for a sell) price at which the order may trade. This price must be better than the limit price and should be multiple of reservation price tick
     */
    public PRICENULL9Encoder reservationPrice()
    {
        reservationPrice.wrap(buffer, offset + 488);
        return reservationPrice;
    }

    public static int priorityIndicatorId()
    {
        return 638;
    }

    public static int priorityIndicatorSinceVersion()
    {
        return 8;
    }

    public static int priorityIndicatorEncodingOffset()
    {
        return 496;
    }

    public static int priorityIndicatorEncodingLength()
    {
        return 1;
    }

    public static String priorityIndicatorMetaAttribute(final MetaAttribute metaAttribute)
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

    public static short priorityIndicatorNullValue()
    {
        return (short)255;
    }

    public static short priorityIndicatorMinValue()
    {
        return (short)0;
    }

    public static short priorityIndicatorMaxValue()
    {
        return (short)254;
    }

    public ExecutionReportStatus532Encoder priorityIndicator(final short value)
    {
        buffer.putByte(offset + 496, (byte)value);
        return this;
    }


    public static int origOrderUserId()
    {
        return 9937;
    }

    public static int origOrderUserSinceVersion()
    {
        return 8;
    }

    public static int origOrderUserEncodingOffset()
    {
        return 497;
    }

    public static int origOrderUserEncodingLength()
    {
        return 8;
    }

    public static String origOrderUserMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte origOrderUserNullValue()
    {
        return (byte)0;
    }

    public static byte origOrderUserMinValue()
    {
        return (byte)32;
    }

    public static byte origOrderUserMaxValue()
    {
        return (byte)126;
    }

    public static int origOrderUserLength()
    {
        return 8;
    }


    public ExecutionReportStatus532Encoder origOrderUser(final int index, final byte value)
    {
        if (index < 0 || index >= 8)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 497 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String origOrderUserCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public ExecutionReportStatus532Encoder putOrigOrderUser(final byte[] src, final int srcOffset)
    {
        final int length = 8;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 497, src, srcOffset, length);

        return this;
    }

    public ExecutionReportStatus532Encoder origOrderUser(final String src)
    {
        final int length = 8;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 497, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 497 + start, (byte)0);
        }

        return this;
    }

    public ExecutionReportStatus532Encoder origOrderUser(final CharSequence src)
    {
        final int length = 8;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 497, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 497 + start, (byte)0);
        }

        return this;
    }

    public static int cancelTextId()
    {
        return 2807;
    }

    public static int cancelTextSinceVersion()
    {
        return 8;
    }

    public static int cancelTextEncodingOffset()
    {
        return 505;
    }

    public static int cancelTextEncodingLength()
    {
        return 8;
    }

    public static String cancelTextMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte cancelTextNullValue()
    {
        return (byte)0;
    }

    public static byte cancelTextMinValue()
    {
        return (byte)32;
    }

    public static byte cancelTextMaxValue()
    {
        return (byte)126;
    }

    public static int cancelTextLength()
    {
        return 8;
    }


    public ExecutionReportStatus532Encoder cancelText(final int index, final byte value)
    {
        if (index < 0 || index >= 8)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 505 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String cancelTextCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public ExecutionReportStatus532Encoder putCancelText(final byte[] src, final int srcOffset)
    {
        final int length = 8;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 505, src, srcOffset, length);

        return this;
    }

    public ExecutionReportStatus532Encoder cancelText(final String src)
    {
        final int length = 8;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 505, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 505 + start, (byte)0);
        }

        return this;
    }

    public ExecutionReportStatus532Encoder cancelText(final CharSequence src)
    {
        final int length = 8;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 505, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 505 + start, (byte)0);
        }

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

        final ExecutionReportStatus532Decoder decoder = new ExecutionReportStatus532Decoder();
        decoder.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return decoder.appendTo(builder);
    }
}