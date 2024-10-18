/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum SMPI
{

    /**
     * Cancel Newest
     */
    CancelNewest((byte)78),


    /**
     * Cancel Oldest
     */
    CancelOldest((byte)79),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)48);

    private final byte value;

    SMPI(final byte value)
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
    public static SMPI get(final byte value)
    {
        switch (value)
        {
            case 78: return CancelNewest;
            case 79: return CancelOldest;
            case 48: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
