/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.DirectBuffer;
import org.agrona.sbe.*;


/**
 * PartyDetailsListRequest
 */
@SuppressWarnings("all")
public final class PartyDetailsListRequest537Decoder implements MessageDecoderFlyweight
{
    public static final int BLOCK_LENGTH = 20;
    public static final int TEMPLATE_ID = 537;
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final PartyDetailsListRequest537Decoder parentMessage = this;
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
        return "CF";
    }

    public DirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public PartyDetailsListRequest537Decoder wrap(
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

    public PartyDetailsListRequest537Decoder wrapAndApplyHeader(
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

    public PartyDetailsListRequest537Decoder sbeRewind()
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

    public long sendingTimeEpoch()
    {
        return buffer.getLong(offset + 8, BYTE_ORDER);
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

    public long seqNum()
    {
        return (buffer.getInt(offset + 16, BYTE_ORDER) & 0xFFFF_FFFFL);
    }


    private final NoRequestingPartyIDsDecoder noRequestingPartyIDs = new NoRequestingPartyIDsDecoder(this);

    public static long noRequestingPartyIDsDecoderId()
    {
        return 1657;
    }

    public static int noRequestingPartyIDsDecoderSinceVersion()
    {
        return 0;
    }

    /**
     * Number of requesting party identifiers. Will be zero if specific PartyDetailsDefinitionID's are being requested. Will be populated only if all PartyDetailsDefinitions are being requested for a specific Firm
     *
     * @return NoRequestingPartyIDsDecoder : Number of requesting party identifiers. Will be zero if specific PartyDetailsDefinitionID's are being requested. Will be populated only if all PartyDetailsDefinitions are being requested for a specific Firm
     */
    public NoRequestingPartyIDsDecoder noRequestingPartyIDs()
    {
        noRequestingPartyIDs.wrap(buffer);
        return noRequestingPartyIDs;
    }

    /**
     * Number of requesting party identifiers. Will be zero if specific PartyDetailsDefinitionID's are being requested. Will be populated only if all PartyDetailsDefinitions are being requested for a specific Firm
     */

    public static final class NoRequestingPartyIDsDecoder
        implements Iterable<NoRequestingPartyIDsDecoder>, java.util.Iterator<NoRequestingPartyIDsDecoder>
    {
        public static final int HEADER_SIZE = 3;
        private final PartyDetailsListRequest537Decoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        NoRequestingPartyIDsDecoder(final PartyDetailsListRequest537Decoder parentMessage)
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

        public NoRequestingPartyIDsDecoder next()
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
            return 7;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<NoRequestingPartyIDsDecoder> iterator()
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


        public byte requestingPartyID(final int index)
        {
            if (index < 0 || index >= 5)
            {
                throw new IndexOutOfBoundsException("index out of range: index=" + index);
            }

            final int pos = offset + 0 + (index * 1);

            return buffer.getByte(pos);
        }


        public static String requestingPartyIDCharacterEncoding()
        {
            return java.nio.charset.StandardCharsets.US_ASCII.name();
        }

        public int getRequestingPartyID(final byte[] dst, final int dstOffset)
        {
            final int length = 5;
            if (dstOffset < 0 || dstOffset > (dst.length - length))
            {
                throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
            }

            buffer.getBytes(offset + 0, dst, dstOffset, length);

            return length;
        }

        public String requestingPartyID()
        {
            final byte[] dst = new byte[5];
            buffer.getBytes(offset + 0, dst, 0, 5);

            int end = 0;
            for (; end < 5 && dst[end] != 0; ++end);

            return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
        }


        public int getRequestingPartyID(final Appendable value)
        {
            for (int i = 0; i < 5; ++i)
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

            return 5;
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

        public byte requestingPartyIDSource()
        {
            return buffer.getByte(offset + 5);
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

        public byte requestingPartyRole()
        {
            return buffer.getByte(offset + 6);
        }


        public StringBuilder appendTo(final StringBuilder builder)
        {
            if (null == buffer)
            {
                return builder;
            }

            builder.append('(');
            builder.append("requestingPartyID=");
            for (int i = 0; i < requestingPartyIDLength() && this.requestingPartyID(i) > 0; i++)
            {
                builder.append((char)this.requestingPartyID(i));
            }
            builder.append('|');
            builder.append("requestingPartyIDSource=");
            builder.append(this.requestingPartyIDSource());
            builder.append('|');
            builder.append("requestingPartyRole=");
            builder.append(this.requestingPartyRole());
            builder.append(')');

            return builder;
        }
        
        public NoRequestingPartyIDsDecoder sbeSkip()
        {

            return this;
        }
    }

    private final NoPartyIDsDecoder noPartyIDs = new NoPartyIDsDecoder(this);

    public static long noPartyIDsDecoderId()
    {
        return 453;
    }

    public static int noPartyIDsDecoderSinceVersion()
    {
        return 0;
    }

    /**
     * Number of PartyID (448), PartyIDSource (447), and PartyRole (452) entries. Applicable only if specific PartyDetailsDefinitions are being requested otherwise set to 0
     *
     * @return NoPartyIDsDecoder : Number of PartyID (448), PartyIDSource (447), and PartyRole (452) entries. Applicable only if specific PartyDetailsDefinitions are being requested otherwise set to 0
     */
    public NoPartyIDsDecoder noPartyIDs()
    {
        noPartyIDs.wrap(buffer);
        return noPartyIDs;
    }

    /**
     * Number of PartyID (448), PartyIDSource (447), and PartyRole (452) entries. Applicable only if specific PartyDetailsDefinitions are being requested otherwise set to 0
     */

    public static final class NoPartyIDsDecoder
        implements Iterable<NoPartyIDsDecoder>, java.util.Iterator<NoPartyIDsDecoder>
    {
        public static final int HEADER_SIZE = 3;
        private final PartyDetailsListRequest537Decoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        NoPartyIDsDecoder(final PartyDetailsListRequest537Decoder parentMessage)
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

        public NoPartyIDsDecoder next()
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
            return 11;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<NoPartyIDsDecoder> iterator()
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

        public long partyID()
        {
            return buffer.getLong(offset + 0, BYTE_ORDER);
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

        public byte partyIDSource()
        {
            return buffer.getByte(offset + 8);
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

        public int partyRole()
        {
            return (buffer.getShort(offset + 9, BYTE_ORDER) & 0xFFFF);
        }


        public StringBuilder appendTo(final StringBuilder builder)
        {
            if (null == buffer)
            {
                return builder;
            }

            builder.append('(');
            builder.append("partyID=");
            builder.append(this.partyID());
            builder.append('|');
            builder.append("partyIDSource=");
            builder.append(this.partyIDSource());
            builder.append('|');
            builder.append("partyRole=");
            builder.append(this.partyRole());
            builder.append(')');

            return builder;
        }
        
        public NoPartyIDsDecoder sbeSkip()
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

        final PartyDetailsListRequest537Decoder decoder = new PartyDetailsListRequest537Decoder();
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
        builder.append("[PartyDetailsListRequest537](sbeTemplateId=");
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
        builder.append("sendingTimeEpoch=");
        builder.append(this.sendingTimeEpoch());
        builder.append('|');
        builder.append("seqNum=");
        builder.append(this.seqNum());
        builder.append('|');
        builder.append("noRequestingPartyIDs=[");
        final int noRequestingPartyIDsOriginalOffset = noRequestingPartyIDs.offset;
        final int noRequestingPartyIDsOriginalIndex = noRequestingPartyIDs.index;
        final NoRequestingPartyIDsDecoder noRequestingPartyIDs = this.noRequestingPartyIDs();
        if (noRequestingPartyIDs.count() > 0)
        {
            while (noRequestingPartyIDs.hasNext())
            {
                noRequestingPartyIDs.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        noRequestingPartyIDs.offset = noRequestingPartyIDsOriginalOffset;
        noRequestingPartyIDs.index = noRequestingPartyIDsOriginalIndex;
        builder.append(']');
        builder.append('|');
        builder.append("noPartyIDs=[");
        final int noPartyIDsOriginalOffset = noPartyIDs.offset;
        final int noPartyIDsOriginalIndex = noPartyIDs.index;
        final NoPartyIDsDecoder noPartyIDs = this.noPartyIDs();
        if (noPartyIDs.count() > 0)
        {
            while (noPartyIDs.hasNext())
            {
                noPartyIDs.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        noPartyIDs.offset = noPartyIDsOriginalOffset;
        noPartyIDs.index = noPartyIDsOriginalIndex;
        builder.append(']');

        limit(originalLimit);

        return builder;
    }
    
    public PartyDetailsListRequest537Decoder sbeSkip()
    {
        sbeRewind();
        NoRequestingPartyIDsDecoder noRequestingPartyIDs = this.noRequestingPartyIDs();
        if (noRequestingPartyIDs.count() > 0)
        {
            while (noRequestingPartyIDs.hasNext())
            {
                noRequestingPartyIDs.next();
                noRequestingPartyIDs.sbeSkip();
            }
        }
        NoPartyIDsDecoder noPartyIDs = this.noPartyIDs();
        if (noPartyIDs.count() > 0)
        {
            while (noPartyIDs.hasNext())
            {
                noPartyIDs.next();
                noPartyIDs.sbeSkip();
            }
        }

        return this;
    }
}
