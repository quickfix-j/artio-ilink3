/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

import org.agrona.MutableDirectBuffer;
import org.agrona.sbe.*;

@SuppressWarnings("all")
public final class ExecInstEncoder implements Flyweight
{
    public static final int SCHEMA_ID = 8;
    public static final int SCHEMA_VERSION = 8;
    public static final String SEMANTIC_VERSION = "FIX5.0";
    public static final int ENCODED_LENGTH = 1;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private MutableDirectBuffer buffer;

    public ExecInstEncoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;

        return this;
    }

    public MutableDirectBuffer buffer()
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

    public ExecInstEncoder clear()
    {
        buffer.putByte(offset, (byte)(short)0);
        return this;
    }
    /**
     * 1=All Or None,0=Not All Or None
     *
     * @param value true if AON is set or false if not.
     * @return this for a fluent API.
     */

    public ExecInstEncoder aON(final boolean value)
    {
        byte bits = buffer.getByte(offset);
        bits = (byte)(value ? bits | (1 << 0) : bits & ~(1 << 0));
        buffer.putByte(offset, bits);
        return this;
    }

    public static byte aON(final byte bits, final boolean value)
    {
        return (byte)(value ? bits | (1 << 0) : bits & ~(1 << 0));
    }
    /**
     * 1=Only Best,0=Not Only Best
     *
     * @param value true if OB is set or false if not.
     * @return this for a fluent API.
     */

    public ExecInstEncoder oB(final boolean value)
    {
        byte bits = buffer.getByte(offset);
        bits = (byte)(value ? bits | (1 << 1) : bits & ~(1 << 1));
        buffer.putByte(offset, bits);
        return this;
    }

    public static byte oB(final byte bits, final boolean value)
    {
        return (byte)(value ? bits | (1 << 1) : bits & ~(1 << 1));
    }
    /**
     * 1=Not Held,0=Not Not Held
     *
     * @param value true if NH is set or false if not.
     * @return this for a fluent API.
     */

    public ExecInstEncoder nH(final boolean value)
    {
        byte bits = buffer.getByte(offset);
        bits = (byte)(value ? bits | (1 << 2) : bits & ~(1 << 2));
        buffer.putByte(offset, bits);
        return this;
    }

    public static byte nH(final byte bits, final boolean value)
    {
        return (byte)(value ? bits | (1 << 2) : bits & ~(1 << 2));
    }
    /**
     * 0=Reserved For Future Use
     *
     * @param value true if Reserved1 is set or false if not.
     * @return this for a fluent API.
     */

    public ExecInstEncoder reserved1(final boolean value)
    {
        byte bits = buffer.getByte(offset);
        bits = (byte)(value ? bits | (1 << 3) : bits & ~(1 << 3));
        buffer.putByte(offset, bits);
        return this;
    }

    public static byte reserved1(final byte bits, final boolean value)
    {
        return (byte)(value ? bits | (1 << 3) : bits & ~(1 << 3));
    }
    /**
     * 0=Reserved For Future Use
     *
     * @param value true if Reserved2 is set or false if not.
     * @return this for a fluent API.
     */

    public ExecInstEncoder reserved2(final boolean value)
    {
        byte bits = buffer.getByte(offset);
        bits = (byte)(value ? bits | (1 << 4) : bits & ~(1 << 4));
        buffer.putByte(offset, bits);
        return this;
    }

    public static byte reserved2(final byte bits, final boolean value)
    {
        return (byte)(value ? bits | (1 << 4) : bits & ~(1 << 4));
    }
    /**
     * 0=Reserved For Future Use
     *
     * @param value true if Reserved3 is set or false if not.
     * @return this for a fluent API.
     */

    public ExecInstEncoder reserved3(final boolean value)
    {
        byte bits = buffer.getByte(offset);
        bits = (byte)(value ? bits | (1 << 5) : bits & ~(1 << 5));
        buffer.putByte(offset, bits);
        return this;
    }

    public static byte reserved3(final byte bits, final boolean value)
    {
        return (byte)(value ? bits | (1 << 5) : bits & ~(1 << 5));
    }
    /**
     * 0=Reserved For Future Use
     *
     * @param value true if Reserved4 is set or false if not.
     * @return this for a fluent API.
     */

    public ExecInstEncoder reserved4(final boolean value)
    {
        byte bits = buffer.getByte(offset);
        bits = (byte)(value ? bits | (1 << 6) : bits & ~(1 << 6));
        buffer.putByte(offset, bits);
        return this;
    }

    public static byte reserved4(final byte bits, final boolean value)
    {
        return (byte)(value ? bits | (1 << 6) : bits & ~(1 << 6));
    }
    /**
     * 0=Reserved For Future Use
     *
     * @param value true if Reserved5 is set or false if not.
     * @return this for a fluent API.
     */

    public ExecInstEncoder reserved5(final boolean value)
    {
        byte bits = buffer.getByte(offset);
        bits = (byte)(value ? bits | (1 << 7) : bits & ~(1 << 7));
        buffer.putByte(offset, bits);
        return this;
    }

    public static byte reserved5(final byte bits, final boolean value)
    {
        return (byte)(value ? bits | (1 << 7) : bits & ~(1 << 7));
    }
}
