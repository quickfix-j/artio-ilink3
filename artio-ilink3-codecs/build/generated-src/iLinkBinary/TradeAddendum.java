/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum TradeAddendum
{

    /**
     * Partially Filled
     */
    PartiallyFilled((short)4),


    /**
     * Filled
     */
    Filled((short)5),


    /**
     * Trade Cancel
     */
    TradeCancel((short)100),


    /**
     * Trade Correction
     */
    TradeCorrection((short)101),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    TradeAddendum(final short value)
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
    public static TradeAddendum get(final short value)
    {
        switch (value)
        {
            case 4: return PartiallyFilled;
            case 5: return Filled;
            case 100: return TradeCancel;
            case 101: return TradeCorrection;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
