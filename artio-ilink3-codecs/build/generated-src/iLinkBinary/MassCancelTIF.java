/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum MassCancelTIF
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
     * Good Till Date
     */
    GoodTillDate((short)6),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    MassCancelTIF(final short value)
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
    public static MassCancelTIF get(final short value)
    {
        switch (value)
        {
            case 0: return Day;
            case 1: return GoodTillCancel;
            case 6: return GoodTillDate;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
