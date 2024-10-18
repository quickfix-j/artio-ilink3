/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.DirectBuffer;
import org.agrona.sbe.*;


/**
 * MassQuoteAck
 */
@SuppressWarnings("all")
public final class MassQuoteAck545Decoder implements MessageDecoderFlyweight
{
    public static final int BLOCK_LENGTH = 351;
    public static final int TEMPLATE_ID = 545;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final MassQuoteAck545Decoder parentMessage = this;
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
        return "b";
    }

    public DirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public MassQuoteAck545Decoder wrap(
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

    public MassQuoteAck545Decoder wrapAndApplyHeader(
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

    public MassQuoteAck545Decoder sbeRewind()
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


    public byte text(final int index)
    {
        if (index < 0 || index >= 256)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 12 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String textCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getText(final byte[] dst, final int dstOffset)
    {
        final int length = 256;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 12, dst, dstOffset, length);

        return length;
    }

    public String text()
    {
        final byte[] dst = new byte[256];
        buffer.getBytes(offset + 12, dst, 0, 256);

        int end = 0;
        for (; end < 256 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getText(final Appendable value)
    {
        for (int i = 0; i < 256; ++i)
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

        return 256;
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


    public byte senderID(final int index)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 268 + (index * 1);

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

        buffer.getBytes(offset + 268, dst, dstOffset, length);

        return length;
    }

    public String senderID()
    {
        final byte[] dst = new byte[20];
        buffer.getBytes(offset + 268, dst, 0, 20);

        int end = 0;
        for (; end < 20 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getSenderID(final Appendable value)
    {
        for (int i = 0; i < 20; ++i)
        {
            final int c = buffer.getByte(offset + 268 + i) & 0xFF;
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

    public long partyDetailsListReqID()
    {
        return buffer.getLong(offset + 288, BYTE_ORDER);
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

    public long requestTime()
    {
        return buffer.getLong(offset + 296, BYTE_ORDER);
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

    public long sendingTimeEpoch()
    {
        return buffer.getLong(offset + 304, BYTE_ORDER);
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

    public long quoteReqID()
    {
        return buffer.getLong(offset + 312, BYTE_ORDER);
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


    public byte location(final int index)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 320 + (index * 1);

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

        buffer.getBytes(offset + 320, dst, dstOffset, length);

        return length;
    }

    public String location()
    {
        final byte[] dst = new byte[5];
        buffer.getBytes(offset + 320, dst, 0, 5);

        int end = 0;
        for (; end < 5 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getLocation(final Appendable value)
    {
        for (int i = 0; i < 5; ++i)
        {
            final int c = buffer.getByte(offset + 320 + i) & 0xFF;
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

    public long quoteID()
    {
        return (buffer.getInt(offset + 325, BYTE_ORDER) & 0xFFFF_FFFFL);
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

    public int quoteRejectReason()
    {
        return (buffer.getShort(offset + 329, BYTE_ORDER) & 0xFFFF);
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

    public int delayDuration()
    {
        return (buffer.getShort(offset + 331, BYTE_ORDER) & 0xFFFF);
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

    public short quoteStatusRaw()
    {
        return ((short)(buffer.getByte(offset + 333) & 0xFF));
    }

    public QuoteAckStatus quoteStatus()
    {
        return QuoteAckStatus.get(((short)(buffer.getByte(offset + 333) & 0xFF)));
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

    public short manualOrderIndicatorRaw()
    {
        return ((short)(buffer.getByte(offset + 334) & 0xFF));
    }

    public ManualOrdIndReq manualOrderIndicator()
    {
        return ManualOrdIndReq.get(((short)(buffer.getByte(offset + 334) & 0xFF)));
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

    public short noProcessedEntries()
    {
        return ((short)(buffer.getByte(offset + 335) & 0xFF));
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

    public short mMProtectionResetRaw()
    {
        return ((short)(buffer.getByte(offset + 336) & 0xFF));
    }

    public BooleanFlag mMProtectionReset()
    {
        return BooleanFlag.get(((short)(buffer.getByte(offset + 336) & 0xFF)));
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

    public short splitMsgRaw()
    {
        return ((short)(buffer.getByte(offset + 337) & 0xFF));
    }

    public SplitMsg splitMsg()
    {
        return SplitMsg.get(((short)(buffer.getByte(offset + 337) & 0xFF)));
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

    public short liquidityFlagRaw()
    {
        return ((short)(buffer.getByte(offset + 338) & 0xFF));
    }

    public BooleanNULL liquidityFlag()
    {
        return BooleanNULL.get(((short)(buffer.getByte(offset + 338) & 0xFF)));
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

    public short shortSaleTypeRaw()
    {
        return ((short)(buffer.getByte(offset + 339) & 0xFF));
    }

    public ShortSaleType shortSaleType()
    {
        return ShortSaleType.get(((short)(buffer.getByte(offset + 339) & 0xFF)));
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

    public short totNoQuoteEntries()
    {
        return ((short)(buffer.getByte(offset + 340) & 0xFF));
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

    public short possRetransFlagRaw()
    {
        if (parentMessage.actingVersion < 2)
        {
            return (short)255;
        }

        return ((short)(buffer.getByte(offset + 341) & 0xFF));
    }

    public BooleanFlag possRetransFlag()
    {
        if (parentMessage.actingVersion < 2)
        {
            return BooleanFlag.NULL_VAL;
        }

        return BooleanFlag.get(((short)(buffer.getByte(offset + 341) & 0xFF)));
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

    public long delayToTime()
    {
        if (parentMessage.actingVersion < 4)
        {
            return 0xffffffffffffffffL;
        }

        return buffer.getLong(offset + 342, BYTE_ORDER);
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

    public short quoteEntryOpenRaw()
    {
        if (parentMessage.actingVersion < 8)
        {
            return (short)255;
        }

        return ((short)(buffer.getByte(offset + 350) & 0xFF));
    }

    public BooleanNULL quoteEntryOpen()
    {
        if (parentMessage.actingVersion < 8)
        {
            return BooleanNULL.NULL_VAL;
        }

        return BooleanNULL.get(((short)(buffer.getByte(offset + 350) & 0xFF)));
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
     * The number of quoute entries for a quote set.
     *
     * @return NoQuoteEntriesDecoder : The number of quoute entries for a quote set.
     */
    public NoQuoteEntriesDecoder noQuoteEntries()
    {
        noQuoteEntries.wrap(buffer);
        return noQuoteEntries;
    }

    /**
     * The number of quoute entries for a quote set.
     */

    public static final class NoQuoteEntriesDecoder
        implements Iterable<NoQuoteEntriesDecoder>, java.util.Iterator<NoQuoteEntriesDecoder>
    {
        public static final int HEADER_SIZE = 3;
        private final MassQuoteAck545Decoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        NoQuoteEntriesDecoder(final MassQuoteAck545Decoder parentMessage)
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
            return 11;
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

        public long quoteEntryID()
        {
            return (buffer.getInt(offset + 0, BYTE_ORDER) & 0xFFFF_FFFFL);
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

        public int securityID()
        {
            return buffer.getInt(offset + 4, BYTE_ORDER);
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

        public int quoteSetID()
        {
            return (buffer.getShort(offset + 8, BYTE_ORDER) & 0xFFFF);
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

        public short quoteEntryRejectReason()
        {
            return ((short)(buffer.getByte(offset + 10) & 0xFF));
        }


        public StringBuilder appendTo(final StringBuilder builder)
        {
            if (null == buffer)
            {
                return builder;
            }

            builder.append('(');
            builder.append("quoteEntryID=");
            builder.append(this.quoteEntryID());
            builder.append('|');
            builder.append("securityID=");
            builder.append(this.securityID());
            builder.append('|');
            builder.append("quoteSetID=");
            builder.append(this.quoteSetID());
            builder.append('|');
            builder.append("quoteEntryRejectReason=");
            builder.append(this.quoteEntryRejectReason());
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

        final MassQuoteAck545Decoder decoder = new MassQuoteAck545Decoder();
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
        builder.append("[MassQuoteAck545](sbeTemplateId=");
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
        builder.append("text=");
        for (int i = 0; i < textLength() && this.text(i) > 0; i++)
        {
            builder.append((char)this.text(i));
        }
        builder.append('|');
        builder.append("senderID=");
        for (int i = 0; i < senderIDLength() && this.senderID(i) > 0; i++)
        {
            builder.append((char)this.senderID(i));
        }
        builder.append('|');
        builder.append("partyDetailsListReqID=");
        builder.append(this.partyDetailsListReqID());
        builder.append('|');
        builder.append("requestTime=");
        builder.append(this.requestTime());
        builder.append('|');
        builder.append("sendingTimeEpoch=");
        builder.append(this.sendingTimeEpoch());
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
        builder.append("quoteRejectReason=");
        builder.append(this.quoteRejectReason());
        builder.append('|');
        builder.append("delayDuration=");
        builder.append(this.delayDuration());
        builder.append('|');
        builder.append("quoteStatus=");
        builder.append(this.quoteStatus());
        builder.append('|');
        builder.append("manualOrderIndicator=");
        builder.append(this.manualOrderIndicator());
        builder.append('|');
        builder.append("noProcessedEntries=");
        builder.append(this.noProcessedEntries());
        builder.append('|');
        builder.append("mMProtectionReset=");
        builder.append(this.mMProtectionReset());
        builder.append('|');
        builder.append("splitMsg=");
        builder.append(this.splitMsg());
        builder.append('|');
        builder.append("liquidityFlag=");
        builder.append(this.liquidityFlag());
        builder.append('|');
        builder.append("shortSaleType=");
        builder.append(this.shortSaleType());
        builder.append('|');
        builder.append("totNoQuoteEntries=");
        builder.append(this.totNoQuoteEntries());
        builder.append('|');
        builder.append("possRetransFlag=");
        builder.append(this.possRetransFlag());
        builder.append('|');
        builder.append("delayToTime=");
        builder.append(this.delayToTime());
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
    
    public MassQuoteAck545Decoder sbeSkip()
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
