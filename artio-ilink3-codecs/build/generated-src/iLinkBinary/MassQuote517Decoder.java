/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.DirectBuffer;
import org.agrona.sbe.*;


/**
 * MassQuote
 */
@SuppressWarnings("all")
public final class MassQuote517Decoder implements MessageDecoderFlyweight
{
    public static final int BLOCK_LENGTH = 123;
    public static final int TEMPLATE_ID = 517;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final MassQuote517Decoder parentMessage = this;
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
        return "i";
    }

    public DirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public MassQuote517Decoder wrap(
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

    public MassQuote517Decoder wrapAndApplyHeader(
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

    public MassQuote517Decoder sbeRewind()
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
        return 0;
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
        return buffer.getLong(offset + 0, BYTE_ORDER);
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
        return 8;
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
        return buffer.getLong(offset + 8, BYTE_ORDER);
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
        return 16;
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
        return ((short)(buffer.getByte(offset + 16) & 0xFF));
    }

    public ManualOrdIndReq manualOrderIndicator()
    {
        return ManualOrdIndReq.get(((short)(buffer.getByte(offset + 16) & 0xFF)));
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
        return 17;
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
        return (buffer.getInt(offset + 17, BYTE_ORDER) & 0xFFFF_FFFFL);
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
        return 21;
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

        final int pos = offset + 21 + (index * 1);

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

        buffer.getBytes(offset + 21, dst, dstOffset, length);

        return length;
    }

    public String senderID()
    {
        final byte[] dst = new byte[20];
        buffer.getBytes(offset + 21, dst, 0, 20);

        int end = 0;
        for (; end < 20 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getSenderID(final Appendable value)
    {
        for (int i = 0; i < 20; ++i)
        {
            final int c = buffer.getByte(offset + 21 + i) & 0xFF;
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


    public static int quoteReqIDId()
    {
        return 131;
    }

    public static int quoteReqIDSinceVersion()
    {
        return 0;
    }

    public static int quoteReqIDEncodingOffset()
    {
        return 41;
    }

    public static int quoteReqIDEncodingLength()
    {
        return 8;
    }

    public static String quoteReqIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long quoteReqIDNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long quoteReqIDMinValue()
    {
        return 0x0L;
    }

    public static long quoteReqIDMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public long quoteReqID()
    {
        return buffer.getLong(offset + 41, BYTE_ORDER);
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
        return 49;
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

        final int pos = offset + 49 + (index * 1);

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

        buffer.getBytes(offset + 49, dst, dstOffset, length);

        return length;
    }

    public String location()
    {
        final byte[] dst = new byte[5];
        buffer.getBytes(offset + 49, dst, 0, 5);

        int end = 0;
        for (; end < 5 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getLocation(final Appendable value)
    {
        for (int i = 0; i < 5; ++i)
        {
            final int c = buffer.getByte(offset + 49 + i) & 0xFF;
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


    public static int quoteIDId()
    {
        return 117;
    }

    public static int quoteIDSinceVersion()
    {
        return 0;
    }

    public static int quoteIDEncodingOffset()
    {
        return 54;
    }

    public static int quoteIDEncodingLength()
    {
        return 4;
    }

    public static String quoteIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long quoteIDNullValue()
    {
        return 4294967295L;
    }

    public static long quoteIDMinValue()
    {
        return 0L;
    }

    public static long quoteIDMaxValue()
    {
        return 4294967294L;
    }

    public long quoteID()
    {
        return (buffer.getInt(offset + 54, BYTE_ORDER) & 0xFFFF_FFFFL);
    }


    public static int totNoQuoteEntriesId()
    {
        return 304;
    }

    public static int totNoQuoteEntriesSinceVersion()
    {
        return 0;
    }

    public static int totNoQuoteEntriesEncodingOffset()
    {
        return 58;
    }

    public static int totNoQuoteEntriesEncodingLength()
    {
        return 1;
    }

    public static String totNoQuoteEntriesMetaAttribute(final MetaAttribute metaAttribute)
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

    public static short totNoQuoteEntriesNullValue()
    {
        return (short)255;
    }

    public static short totNoQuoteEntriesMinValue()
    {
        return (short)0;
    }

    public static short totNoQuoteEntriesMaxValue()
    {
        return (short)254;
    }

    public short totNoQuoteEntries()
    {
        return ((short)(buffer.getByte(offset + 58) & 0xFF));
    }


    public static int mMProtectionResetId()
    {
        return 9773;
    }

    public static int mMProtectionResetSinceVersion()
    {
        return 0;
    }

    public static int mMProtectionResetEncodingOffset()
    {
        return 59;
    }

    public static int mMProtectionResetEncodingLength()
    {
        return 1;
    }

    public static String mMProtectionResetMetaAttribute(final MetaAttribute metaAttribute)
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

    public short mMProtectionResetRaw()
    {
        return ((short)(buffer.getByte(offset + 59) & 0xFF));
    }

    public BooleanFlag mMProtectionReset()
    {
        return BooleanFlag.get(((short)(buffer.getByte(offset + 59) & 0xFF)));
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
        return 60;
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
        return ((short)(buffer.getByte(offset + 60) & 0xFF));
    }

    public BooleanNULL liquidityFlag()
    {
        return BooleanNULL.get(((short)(buffer.getByte(offset + 60) & 0xFF)));
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
        return 61;
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
        return ((short)(buffer.getByte(offset + 61) & 0xFF));
    }

    public ShortSaleType shortSaleType()
    {
        return ShortSaleType.get(((short)(buffer.getByte(offset + 61) & 0xFF)));
    }


    public static int reservedId()
    {
        return 5187;
    }

    public static int reservedSinceVersion()
    {
        return 5;
    }

    public static int reservedEncodingOffset()
    {
        return 62;
    }

    public static int reservedEncodingLength()
    {
        return 30;
    }

    public static String reservedMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte reservedNullValue()
    {
        return (byte)0;
    }

    public static byte reservedMinValue()
    {
        return (byte)32;
    }

    public static byte reservedMaxValue()
    {
        return (byte)126;
    }

    public static int reservedLength()
    {
        return 30;
    }


    public byte reserved(final int index)
    {
        if (index < 0 || index >= 30)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        if (parentMessage.actingVersion < 5)
        {
            return (byte)0;
        }

        final int pos = offset + 62 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String reservedCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getReserved(final byte[] dst, final int dstOffset)
    {
        final int length = 30;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        if (parentMessage.actingVersion < 5)
        {
            return 0;
        }

        buffer.getBytes(offset + 62, dst, dstOffset, length);

        return length;
    }

    public String reserved()
    {
        if (parentMessage.actingVersion < 5)
        {
            return "";
        }

        final byte[] dst = new byte[30];
        buffer.getBytes(offset + 62, dst, 0, 30);

        int end = 0;
        for (; end < 30 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getReserved(final Appendable value)
    {
        if (parentMessage.actingVersion < 5)
        {
            return 0;
        }

        for (int i = 0; i < 30; ++i)
        {
            final int c = buffer.getByte(offset + 62 + i) & 0xFF;
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

        return 30;
    }


    public static int reserved1Id()
    {
        return 5239;
    }

    public static int reserved1SinceVersion()
    {
        return 8;
    }

    public static int reserved1EncodingOffset()
    {
        return 92;
    }

    public static int reserved1EncodingLength()
    {
        return 30;
    }

    public static String reserved1MetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte reserved1NullValue()
    {
        return (byte)0;
    }

    public static byte reserved1MinValue()
    {
        return (byte)32;
    }

    public static byte reserved1MaxValue()
    {
        return (byte)126;
    }

    public static int reserved1Length()
    {
        return 30;
    }


    public byte reserved1(final int index)
    {
        if (index < 0 || index >= 30)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        if (parentMessage.actingVersion < 8)
        {
            return (byte)0;
        }

        final int pos = offset + 92 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String reserved1CharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getReserved1(final byte[] dst, final int dstOffset)
    {
        final int length = 30;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        if (parentMessage.actingVersion < 8)
        {
            return 0;
        }

        buffer.getBytes(offset + 92, dst, dstOffset, length);

        return length;
    }

    public String reserved1()
    {
        if (parentMessage.actingVersion < 8)
        {
            return "";
        }

        final byte[] dst = new byte[30];
        buffer.getBytes(offset + 92, dst, 0, 30);

        int end = 0;
        for (; end < 30 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getReserved1(final Appendable value)
    {
        if (parentMessage.actingVersion < 8)
        {
            return 0;
        }

        for (int i = 0; i < 30; ++i)
        {
            final int c = buffer.getByte(offset + 92 + i) & 0xFF;
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

        return 30;
    }


    public static int quoteEntryOpenId()
    {
        return 9182;
    }

    public static int quoteEntryOpenSinceVersion()
    {
        return 8;
    }

    public static int quoteEntryOpenEncodingOffset()
    {
        return 122;
    }

    public static int quoteEntryOpenEncodingLength()
    {
        return 1;
    }

    public static String quoteEntryOpenMetaAttribute(final MetaAttribute metaAttribute)
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

    public short quoteEntryOpenRaw()
    {
        if (parentMessage.actingVersion < 8)
        {
            return (short)255;
        }

        return ((short)(buffer.getByte(offset + 122) & 0xFF));
    }

    public BooleanNULL quoteEntryOpen()
    {
        if (parentMessage.actingVersion < 8)
        {
            return BooleanNULL.NULL_VAL;
        }

        return BooleanNULL.get(((short)(buffer.getByte(offset + 122) & 0xFF)));
    }


    private final NoQuoteEntriesDecoder noQuoteEntries = new NoQuoteEntriesDecoder(this);

    public static long noQuoteEntriesDecoderId()
    {
        return 295;
    }

    public static int noQuoteEntriesDecoderSinceVersion()
    {
        return 0;
    }

    /**
     * The number of quoute entries for a quote set
     *
     * @return NoQuoteEntriesDecoder : The number of quoute entries for a quote set
     */
    public NoQuoteEntriesDecoder noQuoteEntries()
    {
        noQuoteEntries.wrap(buffer);
        return noQuoteEntries;
    }

    /**
     * The number of quoute entries for a quote set
     */

    public static final class NoQuoteEntriesDecoder
        implements Iterable<NoQuoteEntriesDecoder>, java.util.Iterator<NoQuoteEntriesDecoder>
    {
        public static final int HEADER_SIZE = 3;
        private final MassQuote517Decoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        NoQuoteEntriesDecoder(final MassQuote517Decoder parentMessage)
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

        public NoQuoteEntriesDecoder next()
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
            return 38;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<NoQuoteEntriesDecoder> iterator()
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

        public static int bidPxId()
        {
            return 132;
        }

        public static int bidPxSinceVersion()
        {
            return 0;
        }

        public static int bidPxEncodingOffset()
        {
            return 0;
        }

        public static int bidPxEncodingLength()
        {
            return 8;
        }

        public static String bidPxMetaAttribute(final MetaAttribute metaAttribute)
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

        private final PRICENULL9Decoder bidPx = new PRICENULL9Decoder();

        /**
         * Bid price/rate. This goes together with bid size (tag 134). Note that either BidPx, OfferPx or both must be specified for a new quote. Resting quote can be cancelled by not providing either of these four parameters.
         *
         * @return PRICENULL9Decoder : Bid price/rate. This goes together with bid size (tag 134). Note that either BidPx, OfferPx or both must be specified for a new quote. Resting quote can be cancelled by not providing either of these four parameters.
         */
        public PRICENULL9Decoder bidPx()
        {
            bidPx.wrap(buffer, offset + 0);
            return bidPx;
        }

        public static int offerPxId()
        {
            return 133;
        }

        public static int offerPxSinceVersion()
        {
            return 0;
        }

        public static int offerPxEncodingOffset()
        {
            return 8;
        }

        public static int offerPxEncodingLength()
        {
            return 8;
        }

        public static String offerPxMetaAttribute(final MetaAttribute metaAttribute)
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

        private final PRICENULL9Decoder offerPx = new PRICENULL9Decoder();

        /**
         * Offer price/rate. This goes together with offer size (tag 135). Note that either BidPx, OfferPx or both must be specified for a new quote. Resting quote can be cancelled by not providing either of these four parameters.
         *
         * @return PRICENULL9Decoder : Offer price/rate. This goes together with offer size (tag 135). Note that either BidPx, OfferPx or both must be specified for a new quote. Resting quote can be cancelled by not providing either of these four parameters.
         */
        public PRICENULL9Decoder offerPx()
        {
            offerPx.wrap(buffer, offset + 8);
            return offerPx;
        }

        public static int quoteEntryIDId()
        {
            return 299;
        }

        public static int quoteEntryIDSinceVersion()
        {
            return 0;
        }

        public static int quoteEntryIDEncodingOffset()
        {
            return 16;
        }

        public static int quoteEntryIDEncodingLength()
        {
            return 4;
        }

        public static String quoteEntryIDMetaAttribute(final MetaAttribute metaAttribute)
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

        public static long quoteEntryIDNullValue()
        {
            return 4294967295L;
        }

        public static long quoteEntryIDMinValue()
        {
            return 0L;
        }

        public static long quoteEntryIDMaxValue()
        {
            return 4294967294L;
        }

        public long quoteEntryID()
        {
            return (buffer.getInt(offset + 16, BYTE_ORDER) & 0xFFFF_FFFFL);
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
            return 20;
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
            return buffer.getInt(offset + 20, BYTE_ORDER);
        }


        public static int bidSizeId()
        {
            return 134;
        }

        public static int bidSizeSinceVersion()
        {
            return 0;
        }

        public static int bidSizeEncodingOffset()
        {
            return 24;
        }

        public static int bidSizeEncodingLength()
        {
            return 4;
        }

        public static String bidSizeMetaAttribute(final MetaAttribute metaAttribute)
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

        public static long bidSizeNullValue()
        {
            return 4294967295L;
        }

        public static long bidSizeMinValue()
        {
            return 0L;
        }

        public static long bidSizeMaxValue()
        {
            return 4294967294L;
        }

        public long bidSize()
        {
            return (buffer.getInt(offset + 24, BYTE_ORDER) & 0xFFFF_FFFFL);
        }


        public static int offerSizeId()
        {
            return 135;
        }

        public static int offerSizeSinceVersion()
        {
            return 0;
        }

        public static int offerSizeEncodingOffset()
        {
            return 28;
        }

        public static int offerSizeEncodingLength()
        {
            return 4;
        }

        public static String offerSizeMetaAttribute(final MetaAttribute metaAttribute)
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

        public static long offerSizeNullValue()
        {
            return 4294967295L;
        }

        public static long offerSizeMinValue()
        {
            return 0L;
        }

        public static long offerSizeMaxValue()
        {
            return 4294967294L;
        }

        public long offerSize()
        {
            return (buffer.getInt(offset + 28, BYTE_ORDER) & 0xFFFF_FFFFL);
        }


        public static int underlyingSecurityIDId()
        {
            return 309;
        }

        public static int underlyingSecurityIDSinceVersion()
        {
            return 0;
        }

        public static int underlyingSecurityIDEncodingOffset()
        {
            return 32;
        }

        public static int underlyingSecurityIDEncodingLength()
        {
            return 4;
        }

        public static String underlyingSecurityIDMetaAttribute(final MetaAttribute metaAttribute)
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

        public static int underlyingSecurityIDNullValue()
        {
            return 2147483647;
        }

        public static int underlyingSecurityIDMinValue()
        {
            return -2147483647;
        }

        public static int underlyingSecurityIDMaxValue()
        {
            return 2147483647;
        }

        public int underlyingSecurityID()
        {
            return buffer.getInt(offset + 32, BYTE_ORDER);
        }


        public static int quoteSetIDId()
        {
            return 302;
        }

        public static int quoteSetIDSinceVersion()
        {
            return 0;
        }

        public static int quoteSetIDEncodingOffset()
        {
            return 36;
        }

        public static int quoteSetIDEncodingLength()
        {
            return 2;
        }

        public static String quoteSetIDMetaAttribute(final MetaAttribute metaAttribute)
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

        public static int quoteSetIDNullValue()
        {
            return 65535;
        }

        public static int quoteSetIDMinValue()
        {
            return 0;
        }

        public static int quoteSetIDMaxValue()
        {
            return 65534;
        }

        public int quoteSetID()
        {
            return (buffer.getShort(offset + 36, BYTE_ORDER) & 0xFFFF);
        }


        public StringBuilder appendTo(final StringBuilder builder)
        {
            if (null == buffer)
            {
                return builder;
            }

            builder.append('(');
            builder.append("bidPx=");
            final PRICENULL9Decoder bidPx = this.bidPx();
            if (null != bidPx)
            {
                bidPx.appendTo(builder);
            }
            else
            {
                builder.append("null");
            }
            builder.append('|');
            builder.append("offerPx=");
            final PRICENULL9Decoder offerPx = this.offerPx();
            if (null != offerPx)
            {
                offerPx.appendTo(builder);
            }
            else
            {
                builder.append("null");
            }
            builder.append('|');
            builder.append("quoteEntryID=");
            builder.append(this.quoteEntryID());
            builder.append('|');
            builder.append("securityID=");
            builder.append(this.securityID());
            builder.append('|');
            builder.append("bidSize=");
            builder.append(this.bidSize());
            builder.append('|');
            builder.append("offerSize=");
            builder.append(this.offerSize());
            builder.append('|');
            builder.append("underlyingSecurityID=");
            builder.append(this.underlyingSecurityID());
            builder.append('|');
            builder.append("quoteSetID=");
            builder.append(this.quoteSetID());
            builder.append(')');

            return builder;
        }
        
        public NoQuoteEntriesDecoder sbeSkip()
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

        final MassQuote517Decoder decoder = new MassQuote517Decoder();
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
        builder.append("[MassQuote517](sbeTemplateId=");
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
        builder.append("partyDetailsListReqID=");
        builder.append(this.partyDetailsListReqID());
        builder.append('|');
        builder.append("sendingTimeEpoch=");
        builder.append(this.sendingTimeEpoch());
        builder.append('|');
        builder.append("manualOrderIndicator=");
        builder.append(this.manualOrderIndicator());
        builder.append('|');
        builder.append("seqNum=");
        builder.append(this.seqNum());
        builder.append('|');
        builder.append("senderID=");
        for (int i = 0; i < senderIDLength() && this.senderID(i) > 0; i++)
        {
            builder.append((char)this.senderID(i));
        }
        builder.append('|');
        builder.append("quoteReqID=");
        builder.append(this.quoteReqID());
        builder.append('|');
        builder.append("location=");
        for (int i = 0; i < locationLength() && this.location(i) > 0; i++)
        {
            builder.append((char)this.location(i));
        }
        builder.append('|');
        builder.append("quoteID=");
        builder.append(this.quoteID());
        builder.append('|');
        builder.append("totNoQuoteEntries=");
        builder.append(this.totNoQuoteEntries());
        builder.append('|');
        builder.append("mMProtectionReset=");
        builder.append(this.mMProtectionReset());
        builder.append('|');
        builder.append("liquidityFlag=");
        builder.append(this.liquidityFlag());
        builder.append('|');
        builder.append("shortSaleType=");
        builder.append(this.shortSaleType());
        builder.append('|');
        builder.append("reserved=");
        for (int i = 0; i < reservedLength() && this.reserved(i) > 0; i++)
        {
            builder.append((char)this.reserved(i));
        }
        builder.append('|');
        builder.append("reserved1=");
        for (int i = 0; i < reserved1Length() && this.reserved1(i) > 0; i++)
        {
            builder.append((char)this.reserved1(i));
        }
        builder.append('|');
        builder.append("quoteEntryOpen=");
        builder.append(this.quoteEntryOpen());
        builder.append('|');
        builder.append("noQuoteEntries=[");
        final int noQuoteEntriesOriginalOffset = noQuoteEntries.offset;
        final int noQuoteEntriesOriginalIndex = noQuoteEntries.index;
        final NoQuoteEntriesDecoder noQuoteEntries = this.noQuoteEntries();
        if (noQuoteEntries.count() > 0)
        {
            while (noQuoteEntries.hasNext())
            {
                noQuoteEntries.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        noQuoteEntries.offset = noQuoteEntriesOriginalOffset;
        noQuoteEntries.index = noQuoteEntriesOriginalIndex;
        builder.append(']');

        limit(originalLimit);

        return builder;
    }
    
    public MassQuote517Decoder sbeSkip()
    {
        sbeRewind();
        NoQuoteEntriesDecoder noQuoteEntries = this.noQuoteEntries();
        if (noQuoteEntries.count() > 0)
        {
            while (noQuoteEntries.hasNext())
            {
                noQuoteEntries.next();
                noQuoteEntries.sbeSkip();
            }
        }

        return this;
    }
}
