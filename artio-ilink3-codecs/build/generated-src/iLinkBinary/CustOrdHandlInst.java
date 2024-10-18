/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum CustOrdHandlInst
{

    /**
     * FCM provided screen
     */
    FCMprovidedscreen((byte)67),


    /**
     * Other provided screen
     */
    Otherprovidedscreen((byte)68),


    /**
     * FCM API or FIX
     */
    FCMAPIorFIX((byte)71),


    /**
     * Algo Engine
     */
    AlgoEngine((byte)72),


    /**
     * Desk Electronic
     */
    DeskElectronic((byte)87),


    /**
     * Client Electronic
     */
    ClientElectronic((byte)89),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)48);

    private final byte value;

    CustOrdHandlInst(final byte value)
    {
        this.value = value;
    }

    /**
     * The raw encoded value in the Java type representation.
     *
     * @return the raw value encoded.
     */
    public byte value()
    {
        return value;
    }

    /**
     * Lookup the enum value representing the value.
     *
     * @param value encoded to be looked up.
     * @return the enum value representing the value.
     */
    public static CustOrdHandlInst get(final byte value)
    {
        switch (value)
        {
            case 67: return FCMprovidedscreen;
            case 68: return Otherprovidedscreen;
            case 71: return FCMAPIorFIX;
            case 72: return AlgoEngine;
            case 87: return DeskElectronic;
            case 89: return ClientElectronic;
            case 48: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
