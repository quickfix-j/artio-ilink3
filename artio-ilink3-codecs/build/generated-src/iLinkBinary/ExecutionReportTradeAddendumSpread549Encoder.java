/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.MutableDirectBuffer;
import org.agrona.sbe.*;


/**
 * ExecutionReportTradeAddendumSpread
 */
@SuppressWarnings("all")
public final class ExecutionReportTradeAddendumSpread549Encoder implements MessageEncoderFlyweight
{
    public static final int BLOCK_LENGTH = 187;
    public static final int TEMPLATE_ID = 549;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final ExecutionReportTradeAddendumSpread549Encoder parentMessage = this;
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

    public ExecutionReportTradeAddendumSpread549Encoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public ExecutionReportTradeAddendumSpread549Encoder wrapAndApplyHeader(
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

    public ExecutionReportTradeAddendumSpread549Encoder seqNum(final long value)
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

    public ExecutionReportTradeAddendumSpread549Encoder uUID(final long value)
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


    public ExecutionReportTradeAddendumSpread549Encoder execID(final int index, final byte value)
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

    public ExecutionReportTradeAddendumSpread549Encoder putExecID(final byte[] src, final int srcOffset)
    {
        final int length = 40;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 12, src, srcOffset, length);

        return this;
    }

    public ExecutionReportTradeAddendumSpread549Encoder execID(final String src)
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

    public ExecutionReportTradeAddendumSpread549Encoder execID(final CharSequence src)
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


    public ExecutionReportTradeAddendumSpread549Encoder senderID(final int index, final byte value)
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

    public ExecutionReportTradeAddendumSpread549Encoder putSenderID(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 52, src, srcOffset, length);

