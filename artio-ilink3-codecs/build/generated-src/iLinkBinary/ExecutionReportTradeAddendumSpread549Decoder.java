/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.DirectBuffer;
import org.agrona.sbe.*;


/**
 * ExecutionReportTradeAddendumSpread
 */
@SuppressWarnings("all")
public final class ExecutionReportTradeAddendumSpread549Decoder implements MessageDecoderFlyweight
{
    public static final int BLOCK_LENGTH = 187;
    public static final int TEMPLATE_ID = 549;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final ExecutionReportTradeAddendumSpread549Decoder parentMessage = this;
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

    public ExecutionReportTradeAddendumSpread549Decoder wrap(
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

    public ExecutionReportTradeAddendumSpread549Decoder wrapAndApplyHeader(
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

    public ExecutionReportTradeAddendumSpread549Decoder sbeRewind()
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

    public long transactTime()
    {
        return buffer.getLong(offset + 116, BYTE_ORDER);
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

    public long sendingTimeEpoch()
    {
        return buffer.getLong(offset + 124, BYTE_ORDER);
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

    public long secExecID()
    {
        return buffer.getLong(offset + 132, BYTE_ORDER);
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

    public long origSecondaryExecutionID()
    {
        return buffer.getLong(offset + 140, BYTE_ORDER);
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


    public byte location(final int index)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 148 + (index * 1);

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

        buffer.getBytes(offset + 148, dst, dstOffset, length);

        return length;
    }

    public String location()
    {
        final byte[] dst = new byte[5];
        buffer.getBytes(offset + 148, dst, 0, 5);

        int end = 0;
        for (; end < 5 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getLocation(final Appendable value)
    {
        for (int i = 0; i < 5; ++i)
        {
            final int c = buffer.getByte(offset + 148 + i) & 0xFF;
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

    public int securityID()
    {
        return buffer.getInt(offset + 153, BYTE_ORDER);
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

    public long mDTradeEntryID()
    {
        return (buffer.getInt(offset + 157, BYTE_ORDER) & 0xFFFF_FFFFL);
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

    public long lastQty()
    {
        return (buffer.getInt(offset + 161, BYTE_ORDER) & 0xFFFF_FFFFL);
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

    public long sideTradeID()
    {
        return (buffer.getInt(offset + 165, BYTE_ORDER) & 0xFFFF_FFFFL);
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

    public long origSideTradeID()
    {
        return (buffer.getInt(offset + 169, BYTE_ORDER) & 0xFFFF_FFFFL);
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

    public int tradeDate()
    {
        return (buffer.getShort(offset + 173, BYTE_ORDER) & 0xFFFF);
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

    public byte ordStatusRaw()
    {
        return buffer.getByte(offset + 175);
    }

    public OrdStatusTrdCxl ordStatus()
    {
        return OrdStatusTrdCxl.get(buffer.getByte(offset + 175));
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

    public byte execTypeRaw()
    {
        return buffer.getByte(offset + 176);
    }

    public ExecTypTrdCxl execType()
    {
        return ExecTypTrdCxl.get(buffer.getByte(offset + 176));
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

    public byte ordTypeRaw()
    {
        return buffer.getByte(offset + 177);
    }

    public OrderType ordType()
    {
        return OrderType.get(buffer.getByte(offset + 177));
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

    public short sideRaw()
    {
        return ((short)(buffer.getByte(offset + 178) & 0xFF));
    }

    public SideReq side()
    {
        return SideReq.get(((short)(buffer.getByte(offset + 178) & 0xFF)));
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

    public short manualOrderIndicatorRaw()
    {
        return ((short)(buffer.getByte(offset + 179) & 0xFF));
    }

    public ManualOrdIndReq manualOrderIndicator()
    {
        return ManualOrdIndReq.get(((short)(buffer.getByte(offset + 179) & 0xFF)));
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

    public short possRetransFlagRaw()
    {
        return ((short)(buffer.getByte(offset + 180) & 0xFF));
    }

    public BooleanFlag possRetransFlag()
    {
        return BooleanFlag.get(((short)(buffer.getByte(offset + 180) & 0xFF)));
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

    public short totalNumSecurities()
    {
        return ((short)(buffer.getByte(offset + 181) & 0xFF));
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

    private final ExecInstDecoder execInst = new ExecInstDecoder();

    /**
     * Instructions for order handling on exchange. If more than one instruction is applicable to an order, this field can contain multiple instructions separated by space
     *
     * @return ExecInstDecoder : Instructions for order handling on exchange. If more than one instruction is applicable to an order, this field can contain multiple instructions separated by space
     */
    public ExecInstDecoder execInst()
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

    public byte executionModeRaw()
    {
        return buffer.getByte(offset + 183);
    }

    public ExecMode executionMode()
    {
        return ExecMode.get(buffer.getByte(offset + 183));
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

    public short liquidityFlagRaw()
    {
        return ((short)(buffer.getByte(offset + 184) & 0xFF));
    }

    public BooleanNULL liquidityFlag()
    {
        return BooleanNULL.get(((short)(buffer.getByte(offset + 184) & 0xFF)));
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

    public short managedOrderRaw()
    {
        return ((short)(buffer.getByte(offset + 185) & 0xFF));
    }

    public BooleanNULL managedOrder()
    {
        return BooleanNULL.get(((short)(buffer.getByte(offset + 185) & 0xFF)));
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

    public short shortSaleTypeRaw()
    {
        return ((short)(buffer.getByte(offset + 186) & 0xFF));
    }

    public ShortSaleType shortSaleType()
    {
        return ShortSaleType.get(((short)(buffer.getByte(offset + 186) & 0xFF)));
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
        private final ExecutionReportTradeAddendumSpread549Decoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        NoFillsDecoder(final ExecutionReportTradeAddendumSpread549Decoder parentMessage)
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

    private final NoLegsDecoder noLegs = new NoLegsDecoder(this);

    public static long noLegsDecoderId()
    {
        return 555;
    }

    public static int noLegsDecoderSinceVersion()
    {
        return 0;
    }

    /**
     * Number of legs (repeating groups).
     *
     * @return NoLegsDecoder : Number of legs (repeating groups).
     */
    public NoLegsDecoder noLegs()
    {
        noLegs.wrap(buffer);
        return noLegs;
    }

    /**
     * Number of legs (repeating groups).
     */

    public static final class NoLegsDecoder
        implements Iterable<NoLegsDecoder>, java.util.Iterator<NoLegsDecoder>
    {
        public static final int HEADER_SIZE = 3;
        private final ExecutionReportTradeAddendumSpread549Decoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        NoLegsDecoder(final ExecutionReportTradeAddendumSpread549Decoder parentMessage)
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

        public NoLegsDecoder next()
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

        public java.util.Iterator<NoLegsDecoder> iterator()
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

        public long legExecID()
        {
            return buffer.getLong(offset + 0, BYTE_ORDER);
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

        private final PRICE9Decoder legLastPx = new PRICE9Decoder();

        /**
         * Execution price assigned to a leg of a multileg instrument
         *
         * @return PRICE9Decoder : Execution price assigned to a leg of a multileg instrument
         */
        public PRICE9Decoder legLastPx()
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

        public long legExecRefID()
        {
            return buffer.getLong(offset + 16, BYTE_ORDER);
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

        public long legTradeID()
        {
            return (buffer.getInt(offset + 24, BYTE_ORDER) & 0xFFFF_FFFFL);
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

        public long legTradeRefID()
        {
            return (buffer.getInt(offset + 28, BYTE_ORDER) & 0xFFFF_FFFFL);
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

        public int legSecurityID()
        {
            return buffer.getInt(offset + 32, BYTE_ORDER);
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

        public long legLastQty()
        {
            return (buffer.getInt(offset + 36, BYTE_ORDER) & 0xFFFF_FFFFL);
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

        public short legSideRaw()
        {
            return ((short)(buffer.getByte(offset + 40) & 0xFF));
        }

        public SideReq legSide()
        {
            return SideReq.get(((short)(buffer.getByte(offset + 40) & 0xFF)));
        }


        public StringBuilder appendTo(final StringBuilder builder)
        {
            if (null == buffer)
            {
                return builder;
            }

            builder.append('(');
            builder.append("legExecID=");
            builder.append(this.legExecID());
            builder.append('|');
            builder.append("legLastPx=");
            final PRICE9Decoder legLastPx = this.legLastPx();
            if (null != legLastPx)
            {
                legLastPx.appendTo(builder);
            }
            else
            {
                builder.append("null");
            }
            builder.append('|');
            builder.append("legExecRefID=");
            builder.append(this.legExecRefID());
            builder.append('|');
            builder.append("legTradeID=");
            builder.append(this.legTradeID());
            builder.append('|');
            builder.append("legTradeRefID=");
            builder.append(this.legTradeRefID());
            builder.append('|');
            builder.append("legSecurityID=");
            builder.append(this.legSecurityID());
            builder.append('|');
            builder.append("legLastQty=");
            builder.append(this.legLastQty());
            builder.append('|');
            builder.append("legSide=");
            builder.append(this.legSide());
            builder.append(')');

            return builder;
        }
        
        public NoLegsDecoder sbeSkip()
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
        private final ExecutionReportTradeAddendumSpread549Decoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        NoOrderEventsDecoder(final ExecutionReportTradeAddendumSpread549Decoder parentMessage)
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
            return 27;
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

        public TradeAddendum orderEventType()
        {
            return TradeAddendum.get(((short)(buffer.getByte(offset + 21) & 0xFF)));
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

        public long originalOrderEventExecID()
        {
            if (parentMessage.actingVersion < 3)
            {
                return 4294967295L;
            }

            return (buffer.getInt(offset + 23, BYTE_ORDER) & 0xFFFF_FFFFL);
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
            builder.append("originalOrderEventExecID=");
            builder.append(this.originalOrderEventExecID());
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

        final ExecutionReportTradeAddendumSpread549Decoder decoder = new ExecutionReportTradeAddendumSpread549Decoder();
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
        builder.append("[ExecutionReportTradeAddendumSpread549](sbeTemplateId=");
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
        builder.append("transactTime=");
        builder.append(this.transactTime());
        builder.append('|');
        builder.append("sendingTimeEpoch=");
        builder.append(this.sendingTimeEpoch());
        builder.append('|');
        builder.append("secExecID=");
        builder.append(this.secExecID());
        builder.append('|');
        builder.append("origSecondaryExecutionID=");
        builder.append(this.origSecondaryExecutionID());
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
        builder.append("mDTradeEntryID=");
        builder.append(this.mDTradeEntryID());
        builder.append('|');
        builder.append("lastQty=");
        builder.append(this.lastQty());
        builder.append('|');
        builder.append("sideTradeID=");
        builder.append(this.sideTradeID());
        builder.append('|');
        builder.append("origSideTradeID=");
        builder.append(this.origSideTradeID());
        builder.append('|');
        builder.append("tradeDate=");
        builder.append(this.tradeDate());
        builder.append('|');
        builder.append("ordStatus=");
        builder.append(this.ordStatus());
        builder.append('|');
        builder.append("execType=");
        builder.append(this.execType());
        builder.append('|');
        builder.append("ordType=");
        builder.append(this.ordType());
        builder.append('|');
        builder.append("side=");
        builder.append(this.side());
        builder.append('|');
        builder.append("manualOrderIndicator=");
        builder.append(this.manualOrderIndicator());
        builder.append('|');
        builder.append("possRetransFlag=");
        builder.append(this.possRetransFlag());
        builder.append('|');
        builder.append("totalNumSecurities=");
        builder.append(this.totalNumSecurities());
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
        builder.append("noLegs=[");
        final int noLegsOriginalOffset = noLegs.offset;
        final int noLegsOriginalIndex = noLegs.index;
        final NoLegsDecoder noLegs = this.noLegs();
        if (noLegs.count() > 0)
        {
            while (noLegs.hasNext())
            {
                noLegs.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        noLegs.offset = noLegsOriginalOffset;
        noLegs.index = noLegsOriginalIndex;
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
    
    public ExecutionReportTradeAddendumSpread549Decoder sbeSkip()
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
        NoLegsDecoder noLegs = this.noLegs();
        if (noLegs.count() > 0)
        {
            while (noLegs.hasNext())
            {
                noLegs.next();
                noLegs.sbeSkip();
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
