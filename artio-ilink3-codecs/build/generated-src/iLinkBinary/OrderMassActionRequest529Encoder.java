/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.MutableDirectBuffer;
import org.agrona.sbe.*;


/**
 * OrderMassActionRequest
 */
@SuppressWarnings("all")
public final class OrderMassActionRequest529Encoder implements MessageEncoderFlyweight
{
    public static final int BLOCK_LENGTH = 79;
    public static final int TEMPLATE_ID = 529;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final OrderMassActionRequest529Encoder parentMessage = this;
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
        return "CA";
    }

    public MutableDirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public OrderMassActionRequest529Encoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public OrderMassActionRequest529Encoder wrapAndApplyHeader(
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

    public OrderMassActionRequest529Encoder partyDetailsListReqID(final long value)
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

    public OrderMassActionRequest529Encoder orderRequestID(final long value)
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

    public OrderMassActionRequest529Encoder manualOrderIndicator(final ManualOrdIndReq value)
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

    public OrderMassActionRequest529Encoder seqNum(final long value)
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


    public OrderMassActionRequest529Encoder senderID(final int index, final byte value)
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

    public OrderMassActionRequest529Encoder putSenderID(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 21, src, srcOffset, length);

        return this;
    }

    public OrderMassActionRequest529Encoder senderID(final String src)
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

    public OrderMassActionRequest529Encoder senderID(final CharSequence src)
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
        return 41;
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

    public OrderMassActionRequest529Encoder sendingTimeEpoch(final long value)
    {
        buffer.putLong(offset + 41, value, BYTE_ORDER);
        return this;
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
        return 49;
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


    public OrderMassActionRequest529Encoder securityGroup(final int index, final byte value)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 49 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String securityGroupCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public OrderMassActionRequest529Encoder putSecurityGroup(final byte[] src, final int srcOffset)
    {
        final int length = 6;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 49, src, srcOffset, length);

        return this;
    }

    public OrderMassActionRequest529Encoder securityGroup(final String src)
    {
        final int length = 6;
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

    public OrderMassActionRequest529Encoder securityGroup(final CharSequence src)
    {
        final int length = 6;
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
        return 55;
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


    public OrderMassActionRequest529Encoder location(final int index, final byte value)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 55 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String locationCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public OrderMassActionRequest529Encoder putLocation(final byte[] src, final int srcOffset)
    {
        final int length = 5;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 55, src, srcOffset, length);

        return this;
    }

    public OrderMassActionRequest529Encoder location(final String src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 55, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 55 + start, (byte)0);
        }

        return this;
    }

    public OrderMassActionRequest529Encoder location(final CharSequence src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 55, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 55 + start, (byte)0);
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
        return 60;
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

    public OrderMassActionRequest529Encoder securityID(final int value)
    {
        buffer.putInt(offset + 60, value, BYTE_ORDER);
        return this;
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
        return 64;
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

    public OrderMassActionRequest529Encoder massActionScope(final MassActionScope value)
    {
        buffer.putByte(offset + 64, (byte)value.value());
        return this;
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
        return 65;
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

    public OrderMassActionRequest529Encoder marketSegmentID(final short value)
    {
        buffer.putByte(offset + 65, (byte)value);
        return this;
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
        return 66;
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

    public OrderMassActionRequest529Encoder massCancelRequestType(final MassCxlReqTyp value)
    {
        buffer.putByte(offset + 66, (byte)value.value());
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
        return 67;
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

    public OrderMassActionRequest529Encoder side(final SideNULL value)
    {
        buffer.putByte(offset + 67, (byte)value.value());
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
        return 68;
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

    public OrderMassActionRequest529Encoder ordType(final MassActionOrdTyp value)
    {
        buffer.putByte(offset + 68, value.value());
        return this;
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
        return 69;
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

    public OrderMassActionRequest529Encoder timeInForce(final MassCancelTIF value)
    {
        buffer.putByte(offset + 69, (byte)value.value());
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
        return 70;
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

    public OrderMassActionRequest529Encoder liquidityFlag(final BooleanNULL value)
    {
        buffer.putByte(offset + 70, (byte)value.value());
        return this;
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
        return 71;
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


    public OrderMassActionRequest529Encoder origOrderUser(final int index, final byte value)
    {
        if (index < 0 || index >= 8)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 71 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String origOrderUserCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public OrderMassActionRequest529Encoder putOrigOrderUser(final byte[] src, final int srcOffset)
    {
        final int length = 8;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 71, src, srcOffset, length);

        return this;
    }

    public OrderMassActionRequest529Encoder origOrderUser(final String src)
    {
        final int length = 8;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 71, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 71 + start, (byte)0);
        }

        return this;
    }

    public OrderMassActionRequest529Encoder origOrderUser(final CharSequence src)
    {
        final int length = 8;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 71, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 71 + start, (byte)0);
        }

        return this;
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

        final OrderMassActionRequest529Decoder decoder = new OrderMassActionRequest529Decoder();
        decoder.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return decoder.appendTo(builder);
    }
}
