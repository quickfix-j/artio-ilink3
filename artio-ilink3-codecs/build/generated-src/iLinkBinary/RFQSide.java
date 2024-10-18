/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum RFQSide
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
     * Cross
     */
    Cross((short)8),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    RFQSide(final short value)
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
    public static RFQSide get(final short value)
    {
        switch (value)
        {
            case 1: return Buy;
            case 2: return Sell;
            case 8: return Cross;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
