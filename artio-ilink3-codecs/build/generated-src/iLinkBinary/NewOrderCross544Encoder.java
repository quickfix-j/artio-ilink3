/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.MutableDirectBuffer;
import org.agrona.sbe.*;


/**
 * NewOrderCross
 */
@SuppressWarnings("all")
public final class NewOrderCross544Encoder implements MessageEncoderFlyweight
{
    public static final int BLOCK_LENGTH = 74;
    public static final int TEMPLATE_ID = 544;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final NewOrderCross544Encoder parentMessage = this;
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
        return "s";
    }

    public MutableDirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public NewOrderCross544Encoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public NewOrderCross544Encoder wrapAndApplyHeader(
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
        return 0;
    }

    public static int crossIDEncodingLength()
    {
        return 8;
    }

    public static String crossIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public NewOrderCross544Encoder crossID(final long value)
    {
        buffer.putLong(offset + 0, value, BYTE_ORDER);
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
        return 8;
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

    public NewOrderCross544Encoder orderRequestID(final long value)
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

    public NewOrderCross544Encoder manualOrderIndicator(final ManualOrdIndReq value)
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

    public NewOrderCross544Encoder seqNum(final long value)
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


    public NewOrderCross544Encoder senderID(final int index, final byte value)
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

    public NewOrderCross544Encoder putSenderID(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 21, src, srcOffset, length);

        return this;
    }

    public NewOrderCross544Encoder senderID(final String src)
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

    public NewOrderCross544Encoder senderID(final CharSequence src)
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
        return 41;
    }

    public static int ordTypeEncodingLength()
    {
        return 0;
    }

    public static String ordTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte ordTypeNullValue()
    {
        return (byte)0;
    }

    public static byte ordTypeMinValue()
    {
        return (byte)32;
    }

    public static byte ordTypeMaxValue()
    {
        return (byte)126;
    }


    private static final byte[] ORDTYPE_VALUE = { 50 };

    public static int ordTypeLength()
    {
        return 1;
    }


    public byte ordType(final int index)
    {
        return ORDTYPE_VALUE[index];
    }

    public int getOrdType(final byte[] dst, final int offset, final int length)
    {
        final int bytesCopied = Math.min(length, 1);
        System.arraycopy(ORDTYPE_VALUE, 0, dst, offset, bytesCopied);

        return bytesCopied;
    }

    public byte ordType()
    {
        return (byte)50;
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
        return 41;
    }

    public static int crossTypeEncodingLength()
    {
        return 0;
    }

    public static String crossTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte crossTypeNullValue()
    {
        return (byte)0;
    }

    public static byte crossTypeMinValue()
    {
        return (byte)32;
    }

    public static byte crossTypeMaxValue()
    {
        return (byte)126;
    }


    private static final byte[] CROSSTYPE_VALUE = { 51 };

    public static int crossTypeLength()
    {
        return 1;
    }


    public byte crossType(final int index)
    {
        return CROSSTYPE_VALUE[index];
    }

    public int getCrossType(final byte[] dst, final int offset, final int length)
    {
        final int bytesCopied = Math.min(length, 1);
        System.arraycopy(CROSSTYPE_VALUE, 0, dst, offset, bytesCopied);

        return bytesCopied;
    }

    public byte crossType()
    {
        return (byte)51;
    }


    public static int crossPrioritizationId()
    {
        return 550;
    }

    public static int crossPrioritizationSinceVersion()
    {
        return 0;
    }

    public static int crossPrioritizationEncodingOffset()
    {
        return 41;
    }

    public static int crossPrioritizationEncodingLength()
    {
        return 0;
    }

    public static String crossPrioritizationMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte crossPrioritizationNullValue()
    {
        return (byte)0;
    }

    public static byte crossPrioritizationMinValue()
    {
        return (byte)32;
    }

    public static byte crossPrioritizationMaxValue()
    {
        return (byte)126;
    }


    private static final byte[] CROSSPRIORITIZATION_VALUE = { 48 };

    public static int crossPrioritizationLength()
    {
        return 1;
    }


    public byte crossPrioritization(final int index)
    {
        return CROSSPRIORITIZATION_VALUE[index];
    }

    public int getCrossPrioritization(final byte[] dst, final int offset, final int length)
    {
        final int bytesCopied = Math.min(length, 1);
        System.arraycopy(CROSSPRIORITIZATION_VALUE, 0, dst, offset, bytesCopied);

        return bytesCopied;
    }

    public byte crossPrioritization()
    {
        return (byte)48;
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
        return 41;
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
     * Conditionally required when OrdType (40) = 2 (Limit)
     *
     * @return PRICE9Encoder : Conditionally required when OrdType (40) = 2 (Limit)
     */
    public PRICE9Encoder price()
    {
        price.wrap(buffer, offset + 41);
        return price;
    }

    public static int transBkdTimeId()
    {
        return 483;
    }

    public static int transBkdTimeSinceVersion()
    {
        return 0;
    }

    public static int transBkdTimeEncodingOffset()
    {
        return 49;
    }

    public static int transBkdTimeEncodingLength()
    {
        return 8;
    }

    public static String transBkdTimeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long transBkdTimeNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long transBkdTimeMinValue()
    {
        return 0x0L;
    }

    public static long transBkdTimeMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public NewOrderCross544Encoder transBkdTime(final long value)
    {
        buffer.putLong(offset + 49, value, BYTE_ORDER);
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
        return 57;
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

    public NewOrderCross544Encoder sendingTimeEpoch(final long value)
    {
        buffer.putLong(offset + 57, value, BYTE_ORDER);
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
        return 65;
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


    public NewOrderCross544Encoder location(final int index, final byte value)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 65 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String locationCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public NewOrderCross544Encoder putLocation(final byte[] src, final int srcOffset)
    {
        final int length = 5;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 65, src, srcOffset, length);

        return this;
    }

    public NewOrderCross544Encoder location(final String src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 65, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 65 + start, (byte)0);
        }

        return this;
    }

    public NewOrderCross544Encoder location(final CharSequence src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 65, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 65 + start, (byte)0);
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
        return 70;
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

    public NewOrderCross544Encoder securityID(final int value)
    {
        buffer.putInt(offset + 70, value, BYTE_ORDER);
        return this;
    }


    private final NoSidesEncoder noSides = new NoSidesEncoder(this);

    public static long noSidesId()
    {
        return 552;
    }

    /**
     * Number of Side repeating group instances 
     *
     * @param count of times the group will be encoded.
     * @return NoSidesEncoder : encoder for the group.
     */
    public NoSidesEncoder noSidesCount(final int count)
    {
        noSides.wrap(buffer, count);
        return noSides;
    }

    /**
     * Number of Side repeating group instances 
     */

    public static final class NoSidesEncoder
    {
        public static final int HEADER_SIZE = 3;
        private final NewOrderCross544Encoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int initialLimit;

        NoSidesEncoder(final NewOrderCross544Encoder parentMessage)
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
            buffer.putShort(limit + 0, (short)34, BYTE_ORDER);
            buffer.putByte(limit + 2, (byte)count);
        }

        public NoSidesEncoder next()
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
            return 34;
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
            return 0;
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


        public NoSidesEncoder clOrdID(final int index, final byte value)
        {
            if (index < 0 || index >= 20)
            {
                throw new IndexOutOfBoundsException("index out of range: index=" + index);
            }

            final int pos = offset + 0 + (index * 1);
            buffer.putByte(pos, value);

            return this;
        }

        public static String clOrdIDCharacterEncoding()
        {
            return java.nio.charset.StandardCharsets.US_ASCII.name();
        }

        public NoSidesEncoder putClOrdID(final byte[] src, final int srcOffset)
        {
            final int length = 20;
            if (srcOffset < 0 || srcOffset > (src.length - length))
            {
                throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
            }

            buffer.putBytes(offset + 0, src, srcOffset, length);

            return this;
        }

        public NoSidesEncoder clOrdID(final String src)
        {
            final int length = 20;
            final int srcLength = null == src ? 0 : src.length();
            if (srcLength > length)
            {
                throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
            }

            buffer.putStringWithoutLengthAscii(offset + 0, src);

            for (int start = srcLength; start < length; ++start)
            {
                buffer.putByte(offset + 0 + start, (byte)0);
            }

            return this;
        }

        public NoSidesEncoder clOrdID(final CharSequence src)
        {
            final int length = 20;
            final int srcLength = null == src ? 0 : src.length();
            if (srcLength > length)
            {
                throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
            }

            buffer.putStringWithoutLengthAscii(offset + 0, src);

            for (int start = srcLength; start < length; ++start)
            {
                buffer.putByte(offset + 0 + start, (byte)0);
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
            return 20;
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

        public NoSidesEncoder partyDetailsListReqID(final long value)
        {
            buffer.putLong(offset + 20, value, BYTE_ORDER);
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
            return 28;
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

        public NoSidesEncoder orderQty(final long value)
        {
            buffer.putInt(offset + 28, (int)value, BYTE_ORDER);
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
            return 32;
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

        public NoSidesEncoder side(final SideReq value)
        {
            buffer.putByte(offset + 32, (byte)value.value());
            return this;
        }

        public static int sideTimeInForceId()
        {
            return 962;
        }

        public static int sideTimeInForceSinceVersion()
        {
            return 0;
        }

        public static int sideTimeInForceEncodingOffset()
        {
            return 33;
        }

        public static int sideTimeInForceEncodingLength()
        {
            return 1;
        }

        public static String sideTimeInForceMetaAttribute(final MetaAttribute metaAttribute)
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

        public NoSidesEncoder sideTimeInForce(final SideTimeInForce value)
        {
            buffer.putByte(offset + 33, (byte)value.value());
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

        final NewOrderCross544Decoder decoder = new NewOrderCross544Decoder();
        decoder.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return decoder.appendTo(builder);
    }
}
