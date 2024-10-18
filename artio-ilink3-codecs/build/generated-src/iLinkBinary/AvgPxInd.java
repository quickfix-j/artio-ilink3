/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum AvgPxInd
{

    /**
     * No Average Pricing
     */
    NoAveragePricing((short)0),


    /**
     * Trade is part of an Average Price Group Identified by the AvgPxGrp ID
     */
    TradeispartofanAveragePriceGroupIdentifiedbytheAvgPxGrpID((short)1),


    /**
     * Trade is part of a Notional Value Average Price Group
     */
    TradeispartofaNotionalValueAveragePriceGroup((short)3),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    AvgPxInd(final short value)
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
    public static AvgPxInd get(final short value)
    {
        switch (value)
        {
            case 0: return NoAveragePricing;
            case 1: return TradeispartofanAveragePriceGroupIdentifiedbytheAvgPxGrpID;
            case 3: return TradeispartofaNotionalValueAveragePriceGroup;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
