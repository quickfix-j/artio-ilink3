/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.DirectBuffer;
import org.agrona.sbe.*;


/**
 * DATA Field
 */
@SuppressWarnings("all")
public final class DATADecoder implements CompositeDecoderFlyweight
{
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final int ENCODED_LENGTH = -1;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private DirectBuffer buffer;

    public DATADecoder wrap(final DirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;

        return this;
    }

    public DirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public int encodedLength()
    {
        return ENCODED_LENGTH;
    }

    public int sbeSchemaId()
    {
        return SCHEMA_ID;
    }

    public int sbeSchemaVersion()
    {
        return SCHEMA_VERSION;
    }

    public static int lengthEncodingOffset()
    {
        return 0;
    }

    public static int lengthEncodingLength()
    {
        return 2;
    }

    public static int lengthSinceVersion()
    {
        return 0;
    }

    public static int lengthNullValue()
    {
        return 65535;
    }

    public static int lengthMinValue()
    {
        return 0;
    }

    public static int lengthMaxValue()
    {
        return 65534;
    }

    public int length()
    {
        return (buffer.getShort(offset + 0, BYTE_ORDER) & 0xFFFF);
    }


    public static int varDataEncodingOffset()
    {
        return 2;
    }

    public static int varDataEncodingLength()
    {
        return -1;
    }

    public static int varDataSinceVersion()
    {
        return 0;
    }

    public static byte varDataNullValue()
    {
        return (byte)0;
    }

    public static byte varDataMinValue()
    {
        return (byte)32;
    }

    public static byte varDataMaxValue()
    {
        return (byte)126;
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

        builder.append('(');
        builder.append("length=");
        builder.append(this.length());
        builder.append('|');
        builder.append(')');

        return builder;
    }
}