        return this;
    }

    public ExecutionReportTradeAddendumSpread549Encoder senderID(final String src)
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

    public ExecutionReportTradeAddendumSpread549Encoder senderID(final CharSequence src)
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


    public ExecutionReportTradeAddendumSpread549Encoder clOrdID(final int index, final byte value)
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

    public ExecutionReportTradeAddendumSpread549Encoder putClOrdID(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 72, src, srcOffset, length);

        return this;
    }

    public ExecutionReportTradeAddendumSpread549Encoder clOrdID(final String src)
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

    public ExecutionReportTradeAddendumSpread549Encoder clOrdID(final CharSequence src)
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

    public ExecutionReportTradeAddendumSpread549Encoder partyDetailsListReqID(final long value)
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

    public ExecutionReportTradeAddendumSpread549Encoder orderID(final long value)
    {
        buffer.putLong(offset + 108, value, BYTE_ORDER);
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
        return 116;
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

    public ExecutionReportTradeAddendumSpread549Encoder transactTime(final long value)
    {
        buffer.putLong(offset + 116, value, BYTE_ORDER);
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
        return 124;
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

    public ExecutionReportTradeAddendumSpread549Encoder sendingTimeEpoch(final long value)
    {
        buffer.putLong(offset + 124, value, BYTE_ORDER);
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
        return 132;
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

    public ExecutionReportTradeAddendumSpread549Encoder secExecID(final long value)
    {
        buffer.putLong(offset + 132, value, BYTE_ORDER);
        return this;
    }


    public static int origSecondaryExecutionIDId()
    {
        return 9703;
    }

    public static int origSecondaryExecutionIDSinceVersion()
    {
        return 0;
    }

    public static int origSecondaryExecutionIDEncodingOffset()
    {
        return 140;
    }

    public static int origSecondaryExecutionIDEncodingLength()
    {
        return 8;
    }

    public static String origSecondaryExecutionIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long origSecondaryExecutionIDNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long origSecondaryExecutionIDMinValue()
    {
        return 0x0L;
    }

    public static long origSecondaryExecutionIDMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public ExecutionReportTradeAddendumSpread549Encoder origSecondaryExecutionID(final long value)
    {
        buffer.putLong(offset + 140, value, BYTE_ORDER);
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
        return 148;
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


    public ExecutionReportTradeAddendumSpread549Encoder location(final int index, final byte value)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 148 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String locationCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public ExecutionReportTradeAddendumSpread549Encoder putLocation(final byte[] src, final int srcOffset)
    {
        final int length = 5;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 148, src, srcOffset, length);

        return this;
    }

    public ExecutionReportTradeAddendumSpread549Encoder location(final String src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 148, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 148 + start, (byte)0);
        }

        return this;
    }

    public ExecutionReportTradeAddendumSpread549Encoder location(final CharSequence src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 148, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 148 + start, (byte)0);
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
        return 153;
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

    public ExecutionReportTradeAddendumSpread549Encoder securityID(final int value)
    {
        buffer.putInt(offset + 153, value, BYTE_ORDER);
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
        return 157;
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

    public ExecutionReportTradeAddendumSpread549Encoder mDTradeEntryID(final long value)
    {
        buffer.putInt(offset + 157, (int)value, BYTE_ORDER);
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
        return 161;
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

    public ExecutionReportTradeAddendumSpread549Encoder lastQty(final long value)
    {
        buffer.putInt(offset + 161, (int)value, BYTE_ORDER);
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
        return 165;
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

    public ExecutionReportTradeAddendumSpread549Encoder sideTradeID(final long value)
    {
        buffer.putInt(offset + 165, (int)value, BYTE_ORDER);
        return this;
    }


    public static int origSideTradeIDId()
    {
        return 1507;
    }

    public static int origSideTradeIDSinceVersion()
    {
        return 0;
    }

    public static int origSideTradeIDEncodingOffset()
    {
        return 169;
    }

    public static int origSideTradeIDEncodingLength()
    {
        return 4;
    }

    public static String origSideTradeIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long origSideTradeIDNullValue()
    {
        return 4294967295L;
    }

    public static long origSideTradeIDMinValue()
    {
        return 0L;
    }

    public static long origSideTradeIDMaxValue()
    {
        return 4294967294L;
    }

    public ExecutionReportTradeAddendumSpread549Encoder origSideTradeID(final long value)
    {
        buffer.putInt(offset + 169, (int)value, BYTE_ORDER);
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
        return 173;
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

    public ExecutionReportTradeAddendumSpread549Encoder tradeDate(final int value)
    {
        buffer.putShort(offset + 173, (short)value, BYTE_ORDER);
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
        return 175;
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

    public ExecutionReportTradeAddendumSpread549Encoder ordStatus(final OrdStatusTrdCxl value)
    {
        buffer.putByte(offset + 175, value.value());
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
        return 176;
    }

    public static int execTypeEncodingLength()
    {
        return 1;
    }

    public static String execTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    public ExecutionReportTradeAddendumSpread549Encoder execType(final ExecTypTrdCxl value)
    {
        buffer.putByte(offset + 176, value.value());
        return this;
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
        return 177;
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

    public ExecutionReportTradeAddendumSpread549Encoder ordType(final OrderType value)
    {
        buffer.putByte(offset + 177, value.value());
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
        return 178;
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

    public ExecutionReportTradeAddendumSpread549Encoder side(final SideReq value)
    {
        buffer.putByte(offset + 178, (byte)value.value());
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
        return 179;
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

    public ExecutionReportTradeAddendumSpread549Encoder manualOrderIndicator(final ManualOrdIndReq value)
    {
        buffer.putByte(offset + 179, (byte)value.value());
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
        return 180;
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

    public ExecutionReportTradeAddendumSpread549Encoder possRetransFlag(final BooleanFlag value)
    {
        buffer.putByte(offset + 180, (byte)value.value());
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
        return 181;
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

    public ExecutionReportTradeAddendumSpread549Encoder totalNumSecurities(final short value)
    {
        buffer.putByte(offset + 181, (byte)value);
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
        return 182;
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
     * Instructions for order handling on exchange. If more than one instruction is applicable to an order, this field can contain multiple instructions separated by space
     *
     * @return ExecInstEncoder : Instructions for order handling on exchange. If more than one instruction is applicable to an order, this field can contain multiple instructions separated by space
     */
    public ExecInstEncoder execInst()
    {
        execInst.wrap(buffer, offset + 182);
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
        return 183;
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

    public ExecutionReportTradeAddendumSpread549Encoder executionMode(final ExecMode value)
    {
        buffer.putByte(offset + 183, value.value());
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
        return 184;
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

    public ExecutionReportTradeAddendumSpread549Encoder liquidityFlag(final BooleanNULL value)
    {
        buffer.putByte(offset + 184, (byte)value.value());
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
        return 185;
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

    public ExecutionReportTradeAddendumSpread549Encoder managedOrder(final BooleanNULL value)
    {
        buffer.putByte(offset + 185, (byte)value.value());
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
        return 186;
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

    public ExecutionReportTradeAddendumSpread549Encoder shortSaleType(final ShortSaleType value)
    {
        buffer.putByte(offset + 186, (byte)value.value());
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
        private final ExecutionReportTradeAddendumSpread549Encoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int initialLimit;

        NoFillsEncoder(final ExecutionReportTradeAddendumSpread549Encoder parentMessage)
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
     * Number of legs (repeating groups).
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
     * Number of legs (repeating groups).
     */

    public static final class NoLegsEncoder
    {
        public static final int HEADER_SIZE = 3;
        private final ExecutionReportTradeAddendumSpread549Encoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int initialLimit;

        NoLegsEncoder(final ExecutionReportTradeAddendumSpread549Encoder parentMessage)
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
            buffer.putShort(limit + 0, (short)41, BYTE_ORDER);
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
            return 41;
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

        public static int legExecRefIDId()
        {
            return 1901;
        }

        public static int legExecRefIDSinceVersion()
        {
            return 0;
        }

        public static int legExecRefIDEncodingOffset()
        {
            return 16;
        }

        public static int legExecRefIDEncodingLength()
        {
            return 8;
        }

        public static String legExecRefIDMetaAttribute(final MetaAttribute metaAttribute)
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

        public static long legExecRefIDNullValue()
        {
            return 0xffffffffffffffffL;
        }

        public static long legExecRefIDMinValue()
        {
            return 0x0L;
        }

        public static long legExecRefIDMaxValue()
        {
            return 0xfffffffffffffffeL;
        }

        public NoLegsEncoder legExecRefID(final long value)
        {
            buffer.putLong(offset + 16, value, BYTE_ORDER);
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
            return 24;
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
            buffer.putInt(offset + 24, (int)value, BYTE_ORDER);
            return this;
        }


        public static int legTradeRefIDId()
        {
            return 39023;
        }

        public static int legTradeRefIDSinceVersion()
        {
            return 0;
        }

        public static int legTradeRefIDEncodingOffset()
        {
            return 28;
        }

        public static int legTradeRefIDEncodingLength()
        {
            return 4;
        }

        public static String legTradeRefIDMetaAttribute(final MetaAttribute metaAttribute)
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

        public static long legTradeRefIDNullValue()
        {
            return 4294967295L;
        }

        public static long legTradeRefIDMinValue()
        {
            return 0L;
        }

        public static long legTradeRefIDMaxValue()
        {
            return 4294967294L;
        }

        public NoLegsEncoder legTradeRefID(final long value)
        {
            buffer.putInt(offset + 28, (int)value, BYTE_ORDER);
            return this;
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
            return 32;
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
            buffer.putInt(offset + 32, value, BYTE_ORDER);
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
            return 36;
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
            buffer.putInt(offset + 36, (int)value, BYTE_ORDER);
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
            return 40;
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
            buffer.putByte(offset + 40, (byte)value.value());
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
        private final ExecutionReportTradeAddendumSpread549Encoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int initialLimit;

        NoOrderEventsEncoder(final ExecutionReportTradeAddendumSpread549Encoder parentMessage)
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
            buffer.putShort(limit + 0, (short)27, BYTE_ORDER);
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
            return 27;
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

        public NoOrderEventsEncoder orderEventType(final TradeAddendum value)
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


        public static int originalOrderEventExecIDId()
        {
            return 6555;
        }

        public static int originalOrderEventExecIDSinceVersion()
        {
            return 3;
        }

        public static int originalOrderEventExecIDEncodingOffset()
        {
            return 23;
        }

        public static int originalOrderEventExecIDEncodingLength()
        {
            return 4;
        }

        public static String originalOrderEventExecIDMetaAttribute(final MetaAttribute metaAttribute)
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

        public static long originalOrderEventExecIDNullValue()
        {
            return 4294967295L;
        }

        public static long originalOrderEventExecIDMinValue()
        {
            return 0L;
        }

        public static long originalOrderEventExecIDMaxValue()
        {
            return 4294967294L;
        }

        public NoOrderEventsEncoder originalOrderEventExecID(final long value)
        {
            buffer.putInt(offset + 23, (int)value, BYTE_ORDER);
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

        final ExecutionReportTradeAddendumSpread549Decoder decoder = new ExecutionReportTradeAddendumSpread549Decoder();
        decoder.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return decoder.appendTo(builder);
    }
}