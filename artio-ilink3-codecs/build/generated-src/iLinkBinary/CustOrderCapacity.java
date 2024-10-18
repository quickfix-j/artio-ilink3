/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum CustOrderCapacity
{

    /**
     * Member trading for their own account
     */
    Membertradingfortheirownaccount((short)1),


    /**
     * Member firm trading for its proprietary account
     */
    Memberfirmtradingforitsproprietaryaccount((short)2),


    /**
     * Member trading for another member or non member
     */
    Membertradingforanothermemberornonmember((short)3),


    /**
     * All other
     */
    Allother((short)4),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    CustOrderCapacity(final short value)
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
    public static CustOrderCapacity get(final short value)
    {
        switch (value)
        {
            case 1: return Membertradingfortheirownaccount;
            case 2: return Memberfirmtradingforitsproprietaryaccount;
            case 3: return Membertradingforanothermemberornonmember;
            case 4: return Allother;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
