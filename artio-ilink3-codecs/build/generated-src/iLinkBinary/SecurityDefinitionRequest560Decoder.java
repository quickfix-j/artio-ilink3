/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.DirectBuffer;
import org.agrona.sbe.*;


/**
 * SecurityDefinitionRequest
 */
@SuppressWarnings("all")
public final class SecurityDefinitionRequest560Decoder implements MessageDecoderFlyweight
{
    public static final int BLOCK_LENGTH = 72;
    public static final int TEMPLATE_ID = 560;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final SecurityDefinitionRequest560Decoder parentMessage = this;
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
        return "c";
    }

    public DirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public SecurityDefinitionRequest560Decoder wrap(
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

    public SecurityDefinitionRequest560Decoder wrapAndApplyHeader(
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

    public SecurityDefinitionRequest560Decoder sbeRewind()
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

    public long partyDetailsListReqID()
    {
        return buffer.getLong(offset + 0, BYTE_ORDER);
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
        return 8;
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
        return buffer.getLong(offset + 8, BYTE_ORDER);
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

    public short manualOrderIndicatorRaw()
    {
        return ((short)(buffer.getByte(offset + 16) & 0xFF));
    }

    public ManualOrdIndReq manualOrderIndicator()
    {
        return ManualOrdIndReq.get(((short)(buffer.getByte(offset + 16) & 0xFF)));
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

    public long seqNum()
    {
        return (buffer.getInt(offset + 17, BYTE_ORDER) & 0xFFFF_FFFFL);
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
            return "optional";
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

        final int pos = offset + 21 + (index * 1);

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

        buffer.getBytes(offset + 21, dst, dstOffset, length);

        return length;
    }

    public String senderID()
    {
        final byte[] dst = new byte[20];
        buffer.getBytes(offset + 21, dst, 0, 20);

        int end = 0;
        for (; end < 20 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getSenderID(final Appendable value)
    {
        for (int i = 0; i < 20; ++i)
        {
            final int c = buffer.getByte(offset + 21 + i) & 0xFF;
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


    public static int securityReqTypeId()
    {
        return 321;
    }

    public static int securityReqTypeSinceVersion()
    {
        return 0;
    }

    public static int securityReqTypeEncodingOffset()
    {
        return 41;
    }

    public static int securityReqTypeEncodingLength()
    {
        return 0;
    }

    public static String securityReqTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte securityReqTypeNullValue()
    {
        return (byte)0;
    }

    public static byte securityReqTypeMinValue()
    {
        return (byte)32;
    }

    public static byte securityReqTypeMaxValue()
    {
        return (byte)126;
    }


    private static final byte[] SECURITYREQTYPE_VALUE = { 49 };

    public static int securityReqTypeLength()
    {
        return 1;
    }


    public byte securityReqType(final int index)
    {
        return SECURITYREQTYPE_VALUE[index];
    }

    public int getSecurityReqType(final byte[] dst, final int offset, final int length)
    {
        final int bytesCopied = Math.min(length, 1);
        System.arraycopy(SECURITYREQTYPE_VALUE, 0, dst, offset, bytesCopied);

        return bytesCopied;
    }

    public byte securityReqType()
    {
        return (byte)49;
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

    public long sendingTimeEpoch()
    {
        return buffer.getLong(offset + 41, BYTE_ORDER);
    }


    public static int securitySubTypeId()
    {
        return 762;
    }

    public static int securitySubTypeSinceVersion()
    {
        return 0;
    }

    public static int securitySubTypeEncodingOffset()
    {
        return 49;
    }

    public static int securitySubTypeEncodingLength()
    {
        return 8;
    }

    public static String securitySubTypeMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte securitySubTypeNullValue()
    {
        return (byte)0;
    }

    public static byte securitySubTypeMinValue()
    {
        return (byte)32;
    }

    public static byte securitySubTypeMaxValue()
    {
        return (byte)126;
    }

    public static int securitySubTypeLength()
    {
        return 8;
    }


    public byte securitySubType(final int index)
    {
        if (index < 0 || index >= 8)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 49 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String securitySubTypeCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getSecuritySubType(final byte[] dst, final int dstOffset)
    {
        final int length = 8;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 49, dst, dstOffset, length);

        return length;
    }

    public String securitySubType()
    {
        final byte[] dst = new byte[8];
        buffer.getBytes(offset + 49, dst, 0, 8);

        int end = 0;
        for (; end < 8 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getSecuritySubType(final Appendable value)
    {
        for (int i = 0; i < 8; ++i)
        {
            final int c = buffer.getByte(offset + 49 + i) & 0xFF;
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
        return 57;
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

        final int pos = offset + 57 + (index * 1);

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

        buffer.getBytes(offset + 57, dst, dstOffset, length);

        return length;
    }

    public String location()
    {
        final byte[] dst = new byte[5];
        buffer.getBytes(offset + 57, dst, 0, 5);

        int end = 0;
        for (; end < 5 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getLocation(final Appendable value)
    {
        for (int i = 0; i < 5; ++i)
        {
            final int c = buffer.getByte(offset + 57 + i) & 0xFF;
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
        return 62;
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
        return (buffer.getShort(offset + 62, BYTE_ORDER) & 0xFFFF);
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
        return 64;
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
        return (buffer.getShort(offset + 64, BYTE_ORDER) & 0xFFFF);
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
        return 66;
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
        return ((short)(buffer.getByte(offset + 66) & 0xFF));
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
        return 67;
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
        return buffer.getInt(offset + 67, BYTE_ORDER);
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
        return 71;
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

        return ((short)(buffer.getByte(offset + 71) & 0xFF));
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
     * Up to 26 legs (i.e., repeating groups) supported for UDS for options. Up to 40 legs (i.e., repeating groups) supported for UDS for futures. Will be set to 0 for REPO
     *
     * @return NoLegsDecoder : Up to 26 legs (i.e., repeating groups) supported for UDS for options. Up to 40 legs (i.e., repeating groups) supported for UDS for futures. Will be set to 0 for REPO
     */
    public NoLegsDecoder noLegs()
    {
        noLegs.wrap(buffer);
        return noLegs;
    }

    /**
     * Up to 26 legs (i.e., repeating groups) supported for UDS for options. Up to 40 legs (i.e., repeating groups) supported for UDS for futures. Will be set to 0 for REPO
     */

    public static final class NoLegsDecoder
        implements Iterable<NoLegsDecoder>, java.util.Iterator<NoLegsDecoder>
    {
        public static final int HEADER_SIZE = 3;
        private final SecurityDefinitionRequest560Decoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        NoLegsDecoder(final SecurityDefinitionRequest560Decoder parentMessage)
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
            return 0;
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
         * Price of the futures contract as part of UDS Covered 
         *
         * @return PRICENULL9Decoder : Price of the futures contract as part of UDS Covered 
         */
        public PRICENULL9Decoder legPrice()
        {
            legPrice.wrap(buffer, offset + 0);
            return legPrice;
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
            return 8;
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
            return buffer.getInt(offset + 8, BYTE_ORDER);
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
            return 12;
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
         * Delta used to calculate the quantity of futures used to cover the option or option strategy.
         *
         * @return Decimal32NULLDecoder : Delta used to calculate the quantity of futures used to cover the option or option strategy.
         */
        public Decimal32NULLDecoder legOptionDelta()
        {
            legOptionDelta.wrap(buffer, offset + 12);
            return legOptionDelta;
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
            builder.append("legSecurityID=");
            builder.append(this.legSecurityID());
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
        private final SecurityDefinitionRequest560Decoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        NoBrokenDatesDecoder(final SecurityDefinitionRequest560Decoder parentMessage)
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
            return 4;
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
            return 0;
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
            return (buffer.getShort(offset + 0, BYTE_ORDER) & 0xFFFF);
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
            return 2;
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
            return (buffer.getShort(offset + 2, BYTE_ORDER) & 0xFFFF);
        }


        public StringBuilder appendTo(final StringBuilder builder)
        {
            if (null == buffer)
            {
                return builder;
            }

            builder.append('(');
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

        final SecurityDefinitionRequest560Decoder decoder = new SecurityDefinitionRequest560Decoder();
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
        builder.append("[SecurityDefinitionRequest560](sbeTemplateId=");
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
        builder.append("partyDetailsListReqID=");
        builder.append(this.partyDetailsListReqID());
        builder.append('|');
        builder.append("securityReqID=");
        builder.append(this.securityReqID());
        builder.append('|');
        builder.append("manualOrderIndicator=");
        builder.append(this.manualOrderIndicator());
        builder.append('|');
        builder.append("seqNum=");
        builder.append(this.seqNum());
        builder.append('|');
        builder.append("senderID=");
        for (int i = 0; i < senderIDLength() && this.senderID(i) > 0; i++)
        {
            builder.append((char)this.senderID(i));
        }
        builder.append('|');
        builder.append("sendingTimeEpoch=");
        builder.append(this.sendingTimeEpoch());
        builder.append('|');
        builder.append("securitySubType=");
        for (int i = 0; i < securitySubTypeLength() && this.securitySubType(i) > 0; i++)
        {
            builder.append((char)this.securitySubType(i));
        }
        builder.append('|');
        builder.append("location=");
        for (int i = 0; i < locationLength() && this.location(i) > 0; i++)
        {
            builder.append((char)this.location(i));
        }
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
    
    public SecurityDefinitionRequest560Decoder sbeSkip()
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
