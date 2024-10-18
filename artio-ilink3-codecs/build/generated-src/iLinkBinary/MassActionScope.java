/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum MassActionScope
{

    /**
     * Instrument
     */
    Instrument((short)1),


    /**
     * All
     */
    All((short)7),


    /**
     * Market Segment ID
     */
    MarketSegmentID((short)9),


    /**
     * Instrument Group
     */
    InstrumentGroup((short)10),


    /**
     * Quote Set ID
     */
    QuoteSetID((short)100),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    MassActionScope(final short value)
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
    public static MassActionScope get(final short value)
    {
        switch (value)
        {
            case 1: return Instrument;
            case 7: return All;
            case 9: return MarketSegmentID;
            case 10: return InstrumentGroup;
            case 100: return QuoteSetID;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
