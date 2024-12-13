/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.MutableDirectBuffer;
import org.agrona.sbe.*;


/**
 * ExecutionReportTradeSpreadLeg
 */
@SuppressWarnings("all")
public final class ExecutionReportTradeSpreadLeg527Encoder implements MessageEncoderFlyweight
{
    public static final int BLOCK_LENGTH = 219;
    public static final int TEMPLATE_ID = 527;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final ExecutionReportTradeSpreadLeg527Encoder parentMessage = this;
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

    public ExecutionReportTradeSpreadLeg527Encoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public ExecutionReportTradeSpreadLeg527Encoder wrapAndApplyHeader(
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

    public ExecutionReportTradeSpreadLeg527Encoder seqNum(final long value)
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

    public ExecutionReportTradeSpreadLeg527Encoder uUID(final long value)
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


    public ExecutionReportTradeSpreadLeg527Encoder execID(final int index, final byte value)
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

    public ExecutionReportTradeSpreadLeg527Encoder putExecID(final byte[] src, final int srcOffset)
    {
        final int length = 40;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 12, src, srcOffset, length);

        return this;
    }

    public ExecutionReportTradeSpreadLeg527Encoder execID(final String src)
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

    public ExecutionReportTradeSpreadLeg527Encoder execID(final CharSequence src)
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


    public ExecutionReportTradeSpreadLeg527Encoder senderID(final int index, final byte value)
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

    public ExecutionReportTradeSpreadLeg527Encoder putSenderID(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 52, src, srcOffset, length);

