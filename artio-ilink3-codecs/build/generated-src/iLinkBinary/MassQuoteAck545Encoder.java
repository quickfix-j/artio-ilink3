/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.MutableDirectBuffer;
import org.agrona.sbe.*;


/**
 * MassQuoteAck
 */
@SuppressWarnings("all")
public final class MassQuoteAck545Encoder implements MessageEncoderFlyweight
{
    public static final int BLOCK_LENGTH = 351;
    public static final int TEMPLATE_ID = 545;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final MassQuoteAck545Encoder parentMessage = this;
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
        return "b";
    }

    public MutableDirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public MassQuoteAck545Encoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public MassQuoteAck545Encoder wrapAndApplyHeader(
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

    public MassQuoteAck545Encoder seqNum(final long value)
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

    public MassQuoteAck545Encoder uUID(final long value)
    {
        buffer.putLong(offset + 4, value, BYTE_ORDER);
        return this;
    }


    public static int textId()
    {
        return 58;
    }

    public static int textSinceVersion()
    {
        return 0;
    }

    public static int textEncodingOffset()
    {
        return 12;
    }

    public static int textEncodingLength()
    {
        return 256;
    }

    public static String textMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte textNullValue()
    {
        return (byte)0;
    }

    public static byte textMinValue()
    {
        return (byte)32;
    }

    public static byte textMaxValue()
    {
        return (byte)126;
    }

    public static int textLength()
    {
        return 256;
    }


    public MassQuoteAck545Encoder text(final int index, final byte value)
    {
        if (index < 0 || index >= 256)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 12 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String textCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public MassQuoteAck545Encoder putText(final byte[] src, final int srcOffset)
    {
        final int length = 256;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 12, src, srcOffset, length);

        return this;
    }

    public MassQuoteAck545Encoder text(final String src)
    {
        final int length = 256;
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

    public MassQuoteAck545Encoder text(final CharSequence src)
    {
        final int length = 256;
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
        return 268;
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


    public MassQuoteAck545Encoder senderID(final int index, final byte value)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 268 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String senderIDCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public MassQuoteAck545Encoder putSenderID(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 268, src, srcOffset, length);

        return this;
    }

    public MassQuoteAck545Encoder senderID(final String src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 268, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 268 + start, (byte)0);
        }

        return this;
    }

    public MassQuoteAck545Encoder senderID(final CharSequence src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 268, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 268 + start, (byte)0);
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
        return 288;
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

    public MassQuoteAck545Encoder partyDetailsListReqID(final long value)
    {
        buffer.putLong(offset + 288, value, BYTE_ORDER);
        return this;
    }


    public static int requestTimeId()
    {
        return 5979;
    }

    public static int requestTimeSinceVersion()
    {
        return 0;
    }

    public static int requestTimeEncodingOffset()
    {
        return 296;
    }

    public static int requestTimeEncodingLength()
    {
        return 8;
    }

    public static String requestTimeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long requestTimeNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long requestTimeMinValue()
    {
        return 0x0L;
    }

    public static long requestTimeMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public MassQuoteAck545Encoder requestTime(final long value)
    {
        buffer.putLong(offset + 296, value, BYTE_ORDER);
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
        return 304;
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

    public MassQuoteAck545Encoder sendingTimeEpoch(final long value)
    {
        buffer.putLong(offset + 304, value, BYTE_ORDER);
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
        return 312;
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

    public MassQuoteAck545Encoder quoteReqID(final long value)
    {
        buffer.putLong(offset + 312, value, BYTE_ORDER);
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
        return 320;
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


    public MassQuoteAck545Encoder location(final int index, final byte value)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 320 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String locationCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public MassQuoteAck545Encoder putLocation(final byte[] src, final int srcOffset)
    {
        final int length = 5;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 320, src, srcOffset, length);

        return this;
    }

    public MassQuoteAck545Encoder location(final String src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 320, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 320 + start, (byte)0);
        }

        return this;
    }

    public MassQuoteAck545Encoder location(final CharSequence src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 320, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 320 + start, (byte)0);
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
        return 325;
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

    public MassQuoteAck545Encoder quoteID(final long value)
    {
        buffer.putInt(offset + 325, (int)value, BYTE_ORDER);
        return this;
    }


    public static int quoteRejectReasonId()
    {
        return 300;
    }

    public static int quoteRejectReasonSinceVersion()
    {
        return 0;
    }

    public static int quoteRejectReasonEncodingOffset()
    {
        return 329;
    }

    public static int quoteRejectReasonEncodingLength()
    {
        return 2;
    }

    public static String quoteRejectReasonMetaAttribute(final MetaAttribute metaAttribute)
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

    public static int quoteRejectReasonNullValue()
    {
        return 65535;
    }

    public static int quoteRejectReasonMinValue()
    {
        return 0;
    }

    public static int quoteRejectReasonMaxValue()
    {
        return 65534;
    }

    public MassQuoteAck545Encoder quoteRejectReason(final int value)
    {
        buffer.putShort(offset + 329, (short)value, BYTE_ORDER);
        return this;
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
        return 331;
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

    public MassQuoteAck545Encoder delayDuration(final int value)
    {
        buffer.putShort(offset + 331, (short)value, BYTE_ORDER);
        return this;
    }


    public static int quoteStatusId()
    {
        return 297;
    }

    public static int quoteStatusSinceVersion()
    {
        return 0;
    }

    public static int quoteStatusEncodingOffset()
    {
        return 333;
    }

    public static int quoteStatusEncodingLength()
    {
        return 1;
    }

    public static String quoteStatusMetaAttribute(final MetaAttribute metaAttribute)
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

    public MassQuoteAck545Encoder quoteStatus(final QuoteAckStatus value)
    {
        buffer.putByte(offset + 333, (byte)value.value());
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
        return 334;
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

    public MassQuoteAck545Encoder manualOrderIndicator(final ManualOrdIndReq value)
    {
        buffer.putByte(offset + 334, (byte)value.value());
        return this;
    }

    public static int noProcessedEntriesId()
    {
        return 9772;
    }

    public static int noProcessedEntriesSinceVersion()
    {
        return 0;
    }

    public static int noProcessedEntriesEncodingOffset()
    {
        return 335;
    }

    public static int noProcessedEntriesEncodingLength()
    {
        return 1;
    }

    public static String noProcessedEntriesMetaAttribute(final MetaAttribute metaAttribute)
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

    public static short noProcessedEntriesNullValue()
    {
        return (short)255;
    }

    public static short noProcessedEntriesMinValue()
    {
        return (short)0;
    }

    public static short noProcessedEntriesMaxValue()
    {
        return (short)254;
    }

    public MassQuoteAck545Encoder noProcessedEntries(final short value)
    {
        buffer.putByte(offset + 335, (byte)value);
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
        return 336;
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

    public MassQuoteAck545Encoder mMProtectionReset(final BooleanFlag value)
    {
        buffer.putByte(offset + 336, (byte)value.value());
        return this;
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
        return 337;
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

    public MassQuoteAck545Encoder splitMsg(final SplitMsg value)
    {
        buffer.putByte(offset + 337, (byte)value.value());
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
        return 338;
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

    public MassQuoteAck545Encoder liquidityFlag(final BooleanNULL value)
    {
        buffer.putByte(offset + 338, (byte)value.value());
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
        return 339;
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

    public MassQuoteAck545Encoder shortSaleType(final ShortSaleType value)
    {
        buffer.putByte(offset + 339, (byte)value.value());
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
        return 340;
    }

    public static int totNoQuoteEntriesEncodingLength()
    {
        return 1;
    }

    public static String totNoQuoteEntriesMetaAttribute(final MetaAttribute metaAttribute)
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

    public MassQuoteAck545Encoder totNoQuoteEntries(final short value)
    {
        buffer.putByte(offset + 340, (byte)value);
        return this;
    }


    public static int possRetransFlagId()
    {
        return 9765;
    }

    public static int possRetransFlagSinceVersion()
    {
        return 2;
    }

    public static int possRetransFlagEncodingOffset()
    {
        return 341;
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

    public MassQuoteAck545Encoder possRetransFlag(final BooleanFlag value)
    {
        buffer.putByte(offset + 341, (byte)value.value());
        return this;
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
        return 342;
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

    public MassQuoteAck545Encoder delayToTime(final long value)
    {
        buffer.putLong(offset + 342, value, BYTE_ORDER);
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
        return 350;
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

    public MassQuoteAck545Encoder quoteEntryOpen(final BooleanNULL value)
    {
        buffer.putByte(offset + 350, (byte)value.value());
        return this;
    }

    private final NoQuoteEntriesEncoder noQuoteEntries = new NoQuoteEntriesEncoder(this);

    public static long noQuoteEntriesId()
    {
        return 295;
    }

    /**
     * The number of quoute entries for a quote set.
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
     * The number of quoute entries for a quote set.
     */

    public static final class NoQuoteEntriesEncoder
    {
        public static final int HEADER_SIZE = 3;
        private final MassQuoteAck545Encoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int initialLimit;

        NoQuoteEntriesEncoder(final MassQuoteAck545Encoder parentMessage)
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
            buffer.putShort(limit + 0, (short)11, BYTE_ORDER);
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
            return 11;
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
            return 0;
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
            buffer.putInt(offset + 0, (int)value, BYTE_ORDER);
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
            return 4;
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
            buffer.putInt(offset + 4, value, BYTE_ORDER);
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
            return 8;
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
            buffer.putShort(offset + 8, (short)value, BYTE_ORDER);
            return this;
        }


        public static int quoteEntryRejectReasonId()
        {
            return 368;
        }

        public static int quoteEntryRejectReasonSinceVersion()
        {
            return 0;
        }

        public static int quoteEntryRejectReasonEncodingOffset()
        {
            return 10;
        }

        public static int quoteEntryRejectReasonEncodingLength()
        {
            return 1;
        }

        public static String quoteEntryRejectReasonMetaAttribute(final MetaAttribute metaAttribute)
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

        public static short quoteEntryRejectReasonNullValue()
        {
            return (short)255;
        }

        public static short quoteEntryRejectReasonMinValue()
        {
            return (short)0;
        }

        public static short quoteEntryRejectReasonMaxValue()
        {
            return (short)254;
        }

        public NoQuoteEntriesEncoder quoteEntryRejectReason(final short value)
        {
            buffer.putByte(offset + 10, (byte)value);
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

        final MassQuoteAck545Decoder decoder = new MassQuoteAck545Decoder();
        decoder.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return decoder.appendTo(builder);
    }
}
