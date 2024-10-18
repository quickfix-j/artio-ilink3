/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum MassStatusReqTyp
{

    /**
     * Instrument
     */
    Instrument((short)1),


    /**
     * Instrument Group
     */
    InstrumentGroup((short)3),


    /**
     * All Orders
     */
    AllOrders((short)7),


    /**
     * Market Segment
     */
    MarketSegment((short)100),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    MassStatusReqTyp(final short value)
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
    public static MassStatusReqTyp get(final short value)
    {
        switch (value)
        {
            case 1: return Instrument;
            case 3: return InstrumentGroup;
            case 7: return AllOrders;
            case 100: return MarketSegment;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
