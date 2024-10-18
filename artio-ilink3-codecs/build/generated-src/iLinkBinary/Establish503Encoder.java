/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;
import org.agrona.sbe.*;


/**
 * Establish
 */
@SuppressWarnings("all")
public final class Establish503Encoder implements MessageEncoderFlyweight
{
    public static final int BLOCK_LENGTH = 132;
    public static final int TEMPLATE_ID = 503;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final Establish503Encoder parentMessage = this;
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
        return "Establish";
    }

    public MutableDirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public Establish503Encoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public Establish503Encoder wrapAndApplyHeader(
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


    public Establish503Encoder hMACSignature(final int index, final byte value)
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

    public Establish503Encoder putHMACSignature(final byte[] src, final int srcOffset)
    {
        final int length = 32;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 0, src, srcOffset, length);

        return this;
    }

    public Establish503Encoder hMACSignature(final String src)
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

    public Establish503Encoder hMACSignature(final CharSequence src)
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


    public Establish503Encoder accessKeyID(final int index, final byte value)
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

    public Establish503Encoder putAccessKeyID(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 32, src, srcOffset, length);

        return this;
    }

    public Establish503Encoder accessKeyID(final String src)
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

    public Establish503Encoder accessKeyID(final CharSequence src)
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


    public Establish503Encoder tradingSystemName(final int index, final byte value)
    {
        if (index < 0 || index >= 30)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 52 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String tradingSystemNameCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public Establish503Encoder putTradingSystemName(final byte[] src, final int srcOffset)
    {
        final int length = 30;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 52, src, srcOffset, length);

        return this;
    }

    public Establish503Encoder tradingSystemName(final String src)
    {
        final int length = 30;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 52, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 52 + start, (byte)0);
        }

        return this;
    }

    public Establish503Encoder tradingSystemName(final CharSequence src)
    {
        final int length = 30;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 52, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 52 + start, (byte)0);
        }

        return this;
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


    public Establish503Encoder tradingSystemVersion(final int index, final byte value)
    {
        if (index < 0 || index >= 10)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 82 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String tradingSystemVersionCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public Establish503Encoder putTradingSystemVersion(final byte[] src, final int srcOffset)
    {
        final int length = 10;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 82, src, srcOffset, length);

        return this;
    }

    public Establish503Encoder tradingSystemVersion(final String src)
    {
        final int length = 10;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 82, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 82 + start, (byte)0);
        }

        return this;
    }

    public Establish503Encoder tradingSystemVersion(final CharSequence src)
    {
        final int length = 10;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 82, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 82 + start, (byte)0);
        }

        return this;
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


    public Establish503Encoder tradingSystemVendor(final int index, final byte value)
    {
        if (index < 0 || index >= 10)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 92 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String tradingSystemVendorCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public Establish503Encoder putTradingSystemVendor(final byte[] src, final int srcOffset)
    {
        final int length = 10;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 92, src, srcOffset, length);

        return this;
    }

    public Establish503Encoder tradingSystemVendor(final String src)
    {
        final int length = 10;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 92, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 92 + start, (byte)0);
        }

        return this;
    }

    public Establish503Encoder tradingSystemVendor(final CharSequence src)
    {
        final int length = 10;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 92, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 92 + start, (byte)0);
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

    public Establish503Encoder uUID(final long value)
    {
        buffer.putLong(offset + 102, value, BYTE_ORDER);
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

    public Establish503Encoder requestTimestamp(final long value)
    {
        buffer.putLong(offset + 110, value, BYTE_ORDER);
        return this;
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

    public Establish503Encoder nextSeqNo(final long value)
    {
        buffer.putInt(offset + 118, (int)value, BYTE_ORDER);
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


    public Establish503Encoder session(final int index, final byte value)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 122 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }
    public Establish503Encoder putSession(final byte value0, final byte value1, final byte value2)
    {
        buffer.putByte(offset + 122, value0);
        buffer.putByte(offset + 123, value1);
        buffer.putByte(offset + 124, value2);

        return this;
    }

    public static String sessionCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public Establish503Encoder putSession(final byte[] src, final int srcOffset)
    {
        final int length = 3;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 122, src, srcOffset, length);

        return this;
    }

    public Establish503Encoder session(final String src)
    {
        final int length = 3;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 122, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 122 + start, (byte)0);
        }

        return this;
    }

    public Establish503Encoder session(final CharSequence src)
    {
        final int length = 3;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 122, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 122 + start, (byte)0);
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


    public Establish503Encoder firm(final int index, final byte value)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 125 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String firmCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public Establish503Encoder putFirm(final byte[] src, final int srcOffset)
    {
        final int length = 5;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 125, src, srcOffset, length);

        return this;
    }

    public Establish503Encoder firm(final String src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 125, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 125 + start, (byte)0);
        }

        return this;
    }

    public Establish503Encoder firm(final CharSequence src)
    {
        final int length = 5;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 125, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 125 + start, (byte)0);
        }

        return this;
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

    public Establish503Encoder keepAliveInterval(final int value)
    {
        buffer.putShort(offset + 130, (short)value, BYTE_ORDER);
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

    public Establish503Encoder putCredentials(final DirectBuffer src, final int srcOffset, final int length)
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

    public Establish503Encoder putCredentials(final byte[] src, final int srcOffset, final int length)
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

    public Establish503Encoder credentials(final String value)
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

    public Establish503Encoder credentials(final CharSequence value)
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

        final Establish503Decoder decoder = new Establish503Decoder();
        decoder.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return decoder.appendTo(builder);
    }
}
