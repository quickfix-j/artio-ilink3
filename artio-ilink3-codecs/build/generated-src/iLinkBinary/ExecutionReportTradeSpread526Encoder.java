/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.MutableDirectBuffer;
import org.agrona.sbe.*;


/**
 * ExecutionReportTradeSpread
 */
@SuppressWarnings("all")
public final class ExecutionReportTradeSpread526Encoder implements MessageEncoderFlyweight
{
    public static final int BLOCK_LENGTH = 230;
    public static final int TEMPLATE_ID = 526;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final ExecutionReportTradeSpread526Encoder parentMessage = this;
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

    public ExecutionReportTradeSpread526Encoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public ExecutionReportTradeSpread526Encoder wrapAndApplyHeader(
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

    public ExecutionReportTradeSpread526Encoder seqNum(final long value)
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

    public ExecutionReportTradeSpread526Encoder uUID(final long value)
    {
        buffer.putLong(offset + 4, value, BYTE_ORDER);
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
        return 12;
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


    public ExecutionReportTradeSpread526Encoder execID(final int index, final byte value)
    {
        if (index < 0 || index >= 40)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 12 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String execIDCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public ExecutionReportTradeSpread526Encoder putExecID(final byte[] src, final int srcOffset)
    {
        final int length = 40;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 12, src, srcOffset, length);

        return this;
    }

    public ExecutionReportTradeSpread526Encoder execID(final String src)
    {
        final int length = 40;
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

    public ExecutionReportTradeSpread526Encoder execID(final CharSequence src)
    {
        final int length = 40;
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
        return 52;
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


    public ExecutionReportTradeSpread526Encoder senderID(final int index, final byte value)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 52 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String senderIDCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public ExecutionReportTradeSpread526Encoder putSenderID(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 52, src, srcOffset, length);

        return this;
    }

    public ExecutionReportTradeSpread526Encoder senderID(final String src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 52, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 52 + start, (byte)0);
        }

        return this;
    }

    public ExecutionReportTradeSpread526Encoder senderID(final CharSequence src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 52, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 52 + start, (byte)0);
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
        return 72;
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


    public ExecutionReportTradeSpread526Encoder clOrdID(final int index, final byte value)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 72 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String clOrdIDCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public ExecutionReportTradeSpread526Encoder putClOrdID(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 72, src, srcOffset, length);

        return this;
    }

