/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum SLEDS
{

    /**
     * Trade Clearing at Execution Price
     */
    TradeClearingatExecutionPrice((short)0),


    /**
     * Trade Clearing at Alternate Clearing Price
     */
    TradeClearingatAlternateClearingPrice((short)1),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    SLEDS(final short value)
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
    public static SLEDS get(final short value)
    {
        switch (value)
        {
            case 0: return TradeClearingatExecutionPrice;
            case 1: return TradeClearingatAlternateClearingPrice;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}