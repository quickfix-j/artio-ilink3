/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum OrderStatus
{

    /**
     * New
     */
    New((byte)48),


    /**
     * Partially Filled
     */
    PartiallyFilled((byte)49),


    /**
     * Filled
     */
    Filled((byte)50),


    /**
     * Cancelled
     */
    Cancelled((byte)52),


    /**
     * Replaced
     */
    Replaced((byte)53),


    /**
     * Pending Cancel
     */
    PendingCancel((byte)54),


    /**
     * Rejected
     */
    Rejected((byte)56),


    /**
     * Expired
     */
    Expired((byte)67),


    /**
     * Pending Replace
     */
    PendingReplace((byte)69),


    /**
     * Undefined
     */
    Undefined((byte)85),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    OrderStatus(final byte value)
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
    public static OrderStatus get(final byte value)
    {
        switch (value)
        {
            case 48: return New;
            case 49: return PartiallyFilled;
            case 50: return Filled;
            case 52: return Cancelled;
            case 53: return Replaced;
            case 54: return PendingCancel;
            case 56: return Rejected;
            case 67: return Expired;
            case 69: return PendingReplace;
            case 85: return Undefined;
            case 0: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
