/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.DirectBuffer;
import org.agrona.sbe.*;


/**
 * OrderMassActionReport
 */
@SuppressWarnings("all")
public final class OrderMassActionReport562Decoder implements MessageDecoderFlyweight
{
    public static final int BLOCK_LENGTH = 130;
    public static final int TEMPLATE_ID = 562;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final OrderMassActionReport562Decoder parentMessage = this;
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
        return "BZ";
    }

    public DirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public OrderMassActionReport562Decoder wrap(
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

    public OrderMassActionReport562Decoder wrapAndApplyHeader(
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

    public OrderMassActionReport562Decoder sbeRewind()
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
        return 12;
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

        final int pos = offset + 12 + (index * 1);

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

        buffer.getBytes(offset + 12, dst, dstOffset, length);

        return length;
    }

    public String senderID()
    {
        final byte[] dst = new byte[20];
        buffer.getBytes(offset + 12, dst, 0, 20);

        int end = 0;
        for (; end < 20 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getSenderID(final Appendable value)
    {
        for (int i = 0; i < 20; ++i)
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
        return 32;
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
        return buffer.getLong(offset + 32, BYTE_ORDER);
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
        return 40;
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
        return buffer.getLong(offset + 40, BYTE_ORDER);
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
        return 48;
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
        return buffer.getLong(offset + 48, BYTE_ORDER);
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
        return 56;
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
        return buffer.getLong(offset + 56, BYTE_ORDER);
    }


    public static int massActionReportIDId()
    {
        return 1369;
    }

    public static int massActionReportIDSinceVersion()
    {
        return 0;
    }

    public static int massActionReportIDEncodingOffset()
    {
        return 64;
    }

    public static int massActionReportIDEncodingLength()
    {
        return 8;
    }

    public static String massActionReportIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long massActionReportIDNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long massActionReportIDMinValue()
    {
        return 0x0L;
    }

    public static long massActionReportIDMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public long massActionReportID()
    {
        return buffer.getLong(offset + 64, BYTE_ORDER);
    }


    public static int massActionTypeId()
    {
        return 1373;
    }

    public static int massActionTypeSinceVersion()
    {
        return 0;
    }

    public static int massActionTypeEncodingOffset()
    {
        return 72;
    }

    public static int massActionTypeEncodingLength()
    {
        return 0;
    }

    public static String massActionTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte massActionTypeNullValue()
    {
        return (byte)0;
    }

    public static byte massActionTypeMinValue()
    {
        return (byte)32;
    }

    public static byte massActionTypeMaxValue()
    {
        return (byte)126;
    }


    private static final byte[] MASSACTIONTYPE_VALUE = { 51 };

    public static int massActionTypeLength()
    {
        return 1;
    }


    public byte massActionType(final int index)
    {
        return MASSACTIONTYPE_VALUE[index];
    }

    public int getMassActionType(final byte[] dst, final int offset, final int length)
    {
        final int bytesCopied = Math.min(length, 1);
        System.arraycopy(MASSACTIONTYPE_VALUE, 0, dst, offset, bytesCopied);

        return bytesCopied;
    }

    public byte massActionType()
    {
        return (byte)51;
    }


    public static int securityGroupId()
    {
        return 1151;
    }

    public static int securityGroupSinceVersion()
    {
        return 0;
    }

    public static int securityGroupEncodingOffset()
    {
        return 72;
    }

    public static int securityGroupEncodingLength()
    {
        return 6;
    }

    public static String securityGroupMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte securityGroupNullValue()
    {
        return (byte)0;
    }

    public static byte securityGroupMinValue()
    {
        return (byte)32;
    }

    public static byte securityGroupMaxValue()
    {
        return (byte)126;
    }

    public static int securityGroupLength()
    {
        return 6;
    }


    public byte securityGroup(final int index)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 72 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String securityGroupCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getSecurityGroup(final byte[] dst, final int dstOffset)
    {
        final int length = 6;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 72, dst, dstOffset, length);

        return length;
    }

    public String securityGroup()
    {
        final byte[] dst = new byte[6];
        buffer.getBytes(offset + 72, dst, 0, 6);

        int end = 0;
        for (; end < 6 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getSecurityGroup(final Appendable value)
    {
        for (int i = 0; i < 6; ++i)
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

        return 6;
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
        return 78;
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

        final int pos = offset + 78 + (index * 1);

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

        buffer.getBytes(offset + 78, dst, dstOffset, length);

        return length;
    }

    public String location()
    {
        final byte[] dst = new byte[5];
        buffer.getBytes(offset + 78, dst, 0, 5);

        int end = 0;
        for (; end < 5 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getLocation(final Appendable value)
    {
        for (int i = 0; i < 5; ++i)
        {
            final int c = buffer.getByte(offset + 78 + i) & 0xFF;
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
        return 83;
    }

    public static int securityIDEncodingLength()
    {
        return 4;
    }

    public static String securityIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static int securityIDNullValue()
    {
        return 2147483647;
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
        return buffer.getInt(offset + 83, BYTE_ORDER);
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
        return 87;
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
        return (buffer.getShort(offset + 87, BYTE_ORDER) & 0xFFFF);
    }


    public static int massActionResponseId()
    {
        return 1375;
    }

    public static int massActionResponseSinceVersion()
    {
        return 0;
    }

    public static int massActionResponseEncodingOffset()
    {
        return 89;
    }

    public static int massActionResponseEncodingLength()
    {
        return 1;
    }

    public static String massActionResponseMetaAttribute(final MetaAttribute metaAttribute)
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

    public short massActionResponseRaw()
    {
        return ((short)(buffer.getByte(offset + 89) & 0xFF));
    }

    public MassActionResponse massActionResponse()
    {
        return MassActionResponse.get(((short)(buffer.getByte(offset + 89) & 0xFF)));
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
        return 90;
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
        return ((short)(buffer.getByte(offset + 90) & 0xFF));
    }

    public ManualOrdIndReq manualOrderIndicator()
    {
        return ManualOrdIndReq.get(((short)(buffer.getByte(offset + 90) & 0xFF)));
    }


    public static int massActionScopeId()
    {
        return 1374;
    }

    public static int massActionScopeSinceVersion()
    {
        return 0;
    }

    public static int massActionScopeEncodingOffset()
    {
        return 91;
    }

    public static int massActionScopeEncodingLength()
    {
        return 1;
    }

    public static String massActionScopeMetaAttribute(final MetaAttribute metaAttribute)
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

    public short massActionScopeRaw()
    {
        return ((short)(buffer.getByte(offset + 91) & 0xFF));
    }

    public MassActionScope massActionScope()
    {
        return MassActionScope.get(((short)(buffer.getByte(offset + 91) & 0xFF)));
    }


    public static int totalAffectedOrdersId()
    {
        return 533;
    }

    public static int totalAffectedOrdersSinceVersion()
    {
        return 0;
    }

    public static int totalAffectedOrdersEncodingOffset()
    {
        return 92;
    }

    public static int totalAffectedOrdersEncodingLength()
    {
        return 4;
    }

    public static String totalAffectedOrdersMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long totalAffectedOrdersNullValue()
    {
        return 4294967295L;
    }

    public static long totalAffectedOrdersMinValue()
    {
        return 0L;
    }

    public static long totalAffectedOrdersMaxValue()
    {
        return 4294967294L;
    }

    public long totalAffectedOrders()
    {
        return (buffer.getInt(offset + 92, BYTE_ORDER) & 0xFFFF_FFFFL);
    }


    public static int lastFragmentId()
    {
        return 893;
    }

    public static int lastFragmentSinceVersion()
    {
        return 0;
    }

    public static int lastFragmentEncodingOffset()
    {
        return 96;
    }

    public static int lastFragmentEncodingLength()
    {
        return 1;
    }

    public static String lastFragmentMetaAttribute(final MetaAttribute metaAttribute)
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

    public short lastFragmentRaw()
    {
        return ((short)(buffer.getByte(offset + 96) & 0xFF));
    }

    public BooleanFlag lastFragment()
    {
        return BooleanFlag.get(((short)(buffer.getByte(offset + 96) & 0xFF)));
    }


    public static int massActionRejectReasonId()
    {
        return 1376;
    }

    public static int massActionRejectReasonSinceVersion()
    {
        return 0;
    }

    public static int massActionRejectReasonEncodingOffset()
    {
        return 97;
    }

    public static int massActionRejectReasonEncodingLength()
    {
        return 1;
    }

    public static String massActionRejectReasonMetaAttribute(final MetaAttribute metaAttribute)
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

    public static short massActionRejectReasonNullValue()
    {
        return (short)255;
    }

    public static short massActionRejectReasonMinValue()
    {
        return (short)0;
    }

    public static short massActionRejectReasonMaxValue()
    {
        return (short)254;
    }

    public short massActionRejectReason()
    {
        return ((short)(buffer.getByte(offset + 97) & 0xFF));
    }


    public static int marketSegmentIDId()
    {
        return 1300;
    }

    public static int marketSegmentIDSinceVersion()
    {
        return 0;
    }

    public static int marketSegmentIDEncodingOffset()
    {
        return 98;
    }

    public static int marketSegmentIDEncodingLength()
    {
        return 1;
    }

    public static String marketSegmentIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static short marketSegmentIDNullValue()
    {
        return (short)255;
    }

    public static short marketSegmentIDMinValue()
    {
        return (short)0;
    }

    public static short marketSegmentIDMaxValue()
    {
        return (short)254;
    }

    public short marketSegmentID()
    {
        return ((short)(buffer.getByte(offset + 98) & 0xFF));
    }


    public static int massCancelRequestTypeId()
    {
        return 6115;
    }

    public static int massCancelRequestTypeSinceVersion()
    {
        return 0;
    }

    public static int massCancelRequestTypeEncodingOffset()
    {
        return 99;
    }

    public static int massCancelRequestTypeEncodingLength()
    {
        return 1;
    }

    public static String massCancelRequestTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    public short massCancelRequestTypeRaw()
    {
        return ((short)(buffer.getByte(offset + 99) & 0xFF));
    }

    public MassCxlReqTyp massCancelRequestType()
    {
        return MassCxlReqTyp.get(((short)(buffer.getByte(offset + 99) & 0xFF)));
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
        return 100;
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
        return ((short)(buffer.getByte(offset + 100) & 0xFF));
    }

    public SideNULL side()
    {
        return SideNULL.get(((short)(buffer.getByte(offset + 100) & 0xFF)));
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
        return 101;
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
        return buffer.getByte(offset + 101);
    }

    public MassActionOrdTyp ordType()
    {
        return MassActionOrdTyp.get(buffer.getByte(offset + 101));
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
        return 102;
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
        return ((short)(buffer.getByte(offset + 102) & 0xFF));
    }

    public MassCancelTIF timeInForce()
    {
        return MassCancelTIF.get(((short)(buffer.getByte(offset + 102) & 0xFF)));
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
        return 103;
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
        return ((short)(buffer.getByte(offset + 103) & 0xFF));
    }

    public SplitMsg splitMsg()
    {
        return SplitMsg.get(((short)(buffer.getByte(offset + 103) & 0xFF)));
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
        return 104;
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
        return ((short)(buffer.getByte(offset + 104) & 0xFF));
    }

    public BooleanNULL liquidityFlag()
    {
        return BooleanNULL.get(((short)(buffer.getByte(offset + 104) & 0xFF)));
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
        return 105;
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
        return ((short)(buffer.getByte(offset + 105) & 0xFF));
    }

    public BooleanFlag possRetransFlag()
    {
        return BooleanFlag.get(((short)(buffer.getByte(offset + 105) & 0xFF)));
    }


    public static int delayToTimeId()
    {
        return 7552;
    }

    public static int delayToTimeSinceVersion()
    {
        return 0;
    }

    public static int delayToTimeEncodingOffset()
    {
        return 106;
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
        return buffer.getLong(offset + 106, BYTE_ORDER);
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
        return 114;
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

        final int pos = offset + 114 + (index * 1);

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

        buffer.getBytes(offset + 114, dst, dstOffset, length);

        return length;
    }

    public String origOrderUser()
    {
        if (parentMessage.actingVersion < 8)
        {
            return "";
        }

        final byte[] dst = new byte[8];
        buffer.getBytes(offset + 114, dst, 0, 8);

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
            final int c = buffer.getByte(offset + 114 + i) & 0xFF;
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
        return 122;
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

        final int pos = offset + 122 + (index * 1);

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

        buffer.getBytes(offset + 122, dst, dstOffset, length);

        return length;
    }

    public String cancelText()
    {
        if (parentMessage.actingVersion < 8)
        {
            return "";
        }

        final byte[] dst = new byte[8];
        buffer.getBytes(offset + 122, dst, 0, 8);

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
            final int c = buffer.getByte(offset + 122 + i) & 0xFF;
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


    private final NoAffectedOrdersDecoder noAffectedOrders = new NoAffectedOrdersDecoder(this);

    public static long noAffectedOrdersDecoderId()
    {
        return 534;
    }

    public static int noAffectedOrdersDecoderSinceVersion()
    {
        return 0;
    }

    /**
     * Total number of order identifiers affected by the OrderMass Action Request. Only used if orders could actually be cancelled otherwise will be set to zero. Must be followed by OrigCIOrdID
     *
     * @return NoAffectedOrdersDecoder : Total number of order identifiers affected by the OrderMass Action Request. Only used if orders could actually be cancelled otherwise will be set to zero. Must be followed by OrigCIOrdID
     */
    public NoAffectedOrdersDecoder noAffectedOrders()
    {
        noAffectedOrders.wrap(buffer);
        return noAffectedOrders;
    }

    /**
     * Total number of order identifiers affected by the OrderMass Action Request. Only used if orders could actually be cancelled otherwise will be set to zero. Must be followed by OrigCIOrdID
     */

    public static final class NoAffectedOrdersDecoder
        implements Iterable<NoAffectedOrdersDecoder>, java.util.Iterator<NoAffectedOrdersDecoder>
    {
        public static final int HEADER_SIZE = 3;
        private final OrderMassActionReport562Decoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        NoAffectedOrdersDecoder(final OrderMassActionReport562Decoder parentMessage)
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

        public NoAffectedOrdersDecoder next()
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
            return 32;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<NoAffectedOrdersDecoder> iterator()
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

        public static int origCIOrdIDId()
        {
            return 41;
        }

        public static int origCIOrdIDSinceVersion()
        {
            return 0;
        }

        public static int origCIOrdIDEncodingOffset()
        {
            return 0;
        }

        public static int origCIOrdIDEncodingLength()
        {
            return 20;
        }

        public static String origCIOrdIDMetaAttribute(final MetaAttribute metaAttribute)
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

        public static byte origCIOrdIDNullValue()
        {
            return (byte)0;
        }

        public static byte origCIOrdIDMinValue()
        {
            return (byte)32;
        }

        public static byte origCIOrdIDMaxValue()
        {
            return (byte)126;
        }

        public static int origCIOrdIDLength()
        {
            return 20;
        }


        public byte origCIOrdID(final int index)
        {
            if (index < 0 || index >= 20)
            {
                throw new IndexOutOfBoundsException("index out of range: index=" + index);
            }

            final int pos = offset + 0 + (index * 1);

            return buffer.getByte(pos);
        }


        public static String origCIOrdIDCharacterEncoding()
        {
            return java.nio.charset.StandardCharsets.US_ASCII.name();
        }

        public int getOrigCIOrdID(final byte[] dst, final int dstOffset)
        {
            final int length = 20;
            if (dstOffset < 0 || dstOffset > (dst.length - length))
            {
                throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
            }

            buffer.getBytes(offset + 0, dst, dstOffset, length);

            return length;
        }

        public String origCIOrdID()
        {
            final byte[] dst = new byte[20];
            buffer.getBytes(offset + 0, dst, 0, 20);

            int end = 0;
            for (; end < 20 && dst[end] != 0; ++end);

            return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
        }


        public int getOrigCIOrdID(final Appendable value)
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


        public static int affectedOrderIDId()
        {
            return 535;
        }

        public static int affectedOrderIDSinceVersion()
        {
            return 0;
        }

        public static int affectedOrderIDEncodingOffset()
        {
            return 20;
        }

        public static int affectedOrderIDEncodingLength()
        {
            return 8;
        }

        public static String affectedOrderIDMetaAttribute(final MetaAttribute metaAttribute)
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

        public static long affectedOrderIDNullValue()
        {
            return 0xffffffffffffffffL;
        }

        public static long affectedOrderIDMinValue()
        {
            return 0x0L;
        }

        public static long affectedOrderIDMaxValue()
        {
            return 0xfffffffffffffffeL;
        }

        public long affectedOrderID()
        {
            return buffer.getLong(offset + 20, BYTE_ORDER);
        }


        public static int cxlQuantityId()
        {
            return 84;
        }

        public static int cxlQuantitySinceVersion()
        {
            return 0;
        }

        public static int cxlQuantityEncodingOffset()
        {
            return 28;
        }

        public static int cxlQuantityEncodingLength()
        {
            return 4;
        }

        public static String cxlQuantityMetaAttribute(final MetaAttribute metaAttribute)
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

        public static long cxlQuantityNullValue()
        {
            return 4294967295L;
        }

        public static long cxlQuantityMinValue()
        {
            return 0L;
        }

        public static long cxlQuantityMaxValue()
        {
            return 4294967294L;
        }

        public long cxlQuantity()
        {
            return (buffer.getInt(offset + 28, BYTE_ORDER) & 0xFFFF_FFFFL);
        }


        public StringBuilder appendTo(final StringBuilder builder)
        {
            if (null == buffer)
            {
                return builder;
            }

            builder.append('(');
            builder.append("origCIOrdID=");
            for (int i = 0; i < origCIOrdIDLength() && this.origCIOrdID(i) > 0; i++)
            {
                builder.append((char)this.origCIOrdID(i));
            }
            builder.append('|');
            builder.append("affectedOrderID=");
            builder.append(this.affectedOrderID());
            builder.append('|');
            builder.append("cxlQuantity=");
            builder.append(this.cxlQuantity());
            builder.append(')');

            return builder;
        }
        
        public NoAffectedOrdersDecoder sbeSkip()
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

        final OrderMassActionReport562Decoder decoder = new OrderMassActionReport562Decoder();
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
        builder.append("[OrderMassActionReport562](sbeTemplateId=");
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
        builder.append("senderID=");
        for (int i = 0; i < senderIDLength() && this.senderID(i) > 0; i++)
        {
            builder.append((char)this.senderID(i));
        }
        builder.append('|');
        builder.append("partyDetailsListReqID=");
        builder.append(this.partyDetailsListReqID());
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
        builder.append("massActionReportID=");
        builder.append(this.massActionReportID());
        builder.append('|');
        builder.append("securityGroup=");
        for (int i = 0; i < securityGroupLength() && this.securityGroup(i) > 0; i++)
        {
            builder.append((char)this.securityGroup(i));
        }
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
        builder.append("delayDuration=");
        builder.append(this.delayDuration());
        builder.append('|');
        builder.append("massActionResponse=");
        builder.append(this.massActionResponse());
        builder.append('|');
        builder.append("manualOrderIndicator=");
        builder.append(this.manualOrderIndicator());
        builder.append('|');
        builder.append("massActionScope=");
        builder.append(this.massActionScope());
        builder.append('|');
        builder.append("totalAffectedOrders=");
        builder.append(this.totalAffectedOrders());
        builder.append('|');
        builder.append("lastFragment=");
        builder.append(this.lastFragment());
        builder.append('|');
        builder.append("massActionRejectReason=");
        builder.append(this.massActionRejectReason());
        builder.append('|');
        builder.append("marketSegmentID=");
        builder.append(this.marketSegmentID());
        builder.append('|');
        builder.append("massCancelRequestType=");
        builder.append(this.massCancelRequestType());
        builder.append('|');
        builder.append("side=");
        builder.append(this.side());
        builder.append('|');
        builder.append("ordType=");
        builder.append(this.ordType());
        builder.append('|');
        builder.append("timeInForce=");
        builder.append(this.timeInForce());
        builder.append('|');
        builder.append("splitMsg=");
        builder.append(this.splitMsg());
        builder.append('|');
        builder.append("liquidityFlag=");
        builder.append(this.liquidityFlag());
        builder.append('|');
        builder.append("possRetransFlag=");
        builder.append(this.possRetransFlag());
        builder.append('|');
        builder.append("delayToTime=");
        builder.append(this.delayToTime());
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
        builder.append('|');
        builder.append("noAffectedOrders=[");
        final int noAffectedOrdersOriginalOffset = noAffectedOrders.offset;
        final int noAffectedOrdersOriginalIndex = noAffectedOrders.index;
        final NoAffectedOrdersDecoder noAffectedOrders = this.noAffectedOrders();
        if (noAffectedOrders.count() > 0)
        {
            while (noAffectedOrders.hasNext())
            {
                noAffectedOrders.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        noAffectedOrders.offset = noAffectedOrdersOriginalOffset;
        noAffectedOrders.index = noAffectedOrdersOriginalIndex;
        builder.append(']');

        limit(originalLimit);

        return builder;
    }
    
    public OrderMassActionReport562Decoder sbeSkip()
    {
        sbeRewind();
        NoAffectedOrdersDecoder noAffectedOrders = this.noAffectedOrders();
        if (noAffectedOrders.count() > 0)
        {
            while (noAffectedOrders.hasNext())
            {
                noAffectedOrders.next();
                noAffectedOrders.sbeSkip();
            }
        }

        return this;
    }
}
