/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum ExecMode
{

    /**
     * Aggressive
     */
    Aggressive((byte)65),


    /**
     * Passive
     */
    Passive((byte)80),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    ExecMode(final byte value)
    {
        this.value = value;
    }

    /**
     * The raw encoded value in the Java type representation.
     *
     * @return the raw value encoded.
     */
    public byte value()
    {
        return value;
    }

    /**
     * Lookup the enum value representing the value.
     *
     * @param value encoded to be looked up.
     * @return the enum value representing the value.
     */
    public static ExecMode get(final byte value)
    {
        switch (value)
        {
            case 65: return Aggressive;
            case 80: return Passive;
            case 0: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
