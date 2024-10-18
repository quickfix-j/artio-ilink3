/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum TimeInForce
{

    /**
     * Day
     */
    Day((short)0),


    /**
     * Good Till Cancel
     */
    GoodTillCancel((short)1),


    /**
     * Fill And Kill
     */
    FillAndKill((short)3),


    /**
     * Fill Or Kill
     */
    FillOrKill((short)4),


    /**
     * Good Till Date
     */
    GoodTillDate((short)6),


    /**
     * Good For Session
     */
    GoodForSession((short)99),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    TimeInForce(final short value)
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
    public static TimeInForce get(final short value)
    {
        switch (value)
        {
            case 0: return Day;
            case 1: return GoodTillCancel;
            case 3: return FillAndKill;
            case 4: return FillOrKill;
            case 6: return GoodTillDate;
            case 99: return GoodForSession;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
