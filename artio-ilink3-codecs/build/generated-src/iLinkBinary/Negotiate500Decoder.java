/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;
import org.agrona.sbe.*;


/**
 * Negotiate
 */
@SuppressWarnings("all")
public final class Negotiate500Decoder implements MessageDecoderFlyweight
{
    public static final int BLOCK_LENGTH = 76;
    public static final int TEMPLATE_ID = 500;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final Negotiate500Decoder parentMessage = this;
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
        return "Negotiate";
    }

    public DirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public Negotiate500Decoder wrap(
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

    public Negotiate500Decoder wrapAndApplyHeader(
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

    public Negotiate500Decoder sbeRewind()
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

    public static int customerFlowId()
    {
        return 39000;
    }

    public static int customerFlowSinceVersion()
    {
        return 0;
    }

    public static int customerFlowEncodingOffset()
    {
        return 0;
    }

    public static int customerFlowEncodingLength()
    {
        return 0;
    }

    public static String customerFlowMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte customerFlowNullValue()
    {
        return (byte)0;
    }

    public static byte customerFlowMinValue()
    {
        return (byte)32;
    }

    public static byte customerFlowMaxValue()
    {
        return (byte)126;
    }


    private static final byte[] CUSTOMERFLOW_VALUE = { 73, 68, 69, 77, 80, 79, 84, 69, 78, 84 };

    public static int customerFlowLength()
    {
        return 10;
    }


    public byte customerFlow(final int index)
    {
        return CUSTOMERFLOW_VALUE[index];
    }

    public int getCustomerFlow(final byte[] dst, final int offset, final int length)
    {
        final int bytesCopied = Math.min(length, 10);
        System.arraycopy(CUSTOMERFLOW_VALUE, 0, dst, offset, bytesCopied);

        return bytesCopied;
    }

    public String customerFlow()
    {
        return "IDEMPOTENT";
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
        return 52;
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
        return buffer.getLong(offset + 52, BYTE_ORDER);
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
        return 60;
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
        return buffer.getLong(offset + 60, BYTE_ORDER);
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
        return 68;
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

        final int pos = offset + 68 + (index * 1);

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

        buffer.getBytes(offset + 68, dst, dstOffset, length);

        return length;
    }

    public String session()
    {
        final byte[] dst = new byte[3];
        buffer.getBytes(offset + 68, dst, 0, 3);

        int end = 0;
        for (; end < 3 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getSession(final Appendable value)
    {
        for (int i = 0; i < 3; ++i)
        {
            final int c = buffer.getByte(offset + 68 + i) & 0xFF;
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
        return 71;
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

        final int pos = offset + 71 + (index * 1);

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

        buffer.getBytes(offset + 71, dst, dstOffset, length);

        return length;
    }

    public String firm()
    {
        final byte[] dst = new byte[5];
        buffer.getBytes(offset + 71, dst, 0, 5);

        int end = 0;
        for (; end < 5 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getFirm(final Appendable value)
    {
        for (int i = 0; i < 5; ++i)
        {
            final int c = buffer.getByte(offset + 71 + i) & 0xFF;
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

        final Negotiate500Decoder decoder = new Negotiate500Decoder();
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
        builder.append("[Negotiate500](sbeTemplateId=");
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
        builder.append("uUID=");
        builder.append(this.uUID());
        builder.append('|');
        builder.append("requestTimestamp=");
        builder.append(this.requestTimestamp());
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
        builder.append("credentials=");
        builder.append('\'');
        getCredentials(builder);
        builder.append('\'');

        limit(originalLimit);

        return builder;
    }
    
    public Negotiate500Decoder sbeSkip()
    {
        sbeRewind();
        skipCredentials();

        return this;
    }
}
