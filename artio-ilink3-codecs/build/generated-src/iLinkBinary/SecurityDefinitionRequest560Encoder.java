/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.MutableDirectBuffer;
import org.agrona.sbe.*;


/**
 * SecurityDefinitionRequest
 */
@SuppressWarnings("all")
public final class SecurityDefinitionRequest560Encoder implements MessageEncoderFlyweight
{
    public static final int BLOCK_LENGTH = 72;
    public static final int TEMPLATE_ID = 560;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final SecurityDefinitionRequest560Encoder parentMessage = this;
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
        return "c";
    }

    public MutableDirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public SecurityDefinitionRequest560Encoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public SecurityDefinitionRequest560Encoder wrapAndApplyHeader(
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

    public SecurityDefinitionRequest560Encoder partyDetailsListReqID(final long value)
    {
        buffer.putLong(offset + 0, value, BYTE_ORDER);
        return this;
    }


    public static int securityReqIDId()
    {
        return 320;
    }

    public static int securityReqIDSinceVersion()
    {
        return 0;
    }

    public static int securityReqIDEncodingOffset()
    {
        return 8;
    }

    public static int securityReqIDEncodingLength()
    {
        return 8;
    }

    public static String securityReqIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long securityReqIDNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long securityReqIDMinValue()
    {
        return 0x0L;
    }

    public static long securityReqIDMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public SecurityDefinitionRequest560Encoder securityReqID(final long value)
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

    public SecurityDefinitionRequest560Encoder manualOrderIndicator(final ManualOrdIndReq value)
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

    public SecurityDefinitionRequest560Encoder seqNum(final long value)
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
            return "optional";
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


    public SecurityDefinitionRequest560Encoder senderID(final int index, final byte value)
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

    public SecurityDefinitionRequest560Encoder putSenderID(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 21, src, srcOffset, length);

        return this;
    }

    public SecurityDefinitionRequest560Encoder senderID(final String src)
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

    public SecurityDefinitionRequest560Encoder senderID(final CharSequence src)
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

    public static int securityReqTypeId()
    {
        return 321;
    }

    public static int securityReqTypeSinceVersion()
    {
        return 0;
    }

    public static int securityReqTypeEncodingOffset()
    {
        return 41;
    }

    public static int securityReqTypeEncodingLength()
    {
        return 0;
    }

    public static String securityReqTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte securityReqTypeNullValue()
    {
        return (byte)0;
    }

    public static byte securityReqTypeMinValue()
    {
        return (byte)32;
    }

    public static byte securityReqTypeMaxValue()
    {
        return (byte)126;
    }


    private static final byte[] SECURITYREQTYPE_VALUE = { 49 };

    public static int securityReqTypeLength()
    {
        return 1;
    }


    public byte securityReqType(final int index)
    {
        return SECURITYREQTYPE_VALUE[index];
    }

    public int getSecurityReqType(final byte[] dst, final int offset, final int length)
    {
        final int bytesCopied = Math.min(length, 1);
        System.arraycopy(SECURITYREQTYPE_VALUE, 0, dst, offset, bytesCopied);

        return bytesCopied;
    }

    public byte securityReqType()
    {
        return (byte)49;
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
        return 41;
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

    public SecurityDefinitionRequest560Encoder sendingTimeEpoch(final long value)
    {
        buffer.putLong(offset + 41, value, BYTE_ORDER);
        return this;
    }


    public static int securitySubTypeId()
    {
        return 762;
    }

    public static int securitySubTypeSinceVersion()
    {
        return 0;
    }

    public static int securitySubTypeEncodingOffset()
    {
        return 49;
    }

    public static int securitySubTypeEncodingLength()
    {
        return 8;
    }

    public static String securitySubTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte securitySubTypeNullValue()
    {
        return (byte)0;
    }

    public static byte securitySubTypeMinValue()
    {
        return (byte)32;
    }

    public static byte securitySubTypeMaxValue()
    {
        return (byte)126;
    }

    public static int securitySubTypeLength()
    {
        return 8;
    }


    public SecurityDefinitionRequest560Encoder securitySubType(final int index, final byte value)
    {
        if (index < 0 || index >= 8)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 49 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String securitySubTypeCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public SecurityDefinitionRequest560Encoder putSecuritySubType(final byte[] src, final int srcOffset)
    {
        final int length = 8;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 49, src, srcOffset, length);

        return this;
    }

    public SecurityDefinitionRequest560Encoder securitySubType(final String src)
    {
        final int length = 8;
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

    public SecurityDefinitionRequest560Encoder securitySubType(final CharSequence src)
    {
        final int length = 8;
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
        return 57;
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


    public SecurityDefinitionRequest560Encoder location(final int index, final byte value)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 57 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String locationCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public SecurityDefinitionRequest560Encoder putLocation(final byte[] src, final int srcOffset)
    {
        final int length = 5;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 57, src, srcOffset, length);

        return this;
    }

    public SecurityDefinitionRequest560Encoder location(final String src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 57, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 57 + start, (byte)0);
        }

        return this;
    }

    public SecurityDefinitionRequest560Encoder location(final CharSequence src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 57, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 57 + start, (byte)0);
        }

        return this;
    }

    public static int startDateId()
    {
        return 916;
    }

    public static int startDateSinceVersion()
    {
        return 0;
    }

    public static int startDateEncodingOffset()
    {
        return 62;
    }

    public static int startDateEncodingLength()
    {
        return 2;
    }

    public static String startDateMetaAttribute(final MetaAttribute metaAttribute)
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

    public static int startDateNullValue()
    {
        return 65535;
    }

    public static int startDateMinValue()
    {
        return 0;
    }

    public static int startDateMaxValue()
    {
        return 65534;
    }

    public SecurityDefinitionRequest560Encoder startDate(final int value)
    {
        buffer.putShort(offset + 62, (short)value, BYTE_ORDER);
        return this;
    }


    public static int endDateId()
    {
        return 917;
    }

    public static int endDateSinceVersion()
    {
        return 0;
    }

    public static int endDateEncodingOffset()
    {
        return 64;
    }

    public static int endDateEncodingLength()
    {
        return 2;
    }

    public static String endDateMetaAttribute(final MetaAttribute metaAttribute)
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

    public static int endDateNullValue()
    {
        return 65535;
    }

    public static int endDateMinValue()
    {
        return 0;
    }

    public static int endDateMaxValue()
    {
        return 65534;
    }

    public SecurityDefinitionRequest560Encoder endDate(final int value)
    {
        buffer.putShort(offset + 64, (short)value, BYTE_ORDER);
        return this;
    }


    public static int maxNoOfSubstitutionsId()
    {
        return 37715;
    }

    public static int maxNoOfSubstitutionsSinceVersion()
    {
        return 0;
    }

    public static int maxNoOfSubstitutionsEncodingOffset()
    {
        return 66;
    }

    public static int maxNoOfSubstitutionsEncodingLength()
    {
        return 1;
    }

    public static String maxNoOfSubstitutionsMetaAttribute(final MetaAttribute metaAttribute)
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

    public static short maxNoOfSubstitutionsNullValue()
    {
        return (short)255;
    }

    public static short maxNoOfSubstitutionsMinValue()
    {
        return (short)0;
    }

    public static short maxNoOfSubstitutionsMaxValue()
    {
        return (short)254;
    }

    public SecurityDefinitionRequest560Encoder maxNoOfSubstitutions(final short value)
    {
        buffer.putByte(offset + 66, (byte)value);
        return this;
    }


    public static int sourceRepoIDId()
    {
        return 5677;
    }

    public static int sourceRepoIDSinceVersion()
    {
        return 0;
    }

    public static int sourceRepoIDEncodingOffset()
    {
        return 67;
    }

    public static int sourceRepoIDEncodingLength()
    {
        return 4;
    }

    public static String sourceRepoIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static int sourceRepoIDNullValue()
    {
        return 2147483647;
    }

    public static int sourceRepoIDMinValue()
    {
        return -2147483647;
    }

    public static int sourceRepoIDMaxValue()
    {
        return 2147483647;
    }

    public SecurityDefinitionRequest560Encoder sourceRepoID(final int value)
    {
        buffer.putInt(offset + 67, value, BYTE_ORDER);
        return this;
    }


    public static int brokenDateTermTypeId()
    {
        return 6651;
    }

    public static int brokenDateTermTypeSinceVersion()
    {
        return 8;
    }

    public static int brokenDateTermTypeEncodingOffset()
    {
        return 71;
    }

    public static int brokenDateTermTypeEncodingLength()
    {
        return 1;
    }

    public static String brokenDateTermTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static short brokenDateTermTypeNullValue()
    {
        return (short)255;
    }

    public static short brokenDateTermTypeMinValue()
    {
        return (short)0;
    }

    public static short brokenDateTermTypeMaxValue()
    {
        return (short)254;
    }

    public SecurityDefinitionRequest560Encoder brokenDateTermType(final short value)
    {
        buffer.putByte(offset + 71, (byte)value);
        return this;
    }


    private final NoLegsEncoder noLegs = new NoLegsEncoder(this);

    public static long noLegsId()
    {
        return 555;
    }

    /**
     * Up to 26 legs (i.e., repeating groups) supported for UDS for options. Up to 40 legs (i.e., repeating groups) supported for UDS for futures. Will be set to 0 for REPO
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
     * Up to 26 legs (i.e., repeating groups) supported for UDS for options. Up to 40 legs (i.e., repeating groups) supported for UDS for futures. Will be set to 0 for REPO
     */

    public static final class NoLegsEncoder
    {
        public static final int HEADER_SIZE = 3;
        private final SecurityDefinitionRequest560Encoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int initialLimit;

        NoLegsEncoder(final SecurityDefinitionRequest560Encoder parentMessage)
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
            buffer.putShort(limit + 0, (short)19, BYTE_ORDER);
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
            return 19;
        }

        public static int legSecurityIDSourceId()
        {
            return 603;
        }

        public static int legSecurityIDSourceSinceVersion()
        {
            return 0;
        }

        public static int legSecurityIDSourceEncodingOffset()
        {
            return 0;
        }

        public static int legSecurityIDSourceEncodingLength()
        {
            return 0;
        }

        public static String legSecurityIDSourceMetaAttribute(final MetaAttribute metaAttribute)
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

        public static byte legSecurityIDSourceNullValue()
        {
            return (byte)0;
        }

        public static byte legSecurityIDSourceMinValue()
        {
            return (byte)32;
        }

        public static byte legSecurityIDSourceMaxValue()
        {
            return (byte)126;
        }


        private static final byte[] LEGSECURITYIDSOURCE_VALUE = { 56 };

        public static int legSecurityIDSourceLength()
        {
            return 1;
        }


        public byte legSecurityIDSource(final int index)
        {
            return LEGSECURITYIDSOURCE_VALUE[index];
        }

        public int getLegSecurityIDSource(final byte[] dst, final int offset, final int length)
        {
            final int bytesCopied = Math.min(length, 1);
            System.arraycopy(LEGSECURITYIDSOURCE_VALUE, 0, dst, offset, bytesCopied);

            return bytesCopied;
        }

        public byte legSecurityIDSource()
        {
            return (byte)56;
        }


        public static int legPriceId()
        {
            return 566;
        }

        public static int legPriceSinceVersion()
        {
            return 0;
        }

        public static int legPriceEncodingOffset()
        {
            return 0;
        }

        public static int legPriceEncodingLength()
        {
            return 8;
        }

        public static String legPriceMetaAttribute(final MetaAttribute metaAttribute)
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

        private final PRICENULL9Encoder legPrice = new PRICENULL9Encoder();

        /**
         * Price of the futures contract as part of UDS Covered 
         *
         * @return PRICENULL9Encoder : Price of the futures contract as part of UDS Covered 
         */
        public PRICENULL9Encoder legPrice()
        {
            legPrice.wrap(buffer, offset + 0);
            return legPrice;
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
            return 8;
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
            buffer.putInt(offset + 8, value, BYTE_ORDER);
            return this;
        }


        public static int legOptionDeltaId()
        {
            return 1017;
        }

        public static int legOptionDeltaSinceVersion()
        {
            return 0;
        }

        public static int legOptionDeltaEncodingOffset()
        {
            return 12;
        }

        public static int legOptionDeltaEncodingLength()
        {
            return 5;
        }

        public static String legOptionDeltaMetaAttribute(final MetaAttribute metaAttribute)
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

        private final Decimal32NULLEncoder legOptionDelta = new Decimal32NULLEncoder();

        /**
         * Delta used to calculate the quantity of futures used to cover the option or option strategy.
         *
         * @return Decimal32NULLEncoder : Delta used to calculate the quantity of futures used to cover the option or option strategy.
         */
        public Decimal32NULLEncoder legOptionDelta()
        {
            legOptionDelta.wrap(buffer, offset + 12);
            return legOptionDelta;
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
            return 17;
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
            buffer.putByte(offset + 17, (byte)value.value());
            return this;
        }

        public static int legRatioQtyId()
        {
            return 623;
        }

        public static int legRatioQtySinceVersion()
        {
            return 0;
        }

        public static int legRatioQtyEncodingOffset()
        {
            return 18;
        }

        public static int legRatioQtyEncodingLength()
        {
            return 1;
        }

        public static String legRatioQtyMetaAttribute(final MetaAttribute metaAttribute)
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

        public static short legRatioQtyNullValue()
        {
            return (short)255;
        }

        public static short legRatioQtyMinValue()
        {
            return (short)0;
        }

        public static short legRatioQtyMaxValue()
        {
            return (short)254;
        }

        public NoLegsEncoder legRatioQty(final short value)
        {
            buffer.putByte(offset + 18, (byte)value);
            return this;
        }

    }

    private final NoBrokenDatesEncoder noBrokenDates = new NoBrokenDatesEncoder(this);

    public static long noBrokenDatesId()
    {
        return 39026;
    }

    /**
     * Used to indicate the number of custom bespoke broken dates for user defined tailor made repo
     *
     * @param count of times the group will be encoded.
     * @return NoBrokenDatesEncoder : encoder for the group.
     */
    public NoBrokenDatesEncoder noBrokenDatesCount(final int count)
    {
        noBrokenDates.wrap(buffer, count);
        return noBrokenDates;
    }

    /**
     * Used to indicate the number of custom bespoke broken dates for user defined tailor made repo
     */

    public static final class NoBrokenDatesEncoder
    {
        public static final int HEADER_SIZE = 3;
        private final SecurityDefinitionRequest560Encoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int initialLimit;

        NoBrokenDatesEncoder(final SecurityDefinitionRequest560Encoder parentMessage)
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
            buffer.putShort(limit + 0, (short)4, BYTE_ORDER);
            buffer.putByte(limit + 2, (byte)count);
        }

        public NoBrokenDatesEncoder next()
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
            return 4;
        }

        public static int brokenDateStartId()
        {
            return 6748;
        }

        public static int brokenDateStartSinceVersion()
        {
            return 0;
        }

        public static int brokenDateStartEncodingOffset()
        {
            return 0;
        }

        public static int brokenDateStartEncodingLength()
        {
            return 2;
        }

        public static String brokenDateStartMetaAttribute(final MetaAttribute metaAttribute)
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

        public static int brokenDateStartNullValue()
        {
            return 65535;
        }

        public static int brokenDateStartMinValue()
        {
            return 0;
        }

        public static int brokenDateStartMaxValue()
        {
            return 65534;
        }

        public NoBrokenDatesEncoder brokenDateStart(final int value)
        {
            buffer.putShort(offset + 0, (short)value, BYTE_ORDER);
            return this;
        }


        public static int brokenDateEndId()
        {
            return 6741;
        }

        public static int brokenDateEndSinceVersion()
        {
            return 0;
        }

        public static int brokenDateEndEncodingOffset()
        {
            return 2;
        }

        public static int brokenDateEndEncodingLength()
        {
            return 2;
        }

        public static String brokenDateEndMetaAttribute(final MetaAttribute metaAttribute)
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

        public static int brokenDateEndNullValue()
        {
            return 65535;
        }

        public static int brokenDateEndMinValue()
        {
            return 0;
        }

        public static int brokenDateEndMaxValue()
        {
            return 65534;
        }

        public NoBrokenDatesEncoder brokenDateEnd(final int value)
        {
            buffer.putShort(offset + 2, (short)value, BYTE_ORDER);
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

        final SecurityDefinitionRequest560Decoder decoder = new SecurityDefinitionRequest560Decoder();
        decoder.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return decoder.appendTo(builder);
    }
}
