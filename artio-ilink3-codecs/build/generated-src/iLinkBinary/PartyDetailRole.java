/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum PartyDetailRole
{

    /**
     * Executing Firm
     */
    ExecutingFirm(1),


    /**
     * Customer Account
     */
    CustomerAccount(24),


    /**
     * Take Up Firm
     */
    TakeUpFirm(96),


    /**
     * Operator
     */
    Operator(118),


    /**
     * Take Up Account
     */
    TakeUpAccount(1000),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL(65535);

    private final int value;

    PartyDetailRole(final int value)
    {
        this.value = value;
    }

    /**
     * The raw encoded value in the Java type representation.
     *
     * @return the raw value encoded.
     */
    public int value()
    {
        return value;
    }

    /**
     * Lookup the enum value representing the value.
     *
     * @param value encoded to be looked up.
     * @return the enum value representing the value.
     */
    public static PartyDetailRole get(final int value)
    {
        switch (value)
        {
            case 1: return ExecutingFirm;
            case 24: return CustomerAccount;
            case 96: return TakeUpFirm;
            case 118: return Operator;
            case 1000: return TakeUpAccount;
            case 65535: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