        return this;
    }

    public ExecutionReportTradeSpreadLeg527Encoder senderID(final String src)
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

    public ExecutionReportTradeSpreadLeg527Encoder senderID(final CharSequence src)
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


    public ExecutionReportTradeSpreadLeg527Encoder clOrdID(final int index, final byte value)
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

    public ExecutionReportTradeSpreadLeg527Encoder putClOrdID(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 72, src, srcOffset, length);

        return this;
    }

    public ExecutionReportTradeSpreadLeg527Encoder clOrdID(final String src)
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

    public ExecutionReportTradeSpreadLeg527Encoder clOrdID(final CharSequence src)
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

    public static int volatilityId()
    {
        return 1188;
    }

    public static int volatilitySinceVersion()
    {
        return 0;
    }

    public static int volatilityEncodingOffset()
    {
        return 92;
    }

    public static int volatilityEncodingLength()
    {
        return 9;
    }

    public static String volatilityMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "float";
        }

        return "";
    }

    private final Decimal64NULLEncoder volatility = new Decimal64NULLEncoder();

    /**
     * Annualized volatility for option model calculations. Only applicable for vol quoted option trades.
     *
     * @return Decimal64NULLEncoder : Annualized volatility for option model calculations. Only applicable for vol quoted option trades.
     */
    public Decimal64NULLEncoder volatility()
    {
        volatility.wrap(buffer, offset + 92);
        return volatility;
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
        return 101;
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

    public ExecutionReportTradeSpreadLeg527Encoder partyDetailsListReqID(final long value)
    {
        buffer.putLong(offset + 101, value, BYTE_ORDER);
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
        return 109;
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
        lastPx.wrap(buffer, offset + 109);
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
        return 117;
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

    public ExecutionReportTradeSpreadLeg527Encoder orderID(final long value)
    {
        buffer.putLong(offset + 117, value, BYTE_ORDER);
        return this;
    }


    public static int underlyingPxId()
    {
        return 810;
    }

    public static int underlyingPxSinceVersion()
    {
        return 0;
    }

    public static int underlyingPxEncodingOffset()
    {
        return 125;
    }

    public static int underlyingPxEncodingLength()
    {
        return 8;
    }

    public static String underlyingPxMetaAttribute(final MetaAttribute metaAttribute)
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

    private final PRICENULL9Encoder underlyingPx = new PRICENULL9Encoder();

    /**
     * Underlying price associated with a derivative instrument. Price for the future used in calculating the conversion of vol. to premium for the option. Only applicable for vol quoted option trades.
     *
     * @return PRICENULL9Encoder : Underlying price associated with a derivative instrument. Price for the future used in calculating the conversion of vol. to premium for the option. Only applicable for vol quoted option trades.
     */
    public PRICENULL9Encoder underlyingPx()
    {
        underlyingPx.wrap(buffer, offset + 125);
        return underlyingPx;
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
        return 133;
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

    public ExecutionReportTradeSpreadLeg527Encoder transactTime(final long value)
    {
        buffer.putLong(offset + 133, value, BYTE_ORDER);
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
        return 141;
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

    public ExecutionReportTradeSpreadLeg527Encoder sendingTimeEpoch(final long value)
    {
        buffer.putLong(offset + 141, value, BYTE_ORDER);
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
        return 149;
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

    public ExecutionReportTradeSpreadLeg527Encoder secExecID(final long value)
    {
        buffer.putLong(offset + 149, value, BYTE_ORDER);
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
        return 157;
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


    public ExecutionReportTradeSpreadLeg527Encoder location(final int index, final byte value)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 157 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String locationCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public ExecutionReportTradeSpreadLeg527Encoder putLocation(final byte[] src, final int srcOffset)
    {
        final int length = 5;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 157, src, srcOffset, length);

        return this;
    }

    public ExecutionReportTradeSpreadLeg527Encoder location(final String src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 157, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 157 + start, (byte)0);
        }

        return this;
    }

    public ExecutionReportTradeSpreadLeg527Encoder location(final CharSequence src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 157, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 157 + start, (byte)0);
        }

        return this;
    }

    public static int optionDeltaId()
    {
        return 811;
    }

    public static int optionDeltaSinceVersion()
    {
        return 0;
    }

    public static int optionDeltaEncodingOffset()
    {
        return 162;
    }

    public static int optionDeltaEncodingLength()
    {
        return 5;
    }

    public static String optionDeltaMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "float";
        }

        return "";
    }

    private final Decimal32NULLEncoder optionDelta = new Decimal32NULLEncoder();

    /**
     * The rate of change in the price of a derivative with respect to the movement in the price of the underlying instrument(s) upon which the derivative instrument price is based. Calculated delta, expressed as a decimal between -1 and 1. Only applicable for vol quoted option trades.
     *
     * @return Decimal32NULLEncoder : The rate of change in the price of a derivative with respect to the movement in the price of the underlying instrument(s) upon which the derivative instrument price is based. Calculated delta, expressed as a decimal between -1 and 1. Only applicable for vol quoted option trades.
     */
    public Decimal32NULLEncoder optionDelta()
    {
        optionDelta.wrap(buffer, offset + 162);
        return optionDelta;
    }

    public static int timeToExpirationId()
    {
        return 1189;
    }

    public static int timeToExpirationSinceVersion()
    {
        return 0;
    }

    public static int timeToExpirationEncodingOffset()
    {
        return 167;
    }

    public static int timeToExpirationEncodingLength()
    {
        return 5;
    }

    public static String timeToExpirationMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "float";
        }

        return "";
    }

    private final Decimal32NULLEncoder timeToExpiration = new Decimal32NULLEncoder();

    /**
     * Time to expiration in years calculated as the number of days remaining to expiration divided by 365 days per year. This value is expressed as a decimal portion of a year, typically the days to expiration divided by the days in a year. Currently the year assumption is 365. Only applicable for vol quoted option trades.
     *
     * @return Decimal32NULLEncoder : Time to expiration in years calculated as the number of days remaining to expiration divided by 365 days per year. This value is expressed as a decimal portion of a year, typically the days to expiration divided by the days in a year. Currently the year assumption is 365. Only applicable for vol quoted option trades.
     */
    public Decimal32NULLEncoder timeToExpiration()
    {
        timeToExpiration.wrap(buffer, offset + 167);
        return timeToExpiration;
    }

    public static int riskFreeRateId()
    {
        return 1190;
    }

    public static int riskFreeRateSinceVersion()
    {
        return 0;
    }

    public static int riskFreeRateEncodingOffset()
    {
        return 172;
    }

    public static int riskFreeRateEncodingLength()
    {
        return 5;
    }

    public static String riskFreeRateMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "float";
        }

        return "";
    }

    private final Decimal32NULLEncoder riskFreeRate = new Decimal32NULLEncoder();

    /**
     * Interest rate. Usually some form of short term rate.
     *
     * @return Decimal32NULLEncoder : Interest rate. Usually some form of short term rate.
     */
    public Decimal32NULLEncoder riskFreeRate()
    {
        riskFreeRate.wrap(buffer, offset + 172);
        return riskFreeRate;
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
        return 177;
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

    public ExecutionReportTradeSpreadLeg527Encoder securityID(final int value)
    {
        buffer.putInt(offset + 177, value, BYTE_ORDER);
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
        return 181;
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

    public ExecutionReportTradeSpreadLeg527Encoder lastQty(final long value)
    {
        buffer.putInt(offset + 181, (int)value, BYTE_ORDER);
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
        return 185;
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

    public ExecutionReportTradeSpreadLeg527Encoder cumQty(final long value)
    {
        buffer.putInt(offset + 185, (int)value, BYTE_ORDER);
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
        return 189;
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

    public ExecutionReportTradeSpreadLeg527Encoder sideTradeID(final long value)
    {
        buffer.putInt(offset + 189, (int)value, BYTE_ORDER);
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
        return 193;
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

    public ExecutionReportTradeSpreadLeg527Encoder tradeDate(final int value)
    {
        buffer.putShort(offset + 193, (short)value, BYTE_ORDER);
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
        return 195;
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

    public ExecutionReportTradeSpreadLeg527Encoder ordStatus(final OrdStatusTrd value)
    {
        buffer.putByte(offset + 195, (byte)value.value());
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
        return 196;
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
        return 196;
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

    public ExecutionReportTradeSpreadLeg527Encoder ordType(final OrderType value)
    {
        buffer.putByte(offset + 196, value.value());
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
        return 197;
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

    public ExecutionReportTradeSpreadLeg527Encoder side(final SideReq value)
    {
        buffer.putByte(offset + 197, (byte)value.value());
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
        return 198;
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

    public ExecutionReportTradeSpreadLeg527Encoder possRetransFlag(final BooleanFlag value)
    {
        buffer.putByte(offset + 198, (byte)value.value());
        return this;
    }

    public static int settlDateId()
    {
        return 64;
    }

    public static int settlDateSinceVersion()
    {
        return 6;
    }

    public static int settlDateEncodingOffset()
    {
        return 199;
    }

    public static int settlDateEncodingLength()
    {
        return 2;
    }

    public static String settlDateMetaAttribute(final MetaAttribute metaAttribute)
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

    public static int settlDateNullValue()
    {
        return 65535;
    }

    public static int settlDateMinValue()
    {
        return 0;
    }

    public static int settlDateMaxValue()
    {
        return 65534;
    }

    public ExecutionReportTradeSpreadLeg527Encoder settlDate(final int value)
    {
        buffer.putShort(offset + 199, (short)value, BYTE_ORDER);
        return this;
    }


    public static int calculatedCcyLastQtyId()
    {
        return 1056;
    }

    public static int calculatedCcyLastQtySinceVersion()
    {
        return 6;
    }

    public static int calculatedCcyLastQtyEncodingOffset()
    {
        return 201;
    }

    public static int calculatedCcyLastQtyEncodingLength()
    {
        return 9;
    }

    public static String calculatedCcyLastQtyMetaAttribute(final MetaAttribute metaAttribute)
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

    private final Decimal64NULLEncoder calculatedCcyLastQty = new Decimal64NULLEncoder();

    /**
     * Total amount traded (in notional) in counter currency for the Spot leg
     *
     * @return Decimal64NULLEncoder : Total amount traded (in notional) in counter currency for the Spot leg
     */
    public Decimal64NULLEncoder calculatedCcyLastQty()
    {
        calculatedCcyLastQty.wrap(buffer, offset + 201);
        return calculatedCcyLastQty;
    }

    public static int grossTradeAmtId()
    {
        return 381;
    }

    public static int grossTradeAmtSinceVersion()
    {
        return 6;
    }

    public static int grossTradeAmtEncodingOffset()
    {
        return 210;
    }

    public static int grossTradeAmtEncodingLength()
    {
        return 9;
    }

    public static String grossTradeAmtMetaAttribute(final MetaAttribute metaAttribute)
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

    private final Decimal64NULLEncoder grossTradeAmt = new Decimal64NULLEncoder();

    /**
     * Total amount traded (in notional) in base currency for the Spot leg
     *
     * @return Decimal64NULLEncoder : Total amount traded (in notional) in base currency for the Spot leg
     */
    public Decimal64NULLEncoder grossTradeAmt()
    {
        grossTradeAmt.wrap(buffer, offset + 210);
        return grossTradeAmt;
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
        private final ExecutionReportTradeSpreadLeg527Encoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int initialLimit;

        NoFillsEncoder(final ExecutionReportTradeSpreadLeg527Encoder parentMessage)
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
        private final ExecutionReportTradeSpreadLeg527Encoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int initialLimit;

        NoOrderEventsEncoder(final ExecutionReportTradeSpreadLeg527Encoder parentMessage)
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

        final ExecutionReportTradeSpreadLeg527Decoder decoder = new ExecutionReportTradeSpreadLeg527Decoder();
        decoder.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return decoder.appendTo(builder);
    }
}