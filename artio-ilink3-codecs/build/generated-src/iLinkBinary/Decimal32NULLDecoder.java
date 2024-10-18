/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.DirectBuffer;
import org.agrona.sbe.*;


/**
 * Optional floating point decimal with int32 mantissa and int8 exponent
 */
@SuppressWarnings("all")
public final class Decimal32NULLDecoder implements CompositeDecoderFlyweight
{
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final int ENCODED_LENGTH = 5;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private DirectBuffer buffer;

    public Decimal32NULLDecoder wrap(final DirectBuffer buffer, final int offset)
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

    public static int mantissaEncodingOffset()
    {
        return 0;
    }

    public static int mantissaEncodingLength()
    {
        return 4;
    }

    public static int mantissaSinceVersion()
    {
        return 0;
    }

    public static int mantissaNullValue()
    {
        return 2147483647;
    }

    public static int mantissaMinValue()
    {
        return -2147483647;
    }

    public static int mantissaMaxValue()
    {
        return 2147483647;
    }

    public int mantissa()
    {
        return buffer.getInt(offset + 0, BYTE_ORDER);
    }


    public static int exponentEncodingOffset()
    {
        return 4;
    }

    public static int exponentEncodingLength()
    {
        return 1;
    }

    public static int exponentSinceVersion()
    {
        return 0;
    }

    public static byte exponentNullValue()
    {
        return (byte)127;
    }

    public static byte exponentMinValue()
    {
        return (byte)-127;
    }

    public static byte exponentMaxValue()
    {
        return (byte)127;
    }

    public byte exponent()
    {
        return buffer.getByte(offset + 4);
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
        builder.append("mantissa=");
        builder.append(this.mantissa());
        builder.append('|');
        builder.append("exponent=");
        builder.append(this.exponent());
        builder.append(')');

        return builder;
    }
}
