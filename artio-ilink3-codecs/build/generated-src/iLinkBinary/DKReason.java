/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum DKReason
{

    /**
     * Unknown Security
     */
    UnknownSecurity((byte)65),


    /**
     * Wrong Side
     */
    WrongSide((byte)66),


    /**
     * Quantity Exceeds Order
     */
    QuantityExceedsOrder((byte)67),


    /**
     * No Matching Order
     */
    NoMatchingOrder((byte)68),


    /**
     * Price Exceeds Limit
     */
    PriceExceedsLimit((byte)69),


    /**
     * Calculation Difference
     */
    CalculationDifference((byte)70),


    /**
     * No Matching Execution Report
     */
    NoMatchingExecutionReport((byte)71),


    /**
     * Other
     */
    Other((byte)90),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    DKReason(final byte value)
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
    public static DKReason get(final byte value)
    {
        switch (value)
        {
            case 65: return UnknownSecurity;
            case 66: return WrongSide;
            case 67: return QuantityExceedsOrder;
            case 68: return NoMatchingOrder;
            case 69: return PriceExceedsLimit;
            case 70: return CalculationDifference;
            case 71: return NoMatchingExecutionReport;
            case 90: return Other;
            case 0: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
