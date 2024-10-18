/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.DirectBuffer;
import org.agrona.sbe.*;


/**
 * PartyDetailsDefinitionRequestAck
 */
@SuppressWarnings("all")
public final class PartyDetailsDefinitionRequestAck519Decoder implements MessageDecoderFlyweight
{
    public static final int BLOCK_LENGTH = 159;
    public static final int TEMPLATE_ID = 519;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final PartyDetailsDefinitionRequestAck519Decoder parentMessage = this;
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
        return "CY";
    }

    public DirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public PartyDetailsDefinitionRequestAck519Decoder wrap(
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

    public PartyDetailsDefinitionRequestAck519Decoder wrapAndApplyHeader(
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

    public PartyDetailsDefinitionRequestAck519Decoder sbeRewind()
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
        return 12;
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


    public byte memo(final int index)
    {
        if (index < 0 || index >= 75)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 12 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String memoCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getMemo(final byte[] dst, final int dstOffset)
    {
        final int length = 75;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 12, dst, dstOffset, length);

        return length;
    }

    public String memo()
    {
        final byte[] dst = new byte[75];
        buffer.getBytes(offset + 12, dst, 0, 75);

        int end = 0;
        for (; end < 75 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getMemo(final Appendable value)
    {
        for (int i = 0; i < 75; ++i)
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

        return 75;
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
        return 87;
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


    public byte avgPxGroupID(final int index)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 87 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String avgPxGroupIDCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getAvgPxGroupID(final byte[] dst, final int dstOffset)
    {
        final int length = 20;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 87, dst, dstOffset, length);

        return length;
    }

    public String avgPxGroupID()
    {
        final byte[] dst = new byte[20];
        buffer.getBytes(offset + 87, dst, 0, 20);

        int end = 0;
        for (; end < 20 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getAvgPxGroupID(final Appendable value)
    {
        for (int i = 0; i < 20; ++i)
        {
            final int c = buffer.getByte(offset + 87 + i) & 0xFF;
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
        return 107;
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
        return buffer.getLong(offset + 107, BYTE_ORDER);
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
        return 115;
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
        return buffer.getLong(offset + 115, BYTE_ORDER);
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
        return 123;
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

    public long selfMatchPreventionID()
    {
        return buffer.getLong(offset + 123, BYTE_ORDER);
    }


    public static int partyDetailRequestStatusId()
    {
        return 1878;
    }

    public static int partyDetailRequestStatusSinceVersion()
    {
        return 0;
    }

    public static int partyDetailRequestStatusEncodingOffset()
    {
        return 131;
    }

    public static int partyDetailRequestStatusEncodingLength()
    {
        return 1;
    }

    public static String partyDetailRequestStatusMetaAttribute(final MetaAttribute metaAttribute)
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

    public static short partyDetailRequestStatusNullValue()
    {
        return (short)255;
    }

    public static short partyDetailRequestStatusMinValue()
    {
        return (short)0;
    }

    public static short partyDetailRequestStatusMaxValue()
    {
        return (short)254;
    }

    public short partyDetailRequestStatus()
    {
        return ((short)(buffer.getByte(offset + 131) & 0xFF));
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
        return 132;
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

    public short custOrderCapacityRaw()
    {
        return ((short)(buffer.getByte(offset + 132) & 0xFF));
    }

    public CustOrderCapacity custOrderCapacity()
    {
        return CustOrderCapacity.get(((short)(buffer.getByte(offset + 132) & 0xFF)));
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
        return 133;
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

    public short clearingAccountTypeRaw()
    {
        return ((short)(buffer.getByte(offset + 133) & 0xFF));
    }

    public ClearingAcctType clearingAccountType()
    {
        return ClearingAcctType.get(((short)(buffer.getByte(offset + 133) & 0xFF)));
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
        return 134;
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

    public byte selfMatchPreventionInstructionRaw()
    {
        return buffer.getByte(offset + 134);
    }

    public SMPI selfMatchPreventionInstruction()
    {
        return SMPI.get(buffer.getByte(offset + 134));
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
        return 135;
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

    public short avgPxIndicatorRaw()
    {
        return ((short)(buffer.getByte(offset + 135) & 0xFF));
    }

    public AvgPxInd avgPxIndicator()
    {
        return AvgPxInd.get(((short)(buffer.getByte(offset + 135) & 0xFF)));
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
        return 136;
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

    public short clearingTradePriceTypeRaw()
    {
        return ((short)(buffer.getByte(offset + 136) & 0xFF));
    }

    public SLEDS clearingTradePriceType()
    {
        return SLEDS.get(((short)(buffer.getByte(offset + 136) & 0xFF)));
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
        return 137;
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

    public byte cmtaGiveupCDRaw()
    {
        return buffer.getByte(offset + 137);
    }

    public CmtaGiveUpCD cmtaGiveupCD()
    {
        return CmtaGiveUpCD.get(buffer.getByte(offset + 137));
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
        return 138;
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

    public byte custOrderHandlingInstRaw()
    {
        return buffer.getByte(offset + 138);
    }

    public CustOrdHandlInst custOrderHandlingInst()
    {
        return CustOrdHandlInst.get(buffer.getByte(offset + 138));
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
        return 139;
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
        return 139;
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

    public byte listUpdateActionRaw()
    {
        return buffer.getByte(offset + 139);
    }

    public ListUpdAct listUpdateAction()
    {
        return ListUpdAct.get(buffer.getByte(offset + 139));
    }


    public static int partyDetailDefinitionStatusId()
    {
        return 1879;
    }

    public static int partyDetailDefinitionStatusSinceVersion()
    {
        return 0;
    }

    public static int partyDetailDefinitionStatusEncodingOffset()
    {
        return 140;
    }

    public static int partyDetailDefinitionStatusEncodingLength()
    {
        return 1;
    }

    public static String partyDetailDefinitionStatusMetaAttribute(final MetaAttribute metaAttribute)
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

    public static short partyDetailDefinitionStatusNullValue()
    {
        return (short)255;
    }

    public static short partyDetailDefinitionStatusMinValue()
    {
        return (short)0;
    }

    public static short partyDetailDefinitionStatusMaxValue()
    {
        return (short)254;
    }

    public short partyDetailDefinitionStatus()
    {
        return ((short)(buffer.getByte(offset + 140) & 0xFF));
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
        return 141;
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

    public long executor()
    {
        return buffer.getLong(offset + 141, BYTE_ORDER);
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
        return 149;
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

    public long iDMShortCode()
    {
        return buffer.getLong(offset + 149, BYTE_ORDER);
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
        return 157;
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
        return ((short)(buffer.getByte(offset + 157) & 0xFF));
    }

    public BooleanFlag possRetransFlag()
    {
        return BooleanFlag.get(((short)(buffer.getByte(offset + 157) & 0xFF)));
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
        return 158;
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
        return ((short)(buffer.getByte(offset + 158) & 0xFF));
    }

    public SplitMsg splitMsg()
    {
        return SplitMsg.get(((short)(buffer.getByte(offset + 158) & 0xFF)));
    }


    private final NoPartyDetailsDecoder noPartyDetails = new NoPartyDetailsDecoder(this);

    public static long noPartyDetailsDecoderId()
    {
        return 1671;
    }

    public static int noPartyDetailsDecoderSinceVersion()
    {
        return 0;
    }

    /**
     * Number of party details. More than one occurrence of the same party role is not allowed and will be rejected
     *
     * @return NoPartyDetailsDecoder : Number of party details. More than one occurrence of the same party role is not allowed and will be rejected
     */
    public NoPartyDetailsDecoder noPartyDetails()
    {
        noPartyDetails.wrap(buffer);
        return noPartyDetails;
    }

    /**
     * Number of party details. More than one occurrence of the same party role is not allowed and will be rejected
     */

    public static final class NoPartyDetailsDecoder
        implements Iterable<NoPartyDetailsDecoder>, java.util.Iterator<NoPartyDetailsDecoder>
    {
        public static final int HEADER_SIZE = 3;
        private final PartyDetailsDefinitionRequestAck519Decoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        NoPartyDetailsDecoder(final PartyDetailsDefinitionRequestAck519Decoder parentMessage)
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

        public NoPartyDetailsDecoder next()
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
            return 22;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<NoPartyDetailsDecoder> iterator()
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


        public byte partyDetailID(final int index)
        {
            if (index < 0 || index >= 20)
            {
                throw new IndexOutOfBoundsException("index out of range: index=" + index);
            }

            final int pos = offset + 0 + (index * 1);

            return buffer.getByte(pos);
        }


        public static String partyDetailIDCharacterEncoding()
        {
            return java.nio.charset.StandardCharsets.US_ASCII.name();
        }

        public int getPartyDetailID(final byte[] dst, final int dstOffset)
        {
            final int length = 20;
            if (dstOffset < 0 || dstOffset > (dst.length - length))
            {
                throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
            }

            buffer.getBytes(offset + 0, dst, dstOffset, length);

            return length;
        }

        public String partyDetailID()
        {
            final byte[] dst = new byte[20];
            buffer.getBytes(offset + 0, dst, 0, 20);

            int end = 0;
            for (; end < 20 && dst[end] != 0; ++end);

            return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
        }


        public int getPartyDetailID(final Appendable value)
        {
            for (int i = 0; i < 20; ++i)
            {
                final int c = buffer.getByte(offset + 0 + i) & 0xFF;
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

        public int partyDetailRoleRaw()
        {
            return (buffer.getShort(offset + 20, BYTE_ORDER) & 0xFFFF);
        }

        public PartyDetailRole partyDetailRole()
        {
            return PartyDetailRole.get((buffer.getShort(offset + 20, BYTE_ORDER) & 0xFFFF));
        }


        public StringBuilder appendTo(final StringBuilder builder)
        {
            if (null == buffer)
            {
                return builder;
            }

            builder.append('(');
            builder.append("partyDetailID=");
            for (int i = 0; i < partyDetailIDLength() && this.partyDetailID(i) > 0; i++)
            {
                builder.append((char)this.partyDetailID(i));
            }
            builder.append('|');
            builder.append("partyDetailRole=");
            builder.append(this.partyDetailRole());
            builder.append(')');

            return builder;
        }
        
        public NoPartyDetailsDecoder sbeSkip()
        {

            return this;
        }
    }

    private final NoTrdRegPublicationsDecoder noTrdRegPublications = new NoTrdRegPublicationsDecoder(this);

    public static long noTrdRegPublicationsDecoderId()
    {
        return 2668;
    }

    public static int noTrdRegPublicationsDecoderSinceVersion()
    {
        return 2;
    }

    /**
     * Number of regulatory publication rules in repeating group. Should always be "1" if being used otherwise set to 0
     *
     * @return NoTrdRegPublicationsDecoder : Number of regulatory publication rules in repeating group. Should always be "1" if being used otherwise set to 0
     */
    public NoTrdRegPublicationsDecoder noTrdRegPublications()
    {
        if (parentMessage.actingVersion < 2)
        {
            noTrdRegPublications.count = 0;
            noTrdRegPublications.index = 0;
            return noTrdRegPublications;
        }

        noTrdRegPublications.wrap(buffer);
        return noTrdRegPublications;
    }

    /**
     * Number of regulatory publication rules in repeating group. Should always be "1" if being used otherwise set to 0
     */

    public static final class NoTrdRegPublicationsDecoder
        implements Iterable<NoTrdRegPublicationsDecoder>, java.util.Iterator<NoTrdRegPublicationsDecoder>
    {
        public static final int HEADER_SIZE = 3;
        private final PartyDetailsDefinitionRequestAck519Decoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        NoTrdRegPublicationsDecoder(final PartyDetailsDefinitionRequestAck519Decoder parentMessage)
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

        public NoTrdRegPublicationsDecoder next()
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
            return 2;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<NoTrdRegPublicationsDecoder> iterator()
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

        public short trdRegPublicationType()
        {
            return ((short)(buffer.getByte(offset + 0) & 0xFF));
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

        public short trdRegPublicationReason()
        {
            return ((short)(buffer.getByte(offset + 1) & 0xFF));
        }


        public StringBuilder appendTo(final StringBuilder builder)
        {
            if (null == buffer)
            {
                return builder;
            }

            builder.append('(');
            builder.append("trdRegPublicationType=");
            builder.append(this.trdRegPublicationType());
            builder.append('|');
            builder.append("trdRegPublicationReason=");
            builder.append(this.trdRegPublicationReason());
            builder.append(')');

            return builder;
        }
        
        public NoTrdRegPublicationsDecoder sbeSkip()
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

        final PartyDetailsDefinitionRequestAck519Decoder decoder = new PartyDetailsDefinitionRequestAck519Decoder();
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
        builder.append("[PartyDetailsDefinitionRequestAck519](sbeTemplateId=");
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
        builder.append("memo=");
        for (int i = 0; i < memoLength() && this.memo(i) > 0; i++)
        {
            builder.append((char)this.memo(i));
        }
        builder.append('|');
        builder.append("avgPxGroupID=");
        for (int i = 0; i < avgPxGroupIDLength() && this.avgPxGroupID(i) > 0; i++)
        {
            builder.append((char)this.avgPxGroupID(i));
        }
        builder.append('|');
        builder.append("partyDetailsListReqID=");
        builder.append(this.partyDetailsListReqID());
        builder.append('|');
        builder.append("sendingTimeEpoch=");
        builder.append(this.sendingTimeEpoch());
        builder.append('|');
        builder.append("selfMatchPreventionID=");
        builder.append(this.selfMatchPreventionID());
        builder.append('|');
        builder.append("partyDetailRequestStatus=");
        builder.append(this.partyDetailRequestStatus());
        builder.append('|');
        builder.append("custOrderCapacity=");
        builder.append(this.custOrderCapacity());
        builder.append('|');
        builder.append("clearingAccountType=");
        builder.append(this.clearingAccountType());
        builder.append('|');
        builder.append("selfMatchPreventionInstruction=");
        builder.append(this.selfMatchPreventionInstruction());
        builder.append('|');
        builder.append("avgPxIndicator=");
        builder.append(this.avgPxIndicator());
        builder.append('|');
        builder.append("clearingTradePriceType=");
        builder.append(this.clearingTradePriceType());
        builder.append('|');
        builder.append("cmtaGiveupCD=");
        builder.append(this.cmtaGiveupCD());
        builder.append('|');
        builder.append("custOrderHandlingInst=");
        builder.append(this.custOrderHandlingInst());
        builder.append('|');
        builder.append("listUpdateAction=");
        builder.append(this.listUpdateAction());
        builder.append('|');
        builder.append("partyDetailDefinitionStatus=");
        builder.append(this.partyDetailDefinitionStatus());
        builder.append('|');
        builder.append("executor=");
        builder.append(this.executor());
        builder.append('|');
        builder.append("iDMShortCode=");
        builder.append(this.iDMShortCode());
        builder.append('|');
        builder.append("possRetransFlag=");
        builder.append(this.possRetransFlag());
        builder.append('|');
        builder.append("splitMsg=");
        builder.append(this.splitMsg());
        builder.append('|');
        builder.append("noPartyDetails=[");
        final int noPartyDetailsOriginalOffset = noPartyDetails.offset;
        final int noPartyDetailsOriginalIndex = noPartyDetails.index;
        final NoPartyDetailsDecoder noPartyDetails = this.noPartyDetails();
        if (noPartyDetails.count() > 0)
        {
            while (noPartyDetails.hasNext())
            {
                noPartyDetails.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        noPartyDetails.offset = noPartyDetailsOriginalOffset;
        noPartyDetails.index = noPartyDetailsOriginalIndex;
        builder.append(']');
        builder.append('|');
        builder.append("noTrdRegPublications=[");
        final int noTrdRegPublicationsOriginalOffset = noTrdRegPublications.offset;
        final int noTrdRegPublicationsOriginalIndex = noTrdRegPublications.index;
        final NoTrdRegPublicationsDecoder noTrdRegPublications = this.noTrdRegPublications();
        if (noTrdRegPublications.count() > 0)
        {
            while (noTrdRegPublications.hasNext())
            {
                noTrdRegPublications.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        noTrdRegPublications.offset = noTrdRegPublicationsOriginalOffset;
        noTrdRegPublications.index = noTrdRegPublicationsOriginalIndex;
        builder.append(']');

        limit(originalLimit);

        return builder;
    }
    
    public PartyDetailsDefinitionRequestAck519Decoder sbeSkip()
    {
        sbeRewind();
        NoPartyDetailsDecoder noPartyDetails = this.noPartyDetails();
        if (noPartyDetails.count() > 0)
        {
            while (noPartyDetails.hasNext())
            {
                noPartyDetails.next();
                noPartyDetails.sbeSkip();
            }
        }
        NoTrdRegPublicationsDecoder noTrdRegPublications = this.noTrdRegPublications();
        if (noTrdRegPublications.count() > 0)
        {
            while (noTrdRegPublications.hasNext())
            {
                noTrdRegPublications.next();
                noTrdRegPublications.sbeSkip();
            }
        }

        return this;
    }
}
