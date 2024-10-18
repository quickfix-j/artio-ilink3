/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.MutableDirectBuffer;
import org.agrona.sbe.*;


/**
 * PartyDetailsDefinitionRequest
 */
@SuppressWarnings("all")
public final class PartyDetailsDefinitionRequest518Encoder implements MessageEncoderFlyweight
{
    public static final int BLOCK_LENGTH = 147;
    public static final int TEMPLATE_ID = 518;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final PartyDetailsDefinitionRequest518Encoder parentMessage = this;
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
        return "CX";
    }

    public MutableDirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public PartyDetailsDefinitionRequest518Encoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public PartyDetailsDefinitionRequest518Encoder wrapAndApplyHeader(
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

    public PartyDetailsDefinitionRequest518Encoder partyDetailsListReqID(final long value)
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

    public PartyDetailsDefinitionRequest518Encoder sendingTimeEpoch(final long value)
    {
        buffer.putLong(offset + 8, value, BYTE_ORDER);
        return this;
    }


    public static int listUpdateActionId()
    {
        return 1324;
    }

    public static int listUpdateActionSinceVersion()
    {
        return 0;
    }

    public static int listUpdateActionEncodingOffset()
    {
        return 16;
    }

    public static int listUpdateActionEncodingLength()
    {
        return 1;
    }

    public static String listUpdateActionMetaAttribute(final MetaAttribute metaAttribute)
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

    public PartyDetailsDefinitionRequest518Encoder listUpdateAction(final ListUpdAct value)
    {
        buffer.putByte(offset + 16, value.value());
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

    public PartyDetailsDefinitionRequest518Encoder seqNum(final long value)
    {
        buffer.putInt(offset + 17, (int)value, BYTE_ORDER);
        return this;
    }


    public static int memoId()
    {
        return 5149;
    }

    public static int memoSinceVersion()
    {
        return 0;
    }

    public static int memoEncodingOffset()
    {
        return 21;
    }

    public static int memoEncodingLength()
    {
        return 75;
    }

    public static String memoMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte memoNullValue()
    {
        return (byte)0;
    }

    public static byte memoMinValue()
    {
        return (byte)32;
    }

    public static byte memoMaxValue()
    {
        return (byte)126;
    }

    public static int memoLength()
    {
        return 75;
    }


    public PartyDetailsDefinitionRequest518Encoder memo(final int index, final byte value)
    {
        if (index < 0 || index >= 75)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 21 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String memoCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public PartyDetailsDefinitionRequest518Encoder putMemo(final byte[] src, final int srcOffset)
    {
        final int length = 75;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 21, src, srcOffset, length);

        return this;
    }

    public PartyDetailsDefinitionRequest518Encoder memo(final String src)
    {
        final int length = 75;
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

    public PartyDetailsDefinitionRequest518Encoder memo(final CharSequence src)
    {
        final int length = 75;
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

    public static int avgPxGroupIDId()
    {
        return 1731;
    }

    public static int avgPxGroupIDSinceVersion()
    {
        return 0;
    }

    public static int avgPxGroupIDEncodingOffset()
    {
        return 96;
    }

    public static int avgPxGroupIDEncodingLength()
    {
        return 20;
    }

    public static String avgPxGroupIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte avgPxGroupIDNullValue()
    {
        return (byte)0;
    }

    public static byte avgPxGroupIDMinValue()
    {
        return (byte)32;
    }

    public static byte avgPxGroupIDMaxValue()
    {
        return (byte)126;
    }

    public static int avgPxGroupIDLength()
    {
        return 20;
    }


    public PartyDetailsDefinitionRequest518Encoder avgPxGroupID(final int index, final byte value)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 96 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String avgPxGroupIDCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public PartyDetailsDefinitionRequest518Encoder putAvgPxGroupID(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 96, src, srcOffset, length);

        return this;
    }

    public PartyDetailsDefinitionRequest518Encoder avgPxGroupID(final String src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 96, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 96 + start, (byte)0);
        }

        return this;
    }

    public PartyDetailsDefinitionRequest518Encoder avgPxGroupID(final CharSequence src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 96, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 96 + start, (byte)0);
        }

        return this;
    }

    public static int selfMatchPreventionIDId()
    {
        return 2362;
    }

    public static int selfMatchPreventionIDSinceVersion()
    {
        return 0;
    }

    public static int selfMatchPreventionIDEncodingOffset()
    {
        return 116;
    }

    public static int selfMatchPreventionIDEncodingLength()
    {
        return 8;
    }

    public static String selfMatchPreventionIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long selfMatchPreventionIDNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long selfMatchPreventionIDMinValue()
    {
        return 0x0L;
    }

    public static long selfMatchPreventionIDMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public PartyDetailsDefinitionRequest518Encoder selfMatchPreventionID(final long value)
    {
        buffer.putLong(offset + 116, value, BYTE_ORDER);
        return this;
    }


    public static int cmtaGiveupCDId()
    {
        return 9708;
    }

    public static int cmtaGiveupCDSinceVersion()
    {
        return 0;
    }

    public static int cmtaGiveupCDEncodingOffset()
    {
        return 124;
    }

    public static int cmtaGiveupCDEncodingLength()
    {
        return 1;
    }

    public static String cmtaGiveupCDMetaAttribute(final MetaAttribute metaAttribute)
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

    public PartyDetailsDefinitionRequest518Encoder cmtaGiveupCD(final CmtaGiveUpCD value)
    {
        buffer.putByte(offset + 124, value.value());
        return this;
    }

    public static int custOrderCapacityId()
    {
        return 582;
    }

    public static int custOrderCapacitySinceVersion()
    {
        return 0;
    }

    public static int custOrderCapacityEncodingOffset()
    {
        return 125;
    }

    public static int custOrderCapacityEncodingLength()
    {
        return 1;
    }

    public static String custOrderCapacityMetaAttribute(final MetaAttribute metaAttribute)
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

    public PartyDetailsDefinitionRequest518Encoder custOrderCapacity(final CustOrderCapacity value)
    {
        buffer.putByte(offset + 125, (byte)value.value());
        return this;
    }

    public static int clearingAccountTypeId()
    {
        return 1816;
    }

    public static int clearingAccountTypeSinceVersion()
    {
        return 0;
    }

    public static int clearingAccountTypeEncodingOffset()
    {
        return 126;
    }

    public static int clearingAccountTypeEncodingLength()
    {
        return 1;
    }

    public static String clearingAccountTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    public PartyDetailsDefinitionRequest518Encoder clearingAccountType(final ClearingAcctType value)
    {
        buffer.putByte(offset + 126, (byte)value.value());
        return this;
    }

    public static int selfMatchPreventionInstructionId()
    {
        return 8000;
    }

    public static int selfMatchPreventionInstructionSinceVersion()
    {
        return 0;
    }

    public static int selfMatchPreventionInstructionEncodingOffset()
    {
        return 127;
    }

    public static int selfMatchPreventionInstructionEncodingLength()
    {
        return 1;
    }

    public static String selfMatchPreventionInstructionMetaAttribute(final MetaAttribute metaAttribute)
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

    public PartyDetailsDefinitionRequest518Encoder selfMatchPreventionInstruction(final SMPI value)
    {
        buffer.putByte(offset + 127, value.value());
        return this;
    }

    public static int avgPxIndicatorId()
    {
        return 819;
    }

    public static int avgPxIndicatorSinceVersion()
    {
        return 0;
    }

    public static int avgPxIndicatorEncodingOffset()
    {
        return 128;
    }

    public static int avgPxIndicatorEncodingLength()
    {
        return 1;
    }

    public static String avgPxIndicatorMetaAttribute(final MetaAttribute metaAttribute)
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

    public PartyDetailsDefinitionRequest518Encoder avgPxIndicator(final AvgPxInd value)
    {
        buffer.putByte(offset + 128, (byte)value.value());
        return this;
    }

    public static int clearingTradePriceTypeId()
    {
        return 1598;
    }

    public static int clearingTradePriceTypeSinceVersion()
    {
        return 0;
    }

    public static int clearingTradePriceTypeEncodingOffset()
    {
        return 129;
    }

    public static int clearingTradePriceTypeEncodingLength()
    {
        return 1;
    }

    public static String clearingTradePriceTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    public PartyDetailsDefinitionRequest518Encoder clearingTradePriceType(final SLEDS value)
    {
        buffer.putByte(offset + 129, (byte)value.value());
        return this;
    }

    public static int custOrderHandlingInstId()
    {
        return 1031;
    }

    public static int custOrderHandlingInstSinceVersion()
    {
        return 0;
    }

    public static int custOrderHandlingInstEncodingOffset()
    {
        return 130;
    }

    public static int custOrderHandlingInstEncodingLength()
    {
        return 1;
    }

    public static String custOrderHandlingInstMetaAttribute(final MetaAttribute metaAttribute)
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

    public PartyDetailsDefinitionRequest518Encoder custOrderHandlingInst(final CustOrdHandlInst value)
    {
        buffer.putByte(offset + 130, value.value());
        return this;
    }

    public static int executorId()
    {
        return 5290;
    }

    public static int executorSinceVersion()
    {
        return 0;
    }

    public static int executorEncodingOffset()
    {
        return 131;
    }

    public static int executorEncodingLength()
    {
        return 8;
    }

    public static String executorMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long executorNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long executorMinValue()
    {
        return 0x0L;
    }

    public static long executorMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public PartyDetailsDefinitionRequest518Encoder executor(final long value)
    {
        buffer.putLong(offset + 131, value, BYTE_ORDER);
        return this;
    }


    public static int iDMShortCodeId()
    {
        return 36023;
    }

    public static int iDMShortCodeSinceVersion()
    {
        return 0;
    }

    public static int iDMShortCodeEncodingOffset()
    {
        return 139;
    }

    public static int iDMShortCodeEncodingLength()
    {
        return 8;
    }

    public static String iDMShortCodeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long iDMShortCodeNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long iDMShortCodeMinValue()
    {
        return 0x0L;
    }

    public static long iDMShortCodeMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public PartyDetailsDefinitionRequest518Encoder iDMShortCode(final long value)
    {
        buffer.putLong(offset + 139, value, BYTE_ORDER);
        return this;
    }


    public static int noPartyUpdatesId()
    {
        return 1676;
    }

    public static int noPartyUpdatesSinceVersion()
    {
        return 0;
    }

    public static int noPartyUpdatesEncodingOffset()
    {
        return 147;
    }

    public static int noPartyUpdatesEncodingLength()
    {
        return 0;
    }

    public static String noPartyUpdatesMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "constant";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "int";
        }

        return "";
    }

    public static short noPartyUpdatesNullValue()
    {
        return (short)255;
    }

    public static short noPartyUpdatesMinValue()
    {
        return (short)0;
    }

    public static short noPartyUpdatesMaxValue()
    {
        return (short)254;
    }

    public short noPartyUpdates()
    {
        return (short)1;
    }

    private final NoPartyDetailsEncoder noPartyDetails = new NoPartyDetailsEncoder(this);

    public static long noPartyDetailsId()
    {
        return 1671;
    }

    /**
     * Number of party details. More than one occurrence of the same party role is not allowed and will be rejected
     *
     * @param count of times the group will be encoded.
     * @return NoPartyDetailsEncoder : encoder for the group.
     */
    public NoPartyDetailsEncoder noPartyDetailsCount(final int count)
    {
        noPartyDetails.wrap(buffer, count);
        return noPartyDetails;
    }

    /**
     * Number of party details. More than one occurrence of the same party role is not allowed and will be rejected
     */

    public static final class NoPartyDetailsEncoder
    {
        public static final int HEADER_SIZE = 3;
        private final PartyDetailsDefinitionRequest518Encoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int initialLimit;

        NoPartyDetailsEncoder(final PartyDetailsDefinitionRequest518Encoder parentMessage)
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
            buffer.putShort(limit + 0, (short)22, BYTE_ORDER);
            buffer.putByte(limit + 2, (byte)count);
        }

        public NoPartyDetailsEncoder next()
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
            return 22;
        }

        public static int partyDetailIDId()
        {
            return 1691;
        }

        public static int partyDetailIDSinceVersion()
        {
            return 0;
        }

        public static int partyDetailIDEncodingOffset()
        {
            return 0;
        }

        public static int partyDetailIDEncodingLength()
        {
            return 20;
        }

        public static String partyDetailIDMetaAttribute(final MetaAttribute metaAttribute)
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

        public static byte partyDetailIDNullValue()
        {
            return (byte)0;
        }

        public static byte partyDetailIDMinValue()
        {
            return (byte)32;
        }

        public static byte partyDetailIDMaxValue()
        {
            return (byte)126;
        }

        public static int partyDetailIDLength()
        {
            return 20;
        }


        public NoPartyDetailsEncoder partyDetailID(final int index, final byte value)
        {
            if (index < 0 || index >= 20)
            {
                throw new IndexOutOfBoundsException("index out of range: index=" + index);
            }

            final int pos = offset + 0 + (index * 1);
            buffer.putByte(pos, value);

            return this;
        }

        public static String partyDetailIDCharacterEncoding()
        {
            return java.nio.charset.StandardCharsets.US_ASCII.name();
        }

        public NoPartyDetailsEncoder putPartyDetailID(final byte[] src, final int srcOffset)
        {
            final int length = 20;
            if (srcOffset < 0 || srcOffset > (src.length - length))
            {
                throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
            }

            buffer.putBytes(offset + 0, src, srcOffset, length);

            return this;
        }

        public NoPartyDetailsEncoder partyDetailID(final String src)
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

        public NoPartyDetailsEncoder partyDetailID(final CharSequence src)
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

        public static int partyDetailIDSourceId()
        {
            return 1692;
        }

        public static int partyDetailIDSourceSinceVersion()
        {
            return 0;
        }

        public static int partyDetailIDSourceEncodingOffset()
        {
            return 20;
        }

        public static int partyDetailIDSourceEncodingLength()
        {
            return 0;
        }

        public static String partyDetailIDSourceMetaAttribute(final MetaAttribute metaAttribute)
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

        public static byte partyDetailIDSourceNullValue()
        {
            return (byte)0;
        }

        public static byte partyDetailIDSourceMinValue()
        {
            return (byte)32;
        }

        public static byte partyDetailIDSourceMaxValue()
        {
            return (byte)126;
        }


        private static final byte[] PARTYDETAILIDSOURCE_VALUE = { 67 };

        public static int partyDetailIDSourceLength()
        {
            return 1;
        }


        public byte partyDetailIDSource(final int index)
        {
            return PARTYDETAILIDSOURCE_VALUE[index];
        }

        public int getPartyDetailIDSource(final byte[] dst, final int offset, final int length)
        {
            final int bytesCopied = Math.min(length, 1);
            System.arraycopy(PARTYDETAILIDSOURCE_VALUE, 0, dst, offset, bytesCopied);

            return bytesCopied;
        }

        public byte partyDetailIDSource()
        {
            return (byte)67;
        }


        public static int partyDetailRoleId()
        {
            return 1693;
        }

        public static int partyDetailRoleSinceVersion()
        {
            return 0;
        }

        public static int partyDetailRoleEncodingOffset()
        {
            return 20;
        }

        public static int partyDetailRoleEncodingLength()
        {
            return 2;
        }

        public static String partyDetailRoleMetaAttribute(final MetaAttribute metaAttribute)
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

        public NoPartyDetailsEncoder partyDetailRole(final PartyDetailRole value)
        {
            buffer.putShort(offset + 20, (short)value.value(), BYTE_ORDER);
            return this;
        }
    }

    private final NoTrdRegPublicationsEncoder noTrdRegPublications = new NoTrdRegPublicationsEncoder(this);

    public static long noTrdRegPublicationsId()
    {
        return 2668;
    }

    /**
     * Number of regulatory publication rules in repeating group. Should always be "1" if being used otherwise set to 0
     *
     * @param count of times the group will be encoded.
     * @return NoTrdRegPublicationsEncoder : encoder for the group.
     */
    public NoTrdRegPublicationsEncoder noTrdRegPublicationsCount(final int count)
    {
        noTrdRegPublications.wrap(buffer, count);
        return noTrdRegPublications;
    }

    /**
     * Number of regulatory publication rules in repeating group. Should always be "1" if being used otherwise set to 0
     */

    public static final class NoTrdRegPublicationsEncoder
    {
        public static final int HEADER_SIZE = 3;
        private final PartyDetailsDefinitionRequest518Encoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int initialLimit;

        NoTrdRegPublicationsEncoder(final PartyDetailsDefinitionRequest518Encoder parentMessage)
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
            buffer.putShort(limit + 0, (short)2, BYTE_ORDER);
            buffer.putByte(limit + 2, (byte)count);
        }

        public NoTrdRegPublicationsEncoder next()
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
            return 2;
        }

        public static int trdRegPublicationTypeId()
        {
            return 2669;
        }

        public static int trdRegPublicationTypeSinceVersion()
        {
            return 0;
        }

        public static int trdRegPublicationTypeEncodingOffset()
        {
            return 0;
        }

        public static int trdRegPublicationTypeEncodingLength()
        {
            return 1;
        }

        public static String trdRegPublicationTypeMetaAttribute(final MetaAttribute metaAttribute)
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

        public static short trdRegPublicationTypeNullValue()
        {
            return (short)255;
        }

        public static short trdRegPublicationTypeMinValue()
        {
            return (short)0;
        }

        public static short trdRegPublicationTypeMaxValue()
        {
            return (short)254;
        }

        public NoTrdRegPublicationsEncoder trdRegPublicationType(final short value)
        {
            buffer.putByte(offset + 0, (byte)value);
            return this;
        }


        public static int trdRegPublicationReasonId()
        {
            return 2670;
        }

        public static int trdRegPublicationReasonSinceVersion()
        {
            return 0;
        }

        public static int trdRegPublicationReasonEncodingOffset()
        {
            return 1;
        }

        public static int trdRegPublicationReasonEncodingLength()
        {
            return 1;
        }

        public static String trdRegPublicationReasonMetaAttribute(final MetaAttribute metaAttribute)
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

        public static short trdRegPublicationReasonNullValue()
        {
            return (short)255;
        }

        public static short trdRegPublicationReasonMinValue()
        {
            return (short)0;
        }

        public static short trdRegPublicationReasonMaxValue()
        {
            return (short)254;
        }

        public NoTrdRegPublicationsEncoder trdRegPublicationReason(final short value)
        {
            buffer.putByte(offset + 1, (byte)value);
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

        final PartyDetailsDefinitionRequest518Decoder decoder = new PartyDetailsDefinitionRequest518Decoder();
        decoder.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return decoder.appendTo(builder);
    }
}
