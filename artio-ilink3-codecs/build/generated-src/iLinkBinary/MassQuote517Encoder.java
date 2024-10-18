/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.MutableDirectBuffer;
import org.agrona.sbe.*;


/**
 * MassQuote
 */
@SuppressWarnings("all")
public final class MassQuote517Encoder implements MessageEncoderFlyweight
{
    public static final int BLOCK_LENGTH = 123;
    public static final int TEMPLATE_ID = 517;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final MassQuote517Encoder parentMessage = this;
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
        return "i";
    }

    public MutableDirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public MassQuote517Encoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public MassQuote517Encoder wrapAndApplyHeader(
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

    public MassQuote517Encoder partyDetailsListReqID(final long value)
    {
        buffer.putLong(offset + 0, value, BYTE_ORDER);
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

    public MassQuote517Encoder sendingTimeEpoch(final long value)
    {
        buffer.putLong(offset + 8, value, BYTE_ORDER);
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

    public MassQuote517Encoder manualOrderIndicator(final ManualOrdIndReq value)
    {
        buffer.putByte(offset + 16, (byte)value.value());
        return this;
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

    public MassQuote517Encoder seqNum(final long value)
    {
        buffer.putInt(offset + 17, (int)value, BYTE_ORDER);
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


    public MassQuote517Encoder senderID(final int index, final byte value)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 21 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String senderIDCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public MassQuote517Encoder putSenderID(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 21, src, srcOffset, length);

        return this;
    }

    public MassQuote517Encoder senderID(final String src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 21, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 21 + start, (byte)0);
        }

        return this;
    }

    public MassQuote517Encoder senderID(final CharSequence src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 21, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 21 + start, (byte)0);
        }

        return this;
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

    public MassQuote517Encoder quoteReqID(final long value)
    {
        buffer.putLong(offset + 41, value, BYTE_ORDER);
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


    public MassQuote517Encoder location(final int index, final byte value)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 49 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String locationCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public MassQuote517Encoder putLocation(final byte[] src, final int srcOffset)
    {
        final int length = 5;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 49, src, srcOffset, length);

        return this;
    }

    public MassQuote517Encoder location(final String src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 49, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 49 + start, (byte)0);
        }

        return this;
    }

    public MassQuote517Encoder location(final CharSequence src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 49, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 49 + start, (byte)0);
        }

        return this;
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

    public MassQuote517Encoder quoteID(final long value)
    {
        buffer.putInt(offset + 54, (int)value, BYTE_ORDER);
        return this;
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

    public MassQuote517Encoder totNoQuoteEntries(final short value)
    {
        buffer.putByte(offset + 58, (byte)value);
        return this;
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

    public MassQuote517Encoder mMProtectionReset(final BooleanFlag value)
    {
        buffer.putByte(offset + 59, (byte)value.value());
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

    public MassQuote517Encoder liquidityFlag(final BooleanNULL value)
    {
        buffer.putByte(offset + 60, (byte)value.value());
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

    public MassQuote517Encoder shortSaleType(final ShortSaleType value)
    {
        buffer.putByte(offset + 61, (byte)value.value());
        return this;
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


    public MassQuote517Encoder reserved(final int index, final byte value)
    {
        if (index < 0 || index >= 30)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 62 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String reservedCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public MassQuote517Encoder putReserved(final byte[] src, final int srcOffset)
    {
        final int length = 30;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 62, src, srcOffset, length);

        return this;
    }

    public MassQuote517Encoder reserved(final String src)
    {
        final int length = 30;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 62, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 62 + start, (byte)0);
        }

        return this;
    }

    public MassQuote517Encoder reserved(final CharSequence src)
    {
        final int length = 30;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 62, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 62 + start, (byte)0);
        }

        return this;
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


    public MassQuote517Encoder reserved1(final int index, final byte value)
    {
        if (index < 0 || index >= 30)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 92 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String reserved1CharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public MassQuote517Encoder putReserved1(final byte[] src, final int srcOffset)
    {
        final int length = 30;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 92, src, srcOffset, length);

        return this;
    }

    public MassQuote517Encoder reserved1(final String src)
    {
        final int length = 30;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 92, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 92 + start, (byte)0);
        }

        return this;
    }

    public MassQuote517Encoder reserved1(final CharSequence src)
    {
        final int length = 30;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 92, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 92 + start, (byte)0);
        }

        return this;
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

    public MassQuote517Encoder quoteEntryOpen(final BooleanNULL value)
    {
        buffer.putByte(offset + 122, (byte)value.value());
        return this;
    }

    private final NoQuoteEntriesEncoder noQuoteEntries = new NoQuoteEntriesEncoder(this);

    public static long noQuoteEntriesId()
    {
        return 295;
    }

    /**
     * The number of quoute entries for a quote set
     *
     * @param count of times the group will be encoded.
     * @return NoQuoteEntriesEncoder : encoder for the group.
     */
    public NoQuoteEntriesEncoder noQuoteEntriesCount(final int count)
    {
        noQuoteEntries.wrap(buffer, count);
        return noQuoteEntries;
    }

    /**
     * The number of quoute entries for a quote set
     */

    public static final class NoQuoteEntriesEncoder
    {
        public static final int HEADER_SIZE = 3;
        private final MassQuote517Encoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int initialLimit;

        NoQuoteEntriesEncoder(final MassQuote517Encoder parentMessage)
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
            buffer.putShort(limit + 0, (short)38, BYTE_ORDER);
            buffer.putByte(limit + 2, (byte)count);
        }

        public NoQuoteEntriesEncoder next()
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
            return 38;
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

        private final PRICENULL9Encoder bidPx = new PRICENULL9Encoder();

        /**
         * Bid price/rate. This goes together with bid size (tag 134). Note that either BidPx, OfferPx or both must be specified for a new quote. Resting quote can be cancelled by not providing either of these four parameters.
         *
         * @return PRICENULL9Encoder : Bid price/rate. This goes together with bid size (tag 134). Note that either BidPx, OfferPx or both must be specified for a new quote. Resting quote can be cancelled by not providing either of these four parameters.
         */
        public PRICENULL9Encoder bidPx()
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

        private final PRICENULL9Encoder offerPx = new PRICENULL9Encoder();

        /**
         * Offer price/rate. This goes together with offer size (tag 135). Note that either BidPx, OfferPx or both must be specified for a new quote. Resting quote can be cancelled by not providing either of these four parameters.
         *
         * @return PRICENULL9Encoder : Offer price/rate. This goes together with offer size (tag 135). Note that either BidPx, OfferPx or both must be specified for a new quote. Resting quote can be cancelled by not providing either of these four parameters.
         */
        public PRICENULL9Encoder offerPx()
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

        public NoQuoteEntriesEncoder quoteEntryID(final long value)
        {
            buffer.putInt(offset + 16, (int)value, BYTE_ORDER);
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

        public NoQuoteEntriesEncoder securityID(final int value)
        {
            buffer.putInt(offset + 20, value, BYTE_ORDER);
            return this;
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

        public NoQuoteEntriesEncoder bidSize(final long value)
        {
            buffer.putInt(offset + 24, (int)value, BYTE_ORDER);
            return this;
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

        public NoQuoteEntriesEncoder offerSize(final long value)
        {
            buffer.putInt(offset + 28, (int)value, BYTE_ORDER);
            return this;
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

        public NoQuoteEntriesEncoder underlyingSecurityID(final int value)
        {
            buffer.putInt(offset + 32, value, BYTE_ORDER);
            return this;
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

        public NoQuoteEntriesEncoder quoteSetID(final int value)
        {
            buffer.putShort(offset + 36, (short)value, BYTE_ORDER);
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

        final MassQuote517Decoder decoder = new MassQuote517Decoder();
        decoder.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return decoder.appendTo(builder);
    }
}
