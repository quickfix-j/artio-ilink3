/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.DirectBuffer;
import org.agrona.sbe.*;


/**
 * ExecutionReportCancel
 */
@SuppressWarnings("all")
public final class ExecutionReportCancel534Decoder implements MessageDecoderFlyweight
{
    public static final int BLOCK_LENGTH = 247;
    public static final int TEMPLATE_ID = 534;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final ExecutionReportCancel534Decoder parentMessage = this;
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

    public ExecutionReportCancel534Decoder wrap(
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

    public ExecutionReportCancel534Decoder wrapAndApplyHeader(
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

    public ExecutionReportCancel534Decoder sbeRewind()
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
        return 100;
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
        return buffer.getLong(offset + 100, BYTE_ORDER);
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
        return 108;
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
        price.wrap(buffer, offset + 108);
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
        return 116;
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
        stopPx.wrap(buffer, offset + 116);
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
        return 124;
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
        return buffer.getLong(offset + 124, BYTE_ORDER);
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
        return 132;
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
        return buffer.getLong(offset + 132, BYTE_ORDER);
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
        return 140;
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
        return buffer.getLong(offset + 140, BYTE_ORDER);
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
        return 148;
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
        return buffer.getLong(offset + 148, BYTE_ORDER);
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
        return 156;
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
        return buffer.getLong(offset + 156, BYTE_ORDER);
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
        return 164;
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

        final int pos = offset + 164 + (index * 1);

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

        buffer.getBytes(offset + 164, dst, dstOffset, length);

        return length;
    }

    public String location()
    {
        final byte[] dst = new byte[5];
        buffer.getBytes(offset + 164, dst, 0, 5);

        int end = 0;
        for (; end < 5 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getLocation(final Appendable value)
    {
        for (int i = 0; i < 5; ++i)
        {
            final int c = buffer.getByte(offset + 164 + i) & 0xFF;
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
        return 169;
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
        return buffer.getInt(offset + 169, BYTE_ORDER);
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
        return 173;
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
        return (buffer.getInt(offset + 173, BYTE_ORDER) & 0xFFFF_FFFFL);
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
        return 177;
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
        return (buffer.getInt(offset + 177, BYTE_ORDER) & 0xFFFF_FFFFL);
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
        return 181;
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

    public long minQty()
    {
        return (buffer.getInt(offset + 181, BYTE_ORDER) & 0xFFFF_FFFFL);
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
        return 185;
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

    public long displayQty()
    {
        return (buffer.getInt(offset + 185, BYTE_ORDER) & 0xFFFF_FFFFL);
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
        return 189;
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
        return (buffer.getShort(offset + 189, BYTE_ORDER) & 0xFFFF);
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
        return 191;
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

    public int delayDuration()
    {
        return (buffer.getShort(offset + 191, BYTE_ORDER) & 0xFFFF);
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
        return 193;
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


    private static final byte[] ORDSTATUS_VALUE = { 52 };

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
        return (byte)52;
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
        return 193;
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


    private static final byte[] EXECTYPE_VALUE = { 52 };

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
        return (byte)52;
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
        return 193;
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
        return buffer.getByte(offset + 193);
    }

    public OrderType ordType()
    {
        return OrderType.get(buffer.getByte(offset + 193));
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
        return 194;
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
        return ((short)(buffer.getByte(offset + 194) & 0xFF));
    }

    public SideReq side()
    {
        return SideReq.get(((short)(buffer.getByte(offset + 194) & 0xFF)));
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
        return 195;
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
        return ((short)(buffer.getByte(offset + 195) & 0xFF));
    }

    public TimeInForce timeInForce()
    {
        return TimeInForce.get(((short)(buffer.getByte(offset + 195) & 0xFF)));
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
        return 196;
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
        return ((short)(buffer.getByte(offset + 196) & 0xFF));
    }

    public ManualOrdIndReq manualOrderIndicator()
    {
        return ManualOrdIndReq.get(((short)(buffer.getByte(offset + 196) & 0xFF)));
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
        return 197;
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
        return ((short)(buffer.getByte(offset + 197) & 0xFF));
    }

    public BooleanFlag possRetransFlag()
    {
        return BooleanFlag.get(((short)(buffer.getByte(offset + 197) & 0xFF)));
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
        return 198;
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
        return ((short)(buffer.getByte(offset + 198) & 0xFF));
    }

    public SplitMsg splitMsg()
    {
        return SplitMsg.get(((short)(buffer.getByte(offset + 198) & 0xFF)));
    }


    public static int execRestatementReasonId()
    {
        return 378;
    }

    public static int execRestatementReasonSinceVersion()
    {
        return 0;
    }

    public static int execRestatementReasonEncodingOffset()
    {
        return 199;
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
        return ((short)(buffer.getByte(offset + 199) & 0xFF));
    }

    public ExecReason execRestatementReason()
    {
        return ExecReason.get(((short)(buffer.getByte(offset + 199) & 0xFF)));
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
        return 200;
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
        return ((short)(buffer.getByte(offset + 200) & 0xFF));
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
        return 201;
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
     * Instructions for order handling on exchange. Since more than one instruction is applicable to an order, this field can represent those using a bitset.
     *
     * @return ExecInstDecoder : Instructions for order handling on exchange. Since more than one instruction is applicable to an order, this field can represent those using a bitset.
     */
    public ExecInstDecoder execInst()
    {
        execInst.wrap(buffer, offset + 201);
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
        return 202;
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
        return buffer.getByte(offset + 202);
    }

    public ExecMode executionMode()
    {
        return ExecMode.get(buffer.getByte(offset + 202));
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
        return 203;
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
        return ((short)(buffer.getByte(offset + 203) & 0xFF));
    }

    public BooleanNULL liquidityFlag()
    {
        return BooleanNULL.get(((short)(buffer.getByte(offset + 203) & 0xFF)));
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
        return 204;
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
        return ((short)(buffer.getByte(offset + 204) & 0xFF));
    }

    public BooleanNULL managedOrder()
    {
        return BooleanNULL.get(((short)(buffer.getByte(offset + 204) & 0xFF)));
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
        return 205;
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
        return ((short)(buffer.getByte(offset + 205) & 0xFF));
    }

    public ShortSaleType shortSaleType()
    {
        return ShortSaleType.get(((short)(buffer.getByte(offset + 205) & 0xFF)));
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
        return 206;
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

    public long delayToTime()
    {
        if (parentMessage.actingVersion < 4)
        {
            return 0xffffffffffffffffL;
        }

        return buffer.getLong(offset + 206, BYTE_ORDER);
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
        return 214;
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

        discretionPrice.wrap(buffer, offset + 214);
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
        return 222;
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

        reservationPrice.wrap(buffer, offset + 222);
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
        return 230;
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

        return ((short)(buffer.getByte(offset + 230) & 0xFF));
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
        return 231;
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


    public byte origOrderUser(final int index)
    {
        if (index < 0 || index >= 8)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        if (parentMessage.actingVersion < 8)
        {
            return (byte)0;
        }

        final int pos = offset + 231 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String origOrderUserCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getOrigOrderUser(final byte[] dst, final int dstOffset)
    {
        final int length = 8;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        if (parentMessage.actingVersion < 8)
        {
            return 0;
        }

        buffer.getBytes(offset + 231, dst, dstOffset, length);

        return length;
    }

    public String origOrderUser()
    {
        if (parentMessage.actingVersion < 8)
        {
            return "";
        }

        final byte[] dst = new byte[8];
        buffer.getBytes(offset + 231, dst, 0, 8);

        int end = 0;
        for (; end < 8 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getOrigOrderUser(final Appendable value)
    {
        if (parentMessage.actingVersion < 8)
        {
            return 0;
        }

        for (int i = 0; i < 8; ++i)
        {
            final int c = buffer.getByte(offset + 231 + i) & 0xFF;
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

        return 8;
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
        return 239;
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


    public byte cancelText(final int index)
    {
        if (index < 0 || index >= 8)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        if (parentMessage.actingVersion < 8)
        {
            return (byte)0;
        }

        final int pos = offset + 239 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String cancelTextCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getCancelText(final byte[] dst, final int dstOffset)
    {
        final int length = 8;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        if (parentMessage.actingVersion < 8)
        {
            return 0;
        }

        buffer.getBytes(offset + 239, dst, dstOffset, length);

        return length;
    }

    public String cancelText()
    {
        if (parentMessage.actingVersion < 8)
        {
            return "";
        }

        final byte[] dst = new byte[8];
        buffer.getBytes(offset + 239, dst, 0, 8);

        int end = 0;
        for (; end < 8 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getCancelText(final Appendable value)
    {
        if (parentMessage.actingVersion < 8)
        {
            return 0;
        }

        for (int i = 0; i < 8; ++i)
        {
            final int c = buffer.getByte(offset + 239 + i) & 0xFF;
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

        return 8;
    }


    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        final ExecutionReportCancel534Decoder decoder = new ExecutionReportCancel534Decoder();
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
        builder.append("[ExecutionReportCancel534](sbeTemplateId=");
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
        builder.append("cumQty=");
        builder.append(this.cumQty());
        builder.append('|');
        builder.append("minQty=");
        builder.append(this.minQty());
        builder.append('|');
        builder.append("displayQty=");
        builder.append(this.displayQty());
        builder.append('|');
        builder.append("expireDate=");
        builder.append(this.expireDate());
        builder.append('|');
        builder.append("delayDuration=");
        builder.append(this.delayDuration());
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
        builder.append("splitMsg=");
        builder.append(this.splitMsg());
        builder.append('|');
        builder.append("execRestatementReason=");
        builder.append(this.execRestatementReason());
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
        builder.append("delayToTime=");
        builder.append(this.delayToTime());
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
        builder.append("origOrderUser=");
        for (int i = 0; i < origOrderUserLength() && this.origOrderUser(i) > 0; i++)
        {
            builder.append((char)this.origOrderUser(i));
        }
        builder.append('|');
        builder.append("cancelText=");
        for (int i = 0; i < cancelTextLength() && this.cancelText(i) > 0; i++)
        {
            builder.append((char)this.cancelText(i));
        }

        limit(originalLimit);

        return builder;
    }
    
    public ExecutionReportCancel534Decoder sbeSkip()
    {
        sbeRewind();

        return this;
    }
}