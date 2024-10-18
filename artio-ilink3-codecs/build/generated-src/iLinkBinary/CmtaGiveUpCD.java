/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum CmtaGiveUpCD
{

    /**
     * Give Up
     */
    GiveUp((byte)71),


    /**
     * SGX offset
     */
    SGXoffset((byte)83),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)48);

    private final byte value;

    CmtaGiveUpCD(final byte value)
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
    public static CmtaGiveUpCD get(final byte value)
    {
        switch (value)
        {
            case 71: return GiveUp;
            case 83: return SGXoffset;
            case 48: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
