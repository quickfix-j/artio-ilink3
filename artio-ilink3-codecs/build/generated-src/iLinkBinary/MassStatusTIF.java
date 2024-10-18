/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum MassStatusTIF
{

    /**
     * Day
     */
    Day((short)0),


    /**
     * GTC
     */
    GTC((short)1),


    /**
     * GTD
     */
    GTD((short)6),


    /**
     * GFS
     */
    GFS((short)99),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    MassStatusTIF(final short value)
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
    public static MassStatusTIF get(final short value)
    {
        switch (value)
        {
            case 0: return Day;
            case 1: return GTC;
            case 6: return GTD;
            case 99: return GFS;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
