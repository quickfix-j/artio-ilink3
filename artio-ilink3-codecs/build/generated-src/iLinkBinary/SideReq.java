/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum SideReq
{

    /**
     * Buy
     */
    Buy((short)1),


    /**
     * Sell
     */
    Sell((short)2),


    /**
     * Undisclosed
     */
    Undisclosed((short)7),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    SideReq(final short value)
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
    public static SideReq get(final short value)
    {
        switch (value)
        {
            case 1: return Buy;
            case 2: return Sell;
            case 7: return Undisclosed;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
