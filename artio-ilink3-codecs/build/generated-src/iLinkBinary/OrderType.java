/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum OrderType
{

    /**
     * Market With Protection
     */
    MarketWithProtection((byte)49),


    /**
     * Limit
     */
    Limit((byte)50),


    /**
     * Stop Limit
     */
    StopLimit((byte)52),


    /**
     * Market With Leftover As Limit
     */
    MarketWithLeftoverAsLimit((byte)75),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    OrderType(final byte value)
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
    public static OrderType get(final byte value)
    {
        switch (value)
        {
            case 49: return MarketWithProtection;
            case 50: return Limit;
            case 52: return StopLimit;
            case 75: return MarketWithLeftoverAsLimit;
            case 0: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
