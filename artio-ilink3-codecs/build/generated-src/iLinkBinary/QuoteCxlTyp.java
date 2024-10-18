/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum QuoteCxlTyp
{

    /**
     * Cancel per Instrument
     */
    CancelperInstrument((short)1),


    /**
     * Cancel per Instrument group
     */
    CancelperInstrumentgroup((short)3),


    /**
     * Cancel all quotes
     */
    Cancelallquotes((short)4),


    /**
     * Cancel per Quote Set
     */
    CancelperQuoteSet((short)100),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    QuoteCxlTyp(final short value)
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
    public static QuoteCxlTyp get(final short value)
    {
        switch (value)
        {
            case 1: return CancelperInstrument;
            case 3: return CancelperInstrumentgroup;
            case 4: return Cancelallquotes;
            case 100: return CancelperQuoteSet;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
