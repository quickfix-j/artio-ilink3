/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.DirectBuffer;
import org.agrona.sbe.*;


/**
 * ExecutionReportTradeOutright
 */
@SuppressWarnings("all")
public final class ExecutionReportTradeOutright525Decoder implements MessageDecoderFlyweight
{
    public static final int BLOCK_LENGTH = 293;
    public static final int TEMPLATE_ID = 525;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final ExecutionReportTradeOutright525Decoder parentMessage = this;
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
        return "8";
    }

    public DirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public ExecutionReportTradeOutright525Decoder wrap(
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

    public ExecutionReportTradeOutright525Decoder wrapAndApplyHeader(
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

    public ExecutionReportTradeOutright525Decoder sbeRewind()
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

    public long seqNum()
    {
        return (buffer.getInt(offset + 0, BYTE_ORDER) & 0xFFFF_FFFFL);
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

    public long uUID()
    {
        return buffer.getLong(offset + 4, BYTE_ORDER);
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


    public byte execID(final int index)
    {
        if (index < 0 || index >= 40)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 12 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String execIDCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getExecID(final byte[] dst, final int dstOffset)
    {
        final int length = 40;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 12, dst, dstOffset, length);

        return length;
    }

    public String execID()
    {
        final byte[] dst = new byte[40];
        buffer.getBytes(offset + 12, dst, 0, 40);

        int end = 0;
        for (; end < 40 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getExecID(final Appendable value)
    {
        for (int i = 0; i < 40; ++i)
        {
            final int c = buffer.getByte(offset + 12 + i) & 0xFF;
            if (c == 0)
            {
                return i;
            }

            try
            {
                value.append(c > 127 ? '?' : (char)c);
            }
            catch (final java.io.IOException ex)
            {
                throw new java.io.UncheckedIOException(ex);
            }
        }

        return 40;
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


    public byte senderID(final int index)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 52 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String senderIDCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getSenderID(final byte[] dst, final int dstOffset)
    {
        final int length = 20;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 52, dst, dstOffset, length);

        return length;
    }

    public String senderID()
    {
        final byte[] dst = new byte[20];
        buffer.getBytes(offset + 52, dst, 0, 20);

        int end = 0;
        for (; end < 20 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getSenderID(final Appendable value)
    {
        for (int i = 0; i < 20; ++i)
        {
            final int c = buffer.getByte(offset + 52 + i) & 0xFF;
            if (c == 0)
            {
                return i;
            }

            try
            {
                value.append(c > 127 ? '?' : (char)c);
            }
            catch (final java.io.IOException ex)
            {
                throw new java.io.UncheckedIOException(ex);
            }
        }

        return 20;
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


    public byte clOrdID(final int index)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 72 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String clOrdIDCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getClOrdID(final byte[] dst, final int dstOffset)
    {
        final int length = 20;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 72, dst, dstOffset, length);

        return length;
    }

    public String clOrdID()
    {
        final byte[] dst = new byte[20];
        buffer.getBytes(offset + 72, dst, 0, 20);

        int end = 0;
        for (; end < 20 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getClOrdID(final Appendable value)
    {
        for (int i = 0; i < 20; ++i)
        {
            final int c = buffer.getByte(offset + 72 + i) & 0xFF;
            if (c == 0)
            {
                return i;
            }

            try
            {
                value.append(c > 127 ? '?' : (char)c);
            }
            catch (final java.io.IOException ex)
            {
                throw new java.io.UncheckedIOException(ex);
            }
        }

        return 20;
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

    public long partyDetailsListReqID()
    {
        return buffer.getLong(offset + 92, BYTE_ORDER);
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

    private final PRICE9Decoder lastPx = new PRICE9Decoder();

    /**
     * Price of this (last) fill
     *
     * @return PRICE9Decoder : Price of this (last) fill
     */
    public PRICE9Decoder lastPx()
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

    public long orderID()
    {
        return buffer.getLong(offset + 108, BYTE_ORDER);
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

    private final PRICE9Decoder price = new PRICE9Decoder();

    /**
     * Price per share or contract
     *
     * @return PRICE9Decoder : Price per share or contract
     */
    public PRICE9Decoder price()
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

    private final PRICENULL9Decoder stopPx = new PRICENULL9Decoder();

    /**
     * The stop price of a stop protect or stop limit order. (Conditionally required if OrdType = 3 or 4).
     *
     * @return PRICENULL9Decoder : The stop price of a stop protect or stop limit order. (Conditionally required if OrdType = 3 or 4).
     */
    public PRICENULL9Decoder stopPx()
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

    public long transactTime()
    {
        return buffer.getLong(offset + 132, BYTE_ORDER);
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

    public long sendingTimeEpoch()
    {
        return buffer.getLong(offset + 140, BYTE_ORDER);
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

    public long orderRequestID()
    {
        return buffer.getLong(offset + 148, BYTE_ORDER);
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

    public long secExecID()
    {
        return buffer.getLong(offset + 156, BYTE_ORDER);
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

    public long crossID()
    {
        return buffer.getLong(offset + 164, BYTE_ORDER);
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

    public long hostCrossID()
    {
        return buffer.getLong(offset + 172, BYTE_ORDER);
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


    public byte location(final int index)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 180 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String locationCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getLocation(final byte[] dst, final int dstOffset)
    {
        final int length = 5;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 180, dst, dstOffset, length);

        return length;
    }

    public String location()
    {
        final byte[] dst = new byte[5];
        buffer.getBytes(offset + 180, dst, 0, 5);

        int end = 0;
        for (; end < 5 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getLocation(final Appendable value)
    {
        for (int i = 0; i < 5; ++i)
        {
            final int c = buffer.getByte(offset + 180 + i) & 0xFF;
            if (c == 0)
            {
                return i;
            }

            try
            {
                value.append(c > 127 ? '?' : (char)c);
            }
            catch (final java.io.IOException ex)
            {
                throw new java.io.UncheckedIOException(ex);
            }
        }

        return 5;
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

    public int securityID()
    {
        return buffer.getInt(offset + 185, BYTE_ORDER);
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

    public long orderQty()
    {
        return (buffer.getInt(offset + 189, BYTE_ORDER) & 0xFFFF_FFFFL);
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

    public long lastQty()
    {
        return (buffer.getInt(offset + 193, BYTE_ORDER) & 0xFFFF_FFFFL);
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

    public long cumQty()
    {
        return (buffer.getInt(offset + 197, BYTE_ORDER) & 0xFFFF_FFFFL);
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

    public long mDTradeEntryID()
    {
        return (buffer.getInt(offset + 201, BYTE_ORDER) & 0xFFFF_FFFFL);
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

    public long sideTradeID()
    {
        return (buffer.getInt(offset + 205, BYTE_ORDER) & 0xFFFF_FFFFL);
    }


    public static int tradeLinkIDId()
    {
        return 820;
    }

    public static int tradeLinkIDSinceVersion()
    {
        return 0;
    }

    public static int tradeLinkIDEncodingOffset()
    {
        return 209;
    }

    public static int tradeLinkIDEncodingLength()
    {
        return 4;
    }

    public static String tradeLinkIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long tradeLinkIDNullValue()
    {
        return 4294967295L;
    }

    public static long tradeLinkIDMinValue()
    {
        return 0L;
    }

    public static long tradeLinkIDMaxValue()
    {
        return 4294967294L;
    }

    public long tradeLinkID()
    {
        return (buffer.getInt(offset + 209, BYTE_ORDER) & 0xFFFF_FFFFL);
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
        return 213;
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

    public long leavesQty()
    {
        return (buffer.getInt(offset + 213, BYTE_ORDER) & 0xFFFF_FFFFL);
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
        return 217;
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

    public int tradeDate()
    {
        return (buffer.getShort(offset + 217, BYTE_ORDER) & 0xFFFF);
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
        return 219;
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

    public int expireDate()
    {
        return (buffer.getShort(offset + 219, BYTE_ORDER) & 0xFFFF);
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
        return 221;
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

    public short ordStatusRaw()
    {
        return ((short)(buffer.getByte(offset + 221) & 0xFF));
    }

    public OrdStatusTrd ordStatus()
    {
        return OrdStatusTrd.get(((short)(buffer.getByte(offset + 221) & 0xFF)));
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
        return 222;
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
        return 222;
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

    public byte ordTypeRaw()
    {
        return buffer.getByte(offset + 222);
    }

    public OrderType ordType()
    {
        return OrderType.get(buffer.getByte(offset + 222));
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
        return 223;
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

    public short sideRaw()
    {
        return ((short)(buffer.getByte(offset + 223) & 0xFF));
    }

    public SideReq side()
    {
        return SideReq.get(((short)(buffer.getByte(offset + 223) & 0xFF)));
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
        return 224;
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

    public short timeInForceRaw()
    {
        return ((short)(buffer.getByte(offset + 224) & 0xFF));
    }

    public TimeInForce timeInForce()
    {
        return TimeInForce.get(((short)(buffer.getByte(offset + 224) & 0xFF)));
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
        return 225;
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

    public short manualOrderIndicatorRaw()
    {
        return ((short)(buffer.getByte(offset + 225) & 0xFF));
    }

    public ManualOrdIndReq manualOrderIndicator()
    {
        return ManualOrdIndReq.get(((short)(buffer.getByte(offset + 225) & 0xFF)));
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
        return 226;
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

    public short possRetransFlagRaw()
    {
        return ((short)(buffer.getByte(offset + 226) & 0xFF));
    }

    public BooleanFlag possRetransFlag()
    {
        return BooleanFlag.get(((short)(buffer.getByte(offset + 226) & 0xFF)));
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
        return 227;
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

    public short aggressorIndicatorRaw()
    {
        return ((short)(buffer.getByte(offset + 227) & 0xFF));
    }

    public BooleanFlag aggressorIndicator()
    {
        return BooleanFlag.get(((short)(buffer.getByte(offset + 227) & 0xFF)));
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
        return 228;
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

    public short crossType()
    {
        return ((short)(buffer.getByte(offset + 228) & 0xFF));
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
        return 229;
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

    private final ExecInstDecoder execInst = new ExecInstDecoder();

    /**
     * Instructions for order handling on exchange. Since more than one instruction is applicable to an order, this field can be represented as a bitset.
     *
     * @return ExecInstDecoder : Instructions for order handling on exchange. Since more than one instruction is applicable to an order, this field can be represented as a bitset.
     */
    public ExecInstDecoder execInst()
    {
        execInst.wrap(buffer, offset + 229);
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
        return 230;
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

    public byte executionModeRaw()
    {
        return buffer.getByte(offset + 230);
    }

    public ExecMode executionMode()
    {
        return ExecMode.get(buffer.getByte(offset + 230));
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
        return 231;
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

    public short liquidityFlagRaw()
    {
        return ((short)(buffer.getByte(offset + 231) & 0xFF));
    }

    public BooleanNULL liquidityFlag()
    {
        return BooleanNULL.get(((short)(buffer.getByte(offset + 231) & 0xFF)));
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
        return 232;
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

    public short managedOrderRaw()
    {
        return ((short)(buffer.getByte(offset + 232) & 0xFF));
    }

    public BooleanNULL managedOrder()
    {
        return BooleanNULL.get(((short)(buffer.getByte(offset + 232) & 0xFF)));
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
        return 233;
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

    public short shortSaleTypeRaw()
    {
        return ((short)(buffer.getByte(offset + 233) & 0xFF));
    }

    public ShortSaleType shortSaleType()
    {
        return ShortSaleType.get(((short)(buffer.getByte(offset + 233) & 0xFF)));
    }


    public static int ownershipId()
    {
        return 7191;
    }

    public static int ownershipSinceVersion()
    {
        return 0;
    }

    public static int ownershipEncodingOffset()
    {
        return 234;
    }

    public static int ownershipEncodingLength()
    {
        return 1;
    }

    public static String ownershipMetaAttribute(final MetaAttribute metaAttribute)
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

    public static short ownershipNullValue()
    {
        return (short)255;
    }

    public static short ownershipMinValue()
    {
        return (short)0;
    }

    public static short ownershipMaxValue()
    {
        return (short)254;
    }

    public short ownership()
    {
        return ((short)(buffer.getByte(offset + 234) & 0xFF));
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
        return 235;
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

    private final PRICENULL9Decoder discretionPrice = new PRICENULL9Decoder();

    /**
     * The presence of DiscretionPrice on an order indicates that the trader wishes to display one price but will accept trades at another price
     *
     * @return PRICENULL9Decoder : The presence of DiscretionPrice on an order indicates that the trader wishes to display one price but will accept trades at another price
     */
    public PRICENULL9Decoder discretionPrice()
    {
        if (parentMessage.actingVersion < 6)
        {
            return null;
        }

        discretionPrice.wrap(buffer, offset + 235);
        return discretionPrice;
    }

    public static int trdTypeId()
    {
        return 828;
    }

    public static int trdTypeSinceVersion()
    {
        return 6;
    }

    public static int trdTypeEncodingOffset()
    {
        return 243;
    }

    public static int trdTypeEncodingLength()
    {
        return 2;
    }

    public static String trdTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static int trdTypeNullValue()
    {
        return 65535;
    }

    public static int trdTypeMinValue()
    {
        return 0;
    }

    public static int trdTypeMaxValue()
    {
        return 65534;
    }

    public int trdType()
    {
        if (parentMessage.actingVersion < 6)
        {
            return 65535;
        }

        return (buffer.getShort(offset + 243, BYTE_ORDER) & 0xFFFF);
    }


    public static int execRestatementReasonId()
    {
        return 378;
    }

    public static int execRestatementReasonSinceVersion()
    {
        return 6;
    }

    public static int execRestatementReasonEncodingOffset()
    {
        return 245;
    }

    public static int execRestatementReasonEncodingLength()
    {
        return 1;
    }

    public static String execRestatementReasonMetaAttribute(final MetaAttribute metaAttribute)
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

    public short execRestatementReasonRaw()
    {
        if (parentMessage.actingVersion < 6)
        {
            return (short)255;
        }

        return ((short)(buffer.getByte(offset + 245) & 0xFF));
    }

    public ExecReason execRestatementReason()
    {
        if (parentMessage.actingVersion < 6)
        {
            return ExecReason.NULL_VAL;
        }

        return ExecReason.get(((short)(buffer.getByte(offset + 245) & 0xFF)));
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
        return 246;
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

    public int settlDate()
    {
        if (parentMessage.actingVersion < 6)
        {
            return 65535;
        }

        return (buffer.getShort(offset + 246, BYTE_ORDER) & 0xFFFF);
    }


    public static int maturityDateId()
    {
        return 541;
    }

    public static int maturityDateSinceVersion()
    {
        return 6;
    }

    public static int maturityDateEncodingOffset()
    {
        return 248;
    }

    public static int maturityDateEncodingLength()
    {
        return 2;
    }

    public static String maturityDateMetaAttribute(final MetaAttribute metaAttribute)
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

    public static int maturityDateNullValue()
    {
        return 65535;
    }

    public static int maturityDateMinValue()
    {
        return 0;
    }

    public static int maturityDateMaxValue()
    {
        return 65534;
    }

    public int maturityDate()
    {
        if (parentMessage.actingVersion < 6)
        {
            return 65535;
        }

        return (buffer.getShort(offset + 248, BYTE_ORDER) & 0xFFFF);
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
        return 250;
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

    private final Decimal64NULLDecoder calculatedCcyLastQty = new Decimal64NULLDecoder();

    /**
     * Total amount traded (in notional) in counter currency for the Spot
     *
     * @return Decimal64NULLDecoder : Total amount traded (in notional) in counter currency for the Spot
     */
    public Decimal64NULLDecoder calculatedCcyLastQty()
    {
        if (parentMessage.actingVersion < 6)
        {
            return null;
        }

        calculatedCcyLastQty.wrap(buffer, offset + 250);
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
        return 259;
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

    private final Decimal64NULLDecoder grossTradeAmt = new Decimal64NULLDecoder();

    /**
     * Total amount traded (in notional) in base currency for the Spot
     *
     * @return Decimal64NULLDecoder : Total amount traded (in notional) in base currency for the Spot
     */
    public Decimal64NULLDecoder grossTradeAmt()
    {
        if (parentMessage.actingVersion < 6)
        {
            return null;
        }

        grossTradeAmt.wrap(buffer, offset + 259);
        return grossTradeAmt;
    }

    public static int benchmarkPriceId()
    {
        return 6262;
    }

    public static int benchmarkPriceSinceVersion()
    {
        return 6;
    }

    public static int benchmarkPriceEncodingOffset()
    {
        return 268;
    }

    public static int benchmarkPriceEncodingLength()
    {
        return 8;
    }

    public static String benchmarkPriceMetaAttribute(final MetaAttribute metaAttribute)
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

    private final PRICENULL9Decoder benchmarkPrice = new PRICENULL9Decoder();

    /**
     * The price assigned to an eFIX matched trade which is determined by an automated set market mid-price from a third party market data feed. The Fixing Price will be distributed as soon as practicable after the Fixing Time
     *
     * @return PRICENULL9Decoder : The price assigned to an eFIX matched trade which is determined by an automated set market mid-price from a third party market data feed. The Fixing Price will be distributed as soon as practicable after the Fixing Time
     */
    public PRICENULL9Decoder benchmarkPrice()
    {
        if (parentMessage.actingVersion < 6)
        {
            return null;
        }

        benchmarkPrice.wrap(buffer, offset + 268);
        return benchmarkPrice;
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
        return 276;
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

    private final PRICENULL9Decoder reservationPrice = new PRICENULL9Decoder();

    /**
     * This field specifies the highest (for a buy) or lowest (for a sell) price at which the order may trade. This price must be better than the limit price and should be multiple of reservation price tick
     *
     * @return PRICENULL9Decoder : This field specifies the highest (for a buy) or lowest (for a sell) price at which the order may trade. This price must be better than the limit price and should be multiple of reservation price tick
     */
    public PRICENULL9Decoder reservationPrice()
    {
        if (parentMessage.actingVersion < 8)
        {
            return null;
        }

        reservationPrice.wrap(buffer, offset + 276);
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
        return 284;
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

    public short priorityIndicator()
    {
        if (parentMessage.actingVersion < 8)
        {
            return (short)255;
        }

        return ((short)(buffer.getByte(offset + 284) & 0xFF));
    }


    public static int displayLimitPriceId()
    {
        return 9264;
    }

    public static int displayLimitPriceSinceVersion()
    {
        return 8;
    }

    public static int displayLimitPriceEncodingOffset()
    {
        return 285;
    }

    public static int displayLimitPriceEncodingLength()
    {
        return 8;
    }

    public static String displayLimitPriceMetaAttribute(final MetaAttribute metaAttribute)
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

    private final PRICENULL9Decoder displayLimitPrice = new PRICENULL9Decoder();

    /**
     * The price at which opposite side orders are listed on the market. Sent only in fill messages for reservation price orders
     *
     * @return PRICENULL9Decoder : The price at which opposite side orders are listed on the market. Sent only in fill messages for reservation price orders
     */
    public PRICENULL9Decoder displayLimitPrice()
    {
        if (parentMessage.actingVersion < 8)
        {
            return null;
        }

        displayLimitPrice.wrap(buffer, offset + 285);
        return displayLimitPrice;
    }

    private final NoFillsDecoder noFills = new NoFillsDecoder(this);

    public static long noFillsDecoderId()
    {
        return 1362;
    }

    public static int noFillsDecoderSinceVersion()
    {
        return 0;
    }

    /**
     * Specifies the number of fill reasons included in this Execution Report
     *
     * @return NoFillsDecoder : Specifies the number of fill reasons included in this Execution Report
     */
    public NoFillsDecoder noFills()
    {
        noFills.wrap(buffer);
        return noFills;
    }

    /**
     * Specifies the number of fill reasons included in this Execution Report
     */

    public static final class NoFillsDecoder
        implements Iterable<NoFillsDecoder>, java.util.Iterator<NoFillsDecoder>
    {
        public static final int HEADER_SIZE = 3;
        private final ExecutionReportTradeOutright525Decoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        NoFillsDecoder(final ExecutionReportTradeOutright525Decoder parentMessage)
        {
            this.parentMessage = parentMessage;
        }

        public void wrap(final DirectBuffer buffer)
        {
            if (buffer != this.buffer)
            {
                this.buffer = buffer;
            }

            index = 0;
            final int limit = parentMessage.limit();
            parentMessage.limit(limit + HEADER_SIZE);
            blockLength = (buffer.getShort(limit + 0, BYTE_ORDER) & 0xFFFF);
            count = ((short)(buffer.getByte(limit + 2) & 0xFF));
        }

        public NoFillsDecoder next()
        {
            if (index >= count)
            {
                throw new java.util.NoSuchElementException();
            }

            offset = parentMessage.limit();
            parentMessage.limit(offset + blockLength);
            ++index;

            return this;
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

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<NoFillsDecoder> iterator()
        {
            return this;
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext()
        {
            return index < count;
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

        private final PRICE9Decoder fillPx = new PRICE9Decoder();

        /**
         * Price of this fill reason or allocation. Required if NoFills(1362) &gt; 0. Same as LastPx(31)
         *
         * @return PRICE9Decoder : Price of this fill reason or allocation. Required if NoFills(1362) &gt; 0. Same as LastPx(31)
         */
        public PRICE9Decoder fillPx()
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

        public long fillQty()
        {
            return (buffer.getInt(offset + 8, BYTE_ORDER) & 0xFFFF_FFFFL);
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


        public byte fillExecID(final int index)
        {
            if (index < 0 || index >= 2)
            {
                throw new IndexOutOfBoundsException("index out of range: index=" + index);
            }

            final int pos = offset + 12 + (index * 1);

            return buffer.getByte(pos);
        }


        public static String fillExecIDCharacterEncoding()
        {
            return java.nio.charset.StandardCharsets.US_ASCII.name();
        }

        public int getFillExecID(final byte[] dst, final int dstOffset)
        {
            final int length = 2;
            if (dstOffset < 0 || dstOffset > (dst.length - length))
            {
                throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
            }

            buffer.getBytes(offset + 12, dst, dstOffset, length);

            return length;
        }

        public String fillExecID()
        {
            final byte[] dst = new byte[2];
            buffer.getBytes(offset + 12, dst, 0, 2);

            int end = 0;
            for (; end < 2 && dst[end] != 0; ++end);

            return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
        }


        public int getFillExecID(final Appendable value)
        {
            for (int i = 0; i < 2; ++i)
            {
                final int c = buffer.getByte(offset + 12 + i) & 0xFF;
                if (c == 0)
                {
                    return i;
                }

                try
                {
                    value.append(c > 127 ? '?' : (char)c);
                }
                catch (final java.io.IOException ex)
                {
                    throw new java.io.UncheckedIOException(ex);
                }
            }

            return 2;
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

        public short fillYieldType()
        {
            return ((short)(buffer.getByte(offset + 14) & 0xFF));
        }


        public StringBuilder appendTo(final StringBuilder builder)
        {
            if (null == buffer)
            {
                return builder;
            }

            builder.append('(');
            builder.append("fillPx=");
            final PRICE9Decoder fillPx = this.fillPx();
            if (null != fillPx)
            {
                fillPx.appendTo(builder);
            }
            else
            {
                builder.append("null");
            }
            builder.append('|');
            builder.append("fillQty=");
            builder.append(this.fillQty());
            builder.append('|');
            builder.append("fillExecID=");
            for (int i = 0; i < fillExecIDLength() && this.fillExecID(i) > 0; i++)
            {
                builder.append((char)this.fillExecID(i));
            }
            builder.append('|');
            builder.append("fillYieldType=");
            builder.append(this.fillYieldType());
            builder.append(')');

            return builder;
        }
        
        public NoFillsDecoder sbeSkip()
        {

            return this;
        }
    }

    private final NoOrderEventsDecoder noOrderEvents = new NoOrderEventsDecoder(this);

    public static long noOrderEventsDecoderId()
    {
        return 1795;
    }

    public static int noOrderEventsDecoderSinceVersion()
    {
        return 0;
    }

    /**
     * Number of fills which comprise fill quantity
     *
     * @return NoOrderEventsDecoder : Number of fills which comprise fill quantity
     */
    public NoOrderEventsDecoder noOrderEvents()
    {
        noOrderEvents.wrap(buffer);
        return noOrderEvents;
    }

    /**
     * Number of fills which comprise fill quantity
     */

    public static final class NoOrderEventsDecoder
        implements Iterable<NoOrderEventsDecoder>, java.util.Iterator<NoOrderEventsDecoder>
    {
        public static final int HEADER_SIZE = 3;
        private final ExecutionReportTradeOutright525Decoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        NoOrderEventsDecoder(final ExecutionReportTradeOutright525Decoder parentMessage)
        {
            this.parentMessage = parentMessage;
        }

        public void wrap(final DirectBuffer buffer)
        {
            if (buffer != this.buffer)
            {
                this.buffer = buffer;
            }

            index = 0;
            final int limit = parentMessage.limit();
            parentMessage.limit(limit + HEADER_SIZE);
            blockLength = (buffer.getShort(limit + 0, BYTE_ORDER) & 0xFFFF);
            count = ((short)(buffer.getByte(limit + 2) & 0xFF));
        }

        public NoOrderEventsDecoder next()
        {
            if (index >= count)
            {
                throw new java.util.NoSuchElementException();
            }

            offset = parentMessage.limit();
            parentMessage.limit(offset + blockLength);
            ++index;

            return this;
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

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<NoOrderEventsDecoder> iterator()
        {
            return this;
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext()
        {
            return index < count;
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

        private final PRICE9Decoder orderEventPx = new PRICE9Decoder();

        /**
         * Refers to the fill price; same as LastPx (Tag 31) 
         *
         * @return PRICE9Decoder : Refers to the fill price; same as LastPx (Tag 31) 
         */
        public PRICE9Decoder orderEventPx()
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


        public byte orderEventText(final int index)
        {
            if (index < 0 || index >= 5)
            {
                throw new IndexOutOfBoundsException("index out of range: index=" + index);
            }

            final int pos = offset + 8 + (index * 1);

            return buffer.getByte(pos);
        }


        public static String orderEventTextCharacterEncoding()
        {
            return java.nio.charset.StandardCharsets.US_ASCII.name();
        }

        public int getOrderEventText(final byte[] dst, final int dstOffset)
        {
            final int length = 5;
            if (dstOffset < 0 || dstOffset > (dst.length - length))
            {
                throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
            }

            buffer.getBytes(offset + 8, dst, dstOffset, length);

            return length;
        }

        public String orderEventText()
        {
            final byte[] dst = new byte[5];
            buffer.getBytes(offset + 8, dst, 0, 5);

            int end = 0;
            for (; end < 5 && dst[end] != 0; ++end);

            return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
        }


        public int getOrderEventText(final Appendable value)
        {
            for (int i = 0; i < 5; ++i)
            {
                final int c = buffer.getByte(offset + 8 + i) & 0xFF;
                if (c == 0)
                {
                    return i;
                }

                try
                {
                    value.append(c > 127 ? '?' : (char)c);
                }
                catch (final java.io.IOException ex)
                {
                    throw new java.io.UncheckedIOException(ex);
                }
            }

            return 5;
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

        public long orderEventExecID()
        {
            return (buffer.getInt(offset + 13, BYTE_ORDER) & 0xFFFF_FFFFL);
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

        public long orderEventQty()
        {
            return (buffer.getInt(offset + 17, BYTE_ORDER) & 0xFFFF_FFFFL);
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

        public short orderEventTypeRaw()
        {
            return ((short)(buffer.getByte(offset + 21) & 0xFF));
        }

        public OrderEventType orderEventType()
        {
            return OrderEventType.get(((short)(buffer.getByte(offset + 21) & 0xFF)));
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

        public short orderEventReason()
        {
            return ((short)(buffer.getByte(offset + 22) & 0xFF));
        }


        public static int contraGrossTradeAmtId()
        {
            return 5542;
        }

        public static int contraGrossTradeAmtSinceVersion()
        {
            return 6;
        }

        public static int contraGrossTradeAmtEncodingOffset()
        {
            return 23;
        }

        public static int contraGrossTradeAmtEncodingLength()
        {
            return 9;
        }

        public static String contraGrossTradeAmtMetaAttribute(final MetaAttribute metaAttribute)
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

        private final Decimal64NULLDecoder contraGrossTradeAmt = new Decimal64NULLDecoder();

        /**
         * Amount traded (in notional) in base currency for the Spot with this counterparty
         *
         * @return Decimal64NULLDecoder : Amount traded (in notional) in base currency for the Spot with this counterparty
         */
        public Decimal64NULLDecoder contraGrossTradeAmt()
        {
            if (parentMessage.actingVersion < 6)
            {
                return null;
            }

            contraGrossTradeAmt.wrap(buffer, offset + 23);
            return contraGrossTradeAmt;
        }

        public static int contraCalculatedCcyLastQtyId()
        {
            return 5971;
        }

        public static int contraCalculatedCcyLastQtySinceVersion()
        {
            return 6;
        }

        public static int contraCalculatedCcyLastQtyEncodingOffset()
        {
            return 32;
        }

        public static int contraCalculatedCcyLastQtyEncodingLength()
        {
            return 9;
        }

        public static String contraCalculatedCcyLastQtyMetaAttribute(final MetaAttribute metaAttribute)
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

        private final Decimal64NULLDecoder contraCalculatedCcyLastQty = new Decimal64NULLDecoder();

        /**
         * Amount traded (in notional) in counter currency for the Spot with this counterparty
         *
         * @return Decimal64NULLDecoder : Amount traded (in notional) in counter currency for the Spot with this counterparty
         */
        public Decimal64NULLDecoder contraCalculatedCcyLastQty()
        {
            if (parentMessage.actingVersion < 6)
            {
                return null;
            }

            contraCalculatedCcyLastQty.wrap(buffer, offset + 32);
            return contraCalculatedCcyLastQty;
        }

        public StringBuilder appendTo(final StringBuilder builder)
        {
            if (null == buffer)
            {
                return builder;
            }

            builder.append('(');
            builder.append("orderEventPx=");
            final PRICE9Decoder orderEventPx = this.orderEventPx();
            if (null != orderEventPx)
            {
                orderEventPx.appendTo(builder);
            }
            else
            {
                builder.append("null");
            }
            builder.append('|');
            builder.append("orderEventText=");
            for (int i = 0; i < orderEventTextLength() && this.orderEventText(i) > 0; i++)
            {
                builder.append((char)this.orderEventText(i));
            }
            builder.append('|');
            builder.append("orderEventExecID=");
            builder.append(this.orderEventExecID());
            builder.append('|');
            builder.append("orderEventQty=");
            builder.append(this.orderEventQty());
            builder.append('|');
            builder.append("orderEventType=");
            builder.append(this.orderEventType());
            builder.append('|');
            builder.append("orderEventReason=");
            builder.append(this.orderEventReason());
            builder.append('|');
            builder.append("contraGrossTradeAmt=");
            final Decimal64NULLDecoder contraGrossTradeAmt = this.contraGrossTradeAmt();
            if (null != contraGrossTradeAmt)
            {
                contraGrossTradeAmt.appendTo(builder);
            }
            else
            {
                builder.append("null");
            }
            builder.append('|');
            builder.append("contraCalculatedCcyLastQty=");
            final Decimal64NULLDecoder contraCalculatedCcyLastQty = this.contraCalculatedCcyLastQty();
            if (null != contraCalculatedCcyLastQty)
            {
                contraCalculatedCcyLastQty.appendTo(builder);
            }
            else
            {
                builder.append("null");
            }
            builder.append(')');

            return builder;
        }
        
        public NoOrderEventsDecoder sbeSkip()
        {

            return this;
        }
    }

    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        final ExecutionReportTradeOutright525Decoder decoder = new ExecutionReportTradeOutright525Decoder();
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
        builder.append("[ExecutionReportTradeOutright525](sbeTemplateId=");
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
        builder.append("seqNum=");
        builder.append(this.seqNum());
        builder.append('|');
        builder.append("uUID=");
        builder.append(this.uUID());
        builder.append('|');
        builder.append("execID=");
        for (int i = 0; i < execIDLength() && this.execID(i) > 0; i++)
        {
            builder.append((char)this.execID(i));
        }
        builder.append('|');
        builder.append("senderID=");
        for (int i = 0; i < senderIDLength() && this.senderID(i) > 0; i++)
        {
            builder.append((char)this.senderID(i));
        }
        builder.append('|');
        builder.append("clOrdID=");
        for (int i = 0; i < clOrdIDLength() && this.clOrdID(i) > 0; i++)
        {
            builder.append((char)this.clOrdID(i));
        }
        builder.append('|');
        builder.append("partyDetailsListReqID=");
        builder.append(this.partyDetailsListReqID());
        builder.append('|');
        builder.append("lastPx=");
        final PRICE9Decoder lastPx = this.lastPx();
        if (null != lastPx)
        {
            lastPx.appendTo(builder);
        }
        else
        {
            builder.append("null");
        }
        builder.append('|');
        builder.append("orderID=");
        builder.append(this.orderID());
        builder.append('|');
        builder.append("price=");
        final PRICE9Decoder price = this.price();
        if (null != price)
        {
            price.appendTo(builder);
        }
        else
        {
            builder.append("null");
        }
        builder.append('|');
        builder.append("stopPx=");
        final PRICENULL9Decoder stopPx = this.stopPx();
        if (null != stopPx)
        {
            stopPx.appendTo(builder);
        }
        else
        {
            builder.append("null");
        }
        builder.append('|');
        builder.append("transactTime=");
        builder.append(this.transactTime());
        builder.append('|');
        builder.append("sendingTimeEpoch=");
        builder.append(this.sendingTimeEpoch());
        builder.append('|');
        builder.append("orderRequestID=");
        builder.append(this.orderRequestID());
        builder.append('|');
        builder.append("secExecID=");
        builder.append(this.secExecID());
        builder.append('|');
        builder.append("crossID=");
        builder.append(this.crossID());
        builder.append('|');
        builder.append("hostCrossID=");
        builder.append(this.hostCrossID());
        builder.append('|');
        builder.append("location=");
        for (int i = 0; i < locationLength() && this.location(i) > 0; i++)
        {
            builder.append((char)this.location(i));
        }
        builder.append('|');
        builder.append("securityID=");
        builder.append(this.securityID());
        builder.append('|');
        builder.append("orderQty=");
        builder.append(this.orderQty());
        builder.append('|');
        builder.append("lastQty=");
        builder.append(this.lastQty());
        builder.append('|');
        builder.append("cumQty=");
        builder.append(this.cumQty());
        builder.append('|');
        builder.append("mDTradeEntryID=");
        builder.append(this.mDTradeEntryID());
        builder.append('|');
        builder.append("sideTradeID=");
        builder.append(this.sideTradeID());
        builder.append('|');
        builder.append("tradeLinkID=");
        builder.append(this.tradeLinkID());
        builder.append('|');
        builder.append("leavesQty=");
        builder.append(this.leavesQty());
        builder.append('|');
        builder.append("tradeDate=");
        builder.append(this.tradeDate());
        builder.append('|');
        builder.append("expireDate=");
        builder.append(this.expireDate());
        builder.append('|');
        builder.append("ordStatus=");
        builder.append(this.ordStatus());
        builder.append('|');
        builder.append("ordType=");
        builder.append(this.ordType());
        builder.append('|');
        builder.append("side=");
        builder.append(this.side());
        builder.append('|');
        builder.append("timeInForce=");
        builder.append(this.timeInForce());
        builder.append('|');
        builder.append("manualOrderIndicator=");
        builder.append(this.manualOrderIndicator());
        builder.append('|');
        builder.append("possRetransFlag=");
        builder.append(this.possRetransFlag());
        builder.append('|');
        builder.append("aggressorIndicator=");
        builder.append(this.aggressorIndicator());
        builder.append('|');
        builder.append("crossType=");
        builder.append(this.crossType());
        builder.append('|');
        builder.append("execInst=");
        final ExecInstDecoder execInst = this.execInst();
        if (null != execInst)
        {
            execInst.appendTo(builder);
        }
        else
        {
            builder.append("null");
        }
        builder.append('|');
        builder.append("executionMode=");
        builder.append(this.executionMode());
        builder.append('|');
        builder.append("liquidityFlag=");
        builder.append(this.liquidityFlag());
        builder.append('|');
        builder.append("managedOrder=");
        builder.append(this.managedOrder());
        builder.append('|');
        builder.append("shortSaleType=");
        builder.append(this.shortSaleType());
        builder.append('|');
        builder.append("ownership=");
        builder.append(this.ownership());
        builder.append('|');
        builder.append("discretionPrice=");
        final PRICENULL9Decoder discretionPrice = this.discretionPrice();
        if (null != discretionPrice)
        {
            discretionPrice.appendTo(builder);
        }
        else
        {
            builder.append("null");
        }
        builder.append('|');
        builder.append("trdType=");
        builder.append(this.trdType());
        builder.append('|');
        builder.append("execRestatementReason=");
        builder.append(this.execRestatementReason());
        builder.append('|');
        builder.append("settlDate=");
        builder.append(this.settlDate());
        builder.append('|');
        builder.append("maturityDate=");
        builder.append(this.maturityDate());
        builder.append('|');
        builder.append("calculatedCcyLastQty=");
        final Decimal64NULLDecoder calculatedCcyLastQty = this.calculatedCcyLastQty();
        if (null != calculatedCcyLastQty)
        {
            calculatedCcyLastQty.appendTo(builder);
        }
        else
        {
            builder.append("null");
        }
        builder.append('|');
        builder.append("grossTradeAmt=");
        final Decimal64NULLDecoder grossTradeAmt = this.grossTradeAmt();
        if (null != grossTradeAmt)
        {
            grossTradeAmt.appendTo(builder);
        }
        else
        {
            builder.append("null");
        }
        builder.append('|');
        builder.append("benchmarkPrice=");
        final PRICENULL9Decoder benchmarkPrice = this.benchmarkPrice();
        if (null != benchmarkPrice)
        {
            benchmarkPrice.appendTo(builder);
        }
        else
        {
            builder.append("null");
        }
        builder.append('|');
        builder.append("reservationPrice=");
        final PRICENULL9Decoder reservationPrice = this.reservationPrice();
        if (null != reservationPrice)
        {
            reservationPrice.appendTo(builder);
        }
        else
        {
            builder.append("null");
        }
        builder.append('|');
        builder.append("priorityIndicator=");
        builder.append(this.priorityIndicator());
        builder.append('|');
        builder.append("displayLimitPrice=");
        final PRICENULL9Decoder displayLimitPrice = this.displayLimitPrice();
        if (null != displayLimitPrice)
        {
            displayLimitPrice.appendTo(builder);
        }
        else
        {
            builder.append("null");
        }
        builder.append('|');
        builder.append("noFills=[");
        final int noFillsOriginalOffset = noFills.offset;
        final int noFillsOriginalIndex = noFills.index;
        final NoFillsDecoder noFills = this.noFills();
        if (noFills.count() > 0)
        {
            while (noFills.hasNext())
            {
                noFills.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        noFills.offset = noFillsOriginalOffset;
        noFills.index = noFillsOriginalIndex;
        builder.append(']');
        builder.append('|');
        builder.append("noOrderEvents=[");
        final int noOrderEventsOriginalOffset = noOrderEvents.offset;
        final int noOrderEventsOriginalIndex = noOrderEvents.index;
        final NoOrderEventsDecoder noOrderEvents = this.noOrderEvents();
        if (noOrderEvents.count() > 0)
        {
            while (noOrderEvents.hasNext())
            {
                noOrderEvents.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        noOrderEvents.offset = noOrderEventsOriginalOffset;
        noOrderEvents.index = noOrderEventsOriginalIndex;
        builder.append(']');

        limit(originalLimit);

        return builder;
    }
    
    public ExecutionReportTradeOutright525Decoder sbeSkip()
    {
        sbeRewind();
        NoFillsDecoder noFills = this.noFills();
        if (noFills.count() > 0)
        {
            while (noFills.hasNext())
            {
                noFills.next();
                noFills.sbeSkip();
            }
        }
        NoOrderEventsDecoder noOrderEvents = this.noOrderEvents();
        if (noOrderEvents.count() > 0)
        {
            while (noOrderEvents.hasNext())
            {
                noOrderEvents.next();
                noOrderEvents.sbeSkip();
            }
        }

        return this;
    }
}
