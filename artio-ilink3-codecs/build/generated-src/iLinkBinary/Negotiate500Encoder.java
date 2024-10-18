/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;
import org.agrona.sbe.*;


/**
 * Negotiate
 */
@SuppressWarnings("all")
public final class Negotiate500Encoder implements MessageEncoderFlyweight
{
    public static final int BLOCK_LENGTH = 76;
    public static final int TEMPLATE_ID = 500;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final Negotiate500Encoder parentMessage = this;
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
        return "Negotiate";
    }

    public MutableDirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public Negotiate500Encoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public Negotiate500Encoder wrapAndApplyHeader(
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


    public Negotiate500Encoder hMACSignature(final int index, final byte value)
    {
        if (index < 0 || index >= 32)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 0 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String hMACSignatureCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public Negotiate500Encoder putHMACSignature(final byte[] src, final int srcOffset)
    {
        final int length = 32;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 0, src, srcOffset, length);

        return this;
    }

    public Negotiate500Encoder hMACSignature(final String src)
    {
        final int length = 32;
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

    public Negotiate500Encoder hMACSignature(final CharSequence src)
    {
        final int length = 32;
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


    public Negotiate500Encoder accessKeyID(final int index, final byte value)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 32 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String accessKeyIDCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public Negotiate500Encoder putAccessKeyID(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 32, src, srcOffset, length);

        return this;
    }

    public Negotiate500Encoder accessKeyID(final String src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 32, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 32 + start, (byte)0);
        }

        return this;
    }

    public Negotiate500Encoder accessKeyID(final CharSequence src)
    {
        final int length = 20;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 32, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 32 + start, (byte)0);
        }

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

    public Negotiate500Encoder uUID(final long value)
    {
        buffer.putLong(offset + 52, value, BYTE_ORDER);
        return this;
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

    public Negotiate500Encoder requestTimestamp(final long value)
    {
        buffer.putLong(offset + 60, value, BYTE_ORDER);
        return this;
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


    public Negotiate500Encoder session(final int index, final byte value)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 68 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }
    public Negotiate500Encoder putSession(final byte value0, final byte value1, final byte value2)
    {
        buffer.putByte(offset + 68, value0);
        buffer.putByte(offset + 69, value1);
        buffer.putByte(offset + 70, value2);

        return this;
    }

    public static String sessionCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public Negotiate500Encoder putSession(final byte[] src, final int srcOffset)
    {
        final int length = 3;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 68, src, srcOffset, length);

        return this;
    }

    public Negotiate500Encoder session(final String src)
    {
        final int length = 3;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 68, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 68 + start, (byte)0);
        }

        return this;
    }

    public Negotiate500Encoder session(final CharSequence src)
    {
        final int length = 3;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 68, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 68 + start, (byte)0);
        }

        return this;
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


    public Negotiate500Encoder firm(final int index, final byte value)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 71 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String firmCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public Negotiate500Encoder putFirm(final byte[] src, final int srcOffset)
    {
        final int length = 5;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 71, src, srcOffset, length);

        return this;
    }

    public Negotiate500Encoder firm(final String src)
    {
        final int length = 5;
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

    public Negotiate500Encoder firm(final CharSequence src)
    {
        final int length = 5;
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

    public static int credentialsId()
    {
        return 39008;
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

    public Negotiate500Encoder putCredentials(final DirectBuffer src, final int srcOffset, final int length)
    {
        if (length > 65534)
        {
            throw new IllegalStateException("length > maxValue for type: " + length);
        }

        final int headerLength = 2;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + headerLength + length);
        buffer.putShort(limit, (short)length, BYTE_ORDER);
        buffer.putBytes(limit + headerLength, src, srcOffset, length);

        return this;
    }

    public Negotiate500Encoder putCredentials(final byte[] src, final int srcOffset, final int length)
    {
        if (length > 65534)
        {
            throw new IllegalStateException("length > maxValue for type: " + length);
        }

        final int headerLength = 2;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + headerLength + length);
        buffer.putShort(limit, (short)length, BYTE_ORDER);
        buffer.putBytes(limit + headerLength, src, srcOffset, length);

        return this;
    }

    public Negotiate500Encoder credentials(final String value)
    {
        final int length = null == value ? 0 : value.length();
        if (length > 65534)
        {
            throw new IllegalStateException("length > maxValue for type: " + length);
        }

        final int headerLength = 2;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + headerLength + length);
        buffer.putShort(limit, (short)length, BYTE_ORDER);
        buffer.putStringWithoutLengthAscii(limit + headerLength, value);

        return this;
    }

    public Negotiate500Encoder credentials(final CharSequence value)
    {
        final int length = null == value ? 0 : value.length();
        if (length > 65534)
        {
            throw new IllegalStateException("length > maxValue for type: " + length);
        }

        final int headerLength = 2;
        final int limit = parentMessage.limit();
        parentMessage.limit(limit + headerLength + length);
        buffer.putShort(limit, (short)length, BYTE_ORDER);
        buffer.putStringWithoutLengthAscii(limit + headerLength, value);

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

        final Negotiate500Decoder decoder = new Negotiate500Decoder();
        decoder.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return decoder.appendTo(builder);
    }
}
