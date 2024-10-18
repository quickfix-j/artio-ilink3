/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.DirectBuffer;
import org.agrona.sbe.*;


/**
 * Year, Month and Date
 */
@SuppressWarnings("all")
public final class MaturityMonthYearDecoder implements CompositeDecoderFlyweight
{
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final int ENCODED_LENGTH = 5;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private DirectBuffer buffer;

    public MaturityMonthYearDecoder wrap(final DirectBuffer buffer, final int offset)
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

    public static int yearEncodingOffset()
    {
        return 0;
    }

    public static int yearEncodingLength()
    {
        return 2;
    }

    public static int yearSinceVersion()
    {
        return 0;
    }

    public static int yearNullValue()
    {
        return 65535;
    }

    public static int yearMinValue()
    {
        return 0;
    }

    public static int yearMaxValue()
    {
        return 65534;
    }

    public int year()
    {
        return (buffer.getShort(offset + 0, BYTE_ORDER) & 0xFFFF);
    }


    public static int monthEncodingOffset()
    {
        return 2;
    }

    public static int monthEncodingLength()
    {
        return 1;
    }

    public static int monthSinceVersion()
    {
        return 0;
    }

    public static short monthNullValue()
    {
        return (short)255;
    }

    public static short monthMinValue()
    {
        return (short)0;
    }

    public static short monthMaxValue()
    {
        return (short)254;
    }

    public short month()
    {
        return ((short)(buffer.getByte(offset + 2) & 0xFF));
    }


    public static int dayEncodingOffset()
    {
        return 3;
    }

    public static int dayEncodingLength()
    {
        return 1;
    }

    public static int daySinceVersion()
    {
        return 0;
    }

    public static short dayNullValue()
    {
        return (short)255;
    }

    public static short dayMinValue()
    {
        return (short)0;
    }

    public static short dayMaxValue()
    {
        return (short)254;
    }

    public short day()
    {
        return ((short)(buffer.getByte(offset + 3) & 0xFF));
    }


    public static int weekEncodingOffset()
    {
        return 4;
    }

    public static int weekEncodingLength()
    {
        return 1;
    }

    public static int weekSinceVersion()
    {
        return 0;
    }

    public static short weekNullValue()
    {
        return (short)255;
    }

    public static short weekMinValue()
    {
        return (short)0;
    }

    public static short weekMaxValue()
    {
        return (short)254;
    }

    public short week()
    {
        return ((short)(buffer.getByte(offset + 4) & 0xFF));
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
        builder.append("year=");
        builder.append(this.year());
        builder.append('|');
        builder.append("month=");
        builder.append(this.month());
        builder.append('|');
        builder.append("day=");
        builder.append(this.day());
        builder.append('|');
        builder.append("week=");
        builder.append(this.week());
        builder.append(')');

        return builder;
    }
}
