/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum ManualOrdInd
{

    /**
     * Automated
     */
    Automated((short)0),


    /**
     * Manual
     */
    Manual((short)1),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    ManualOrdInd(final short value)
    {
        this.value = value;
    }

    /**
     * The raw encoded value in the Java type representation.
     *
     * @return the raw value encoded.
     */
    public short value()
    {
        return value;
    }

    /**
     * Lookup the enum value representing the value.
     *
     * @param value encoded to be looked up.
     * @return the enum value representing the value.
     */
    public static ManualOrdInd get(final short value)
    {
        switch (value)
        {
            case 0: return Automated;
            case 1: return Manual;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
