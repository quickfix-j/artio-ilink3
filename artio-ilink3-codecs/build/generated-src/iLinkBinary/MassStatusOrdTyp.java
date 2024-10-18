/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum MassStatusOrdTyp
{

    /**
     * SenderSubID
     */
    SenderSubID((short)100),


    /**
     * Account
     */
    Account((short)101),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    MassStatusOrdTyp(final short value)
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
    public static MassStatusOrdTyp get(final short value)
    {
        switch (value)
        {
            case 100: return SenderSubID;
            case 101: return Account;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
