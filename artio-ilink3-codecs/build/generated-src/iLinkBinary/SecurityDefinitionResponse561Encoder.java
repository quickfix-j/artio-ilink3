/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.MutableDirectBuffer;
import org.agrona.sbe.*;


/**
 * SecurityDefinitionResponse
 */
@SuppressWarnings("all")
public final class SecurityDefinitionResponse561Encoder implements MessageEncoderFlyweight
{
    public static final int BLOCK_LENGTH = 430;
    public static final int TEMPLATE_ID = 561;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final SecurityDefinitionResponse561Encoder parentMessage = this;
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
        return "d";
    }

    public MutableDirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public SecurityDefinitionResponse561Encoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public SecurityDefinitionResponse561Encoder wrapAndApplyHeader(
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

    public SecurityDefinitionResponse561Encoder seqNum(final long value)
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

    public SecurityDefinitionResponse561Encoder uUID(final long value)
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


    public SecurityDefinitionResponse561Encoder text(final int index, final byte value)
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

    public SecurityDefinitionResponse561Encoder putText(final byte[] src, final int srcOffset)
    {
        final int length = 256;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 12, src, srcOffset, length);

        return this;
    }

    public SecurityDefinitionResponse561Encoder text(final String src)
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

    public SecurityDefinitionResponse561Encoder text(final CharSequence src)
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

    public static int financialInstrumentFullNameId()
    {
        return 2714;
    }

    public static int financialInstrumentFullNameSinceVersion()
    {
        return 0;
    }

    public static int financialInstrumentFullNameEncodingOffset()
    {
        return 268;
    }

    public static int financialInstrumentFullNameEncodingLength()
    {
        return 35;
    }

    public static String financialInstrumentFullNameMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte financialInstrumentFullNameNullValue()
    {
        return (byte)0;
    }

    public static byte financialInstrumentFullNameMinValue()
    {
        return (byte)32;
    }

    public static byte financialInstrumentFullNameMaxValue()
    {
        return (byte)126;
    }

    public static int financialInstrumentFullNameLength()
    {
        return 35;
    }


    public SecurityDefinitionResponse561Encoder financialInstrumentFullName(final int index, final byte value)
    {
        if (index < 0 || index >= 35)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 268 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String financialInstrumentFullNameCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public SecurityDefinitionResponse561Encoder putFinancialInstrumentFullName(final byte[] src, final int srcOffset)
    {
        final int length = 35;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 268, src, srcOffset, length);

        return this;
    }

    public SecurityDefinitionResponse561Encoder financialInstrumentFullName(final String src)
    {
        final int length = 35;
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

    public SecurityDefinitionResponse561Encoder financialInstrumentFullName(final CharSequence src)
    {
        final int length = 35;
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
        return 303;
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


    public SecurityDefinitionResponse561Encoder senderID(final int index, final byte value)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 303 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String senderIDCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public SecurityDefinitionResponse561Encoder putSenderID(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 303, src, srcOffset, length);

        return this;
    }

    public SecurityDefinitionResponse561Encoder senderID(final String src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 303, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 303 + start, (byte)0);
        }

        return this;
    }

    public SecurityDefinitionResponse561Encoder senderID(final CharSequence src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 303, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 303 + start, (byte)0);
        }

        return this;
    }

    public static int symbolId()
    {
        return 55;
    }

    public static int symbolSinceVersion()
    {
        return 0;
    }

    public static int symbolEncodingOffset()
    {
        return 323;
    }

    public static int symbolEncodingLength()
    {
        return 20;
    }

    public static String symbolMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte symbolNullValue()
    {
        return (byte)0;
    }

    public static byte symbolMinValue()
    {
        return (byte)32;
    }

    public static byte symbolMaxValue()
    {
        return (byte)126;
    }

    public static int symbolLength()
    {
        return 20;
    }


    public SecurityDefinitionResponse561Encoder symbol(final int index, final byte value)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 323 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String symbolCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public SecurityDefinitionResponse561Encoder putSymbol(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 323, src, srcOffset, length);

        return this;
    }

    public SecurityDefinitionResponse561Encoder symbol(final String src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 323, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 323 + start, (byte)0);
        }

        return this;
    }

    public SecurityDefinitionResponse561Encoder symbol(final CharSequence src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 323, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 323 + start, (byte)0);
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
        return 343;
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

    public SecurityDefinitionResponse561Encoder partyDetailsListReqID(final long value)
    {
        buffer.putLong(offset + 343, value, BYTE_ORDER);
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
        return 351;
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

    public SecurityDefinitionResponse561Encoder securityReqID(final long value)
    {
        buffer.putLong(offset + 351, value, BYTE_ORDER);
        return this;
    }


    public static int securityResponseIDId()
    {
        return 322;
    }

    public static int securityResponseIDSinceVersion()
    {
        return 0;
    }

    public static int securityResponseIDEncodingOffset()
    {
        return 359;
    }

    public static int securityResponseIDEncodingLength()
    {
        return 8;
    }

    public static String securityResponseIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long securityResponseIDNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long securityResponseIDMinValue()
    {
        return 0x0L;
    }

    public static long securityResponseIDMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public SecurityDefinitionResponse561Encoder securityResponseID(final long value)
    {
        buffer.putLong(offset + 359, value, BYTE_ORDER);
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
        return 367;
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

    public SecurityDefinitionResponse561Encoder sendingTimeEpoch(final long value)
    {
        buffer.putLong(offset + 367, value, BYTE_ORDER);
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
        return 375;
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


    public SecurityDefinitionResponse561Encoder securityGroup(final int index, final byte value)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 375 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String securityGroupCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public SecurityDefinitionResponse561Encoder putSecurityGroup(final byte[] src, final int srcOffset)
    {
        final int length = 6;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 375, src, srcOffset, length);

        return this;
    }

    public SecurityDefinitionResponse561Encoder securityGroup(final String src)
    {
        final int length = 6;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 375, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 375 + start, (byte)0);
        }

        return this;
    }

    public SecurityDefinitionResponse561Encoder securityGroup(final CharSequence src)
    {
        final int length = 6;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 375, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 375 + start, (byte)0);
        }

        return this;
    }

    public static int securityTypeId()
    {
        return 167;
    }

    public static int securityTypeSinceVersion()
    {
        return 0;
    }

    public static int securityTypeEncodingOffset()
    {
        return 381;
    }

    public static int securityTypeEncodingLength()
    {
        return 6;
    }

    public static String securityTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte securityTypeNullValue()
    {
        return (byte)0;
    }

    public static byte securityTypeMinValue()
    {
        return (byte)32;
    }

    public static byte securityTypeMaxValue()
    {
        return (byte)126;
    }

    public static int securityTypeLength()
    {
        return 6;
    }


    public SecurityDefinitionResponse561Encoder securityType(final int index, final byte value)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 381 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String securityTypeCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public SecurityDefinitionResponse561Encoder putSecurityType(final byte[] src, final int srcOffset)
    {
        final int length = 6;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 381, src, srcOffset, length);

        return this;
    }

    public SecurityDefinitionResponse561Encoder securityType(final String src)
    {
        final int length = 6;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 381, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 381 + start, (byte)0);
        }

        return this;
    }

    public SecurityDefinitionResponse561Encoder securityType(final CharSequence src)
    {
        final int length = 6;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 381, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 381 + start, (byte)0);
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
        return 387;
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


    public SecurityDefinitionResponse561Encoder location(final int index, final byte value)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 387 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String locationCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public SecurityDefinitionResponse561Encoder putLocation(final byte[] src, final int srcOffset)
    {
        final int length = 5;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 387, src, srcOffset, length);

        return this;
    }

    public SecurityDefinitionResponse561Encoder location(final String src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 387, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 387 + start, (byte)0);
        }

        return this;
    }

    public SecurityDefinitionResponse561Encoder location(final CharSequence src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 387, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 387 + start, (byte)0);
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
        return 392;
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

    public SecurityDefinitionResponse561Encoder securityID(final int value)
    {
        buffer.putInt(offset + 392, value, BYTE_ORDER);
        return this;
    }


    public static int currencyId()
    {
        return 15;
    }

    public static int currencySinceVersion()
    {
        return 0;
    }

    public static int currencyEncodingOffset()
    {
        return 396;
    }

    public static int currencyEncodingLength()
    {
        return 3;
    }

    public static String currencyMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte currencyNullValue()
    {
        return (byte)0;
    }

    public static byte currencyMinValue()
    {
        return (byte)32;
    }

    public static byte currencyMaxValue()
    {
        return (byte)126;
    }

    public static int currencyLength()
    {
        return 3;
    }


    public SecurityDefinitionResponse561Encoder currency(final int index, final byte value)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 396 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }
    public SecurityDefinitionResponse561Encoder putCurrency(final byte value0, final byte value1, final byte value2)
    {
        buffer.putByte(offset + 396, value0);
        buffer.putByte(offset + 397, value1);
        buffer.putByte(offset + 398, value2);

        return this;
    }

    public static String currencyCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public SecurityDefinitionResponse561Encoder putCurrency(final byte[] src, final int srcOffset)
    {
        final int length = 3;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 396, src, srcOffset, length);

        return this;
    }

    public SecurityDefinitionResponse561Encoder currency(final String src)
    {
        final int length = 3;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 396, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 396 + start, (byte)0);
        }

        return this;
    }

    public SecurityDefinitionResponse561Encoder currency(final CharSequence src)
    {
        final int length = 3;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 396, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 396 + start, (byte)0);
        }

        return this;
    }

    public static int securityIDSourceId()
    {
        return 22;
    }

    public static int securityIDSourceSinceVersion()
    {
        return 0;
    }

    public static int securityIDSourceEncodingOffset()
    {
        return 399;
    }

    public static int securityIDSourceEncodingLength()
    {
        return 0;
    }

    public static String securityIDSourceMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte securityIDSourceNullValue()
    {
        return (byte)0;
    }

    public static byte securityIDSourceMinValue()
    {
        return (byte)32;
    }

    public static byte securityIDSourceMaxValue()
    {
        return (byte)126;
    }


    private static final byte[] SECURITYIDSOURCE_VALUE = { 56 };

    public static int securityIDSourceLength()
    {
        return 1;
    }


    public byte securityIDSource(final int index)
    {
        return SECURITYIDSOURCE_VALUE[index];
    }

    public int getSecurityIDSource(final byte[] dst, final int offset, final int length)
    {
        final int bytesCopied = Math.min(length, 1);
        System.arraycopy(SECURITYIDSOURCE_VALUE, 0, dst, offset, bytesCopied);

        return bytesCopied;
    }

    public byte securityIDSource()
    {
        return (byte)56;
    }


    public static int maturityMonthYearId()
    {
        return 200;
    }

    public static int maturityMonthYearSinceVersion()
    {
        return 0;
    }

    public static int maturityMonthYearEncodingOffset()
    {
        return 399;
    }

    public static int maturityMonthYearEncodingLength()
    {
        return 5;
    }

    public static String maturityMonthYearMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "MonthYear";
        }

        return "";
    }

    private final MaturityMonthYearEncoder maturityMonthYear = new MaturityMonthYearEncoder();

    /**
     * Instrument expiration; earliest leg maturity in the options strategy 
     *
     * @return MaturityMonthYearEncoder : Instrument expiration; earliest leg maturity in the options strategy 
     */
    public MaturityMonthYearEncoder maturityMonthYear()
    {
        maturityMonthYear.wrap(buffer, offset + 399);
        return maturityMonthYear;
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
        return 404;
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

    public SecurityDefinitionResponse561Encoder delayDuration(final int value)
    {
        buffer.putShort(offset + 404, (short)value, BYTE_ORDER);
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
        return 406;
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

    public SecurityDefinitionResponse561Encoder startDate(final int value)
    {
        buffer.putShort(offset + 406, (short)value, BYTE_ORDER);
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
        return 408;
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

    public SecurityDefinitionResponse561Encoder endDate(final int value)
    {
        buffer.putShort(offset + 408, (short)value, BYTE_ORDER);
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
        return 410;
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

    public SecurityDefinitionResponse561Encoder maxNoOfSubstitutions(final short value)
    {
        buffer.putByte(offset + 410, (byte)value);
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
        return 411;
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

    public SecurityDefinitionResponse561Encoder sourceRepoID(final int value)
    {
        buffer.putInt(offset + 411, value, BYTE_ORDER);
        return this;
    }


    public static int terminationTypeId()
    {
        return 788;
    }

    public static int terminationTypeSinceVersion()
    {
        return 3;
    }

    public static int terminationTypeEncodingOffset()
    {
        return 415;
    }

    public static int terminationTypeEncodingLength()
    {
        return 8;
    }

    public static String terminationTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte terminationTypeNullValue()
    {
        return (byte)0;
    }

    public static byte terminationTypeMinValue()
    {
        return (byte)32;
    }

    public static byte terminationTypeMaxValue()
    {
        return (byte)126;
    }

    public static int terminationTypeLength()
    {
        return 8;
    }


    public SecurityDefinitionResponse561Encoder terminationType(final int index, final byte value)
    {
        if (index < 0 || index >= 8)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 415 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String terminationTypeCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public SecurityDefinitionResponse561Encoder putTerminationType(final byte[] src, final int srcOffset)
    {
        final int length = 8;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 415, src, srcOffset, length);

        return this;
    }

    public SecurityDefinitionResponse561Encoder terminationType(final String src)
    {
        final int length = 8;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 415, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 415 + start, (byte)0);
        }

        return this;
    }

    public SecurityDefinitionResponse561Encoder terminationType(final CharSequence src)
    {
        final int length = 8;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 415, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 415 + start, (byte)0);
        }

        return this;
    }

    public static int securityResponseTypeId()
    {
        return 323;
    }

    public static int securityResponseTypeSinceVersion()
    {
        return 0;
    }

    public static int securityResponseTypeEncodingOffset()
    {
        return 423;
    }

    public static int securityResponseTypeEncodingLength()
    {
        return 1;
    }

    public static String securityResponseTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    public SecurityDefinitionResponse561Encoder securityResponseType(final SecRspTyp value)
    {
        buffer.putByte(offset + 423, (byte)value.value());
        return this;
    }

    public static int userDefinedInstrumentId()
    {
        return 9779;
    }

    public static int userDefinedInstrumentSinceVersion()
    {
        return 0;
    }

    public static int userDefinedInstrumentEncodingOffset()
    {
        return 424;
    }

    public static int userDefinedInstrumentEncodingLength()
    {
        return 0;
    }

    public static String userDefinedInstrumentMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte userDefinedInstrumentNullValue()
    {
        return (byte)0;
    }

    public static byte userDefinedInstrumentMinValue()
    {
        return (byte)32;
    }

    public static byte userDefinedInstrumentMaxValue()
    {
        return (byte)126;
    }


    private static final byte[] USERDEFINEDINSTRUMENT_VALUE = { 89 };

    public static int userDefinedInstrumentLength()
    {
        return 1;
    }


    public byte userDefinedInstrument(final int index)
    {
        return USERDEFINEDINSTRUMENT_VALUE[index];
    }

    public int getUserDefinedInstrument(final byte[] dst, final int offset, final int length)
    {
        final int bytesCopied = Math.min(length, 1);
        System.arraycopy(USERDEFINEDINSTRUMENT_VALUE, 0, dst, offset, bytesCopied);

        return bytesCopied;
    }

    public byte userDefinedInstrument()
    {
        return (byte)89;
    }


    public static int expirationCycleId()
    {
        return 827;
    }

    public static int expirationCycleSinceVersion()
    {
        return 0;
    }

    public static int expirationCycleEncodingOffset()
    {
        return 424;
    }

    public static int expirationCycleEncodingLength()
    {
        return 1;
    }

    public static String expirationCycleMetaAttribute(final MetaAttribute metaAttribute)
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

    public SecurityDefinitionResponse561Encoder expirationCycle(final ExpCycle value)
    {
        buffer.putByte(offset + 424, (byte)value.value());
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
        return 425;
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

    public SecurityDefinitionResponse561Encoder manualOrderIndicator(final ManualOrdIndReq value)
    {
        buffer.putByte(offset + 425, (byte)value.value());
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
        return 426;
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

    public SecurityDefinitionResponse561Encoder splitMsg(final SplitMsg value)
    {
        buffer.putByte(offset + 426, (byte)value.value());
        return this;
    }

    public static int autoQuoteRequestId()
    {
        return 9776;
    }

    public static int autoQuoteRequestSinceVersion()
    {
        return 0;
    }

    public static int autoQuoteRequestEncodingOffset()
    {
        return 427;
    }

    public static int autoQuoteRequestEncodingLength()
    {
        return 1;
    }

    public static String autoQuoteRequestMetaAttribute(final MetaAttribute metaAttribute)
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

    public SecurityDefinitionResponse561Encoder autoQuoteRequest(final BooleanFlag value)
    {
        buffer.putByte(offset + 427, (byte)value.value());
        return this;
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
        return 428;
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

    public SecurityDefinitionResponse561Encoder possRetransFlag(final BooleanFlag value)
    {
        buffer.putByte(offset + 428, (byte)value.value());
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
        return 429;
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

    public SecurityDefinitionResponse561Encoder brokenDateTermType(final short value)
    {
        buffer.putByte(offset + 429, (byte)value);
        return this;
    }


    private final NoLegsEncoder noLegs = new NoLegsEncoder(this);

    public static long noLegsId()
    {
        return 555;
    }

    /**
     * Number of legs (repeating groups).
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
     * Number of legs (repeating groups).
     */

    public static final class NoLegsEncoder
    {
        public static final int HEADER_SIZE = 3;
        private final SecurityDefinitionResponse561Encoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int initialLimit;

        NoLegsEncoder(final SecurityDefinitionResponse561Encoder parentMessage)
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
         * Price for a futures leg of a covered 
         *
         * @return PRICENULL9Encoder : Price for a futures leg of a covered 
         */
        public PRICENULL9Encoder legPrice()
        {
            legPrice.wrap(buffer, offset + 0);
            return legPrice;
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
            return 8;
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
         * Delta used to calculate the quantity of futures used to cover the option or option strategy.For a covered option outright instrument, must be between +0.01 and +1.00. For a covered option spread instrument, must be between +0.01 and +40.00
         *
         * @return Decimal32NULLEncoder : Delta used to calculate the quantity of futures used to cover the option or option strategy.For a covered option outright instrument, must be between +0.01 and +1.00. For a covered option spread instrument, must be between +0.01 and +40.00
         */
        public Decimal32NULLEncoder legOptionDelta()
        {
            legOptionDelta.wrap(buffer, offset + 8);
            return legOptionDelta;
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
            return 13;
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
            return 13;
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
            buffer.putInt(offset + 13, value, BYTE_ORDER);
            return this;
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
        private final SecurityDefinitionResponse561Encoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int initialLimit;

        NoBrokenDatesEncoder(final SecurityDefinitionResponse561Encoder parentMessage)
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
            buffer.putShort(limit + 0, (short)16, BYTE_ORDER);
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
            return 16;
        }

        public static int brokenDateGUIDId()
        {
            return 39031;
        }

        public static int brokenDateGUIDSinceVersion()
        {
            return 0;
        }

        public static int brokenDateGUIDEncodingOffset()
        {
            return 0;
        }

        public static int brokenDateGUIDEncodingLength()
        {
            return 8;
        }

        public static String brokenDateGUIDMetaAttribute(final MetaAttribute metaAttribute)
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

        public static long brokenDateGUIDNullValue()
        {
            return 0xffffffffffffffffL;
        }

        public static long brokenDateGUIDMinValue()
        {
            return 0x0L;
        }

        public static long brokenDateGUIDMaxValue()
        {
            return 0xfffffffffffffffeL;
        }

        public NoBrokenDatesEncoder brokenDateGUID(final long value)
        {
            buffer.putLong(offset + 0, value, BYTE_ORDER);
            return this;
        }


        public static int brokenDateSecurityIDId()
        {
            return 39027;
        }

        public static int brokenDateSecurityIDSinceVersion()
        {
            return 0;
        }

        public static int brokenDateSecurityIDEncodingOffset()
        {
            return 8;
        }

        public static int brokenDateSecurityIDEncodingLength()
        {
            return 4;
        }

        public static String brokenDateSecurityIDMetaAttribute(final MetaAttribute metaAttribute)
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

        public static int brokenDateSecurityIDNullValue()
        {
            return 2147483647;
        }

        public static int brokenDateSecurityIDMinValue()
        {
            return -2147483647;
        }

        public static int brokenDateSecurityIDMaxValue()
        {
            return 2147483647;
        }

        public NoBrokenDatesEncoder brokenDateSecurityID(final int value)
        {
            buffer.putInt(offset + 8, value, BYTE_ORDER);
            return this;
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
            return 12;
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
            buffer.putShort(offset + 12, (short)value, BYTE_ORDER);
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
            return 14;
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
            buffer.putShort(offset + 14, (short)value, BYTE_ORDER);
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

        final SecurityDefinitionResponse561Decoder decoder = new SecurityDefinitionResponse561Decoder();
        decoder.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return decoder.appendTo(builder);
    }
}