    public ExecutionReportTradeSpread526Encoder clOrdID(final String src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 72, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 72 + start, (byte)0);
        }

        return this;
    }

    public ExecutionReportTradeSpread526Encoder clOrdID(final CharSequence src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 72, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 72 + start, (byte)0);
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
        return 92;
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

    public ExecutionReportTradeSpread526Encoder partyDetailsListReqID(final long value)
    {
        buffer.putLong(offset + 92, value, BYTE_ORDER);
        return this;
    }


    public static int lastPxId()
    {
        return 31;
    }

    public static int lastPxSinceVersion()
    {
        return 0;
    }

    public static int lastPxEncodingOffset()
    {
        return 100;
    }

    public static int lastPxEncodingLength()
    {
        return 8;
    }

    public static String lastPxMetaAttribute(final MetaAttribute metaAttribute)
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

    private final PRICE9Encoder lastPx = new PRICE9Encoder();

    /**
     * Price of this (last) fill
     *
     * @return PRICE9Encoder : Price of this (last) fill
     */
    public PRICE9Encoder lastPx()
    {
        lastPx.wrap(buffer, offset + 100);
        return lastPx;
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
        return 108;
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

    public ExecutionReportTradeSpread526Encoder orderID(final long value)
    {
        buffer.putLong(offset + 108, value, BYTE_ORDER);
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
        return 116;
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

    private final PRICE9Encoder price = new PRICE9Encoder();

    /**
     * Price per share or contract
     *
     * @return PRICE9Encoder : Price per share or contract
     */
    public PRICE9Encoder price()
    {
        price.wrap(buffer, offset + 116);
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
        return 124;
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
        stopPx.wrap(buffer, offset + 124);
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
        return 132;
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

    public ExecutionReportTradeSpread526Encoder transactTime(final long value)
    {
        buffer.putLong(offset + 132, value, BYTE_ORDER);
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
        return 140;
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

    public ExecutionReportTradeSpread526Encoder sendingTimeEpoch(final long value)
    {
        buffer.putLong(offset + 140, value, BYTE_ORDER);
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
        return 148;
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

    public ExecutionReportTradeSpread526Encoder orderRequestID(final long value)
    {
        buffer.putLong(offset + 148, value, BYTE_ORDER);
        return this;
    }


    public static int secExecIDId()
    {
        return 527;
    }

    public static int secExecIDSinceVersion()
    {
        return 0;
    }

    public static int secExecIDEncodingOffset()
    {
        return 156;
    }

    public static int secExecIDEncodingLength()
    {
        return 8;
    }

    public static String secExecIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long secExecIDNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long secExecIDMinValue()
    {
        return 0x0L;
    }

    public static long secExecIDMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public ExecutionReportTradeSpread526Encoder secExecID(final long value)
    {
        buffer.putLong(offset + 156, value, BYTE_ORDER);
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
        return 164;
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

    public ExecutionReportTradeSpread526Encoder crossID(final long value)
    {
        buffer.putLong(offset + 164, value, BYTE_ORDER);
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
        return 172;
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

    public ExecutionReportTradeSpread526Encoder hostCrossID(final long value)
    {
        buffer.putLong(offset + 172, value, BYTE_ORDER);
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
        return 180;
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


    public ExecutionReportTradeSpread526Encoder location(final int index, final byte value)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 180 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String locationCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public ExecutionReportTradeSpread526Encoder putLocation(final byte[] src, final int srcOffset)
    {
        final int length = 5;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 180, src, srcOffset, length);

        return this;
    }

    public ExecutionReportTradeSpread526Encoder location(final String src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 180, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 180 + start, (byte)0);
        }

        return this;
    }

    public ExecutionReportTradeSpread526Encoder location(final CharSequence src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 180, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 180 + start, (byte)0);
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
        return 185;
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

    public ExecutionReportTradeSpread526Encoder securityID(final int value)
    {
        buffer.putInt(offset + 185, value, BYTE_ORDER);
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
        return 189;
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

    public ExecutionReportTradeSpread526Encoder orderQty(final long value)
    {
        buffer.putInt(offset + 189, (int)value, BYTE_ORDER);
        return this;
    }


    public static int lastQtyId()
    {
        return 32;
    }

    public static int lastQtySinceVersion()
    {
        return 0;
    }

    public static int lastQtyEncodingOffset()
    {
        return 193;
    }

    public static int lastQtyEncodingLength()
    {
        return 4;
    }

    public static String lastQtyMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long lastQtyNullValue()
    {
        return 4294967295L;
    }

    public static long lastQtyMinValue()
    {
        return 0L;
    }

    public static long lastQtyMaxValue()
    {
        return 4294967294L;
    }

    public ExecutionReportTradeSpread526Encoder lastQty(final long value)
    {
        buffer.putInt(offset + 193, (int)value, BYTE_ORDER);
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
        return 197;
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

    public ExecutionReportTradeSpread526Encoder cumQty(final long value)
    {
        buffer.putInt(offset + 197, (int)value, BYTE_ORDER);
        return this;
    }


    public static int mDTradeEntryIDId()
    {
        return 37711;
    }

    public static int mDTradeEntryIDSinceVersion()
    {
        return 0;
    }

    public static int mDTradeEntryIDEncodingOffset()
    {
        return 201;
    }

    public static int mDTradeEntryIDEncodingLength()
    {
        return 4;
    }

    public static String mDTradeEntryIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long mDTradeEntryIDNullValue()
    {
        return 4294967295L;
    }

    public static long mDTradeEntryIDMinValue()
    {
        return 0L;
    }

    public static long mDTradeEntryIDMaxValue()
    {
        return 4294967294L;
    }

    public ExecutionReportTradeSpread526Encoder mDTradeEntryID(final long value)
    {
        buffer.putInt(offset + 201, (int)value, BYTE_ORDER);
        return this;
    }


    public static int sideTradeIDId()
    {
        return 1506;
    }

    public static int sideTradeIDSinceVersion()
    {
        return 0;
    }

    public static int sideTradeIDEncodingOffset()
    {
        return 205;
    }

    public static int sideTradeIDEncodingLength()
    {
        return 4;
    }

    public static String sideTradeIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long sideTradeIDNullValue()
    {
        return 4294967295L;
    }

    public static long sideTradeIDMinValue()
    {
        return 0L;
    }

    public static long sideTradeIDMaxValue()
    {
        return 4294967294L;
    }

    public ExecutionReportTradeSpread526Encoder sideTradeID(final long value)
    {
        buffer.putInt(offset + 205, (int)value, BYTE_ORDER);
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
        return 209;
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

    public ExecutionReportTradeSpread526Encoder leavesQty(final long value)
    {
        buffer.putInt(offset + 209, (int)value, BYTE_ORDER);
        return this;
    }


    public static int tradeDateId()
    {
        return 75;
    }

    public static int tradeDateSinceVersion()
    {
        return 0;
    }

    public static int tradeDateEncodingOffset()
    {
        return 213;
    }

    public static int tradeDateEncodingLength()
    {
        return 2;
    }

    public static String tradeDateMetaAttribute(final MetaAttribute metaAttribute)
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

    public static int tradeDateNullValue()
    {
        return 65535;
    }

    public static int tradeDateMinValue()
    {
        return 0;
    }

    public static int tradeDateMaxValue()
    {
        return 65534;
    }

    public ExecutionReportTradeSpread526Encoder tradeDate(final int value)
    {
        buffer.putShort(offset + 213, (short)value, BYTE_ORDER);
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
        return 215;
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

    public ExecutionReportTradeSpread526Encoder expireDate(final int value)
    {
        buffer.putShort(offset + 215, (short)value, BYTE_ORDER);
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
        return 217;
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
            return "int";
        }

        return "";
    }

    public ExecutionReportTradeSpread526Encoder ordStatus(final OrdStatusTrd value)
    {
        buffer.putByte(offset + 217, (byte)value.value());
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
        return 218;
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


    private static final byte[] EXECTYPE_VALUE = { 70 };

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
        return (byte)70;
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
        return 218;
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

    public ExecutionReportTradeSpread526Encoder ordType(final OrderType value)
    {
        buffer.putByte(offset + 218, value.value());
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
        return 219;
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

    public ExecutionReportTradeSpread526Encoder side(final SideReq value)
    {
        buffer.putByte(offset + 219, (byte)value.value());
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
        return 220;
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

    public ExecutionReportTradeSpread526Encoder timeInForce(final TimeInForce value)
    {
        buffer.putByte(offset + 220, (byte)value.value());
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
        return 221;
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

    public ExecutionReportTradeSpread526Encoder manualOrderIndicator(final ManualOrdIndReq value)
    {
        buffer.putByte(offset + 221, (byte)value.value());
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
        return 222;
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

    public ExecutionReportTradeSpread526Encoder possRetransFlag(final BooleanFlag value)
    {
        buffer.putByte(offset + 222, (byte)value.value());
        return this;
    }

    public static int aggressorIndicatorId()
    {
        return 1057;
    }

    public static int aggressorIndicatorSinceVersion()
    {
        return 0;
    }

    public static int aggressorIndicatorEncodingOffset()
    {
        return 223;
    }

    public static int aggressorIndicatorEncodingLength()
    {
        return 1;
    }

    public static String aggressorIndicatorMetaAttribute(final MetaAttribute metaAttribute)
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

    public ExecutionReportTradeSpread526Encoder aggressorIndicator(final BooleanFlag value)
    {
        buffer.putByte(offset + 223, (byte)value.value());
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
        return 224;
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

    public ExecutionReportTradeSpread526Encoder crossType(final short value)
    {
        buffer.putByte(offset + 224, (byte)value);
        return this;
    }


    public static int totalNumSecuritiesId()
    {
        return 393;
    }

    public static int totalNumSecuritiesSinceVersion()
    {
        return 0;
    }

    public static int totalNumSecuritiesEncodingOffset()
    {
        return 225;
    }

    public static int totalNumSecuritiesEncodingLength()
    {
        return 1;
    }

    public static String totalNumSecuritiesMetaAttribute(final MetaAttribute metaAttribute)
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

    public static short totalNumSecuritiesNullValue()
    {
        return (short)255;
    }

    public static short totalNumSecuritiesMinValue()
    {
        return (short)0;
    }

    public static short totalNumSecuritiesMaxValue()
    {
        return (short)254;
    }

    public ExecutionReportTradeSpread526Encoder totalNumSecurities(final short value)
    {
        buffer.putByte(offset + 225, (byte)value);
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
        return 226;
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
        execInst.wrap(buffer, offset + 226);
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
        return 227;
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

    public ExecutionReportTradeSpread526Encoder executionMode(final ExecMode value)
    {
        buffer.putByte(offset + 227, value.value());
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
        return 228;
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

    public ExecutionReportTradeSpread526Encoder liquidityFlag(final BooleanNULL value)
    {
        buffer.putByte(offset + 228, (byte)value.value());
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
        return 229;
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

    public ExecutionReportTradeSpread526Encoder shortSaleType(final ShortSaleType value)
    {
        buffer.putByte(offset + 229, (byte)value.value());
        return this;
    }

    private final NoFillsEncoder noFills = new NoFillsEncoder(this);

    public static long noFillsId()
    {
        return 1362;
    }

    /**
     * Specifies the number of fill reasons included in this Execution Report
     *
     * @param count of times the group will be encoded.
     * @return NoFillsEncoder : encoder for the group.
     */
    public NoFillsEncoder noFillsCount(final int count)
    {
        noFills.wrap(buffer, count);
        return noFills;
    }

    /**
     * Specifies the number of fill reasons included in this Execution Report
     */

    public static final class NoFillsEncoder
    {
        public static final int HEADER_SIZE = 3;
        private final ExecutionReportTradeSpread526Encoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int initialLimit;

        NoFillsEncoder(final ExecutionReportTradeSpread526Encoder parentMessage)
        {
            this.parentMessage = parentMessage;
        }

        public void wrap(final MutableDirectBuffer buffer, final int count)
        {
            if (count < 0 || count > 254)
            {
                throw new IllegalArgumentException("count outside allowed range: count=" + count);
            }

            if (buffer != this.buffer)
            {
                this.buffer = buffer;
            }

            index = 0;
            this.count = count;
            final int limit = parentMessage.limit();
            initialLimit = limit;
            parentMessage.limit(limit + HEADER_SIZE);
            buffer.putShort(limit + 0, (short)15, BYTE_ORDER);
            buffer.putByte(limit + 2, (byte)count);
        }

        public NoFillsEncoder next()
        {
            if (index >= count)
            {
                throw new java.util.NoSuchElementException();
            }

            offset = parentMessage.limit();
            parentMessage.limit(offset + sbeBlockLength());
            ++index;

            return this;
        }

        public int resetCountToIndex()
        {
            count = index;
            buffer.putByte(initialLimit + 2, (byte)count);

            return count;
        }

        public static short countMinValue()
        {
            return (short)0;
        }

        public static short countMaxValue()
        {
            return (short)254;
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 15;
        }

        public static int fillPxId()
        {
            return 1364;
        }

        public static int fillPxSinceVersion()
        {
            return 0;
        }

        public static int fillPxEncodingOffset()
        {
            return 0;
        }

        public static int fillPxEncodingLength()
        {
            return 8;
        }

        public static String fillPxMetaAttribute(final MetaAttribute metaAttribute)
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

        private final PRICE9Encoder fillPx = new PRICE9Encoder();

        /**
         * Price of this fill reason or allocation. Required if NoFills(1362) &gt; 0. Same as LastPx(31)
         *
         * @return PRICE9Encoder : Price of this fill reason or allocation. Required if NoFills(1362) &gt; 0. Same as LastPx(31)
         */
        public PRICE9Encoder fillPx()
        {
            fillPx.wrap(buffer, offset + 0);
            return fillPx;
        }

        public static int fillQtyId()
        {
            return 1365;
        }

        public static int fillQtySinceVersion()
        {
            return 0;
        }

        public static int fillQtyEncodingOffset()
        {
            return 8;
        }

        public static int fillQtyEncodingLength()
        {
            return 4;
        }

        public static String fillQtyMetaAttribute(final MetaAttribute metaAttribute)
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

        public static long fillQtyNullValue()
        {
            return 4294967295L;
        }

        public static long fillQtyMinValue()
        {
            return 0L;
        }

        public static long fillQtyMaxValue()
        {
            return 4294967294L;
        }

        public NoFillsEncoder fillQty(final long value)
        {
            buffer.putInt(offset + 8, (int)value, BYTE_ORDER);
            return this;
        }


        public static int fillExecIDId()
        {
            return 1363;
        }

        public static int fillExecIDSinceVersion()
        {
            return 0;
        }

        public static int fillExecIDEncodingOffset()
        {
            return 12;
        }

        public static int fillExecIDEncodingLength()
        {
            return 2;
        }

        public static String fillExecIDMetaAttribute(final MetaAttribute metaAttribute)
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

        public static byte fillExecIDNullValue()
        {
            return (byte)0;
        }

        public static byte fillExecIDMinValue()
        {
            return (byte)32;
        }

        public static byte fillExecIDMaxValue()
        {
            return (byte)126;
        }

        public static int fillExecIDLength()
        {
            return 2;
        }


        public NoFillsEncoder fillExecID(final int index, final byte value)
        {
            if (index < 0 || index >= 2)
            {
                throw new IndexOutOfBoundsException("index out of range: index=" + index);
            }

            final int pos = offset + 12 + (index * 1);
            buffer.putByte(pos, value);

            return this;
        }
        public NoFillsEncoder putFillExecID(final byte value0, final byte value1)
        {
            buffer.putByte(offset + 12, value0);
            buffer.putByte(offset + 13, value1);

            return this;
        }

        public static String fillExecIDCharacterEncoding()
        {
            return java.nio.charset.StandardCharsets.US_ASCII.name();
        }

        public NoFillsEncoder putFillExecID(final byte[] src, final int srcOffset)
        {
            final int length = 2;
            if (srcOffset < 0 || srcOffset > (src.length - length))
            {
                throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
            }

            buffer.putBytes(offset + 12, src, srcOffset, length);

            return this;
        }

        public NoFillsEncoder fillExecID(final String src)
        {
            final int length = 2;
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

        public NoFillsEncoder fillExecID(final CharSequence src)
        {
            final int length = 2;
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

        public static int fillYieldTypeId()
        {
            return 1622;
        }

        public static int fillYieldTypeSinceVersion()
        {
            return 0;
        }

        public static int fillYieldTypeEncodingOffset()
        {
            return 14;
        }

        public static int fillYieldTypeEncodingLength()
        {
            return 1;
        }

        public static String fillYieldTypeMetaAttribute(final MetaAttribute metaAttribute)
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

        public static short fillYieldTypeNullValue()
        {
            return (short)255;
        }

        public static short fillYieldTypeMinValue()
        {
            return (short)0;
        }

        public static short fillYieldTypeMaxValue()
        {
            return (short)254;
        }

        public NoFillsEncoder fillYieldType(final short value)
        {
            buffer.putByte(offset + 14, (byte)value);
            return this;
        }

    }

    private final NoLegsEncoder noLegs = new NoLegsEncoder(this);

    public static long noLegsId()
    {
        return 555;
    }

    /**
     * Number of Leg executions; Will currently be set to 0 and in future will contain the leg fills for the spread when spread leg fills are consolidated with the spread fill as a single message
     *
     * @param count of times the group will be encoded.
     * @return NoLegsEncoder : encoder for the group.
     */
    public NoLegsEncoder noLegsCount(final int count)
    {
        noLegs.wrap(buffer, count);
        return noLegs;
    }

    /**
     * Number of Leg executions; Will currently be set to 0 and in future will contain the leg fills for the spread when spread leg fills are consolidated with the spread fill as a single message
     */

    public static final class NoLegsEncoder
    {
        public static final int HEADER_SIZE = 3;
        private final ExecutionReportTradeSpread526Encoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int initialLimit;

        NoLegsEncoder(final ExecutionReportTradeSpread526Encoder parentMessage)
        {
            this.parentMessage = parentMessage;
        }

        public void wrap(final MutableDirectBuffer buffer, final int count)
        {
            if (count < 0 || count > 254)
            {
                throw new IllegalArgumentException("count outside allowed range: count=" + count);
            }

            if (buffer != this.buffer)
            {
                this.buffer = buffer;
            }

            index = 0;
            this.count = count;
            final int limit = parentMessage.limit();
            initialLimit = limit;
            parentMessage.limit(limit + HEADER_SIZE);
            buffer.putShort(limit + 0, (short)29, BYTE_ORDER);
            buffer.putByte(limit + 2, (byte)count);
        }

        public NoLegsEncoder next()
        {
            if (index >= count)
            {
                throw new java.util.NoSuchElementException();
            }

            offset = parentMessage.limit();
            parentMessage.limit(offset + sbeBlockLength());
            ++index;

            return this;
        }

        public int resetCountToIndex()
        {
            count = index;
            buffer.putByte(initialLimit + 2, (byte)count);

            return count;
        }

        public static short countMinValue()
        {
            return (short)0;
        }

        public static short countMaxValue()
        {
            return (short)254;
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 29;
        }

        public static int legExecIDId()
        {
            return 1893;
        }

        public static int legExecIDSinceVersion()
        {
            return 0;
        }

        public static int legExecIDEncodingOffset()
        {
            return 0;
        }

        public static int legExecIDEncodingLength()
        {
            return 8;
        }

        public static String legExecIDMetaAttribute(final MetaAttribute metaAttribute)
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

        public static long legExecIDNullValue()
        {
            return 0xffffffffffffffffL;
        }

        public static long legExecIDMinValue()
        {
            return 0x0L;
        }

        public static long legExecIDMaxValue()
        {
            return 0xfffffffffffffffeL;
        }

        public NoLegsEncoder legExecID(final long value)
        {
            buffer.putLong(offset + 0, value, BYTE_ORDER);
            return this;
        }


        public static int legLastPxId()
        {
            return 637;
        }

        public static int legLastPxSinceVersion()
        {
            return 0;
        }

        public static int legLastPxEncodingOffset()
        {
            return 8;
        }

        public static int legLastPxEncodingLength()
        {
            return 8;
        }

        public static String legLastPxMetaAttribute(final MetaAttribute metaAttribute)
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

        private final PRICE9Encoder legLastPx = new PRICE9Encoder();

        /**
         * Execution price assigned to a leg of a multileg instrument
         *
         * @return PRICE9Encoder : Execution price assigned to a leg of a multileg instrument
         */
        public PRICE9Encoder legLastPx()
        {
            legLastPx.wrap(buffer, offset + 8);
            return legLastPx;
        }

        public static int legSecurityIDId()
        {
            return 602;
        }

        public static int legSecurityIDSinceVersion()
        {
            return 0;
        }

        public static int legSecurityIDEncodingOffset()
        {
            return 16;
        }

        public static int legSecurityIDEncodingLength()
        {
            return 4;
        }

        public static String legSecurityIDMetaAttribute(final MetaAttribute metaAttribute)
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

        public static int legSecurityIDNullValue()
        {
            return -2147483648;
        }

        public static int legSecurityIDMinValue()
        {
            return -2147483647;
        }

        public static int legSecurityIDMaxValue()
        {
            return 2147483647;
        }

        public NoLegsEncoder legSecurityID(final int value)
        {
            buffer.putInt(offset + 16, value, BYTE_ORDER);
            return this;
        }


        public static int legTradeIDId()
        {
            return 1894;
        }

        public static int legTradeIDSinceVersion()
        {
            return 0;
        }

        public static int legTradeIDEncodingOffset()
        {
            return 20;
        }

        public static int legTradeIDEncodingLength()
        {
            return 4;
        }

        public static String legTradeIDMetaAttribute(final MetaAttribute metaAttribute)
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

        public static long legTradeIDNullValue()
        {
            return 4294967295L;
        }

        public static long legTradeIDMinValue()
        {
            return 0L;
        }

        public static long legTradeIDMaxValue()
        {
            return 4294967294L;
        }

        public NoLegsEncoder legTradeID(final long value)
        {
            buffer.putInt(offset + 20, (int)value, BYTE_ORDER);
            return this;
        }


        public static int legLastQtyId()
        {
            return 1418;
        }

        public static int legLastQtySinceVersion()
        {
            return 0;
        }

        public static int legLastQtyEncodingOffset()
        {
            return 24;
        }

        public static int legLastQtyEncodingLength()
        {
            return 4;
        }

        public static String legLastQtyMetaAttribute(final MetaAttribute metaAttribute)
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

        public static long legLastQtyNullValue()
        {
            return 4294967295L;
        }

        public static long legLastQtyMinValue()
        {
            return 0L;
        }

        public static long legLastQtyMaxValue()
        {
            return 4294967294L;
        }

        public NoLegsEncoder legLastQty(final long value)
        {
            buffer.putInt(offset + 24, (int)value, BYTE_ORDER);
            return this;
        }


        public static int legSideId()
        {
            return 624;
        }

        public static int legSideSinceVersion()
        {
            return 0;
        }

        public static int legSideEncodingOffset()
        {
            return 28;
        }

        public static int legSideEncodingLength()
        {
            return 1;
        }

        public static String legSideMetaAttribute(final MetaAttribute metaAttribute)
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

        public NoLegsEncoder legSide(final SideReq value)
        {
            buffer.putByte(offset + 28, (byte)value.value());
            return this;
        }
    }

    private final NoOrderEventsEncoder noOrderEvents = new NoOrderEventsEncoder(this);

    public static long noOrderEventsId()
    {
        return 1795;
    }

    /**
     * Number of fills which comprise fill quantity
     *
     * @param count of times the group will be encoded.
     * @return NoOrderEventsEncoder : encoder for the group.
     */
    public NoOrderEventsEncoder noOrderEventsCount(final int count)
    {
        noOrderEvents.wrap(buffer, count);
        return noOrderEvents;
    }

    /**
     * Number of fills which comprise fill quantity
     */

    public static final class NoOrderEventsEncoder
    {
        public static final int HEADER_SIZE = 3;
        private final ExecutionReportTradeSpread526Encoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int initialLimit;

        NoOrderEventsEncoder(final ExecutionReportTradeSpread526Encoder parentMessage)
        {
            this.parentMessage = parentMessage;
        }

        public void wrap(final MutableDirectBuffer buffer, final int count)
        {
            if (count < 0 || count > 254)
            {
                throw new IllegalArgumentException("count outside allowed range: count=" + count);
            }

            if (buffer != this.buffer)
            {
                this.buffer = buffer;
            }

            index = 0;
            this.count = count;
            final int limit = parentMessage.limit();
            initialLimit = limit;
            parentMessage.limit(limit + HEADER_SIZE);
            buffer.putShort(limit + 0, (short)23, BYTE_ORDER);
            buffer.putByte(limit + 2, (byte)count);
        }

        public NoOrderEventsEncoder next()
        {
            if (index >= count)
            {
                throw new java.util.NoSuchElementException();
            }

            offset = parentMessage.limit();
            parentMessage.limit(offset + sbeBlockLength());
            ++index;

            return this;
        }

        public int resetCountToIndex()
        {
            count = index;
            buffer.putByte(initialLimit + 2, (byte)count);

            return count;
        }

        public static short countMinValue()
        {
            return (short)0;
        }

        public static short countMaxValue()
        {
            return (short)254;
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 23;
        }

        public static int orderEventPxId()
        {
            return 1799;
        }

        public static int orderEventPxSinceVersion()
        {
            return 0;
        }

        public static int orderEventPxEncodingOffset()
        {
            return 0;
        }

        public static int orderEventPxEncodingLength()
        {
            return 8;
        }

        public static String orderEventPxMetaAttribute(final MetaAttribute metaAttribute)
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

        private final PRICE9Encoder orderEventPx = new PRICE9Encoder();

        /**
         * Refers to the fill price; same as LastPx (Tag 31) 
         *
         * @return PRICE9Encoder : Refers to the fill price; same as LastPx (Tag 31) 
         */
        public PRICE9Encoder orderEventPx()
        {
            orderEventPx.wrap(buffer, offset + 0);
            return orderEventPx;
        }

        public static int orderEventTextId()
        {
            return 1802;
        }

        public static int orderEventTextSinceVersion()
        {
            return 0;
        }

        public static int orderEventTextEncodingOffset()
        {
            return 8;
        }

        public static int orderEventTextEncodingLength()
        {
            return 5;
        }

        public static String orderEventTextMetaAttribute(final MetaAttribute metaAttribute)
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

        public static byte orderEventTextNullValue()
        {
            return (byte)0;
        }

        public static byte orderEventTextMinValue()
        {
            return (byte)32;
        }

        public static byte orderEventTextMaxValue()
        {
            return (byte)126;
        }

        public static int orderEventTextLength()
        {
            return 5;
        }


        public NoOrderEventsEncoder orderEventText(final int index, final byte value)
        {
            if (index < 0 || index >= 5)
            {
                throw new IndexOutOfBoundsException("index out of range: index=" + index);
            }

            final int pos = offset + 8 + (index * 1);
            buffer.putByte(pos, value);

            return this;
        }

        public static String orderEventTextCharacterEncoding()
        {
            return java.nio.charset.StandardCharsets.US_ASCII.name();
        }

        public NoOrderEventsEncoder putOrderEventText(final byte[] src, final int srcOffset)
        {
            final int length = 5;
            if (srcOffset < 0 || srcOffset > (src.length - length))
            {
                throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
            }

            buffer.putBytes(offset + 8, src, srcOffset, length);

            return this;
        }

        public NoOrderEventsEncoder orderEventText(final String src)
        {
            final int length = 5;
            final int srcLength = null == src ? 0 : src.length();
            if (srcLength > length)
            {
                throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
            }

            buffer.putStringWithoutLengthAscii(offset + 8, src);

            for (int start = srcLength; start < length; ++start)
            {
                buffer.putByte(offset + 8 + start, (byte)0);
            }

            return this;
        }

        public NoOrderEventsEncoder orderEventText(final CharSequence src)
        {
            final int length = 5;
            final int srcLength = null == src ? 0 : src.length();
            if (srcLength > length)
            {
                throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
            }

            buffer.putStringWithoutLengthAscii(offset + 8, src);

            for (int start = srcLength; start < length; ++start)
            {
                buffer.putByte(offset + 8 + start, (byte)0);
            }

            return this;
        }

        public static int orderEventExecIDId()
        {
            return 1797;
        }

        public static int orderEventExecIDSinceVersion()
        {
            return 0;
        }

        public static int orderEventExecIDEncodingOffset()
        {
            return 13;
        }

        public static int orderEventExecIDEncodingLength()
        {
            return 4;
        }

        public static String orderEventExecIDMetaAttribute(final MetaAttribute metaAttribute)
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

        public static long orderEventExecIDNullValue()
        {
            return 4294967295L;
        }

        public static long orderEventExecIDMinValue()
        {
            return 0L;
        }

        public static long orderEventExecIDMaxValue()
        {
            return 4294967294L;
        }

        public NoOrderEventsEncoder orderEventExecID(final long value)
        {
            buffer.putInt(offset + 13, (int)value, BYTE_ORDER);
            return this;
        }


        public static int orderEventQtyId()
        {
            return 1800;
        }

        public static int orderEventQtySinceVersion()
        {
            return 0;
        }

        public static int orderEventQtyEncodingOffset()
        {
            return 17;
        }

        public static int orderEventQtyEncodingLength()
        {
            return 4;
        }

        public static String orderEventQtyMetaAttribute(final MetaAttribute metaAttribute)
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

        public static long orderEventQtyNullValue()
        {
            return 4294967295L;
        }

        public static long orderEventQtyMinValue()
        {
            return 0L;
        }

        public static long orderEventQtyMaxValue()
        {
            return 4294967294L;
        }

        public NoOrderEventsEncoder orderEventQty(final long value)
        {
            buffer.putInt(offset + 17, (int)value, BYTE_ORDER);
            return this;
        }


        public static int orderEventTypeId()
        {
            return 1796;
        }

        public static int orderEventTypeSinceVersion()
        {
            return 0;
        }

        public static int orderEventTypeEncodingOffset()
        {
            return 21;
        }

        public static int orderEventTypeEncodingLength()
        {
            return 1;
        }

        public static String orderEventTypeMetaAttribute(final MetaAttribute metaAttribute)
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

        public NoOrderEventsEncoder orderEventType(final OrderEventType value)
        {
            buffer.putByte(offset + 21, (byte)value.value());
            return this;
        }

        public static int orderEventReasonId()
        {
            return 1798;
        }

        public static int orderEventReasonSinceVersion()
        {
            return 0;
        }

        public static int orderEventReasonEncodingOffset()
        {
            return 22;
        }

        public static int orderEventReasonEncodingLength()
        {
            return 1;
        }

        public static String orderEventReasonMetaAttribute(final MetaAttribute metaAttribute)
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

        public static short orderEventReasonNullValue()
        {
            return (short)255;
        }

        public static short orderEventReasonMinValue()
        {
            return (short)0;
        }

        public static short orderEventReasonMaxValue()
        {
            return (short)254;
        }

        public NoOrderEventsEncoder orderEventReason(final short value)
        {
            buffer.putByte(offset + 22, (byte)value);
            return this;
        }

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

        final ExecutionReportTradeSpread526Decoder decoder = new ExecutionReportTradeSpread526Decoder();
        decoder.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return decoder.appendTo(builder);
    }
}
