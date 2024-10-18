/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum ShortSaleType
{

    /**
     * Long Sell
     */
    LongSell((short)0),


    /**
     * Short Sale With No Exemption SESH
     */
    ShortSaleWithNoExemptionSESH((short)1),


    /**
     * Short Sale With Exemption SSEX
     */
    ShortSaleWithExemptionSSEX((short)2),


    /**
     * Undisclosed Sell Information Not Available UNDI
     */
    UndisclosedSellInformationNotAvailableUNDI((short)3),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    ShortSaleType(final short value)
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
    public static ShortSaleType get(final short value)
    {
        switch (value)
        {
            case 0: return LongSell;
            case 1: return ShortSaleWithNoExemptionSESH;
            case 2: return ShortSaleWithExemptionSSEX;
            case 3: return UndisclosedSellInformationNotAvailableUNDI;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
