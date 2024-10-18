/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum MassActionOrdTyp
{

    /**
     * Limit
     */
    Limit((byte)50),


    /**
     * Stop Limit
     */
    StopLimit((byte)52),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)48);

    private final byte value;

    MassActionOrdTyp(final byte value)
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
    public static MassActionOrdTyp get(final byte value)
    {
        switch (value)
        {
            case 50: return Limit;
            case 52: return StopLimit;
            case 48: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
