/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum ExecTypTrdCxl
{

    /**
     * Trade Correction
     */
    TradeCorrection((byte)71),


    /**
     * Trade Cancel
     */
    TradeCancel((byte)72),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    ExecTypTrdCxl(final byte value)
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
    public static ExecTypTrdCxl get(final byte value)
    {
        switch (value)
        {
            case 71: return TradeCorrection;
            case 72: return TradeCancel;
            case 0: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
