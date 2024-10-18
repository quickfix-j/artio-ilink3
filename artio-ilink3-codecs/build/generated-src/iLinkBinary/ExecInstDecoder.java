/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.DirectBuffer;
import org.agrona.sbe.*;

@SuppressWarnings("all")
public final class ExecInstDecoder implements Flyweight
{
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final int ENCODED_LENGTH = 1;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private DirectBuffer buffer;

    public ExecInstDecoder wrap(final DirectBuffer buffer, final int offset)
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

    public boolean isEmpty()
    {
        return 0 == buffer.getByte(offset);
    }

    public short getRaw()
    {
        return ((short)(buffer.getByte(offset) & 0xFF));
    }
    /**
     * 1=All Or None,0=Not All Or None
     *
     * @return true if AON set or false if not.
     */

    public boolean aON()
    {
        return 0 != (buffer.getByte(offset) & (1 << 0));
    }

    public static boolean aON(final byte value)
    {
        return 0 != (value & (1 << 0));
    }
    /**
     * 1=Only Best,0=Not Only Best
     *
     * @return true if OB set or false if not.
     */

    public boolean oB()
    {
        return 0 != (buffer.getByte(offset) & (1 << 1));
    }

    public static boolean oB(final byte value)
    {
        return 0 != (value & (1 << 1));
    }
    /**
     * 1=Not Held,0=Not Not Held
     *
     * @return true if NH set or false if not.
     */

    public boolean nH()
    {
        return 0 != (buffer.getByte(offset) & (1 << 2));
    }

    public static boolean nH(final byte value)
    {
        return 0 != (value & (1 << 2));
    }
    /**
     * 0=Reserved For Future Use
     *
     * @return true if Reserved1 set or false if not.
     */

    public boolean reserved1()
    {
        return 0 != (buffer.getByte(offset) & (1 << 3));
    }

    public static boolean reserved1(final byte value)
    {
        return 0 != (value & (1 << 3));
    }
    /**
     * 0=Reserved For Future Use
     *
     * @return true if Reserved2 set or false if not.
     */

    public boolean reserved2()
    {
        return 0 != (buffer.getByte(offset) & (1 << 4));
    }

    public static boolean reserved2(final byte value)
    {
        return 0 != (value & (1 << 4));
    }
    /**
     * 0=Reserved For Future Use
     *
     * @return true if Reserved3 set or false if not.
     */

    public boolean reserved3()
    {
        return 0 != (buffer.getByte(offset) & (1 << 5));
    }

    public static boolean reserved3(final byte value)
    {
        return 0 != (value & (1 << 5));
    }
    /**
     * 0=Reserved For Future Use
     *
     * @return true if Reserved4 set or false if not.
     */

    public boolean reserved4()
    {
        return 0 != (buffer.getByte(offset) & (1 << 6));
    }

    public static boolean reserved4(final byte value)
    {
        return 0 != (value & (1 << 6));
    }
    /**
     * 0=Reserved For Future Use
     *
     * @return true if Reserved5 set or false if not.
     */

    public boolean reserved5()
    {
        return 0 != (buffer.getByte(offset) & (1 << 7));
    }

    public static boolean reserved5(final byte value)
    {
        return 0 != (value & (1 << 7));
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
        builder.append('{');
        boolean atLeastOne = false;
        if (aON())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("aON");
            atLeastOne = true;
        }
        if (oB())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("oB");
            atLeastOne = true;
        }
        if (nH())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("nH");
            atLeastOne = true;
        }
        if (reserved1())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("reserved1");
            atLeastOne = true;
        }
        if (reserved2())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("reserved2");
            atLeastOne = true;
        }
        if (reserved3())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("reserved3");
            atLeastOne = true;
        }
        if (reserved4())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("reserved4");
            atLeastOne = true;
        }
        if (reserved5())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("reserved5");
            atLeastOne = true;
        }
        builder.append('}');

        return builder;
    }
}
