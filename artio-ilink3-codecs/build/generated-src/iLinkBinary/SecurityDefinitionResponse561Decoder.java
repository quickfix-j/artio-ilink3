/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.DirectBuffer;
import org.agrona.sbe.*;


/**
 * SecurityDefinitionResponse
 */
@SuppressWarnings("all")
public final class SecurityDefinitionResponse561Decoder implements MessageDecoderFlyweight
{
    public static final int BLOCK_LENGTH = 430;
    public static final int TEMPLATE_ID = 561;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final SecurityDefinitionResponse561Decoder parentMessage = this;
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
        return "d";
    }

    public DirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public SecurityDefinitionResponse561Decoder wrap(
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

    public SecurityDefinitionResponse561Decoder wrapAndApplyHeader(
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

    public SecurityDefinitionResponse561Decoder sbeRewind()
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


    public byte financialInstrumentFullName(final int index)
    {
        if (index < 0 || index >= 35)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 268 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String financialInstrumentFullNameCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getFinancialInstrumentFullName(final byte[] dst, final int dstOffset)
    {
        final int length = 35;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 268, dst, dstOffset, length);

        return length;
    }

    public String financialInstrumentFullName()
    {
        final byte[] dst = new byte[35];
        buffer.getBytes(offset + 268, dst, 0, 35);

        int end = 0;
        for (; end < 35 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getFinancialInstrumentFullName(final Appendable value)
    {
        for (int i = 0; i < 35; ++i)
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

        return 35;
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


    public byte senderID(final int index)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 303 + (index * 1);

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

        buffer.getBytes(offset + 303, dst, dstOffset, length);

        return length;
    }

    public String senderID()
    {
        final byte[] dst = new byte[20];
        buffer.getBytes(offset + 303, dst, 0, 20);

        int end = 0;
        for (; end < 20 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getSenderID(final Appendable value)
    {
        for (int i = 0; i < 20; ++i)
        {
            final int c = buffer.getByte(offset + 303 + i) & 0xFF;
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


    public byte symbol(final int index)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 323 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String symbolCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getSymbol(final byte[] dst, final int dstOffset)
    {
        final int length = 20;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 323, dst, dstOffset, length);

        return length;
    }

    public String symbol()
    {
        final byte[] dst = new byte[20];
        buffer.getBytes(offset + 323, dst, 0, 20);

        int end = 0;
        for (; end < 20 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getSymbol(final Appendable value)
    {
        for (int i = 0; i < 20; ++i)
        {
            final int c = buffer.getByte(offset + 323 + i) & 0xFF;
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

    public long partyDetailsListReqID()
    {
        return buffer.getLong(offset + 343, BYTE_ORDER);
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

    public long securityReqID()
    {
        return buffer.getLong(offset + 351, BYTE_ORDER);
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

    public long securityResponseID()
    {
        return buffer.getLong(offset + 359, BYTE_ORDER);
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

    public long sendingTimeEpoch()
    {
        return buffer.getLong(offset + 367, BYTE_ORDER);
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


    public byte securityGroup(final int index)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 375 + (index * 1);

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

        buffer.getBytes(offset + 375, dst, dstOffset, length);

        return length;
    }

    public String securityGroup()
    {
        final byte[] dst = new byte[6];
        buffer.getBytes(offset + 375, dst, 0, 6);

        int end = 0;
        for (; end < 6 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getSecurityGroup(final Appendable value)
    {
        for (int i = 0; i < 6; ++i)
        {
            final int c = buffer.getByte(offset + 375 + i) & 0xFF;
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


    public byte securityType(final int index)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 381 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String securityTypeCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getSecurityType(final byte[] dst, final int dstOffset)
    {
        final int length = 6;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 381, dst, dstOffset, length);

        return length;
    }

    public String securityType()
    {
        final byte[] dst = new byte[6];
        buffer.getBytes(offset + 381, dst, 0, 6);

        int end = 0;
        for (; end < 6 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getSecurityType(final Appendable value)
    {
        for (int i = 0; i < 6; ++i)
        {
            final int c = buffer.getByte(offset + 381 + i) & 0xFF;
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


    public byte location(final int index)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 387 + (index * 1);

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

        buffer.getBytes(offset + 387, dst, dstOffset, length);

        return length;
    }

    public String location()
    {
        final byte[] dst = new byte[5];
        buffer.getBytes(offset + 387, dst, 0, 5);

        int end = 0;
        for (; end < 5 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getLocation(final Appendable value)
    {
        for (int i = 0; i < 5; ++i)
        {
            final int c = buffer.getByte(offset + 387 + i) & 0xFF;
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

    public int securityID()
    {
        return buffer.getInt(offset + 392, BYTE_ORDER);
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


    public byte currency(final int index)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 396 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String currencyCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getCurrency(final byte[] dst, final int dstOffset)
    {
        final int length = 3;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 396, dst, dstOffset, length);

        return length;
    }

    public String currency()
    {
        final byte[] dst = new byte[3];
        buffer.getBytes(offset + 396, dst, 0, 3);

        int end = 0;
        for (; end < 3 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getCurrency(final Appendable value)
    {
        for (int i = 0; i < 3; ++i)
        {
            final int c = buffer.getByte(offset + 396 + i) & 0xFF;
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

        return 3;
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

    private final MaturityMonthYearDecoder maturityMonthYear = new MaturityMonthYearDecoder();

    /**
     * Instrument expiration; earliest leg maturity in the options strategy 
     *
     * @return MaturityMonthYearDecoder : Instrument expiration; earliest leg maturity in the options strategy 
     */
    public MaturityMonthYearDecoder maturityMonthYear()
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

    public int delayDuration()
    {
        return (buffer.getShort(offset + 404, BYTE_ORDER) & 0xFFFF);
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

    public int startDate()
    {
        return (buffer.getShort(offset + 406, BYTE_ORDER) & 0xFFFF);
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

    public int endDate()
    {
        return (buffer.getShort(offset + 408, BYTE_ORDER) & 0xFFFF);
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

    public short maxNoOfSubstitutions()
    {
        return ((short)(buffer.getByte(offset + 410) & 0xFF));
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

    public int sourceRepoID()
    {
        return buffer.getInt(offset + 411, BYTE_ORDER);
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


    public byte terminationType(final int index)
    {
        if (index < 0 || index >= 8)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        if (parentMessage.actingVersion < 3)
        {
            return (byte)0;
        }

        final int pos = offset + 415 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String terminationTypeCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getTerminationType(final byte[] dst, final int dstOffset)
    {
        final int length = 8;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        if (parentMessage.actingVersion < 3)
        {
            return 0;
        }

        buffer.getBytes(offset + 415, dst, dstOffset, length);

        return length;
    }

    public String terminationType()
    {
        if (parentMessage.actingVersion < 3)
        {
            return "";
        }

        final byte[] dst = new byte[8];
        buffer.getBytes(offset + 415, dst, 0, 8);

        int end = 0;
        for (; end < 8 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getTerminationType(final Appendable value)
    {
        if (parentMessage.actingVersion < 3)
        {
            return 0;
        }

        for (int i = 0; i < 8; ++i)
        {
            final int c = buffer.getByte(offset + 415 + i) & 0xFF;
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

    public short securityResponseTypeRaw()
    {
        return ((short)(buffer.getByte(offset + 423) & 0xFF));
    }

    public SecRspTyp securityResponseType()
    {
        return SecRspTyp.get(((short)(buffer.getByte(offset + 423) & 0xFF)));
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

    public short expirationCycleRaw()
    {
        return ((short)(buffer.getByte(offset + 424) & 0xFF));
    }

    public ExpCycle expirationCycle()
    {
        return ExpCycle.get(((short)(buffer.getByte(offset + 424) & 0xFF)));
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

    public short manualOrderIndicatorRaw()
    {
        return ((short)(buffer.getByte(offset + 425) & 0xFF));
    }

    public ManualOrdIndReq manualOrderIndicator()
    {
        return ManualOrdIndReq.get(((short)(buffer.getByte(offset + 425) & 0xFF)));
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

    public short splitMsgRaw()
    {
        return ((short)(buffer.getByte(offset + 426) & 0xFF));
    }

    public SplitMsg splitMsg()
    {
        return SplitMsg.get(((short)(buffer.getByte(offset + 426) & 0xFF)));
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

    public short autoQuoteRequestRaw()
    {
        return ((short)(buffer.getByte(offset + 427) & 0xFF));
    }

    public BooleanFlag autoQuoteRequest()
    {
        return BooleanFlag.get(((short)(buffer.getByte(offset + 427) & 0xFF)));
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

    public short possRetransFlagRaw()
    {
        return ((short)(buffer.getByte(offset + 428) & 0xFF));
    }

    public BooleanFlag possRetransFlag()
    {
        return BooleanFlag.get(((short)(buffer.getByte(offset + 428) & 0xFF)));
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

    public short brokenDateTermType()
    {
        if (parentMessage.actingVersion < 8)
        {
            return (short)255;
        }

        return ((short)(buffer.getByte(offset + 429) & 0xFF));
    }


    private final NoLegsDecoder noLegs = new NoLegsDecoder(this);

    public static long noLegsDecoderId()
    {
        return 555;
    }

    public static int noLegsDecoderSinceVersion()
    {
        return 0;
    }

    /**
     * Number of legs (repeating groups).
     *
     * @return NoLegsDecoder : Number of legs (repeating groups).
     */
    public NoLegsDecoder noLegs()
    {
        noLegs.wrap(buffer);
        return noLegs;
    }

    /**
     * Number of legs (repeating groups).
     */

    public static final class NoLegsDecoder
        implements Iterable<NoLegsDecoder>, java.util.Iterator<NoLegsDecoder>
    {
        public static final int HEADER_SIZE = 3;
        private final SecurityDefinitionResponse561Decoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        NoLegsDecoder(final SecurityDefinitionResponse561Decoder parentMessage)
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

        public NoLegsDecoder next()
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
            return 19;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<NoLegsDecoder> iterator()
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

        private final PRICENULL9Decoder legPrice = new PRICENULL9Decoder();

        /**
         * Price for a futures leg of a covered 
         *
         * @return PRICENULL9Decoder : Price for a futures leg of a covered 
         */
        public PRICENULL9Decoder legPrice()
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

        private final Decimal32NULLDecoder legOptionDelta = new Decimal32NULLDecoder();

        /**
         * Delta used to calculate the quantity of futures used to cover the option or option strategy.For a covered option outright instrument, must be between +0.01 and +1.00. For a covered option spread instrument, must be between +0.01 and +40.00
         *
         * @return Decimal32NULLDecoder : Delta used to calculate the quantity of futures used to cover the option or option strategy.For a covered option outright instrument, must be between +0.01 and +1.00. For a covered option spread instrument, must be between +0.01 and +40.00
         */
        public Decimal32NULLDecoder legOptionDelta()
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

        public int legSecurityID()
        {
            return buffer.getInt(offset + 13, BYTE_ORDER);
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

        public short legSideRaw()
        {
            return ((short)(buffer.getByte(offset + 17) & 0xFF));
        }

        public SideReq legSide()
        {
            return SideReq.get(((short)(buffer.getByte(offset + 17) & 0xFF)));
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

        public short legRatioQty()
        {
            return ((short)(buffer.getByte(offset + 18) & 0xFF));
        }


        public StringBuilder appendTo(final StringBuilder builder)
        {
            if (null == buffer)
            {
                return builder;
            }

            builder.append('(');
            builder.append("legPrice=");
            final PRICENULL9Decoder legPrice = this.legPrice();
            if (null != legPrice)
            {
                legPrice.appendTo(builder);
            }
            else
            {
                builder.append("null");
            }
            builder.append('|');
            builder.append("legOptionDelta=");
            final Decimal32NULLDecoder legOptionDelta = this.legOptionDelta();
            if (null != legOptionDelta)
            {
                legOptionDelta.appendTo(builder);
            }
            else
            {
                builder.append("null");
            }
            builder.append('|');
            builder.append("legSecurityID=");
            builder.append(this.legSecurityID());
            builder.append('|');
            builder.append("legSide=");
            builder.append(this.legSide());
            builder.append('|');
            builder.append("legRatioQty=");
            builder.append(this.legRatioQty());
            builder.append(')');

            return builder;
        }
        
        public NoLegsDecoder sbeSkip()
        {

            return this;
        }
    }

    private final NoBrokenDatesDecoder noBrokenDates = new NoBrokenDatesDecoder(this);

    public static long noBrokenDatesDecoderId()
    {
        return 39026;
    }

    public static int noBrokenDatesDecoderSinceVersion()
    {
        return 8;
    }

    /**
     * Used to indicate the number of custom bespoke broken dates for user defined tailor made repo
     *
     * @return NoBrokenDatesDecoder : Used to indicate the number of custom bespoke broken dates for user defined tailor made repo
     */
    public NoBrokenDatesDecoder noBrokenDates()
    {
        if (parentMessage.actingVersion < 8)
        {
            noBrokenDates.count = 0;
            noBrokenDates.index = 0;
            return noBrokenDates;
        }

        noBrokenDates.wrap(buffer);
        return noBrokenDates;
    }

    /**
     * Used to indicate the number of custom bespoke broken dates for user defined tailor made repo
     */

    public static final class NoBrokenDatesDecoder
        implements Iterable<NoBrokenDatesDecoder>, java.util.Iterator<NoBrokenDatesDecoder>
    {
        public static final int HEADER_SIZE = 3;
        private final SecurityDefinitionResponse561Decoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        NoBrokenDatesDecoder(final SecurityDefinitionResponse561Decoder parentMessage)
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

        public NoBrokenDatesDecoder next()
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
            return 16;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<NoBrokenDatesDecoder> iterator()
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

        public long brokenDateGUID()
        {
            return buffer.getLong(offset + 0, BYTE_ORDER);
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

        public int brokenDateSecurityID()
        {
            return buffer.getInt(offset + 8, BYTE_ORDER);
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

        public int brokenDateStart()
        {
            return (buffer.getShort(offset + 12, BYTE_ORDER) & 0xFFFF);
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

        public int brokenDateEnd()
        {
            return (buffer.getShort(offset + 14, BYTE_ORDER) & 0xFFFF);
        }


        public StringBuilder appendTo(final StringBuilder builder)
        {
            if (null == buffer)
            {
                return builder;
            }

            builder.append('(');
            builder.append("brokenDateGUID=");
            builder.append(this.brokenDateGUID());
            builder.append('|');
            builder.append("brokenDateSecurityID=");
            builder.append(this.brokenDateSecurityID());
            builder.append('|');
            builder.append("brokenDateStart=");
            builder.append(this.brokenDateStart());
            builder.append('|');
            builder.append("brokenDateEnd=");
            builder.append(this.brokenDateEnd());
            builder.append(')');

            return builder;
        }
        
        public NoBrokenDatesDecoder sbeSkip()
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

        final SecurityDefinitionResponse561Decoder decoder = new SecurityDefinitionResponse561Decoder();
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
        builder.append("[SecurityDefinitionResponse561](sbeTemplateId=");
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
        builder.append("financialInstrumentFullName=");
        for (int i = 0; i < financialInstrumentFullNameLength() && this.financialInstrumentFullName(i) > 0; i++)
        {
            builder.append((char)this.financialInstrumentFullName(i));
        }
        builder.append('|');
        builder.append("senderID=");
        for (int i = 0; i < senderIDLength() && this.senderID(i) > 0; i++)
        {
            builder.append((char)this.senderID(i));
        }
        builder.append('|');
        builder.append("symbol=");
        for (int i = 0; i < symbolLength() && this.symbol(i) > 0; i++)
        {
            builder.append((char)this.symbol(i));
        }
        builder.append('|');
        builder.append("partyDetailsListReqID=");
        builder.append(this.partyDetailsListReqID());
        builder.append('|');
        builder.append("securityReqID=");
        builder.append(this.securityReqID());
        builder.append('|');
        builder.append("securityResponseID=");
        builder.append(this.securityResponseID());
        builder.append('|');
        builder.append("sendingTimeEpoch=");
        builder.append(this.sendingTimeEpoch());
        builder.append('|');
        builder.append("securityGroup=");
        for (int i = 0; i < securityGroupLength() && this.securityGroup(i) > 0; i++)
        {
            builder.append((char)this.securityGroup(i));
        }
        builder.append('|');
        builder.append("securityType=");
        for (int i = 0; i < securityTypeLength() && this.securityType(i) > 0; i++)
        {
            builder.append((char)this.securityType(i));
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
        builder.append("currency=");
        for (int i = 0; i < currencyLength() && this.currency(i) > 0; i++)
        {
            builder.append((char)this.currency(i));
        }
        builder.append('|');
        builder.append("maturityMonthYear=");
        final MaturityMonthYearDecoder maturityMonthYear = this.maturityMonthYear();
        if (null != maturityMonthYear)
        {
            maturityMonthYear.appendTo(builder);
        }
        else
        {
            builder.append("null");
        }
        builder.append('|');
        builder.append("delayDuration=");
        builder.append(this.delayDuration());
        builder.append('|');
        builder.append("startDate=");
        builder.append(this.startDate());
        builder.append('|');
        builder.append("endDate=");
        builder.append(this.endDate());
        builder.append('|');
        builder.append("maxNoOfSubstitutions=");
        builder.append(this.maxNoOfSubstitutions());
        builder.append('|');
        builder.append("sourceRepoID=");
        builder.append(this.sourceRepoID());
        builder.append('|');
        builder.append("terminationType=");
        for (int i = 0; i < terminationTypeLength() && this.terminationType(i) > 0; i++)
        {
            builder.append((char)this.terminationType(i));
        }
        builder.append('|');
        builder.append("securityResponseType=");
        builder.append(this.securityResponseType());
        builder.append('|');
        builder.append("expirationCycle=");
        builder.append(this.expirationCycle());
        builder.append('|');
        builder.append("manualOrderIndicator=");
        builder.append(this.manualOrderIndicator());
        builder.append('|');
        builder.append("splitMsg=");
        builder.append(this.splitMsg());
        builder.append('|');
        builder.append("autoQuoteRequest=");
        builder.append(this.autoQuoteRequest());
        builder.append('|');
        builder.append("possRetransFlag=");
        builder.append(this.possRetransFlag());
        builder.append('|');
        builder.append("brokenDateTermType=");
        builder.append(this.brokenDateTermType());
        builder.append('|');
        builder.append("noLegs=[");
        final int noLegsOriginalOffset = noLegs.offset;
        final int noLegsOriginalIndex = noLegs.index;
        final NoLegsDecoder noLegs = this.noLegs();
        if (noLegs.count() > 0)
        {
            while (noLegs.hasNext())
            {
                noLegs.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        noLegs.offset = noLegsOriginalOffset;
        noLegs.index = noLegsOriginalIndex;
        builder.append(']');
        builder.append('|');
        builder.append("noBrokenDates=[");
        final int noBrokenDatesOriginalOffset = noBrokenDates.offset;
        final int noBrokenDatesOriginalIndex = noBrokenDates.index;
        final NoBrokenDatesDecoder noBrokenDates = this.noBrokenDates();
        if (noBrokenDates.count() > 0)
        {
            while (noBrokenDates.hasNext())
            {
                noBrokenDates.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        noBrokenDates.offset = noBrokenDatesOriginalOffset;
        noBrokenDates.index = noBrokenDatesOriginalIndex;
        builder.append(']');

        limit(originalLimit);

        return builder;
    }
    
    public SecurityDefinitionResponse561Decoder sbeSkip()
    {
        sbeRewind();
        NoLegsDecoder noLegs = this.noLegs();
        if (noLegs.count() > 0)
        {
            while (noLegs.hasNext())
            {
                noLegs.next();
                noLegs.sbeSkip();
            }
        }
        NoBrokenDatesDecoder noBrokenDates = this.noBrokenDates();
        if (noBrokenDates.count() > 0)
        {
            while (noBrokenDates.hasNext())
            {
                noBrokenDates.next();
                noBrokenDates.sbeSkip();
            }
        }

        return this;
    }
}
