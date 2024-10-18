/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.MutableDirectBuffer;
import org.agrona.sbe.*;


/**
 * PartyDetailsListRequest
 */
@SuppressWarnings("all")
public final class PartyDetailsListRequest537Encoder implements MessageEncoderFlyweight
{
    public static final int BLOCK_LENGTH = 20;
    public static final int TEMPLATE_ID = 537;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final PartyDetailsListRequest537Encoder parentMessage = this;
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
        return "CF";
    }

    public MutableDirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public PartyDetailsListRequest537Encoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public PartyDetailsListRequest537Encoder wrapAndApplyHeader(
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

    public PartyDetailsListRequest537Encoder partyDetailsListReqID(final long value)
    {
        buffer.putLong(offset + 0, value, BYTE_ORDER);
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
        return 8;
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

    public PartyDetailsListRequest537Encoder sendingTimeEpoch(final long value)
    {
        buffer.putLong(offset + 8, value, BYTE_ORDER);
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
        return 16;
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

    public PartyDetailsListRequest537Encoder seqNum(final long value)
    {
        buffer.putInt(offset + 16, (int)value, BYTE_ORDER);
        return this;
    }


    private final NoRequestingPartyIDsEncoder noRequestingPartyIDs = new NoRequestingPartyIDsEncoder(this);

    public static long noRequestingPartyIDsId()
    {
        return 1657;
    }

    /**
     * Number of requesting party identifiers. Will be zero if specific PartyDetailsDefinitionID's are being requested. Will be populated only if all PartyDetailsDefinitions are being requested for a specific Firm
     *
     * @param count of times the group will be encoded.
     * @return NoRequestingPartyIDsEncoder : encoder for the group.
     */
    public NoRequestingPartyIDsEncoder noRequestingPartyIDsCount(final int count)
    {
        noRequestingPartyIDs.wrap(buffer, count);
        return noRequestingPartyIDs;
    }

    /**
     * Number of requesting party identifiers. Will be zero if specific PartyDetailsDefinitionID's are being requested. Will be populated only if all PartyDetailsDefinitions are being requested for a specific Firm
     */

    public static final class NoRequestingPartyIDsEncoder
    {
        public static final int HEADER_SIZE = 3;
        private final PartyDetailsListRequest537Encoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int initialLimit;

        NoRequestingPartyIDsEncoder(final PartyDetailsListRequest537Encoder parentMessage)
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
            buffer.putShort(limit + 0, (short)7, BYTE_ORDER);
            buffer.putByte(limit + 2, (byte)count);
        }

        public NoRequestingPartyIDsEncoder next()
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
            return 7;
        }

        public static int requestingPartyIDId()
        {
            return 1658;
        }

        public static int requestingPartyIDSinceVersion()
        {
            return 0;
        }

        public static int requestingPartyIDEncodingOffset()
        {
            return 0;
        }

        public static int requestingPartyIDEncodingLength()
        {
            return 5;
        }

        public static String requestingPartyIDMetaAttribute(final MetaAttribute metaAttribute)
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

        public static byte requestingPartyIDNullValue()
        {
            return (byte)0;
        }

        public static byte requestingPartyIDMinValue()
        {
            return (byte)32;
        }

        public static byte requestingPartyIDMaxValue()
        {
            return (byte)126;
        }

        public static int requestingPartyIDLength()
        {
            return 5;
        }


        public NoRequestingPartyIDsEncoder requestingPartyID(final int index, final byte value)
        {
            if (index < 0 || index >= 5)
            {
                throw new IndexOutOfBoundsException("index out of range: index=" + index);
            }

            final int pos = offset + 0 + (index * 1);
            buffer.putByte(pos, value);

            return this;
        }

        public static String requestingPartyIDCharacterEncoding()
        {
            return java.nio.charset.StandardCharsets.US_ASCII.name();
        }

        public NoRequestingPartyIDsEncoder putRequestingPartyID(final byte[] src, final int srcOffset)
        {
            final int length = 5;
            if (srcOffset < 0 || srcOffset > (src.length - length))
            {
                throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
            }

            buffer.putBytes(offset + 0, src, srcOffset, length);

            return this;
        }

        public NoRequestingPartyIDsEncoder requestingPartyID(final String src)
        {
            final int length = 5;
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

        public NoRequestingPartyIDsEncoder requestingPartyID(final CharSequence src)
        {
            final int length = 5;
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

        public static int requestingPartyIDSourceId()
        {
            return 1659;
        }

        public static int requestingPartyIDSourceSinceVersion()
        {
            return 0;
        }

        public static int requestingPartyIDSourceEncodingOffset()
        {
            return 5;
        }

        public static int requestingPartyIDSourceEncodingLength()
        {
            return 1;
        }

        public static String requestingPartyIDSourceMetaAttribute(final MetaAttribute metaAttribute)
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

        public static byte requestingPartyIDSourceNullValue()
        {
            return (byte)0;
        }

        public static byte requestingPartyIDSourceMinValue()
        {
            return (byte)32;
        }

        public static byte requestingPartyIDSourceMaxValue()
        {
            return (byte)126;
        }

        public NoRequestingPartyIDsEncoder requestingPartyIDSource(final byte value)
        {
            buffer.putByte(offset + 5, value);
            return this;
        }


        public static int requestingPartyRoleId()
        {
            return 1660;
        }

        public static int requestingPartyRoleSinceVersion()
        {
            return 0;
        }

        public static int requestingPartyRoleEncodingOffset()
        {
            return 6;
        }

        public static int requestingPartyRoleEncodingLength()
        {
            return 1;
        }

        public static String requestingPartyRoleMetaAttribute(final MetaAttribute metaAttribute)
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

        public static byte requestingPartyRoleNullValue()
        {
            return (byte)0;
        }

        public static byte requestingPartyRoleMinValue()
        {
            return (byte)32;
        }

        public static byte requestingPartyRoleMaxValue()
        {
            return (byte)126;
        }

        public NoRequestingPartyIDsEncoder requestingPartyRole(final byte value)
        {
            buffer.putByte(offset + 6, value);
            return this;
        }

    }

    private final NoPartyIDsEncoder noPartyIDs = new NoPartyIDsEncoder(this);

    public static long noPartyIDsId()
    {
        return 453;
    }

    /**
     * Number of PartyID (448), PartyIDSource (447), and PartyRole (452) entries. Applicable only if specific PartyDetailsDefinitions are being requested otherwise set to 0
     *
     * @param count of times the group will be encoded.
     * @return NoPartyIDsEncoder : encoder for the group.
     */
    public NoPartyIDsEncoder noPartyIDsCount(final int count)
    {
        noPartyIDs.wrap(buffer, count);
        return noPartyIDs;
    }

    /**
     * Number of PartyID (448), PartyIDSource (447), and PartyRole (452) entries. Applicable only if specific PartyDetailsDefinitions are being requested otherwise set to 0
     */

    public static final class NoPartyIDsEncoder
    {
        public static final int HEADER_SIZE = 3;
        private final PartyDetailsListRequest537Encoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int initialLimit;

        NoPartyIDsEncoder(final PartyDetailsListRequest537Encoder parentMessage)
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
            buffer.putShort(limit + 0, (short)11, BYTE_ORDER);
            buffer.putByte(limit + 2, (byte)count);
        }

        public NoPartyIDsEncoder next()
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
            return 11;
        }

        public static int partyIDId()
        {
            return 448;
        }

        public static int partyIDSinceVersion()
        {
            return 0;
        }

        public static int partyIDEncodingOffset()
        {
            return 0;
        }

        public static int partyIDEncodingLength()
        {
            return 8;
        }

        public static String partyIDMetaAttribute(final MetaAttribute metaAttribute)
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

        public static long partyIDNullValue()
        {
            return 0xffffffffffffffffL;
        }

        public static long partyIDMinValue()
        {
            return 0x0L;
        }

        public static long partyIDMaxValue()
        {
            return 0xfffffffffffffffeL;
        }

        public NoPartyIDsEncoder partyID(final long value)
        {
            buffer.putLong(offset + 0, value, BYTE_ORDER);
            return this;
        }


        public static int partyIDSourceId()
        {
            return 447;
        }

        public static int partyIDSourceSinceVersion()
        {
            return 0;
        }

        public static int partyIDSourceEncodingOffset()
        {
            return 8;
        }

        public static int partyIDSourceEncodingLength()
        {
            return 1;
        }

        public static String partyIDSourceMetaAttribute(final MetaAttribute metaAttribute)
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

        public static byte partyIDSourceNullValue()
        {
            return (byte)0;
        }

        public static byte partyIDSourceMinValue()
        {
            return (byte)32;
        }

        public static byte partyIDSourceMaxValue()
        {
            return (byte)126;
        }

        public NoPartyIDsEncoder partyIDSource(final byte value)
        {
            buffer.putByte(offset + 8, value);
            return this;
        }


        public static int partyRoleId()
        {
            return 452;
        }

        public static int partyRoleSinceVersion()
        {
            return 0;
        }

        public static int partyRoleEncodingOffset()
        {
            return 9;
        }

        public static int partyRoleEncodingLength()
        {
            return 2;
        }

        public static String partyRoleMetaAttribute(final MetaAttribute metaAttribute)
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

        public static int partyRoleNullValue()
        {
            return 65535;
        }

        public static int partyRoleMinValue()
        {
            return 0;
        }

        public static int partyRoleMaxValue()
        {
            return 65534;
        }

        public NoPartyIDsEncoder partyRole(final int value)
        {
            buffer.putShort(offset + 9, (short)value, BYTE_ORDER);
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

        final PartyDetailsListRequest537Decoder decoder = new PartyDetailsListRequest537Decoder();
        decoder.wrap(buffer, offset, BLOCK_LENGTH, SCHEMA_VERSION);

        return decoder.appendTo(builder);
    }
}
