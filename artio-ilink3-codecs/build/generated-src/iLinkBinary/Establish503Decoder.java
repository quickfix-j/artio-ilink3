/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;
import org.agrona.sbe.*;


/**
 * Establish
 */
@SuppressWarnings("all")
public final class Establish503Decoder implements MessageDecoderFlyweight
{
    public static final int BLOCK_LENGTH = 132;
    public static final int TEMPLATE_ID = 503;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final Establish503Decoder parentMessage = this;
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
        return "Establish";
    }

    public DirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public Establish503Decoder wrap(
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

    public Establish503Decoder wrapAndApplyHeader(
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

    public Establish503Decoder sbeRewind()
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

    public static int hMACVersionId()
    {
        return 39003;
    }

    public static int hMACVersionSinceVersion()
    {
        return 0;
    }

    public static int hMACVersionEncodingOffset()
    {
        return 0;
    }

    public static int hMACVersionEncodingLength()
    {
        return 0;
    }

    public static String hMACVersionMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "constant";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "String";
        }

        return "";
    }

    public static byte hMACVersionNullValue()
    {
        return (byte)0;
    }

    public static byte hMACVersionMinValue()
    {
        return (byte)32;
    }

    public static byte hMACVersionMaxValue()
    {
        return (byte)126;
    }


    private static final byte[] HMACVERSION_VALUE = { 67, 77, 69, 45, 49, 45, 83, 72, 65, 45, 50, 53, 54 };

    public static int hMACVersionLength()
    {
        return 13;
    }


    public byte hMACVersion(final int index)
    {
        return HMACVERSION_VALUE[index];
    }

    public int getHMACVersion(final byte[] dst, final int offset, final int length)
    {
        final int bytesCopied = Math.min(length, 13);
        System.arraycopy(HMACVERSION_VALUE, 0, dst, offset, bytesCopied);

        return bytesCopied;
    }

    public String hMACVersion()
    {
        return "CME-1-SHA-256";
    }


    public static int hMACSignatureId()
    {
        return 39005;
    }

    public static int hMACSignatureSinceVersion()
    {
        return 0;
    }

    public static int hMACSignatureEncodingOffset()
    {
        return 0;
    }

    public static int hMACSignatureEncodingLength()
    {
        return 32;
    }

    public static String hMACSignatureMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte hMACSignatureNullValue()
    {
        return (byte)0;
    }

    public static byte hMACSignatureMinValue()
    {
        return (byte)32;
    }

    public static byte hMACSignatureMaxValue()
    {
        return (byte)126;
    }

    public static int hMACSignatureLength()
    {
        return 32;
    }


    public byte hMACSignature(final int index)
    {
        if (index < 0 || index >= 32)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 0 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String hMACSignatureCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getHMACSignature(final byte[] dst, final int dstOffset)
    {
        final int length = 32;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 0, dst, dstOffset, length);

        return length;
    }

    public String hMACSignature()
    {
        final byte[] dst = new byte[32];
        buffer.getBytes(offset + 0, dst, 0, 32);

        int end = 0;
        for (; end < 32 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getHMACSignature(final Appendable value)
    {
        for (int i = 0; i < 32; ++i)
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

        return 32;
    }


    public static int accessKeyIDId()
    {
        return 39004;
    }

    public static int accessKeyIDSinceVersion()
    {
        return 0;
    }

    public static int accessKeyIDEncodingOffset()
    {
        return 32;
    }

    public static int accessKeyIDEncodingLength()
    {
        return 20;
    }

    public static String accessKeyIDMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte accessKeyIDNullValue()
    {
        return (byte)0;
    }

    public static byte accessKeyIDMinValue()
    {
        return (byte)32;
    }

    public static byte accessKeyIDMaxValue()
    {
        return (byte)126;
    }

    public static int accessKeyIDLength()
    {
        return 20;
    }


    public byte accessKeyID(final int index)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 32 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String accessKeyIDCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getAccessKeyID(final byte[] dst, final int dstOffset)
    {
        final int length = 20;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 32, dst, dstOffset, length);

        return length;
    }

    public String accessKeyID()
    {
        final byte[] dst = new byte[20];
        buffer.getBytes(offset + 32, dst, 0, 20);

        int end = 0;
        for (; end < 20 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getAccessKeyID(final Appendable value)
    {
        for (int i = 0; i < 20; ++i)
        {
            final int c = buffer.getByte(offset + 32 + i) & 0xFF;
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


    public static int tradingSystemNameId()
    {
        return 1603;
    }

    public static int tradingSystemNameSinceVersion()
    {
        return 0;
    }

    public static int tradingSystemNameEncodingOffset()
    {
        return 52;
    }

    public static int tradingSystemNameEncodingLength()
    {
        return 30;
    }

    public static String tradingSystemNameMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte tradingSystemNameNullValue()
    {
        return (byte)0;
    }

    public static byte tradingSystemNameMinValue()
    {
        return (byte)32;
    }

    public static byte tradingSystemNameMaxValue()
    {
        return (byte)126;
    }

    public static int tradingSystemNameLength()
    {
        return 30;
    }


    public byte tradingSystemName(final int index)
    {
        if (index < 0 || index >= 30)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 52 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String tradingSystemNameCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getTradingSystemName(final byte[] dst, final int dstOffset)
    {
        final int length = 30;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 52, dst, dstOffset, length);

        return length;
    }

    public String tradingSystemName()
    {
        final byte[] dst = new byte[30];
        buffer.getBytes(offset + 52, dst, 0, 30);

        int end = 0;
        for (; end < 30 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getTradingSystemName(final Appendable value)
    {
        for (int i = 0; i < 30; ++i)
        {
            final int c = buffer.getByte(offset + 52 + i) & 0xFF;
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

        return 30;
    }


    public static int tradingSystemVersionId()
    {
        return 1604;
    }

    public static int tradingSystemVersionSinceVersion()
    {
        return 0;
    }

    public static int tradingSystemVersionEncodingOffset()
    {
        return 82;
    }

    public static int tradingSystemVersionEncodingLength()
    {
        return 10;
    }

    public static String tradingSystemVersionMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte tradingSystemVersionNullValue()
    {
        return (byte)0;
    }

    public static byte tradingSystemVersionMinValue()
    {
        return (byte)32;
    }

    public static byte tradingSystemVersionMaxValue()
    {
        return (byte)126;
    }

    public static int tradingSystemVersionLength()
    {
        return 10;
    }


    public byte tradingSystemVersion(final int index)
    {
        if (index < 0 || index >= 10)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 82 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String tradingSystemVersionCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getTradingSystemVersion(final byte[] dst, final int dstOffset)
    {
        final int length = 10;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 82, dst, dstOffset, length);

        return length;
    }

    public String tradingSystemVersion()
    {
        final byte[] dst = new byte[10];
        buffer.getBytes(offset + 82, dst, 0, 10);

        int end = 0;
        for (; end < 10 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getTradingSystemVersion(final Appendable value)
    {
        for (int i = 0; i < 10; ++i)
        {
            final int c = buffer.getByte(offset + 82 + i) & 0xFF;
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

        return 10;
    }


    public static int tradingSystemVendorId()
    {
        return 1605;
    }

    public static int tradingSystemVendorSinceVersion()
    {
        return 0;
    }

    public static int tradingSystemVendorEncodingOffset()
    {
        return 92;
    }

    public static int tradingSystemVendorEncodingLength()
    {
        return 10;
    }

    public static String tradingSystemVendorMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte tradingSystemVendorNullValue()
    {
        return (byte)0;
    }

    public static byte tradingSystemVendorMinValue()
    {
        return (byte)32;
    }

    public static byte tradingSystemVendorMaxValue()
    {
        return (byte)126;
    }

    public static int tradingSystemVendorLength()
    {
        return 10;
    }


    public byte tradingSystemVendor(final int index)
    {
        if (index < 0 || index >= 10)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 92 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String tradingSystemVendorCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getTradingSystemVendor(final byte[] dst, final int dstOffset)
    {
        final int length = 10;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 92, dst, dstOffset, length);

        return length;
    }

    public String tradingSystemVendor()
    {
        final byte[] dst = new byte[10];
        buffer.getBytes(offset + 92, dst, 0, 10);

        int end = 0;
        for (; end < 10 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getTradingSystemVendor(final Appendable value)
    {
        for (int i = 0; i < 10; ++i)
        {
            final int c = buffer.getByte(offset + 92 + i) & 0xFF;
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

        return 10;
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
        return 102;
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
        return buffer.getLong(offset + 102, BYTE_ORDER);
    }


    public static int requestTimestampId()
    {
        return 39002;
    }

    public static int requestTimestampSinceVersion()
    {
        return 0;
    }

    public static int requestTimestampEncodingOffset()
    {
        return 110;
    }

    public static int requestTimestampEncodingLength()
    {
        return 8;
    }

    public static String requestTimestampMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long requestTimestampNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long requestTimestampMinValue()
    {
        return 0x0L;
    }

    public static long requestTimestampMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public long requestTimestamp()
    {
        return buffer.getLong(offset + 110, BYTE_ORDER);
    }


    public static int nextSeqNoId()
    {
        return 39013;
    }

    public static int nextSeqNoSinceVersion()
    {
        return 0;
    }

    public static int nextSeqNoEncodingOffset()
    {
        return 118;
    }

    public static int nextSeqNoEncodingLength()
    {
        return 4;
    }

    public static String nextSeqNoMetaAttribute(final MetaAttribute metaAttribute)
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

    public static long nextSeqNoNullValue()
    {
        return 4294967295L;
    }

    public static long nextSeqNoMinValue()
    {
        return 0L;
    }

    public static long nextSeqNoMaxValue()
    {
        return 4294967294L;
    }

    public long nextSeqNo()
    {
        return (buffer.getInt(offset + 118, BYTE_ORDER) & 0xFFFF_FFFFL);
    }


    public static int sessionId()
    {
        return 39006;
    }

    public static int sessionSinceVersion()
    {
        return 0;
    }

    public static int sessionEncodingOffset()
    {
        return 122;
    }

    public static int sessionEncodingLength()
    {
        return 3;
    }

    public static String sessionMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte sessionNullValue()
    {
        return (byte)0;
    }

    public static byte sessionMinValue()
    {
        return (byte)32;
    }

    public static byte sessionMaxValue()
    {
        return (byte)126;
    }

    public static int sessionLength()
    {
        return 3;
    }


    public byte session(final int index)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 122 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String sessionCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getSession(final byte[] dst, final int dstOffset)
    {
        final int length = 3;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 122, dst, dstOffset, length);

        return length;
    }

    public String session()
    {
        final byte[] dst = new byte[3];
        buffer.getBytes(offset + 122, dst, 0, 3);

        int end = 0;
        for (; end < 3 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getSession(final Appendable value)
    {
        for (int i = 0; i < 3; ++i)
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

        return 3;
    }


    public static int firmId()
    {
        return 39007;
    }

    public static int firmSinceVersion()
    {
        return 0;
    }

    public static int firmEncodingOffset()
    {
        return 125;
    }

    public static int firmEncodingLength()
    {
        return 5;
    }

    public static String firmMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte firmNullValue()
    {
        return (byte)0;
    }

    public static byte firmMinValue()
    {
        return (byte)32;
    }

    public static byte firmMaxValue()
    {
        return (byte)126;
    }

    public static int firmLength()
    {
        return 5;
    }


    public byte firm(final int index)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 125 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String firmCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getFirm(final byte[] dst, final int dstOffset)
    {
        final int length = 5;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 125, dst, dstOffset, length);

        return length;
    }

    public String firm()
    {
        final byte[] dst = new byte[5];
        buffer.getBytes(offset + 125, dst, 0, 5);

        int end = 0;
        for (; end < 5 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getFirm(final Appendable value)
    {
        for (int i = 0; i < 5; ++i)
        {
            final int c = buffer.getByte(offset + 125 + i) & 0xFF;
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


    public static int keepAliveIntervalId()
    {
        return 39014;
    }

    public static int keepAliveIntervalSinceVersion()
    {
        return 0;
    }

    public static int keepAliveIntervalEncodingOffset()
    {
        return 130;
    }

    public static int keepAliveIntervalEncodingLength()
    {
        return 2;
    }

    public static String keepAliveIntervalMetaAttribute(final MetaAttribute metaAttribute)
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

    public static int keepAliveIntervalNullValue()
    {
        return 65535;
    }

    public static int keepAliveIntervalMinValue()
    {
        return 0;
    }

    public static int keepAliveIntervalMaxValue()
    {
        return 65534;
    }

    public int keepAliveInterval()
    {
        return (buffer.getShort(offset + 130, BYTE_ORDER) & 0xFFFF);
    }


    public static int credentialsId()
    {
        return 39008;
    }

    public static int credentialsSinceVersion()
    {
        return 0;
    }

    public static String credentialsCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public static String credentialsMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }
        if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
        {
            return "data";
        }

        return "";
    }

    public static int credentialsHeaderLength()
    {
        return 2;
    }

    public int credentialsLength()
    {
        final int limit = parentMessage.limit();
        return (buffer.getShort(limit, BYTE_ORDER) & 0xFFFF);
    }

    public int skipCredentials()
    {
        final int headerLength = 2;
        final int limit = parentMessage.limit();
        final int dataLength = (buffer.getShort(limit, BYTE_ORDER) & 0xFFFF);
        final int dataOffset = limit + headerLength;
        parentMessage.limit(dataOffset + dataLength);

        return dataLength;
    }

    public int getCredentials(final MutableDirectBuffer dst, final int dstOffset, final int length)
    {
        final int headerLength = 2;
        final int limit = parentMessage.limit();
        final int dataLength = (buffer.getShort(limit, BYTE_ORDER) & 0xFFFF);
        final int bytesCopied = Math.min(length, dataLength);
        parentMessage.limit(limit + headerLength + dataLength);
        buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

        return bytesCopied;
    }

    public int getCredentials(final byte[] dst, final int dstOffset, final int length)
    {
        final int headerLength = 2;
        final int limit = parentMessage.limit();
        final int dataLength = (buffer.getShort(limit, BYTE_ORDER) & 0xFFFF);
        final int bytesCopied = Math.min(length, dataLength);
        parentMessage.limit(limit + headerLength + dataLength);
        buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

        return bytesCopied;
    }

    public void wrapCredentials(final DirectBuffer wrapBuffer)
    {
        final int headerLength = 2;
        final int limit = parentMessage.limit();
        final int dataLength = (buffer.getShort(limit, BYTE_ORDER) & 0xFFFF);
        parentMessage.limit(limit + headerLength + dataLength);
        wrapBuffer.wrap(buffer, limit + headerLength, dataLength);
    }

    public String credentials()
    {
        final int headerLength = 2;
        final int limit = parentMessage.limit();
        final int dataLength = (buffer.getShort(limit, BYTE_ORDER) & 0xFFFF);
        parentMessage.limit(limit + headerLength + dataLength);

        if (0 == dataLength)
        {
            return "";
        }

        final byte[] tmp = new byte[dataLength];
        buffer.getBytes(limit + headerLength, tmp, 0, dataLength);

        return new String(tmp, java.nio.charset.StandardCharsets.US_ASCII);
    }

    public int getCredentials(final Appendable appendable)
    {
        final int headerLength = 2;
        final int limit = parentMessage.limit();
        final int dataLength = (buffer.getShort(limit, BYTE_ORDER) & 0xFFFF);
        final int dataOffset = limit + headerLength;

        parentMessage.limit(dataOffset + dataLength);
        buffer.getStringWithoutLengthAscii(dataOffset, dataLength, appendable);

        return dataLength;
    }

    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        final Establish503Decoder decoder = new Establish503Decoder();
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
        builder.append("[Establish503](sbeTemplateId=");
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
        builder.append("hMACSignature=");
        for (int i = 0; i < hMACSignatureLength() && this.hMACSignature(i) > 0; i++)
        {
            builder.append((char)this.hMACSignature(i));
        }
        builder.append('|');
        builder.append("accessKeyID=");
        for (int i = 0; i < accessKeyIDLength() && this.accessKeyID(i) > 0; i++)
        {
            builder.append((char)this.accessKeyID(i));
        }
        builder.append('|');
        builder.append("tradingSystemName=");
        for (int i = 0; i < tradingSystemNameLength() && this.tradingSystemName(i) > 0; i++)
        {
            builder.append((char)this.tradingSystemName(i));
        }
        builder.append('|');
        builder.append("tradingSystemVersion=");
        for (int i = 0; i < tradingSystemVersionLength() && this.tradingSystemVersion(i) > 0; i++)
        {
            builder.append((char)this.tradingSystemVersion(i));
        }
        builder.append('|');
        builder.append("tradingSystemVendor=");
        for (int i = 0; i < tradingSystemVendorLength() && this.tradingSystemVendor(i) > 0; i++)
        {
            builder.append((char)this.tradingSystemVendor(i));
        }
        builder.append('|');
        builder.append("uUID=");
        builder.append(this.uUID());
        builder.append('|');
        builder.append("requestTimestamp=");
        builder.append(this.requestTimestamp());
        builder.append('|');
        builder.append("nextSeqNo=");
        builder.append(this.nextSeqNo());
        builder.append('|');
        builder.append("session=");
        for (int i = 0; i < sessionLength() && this.session(i) > 0; i++)
        {
            builder.append((char)this.session(i));
        }
        builder.append('|');
        builder.append("firm=");
        for (int i = 0; i < firmLength() && this.firm(i) > 0; i++)
        {
            builder.append((char)this.firm(i));
        }
        builder.append('|');
        builder.append("keepAliveInterval=");
        builder.append(this.keepAliveInterval());
        builder.append('|');
        builder.append("credentials=");
        builder.append('\'');
        getCredentials(builder);
        builder.append('\'');

        limit(originalLimit);

        return builder;
    }
    
    public Establish503Decoder sbeSkip()
    {
        sbeRewind();
        skipCredentials();

        return this;
    }
}
