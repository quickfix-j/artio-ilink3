/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum ExecReason
{

    /**
     * Market Exchange Option
     */
    MarketExchangeOption((short)8),


    /**
     * Cancelled Not Best
     */
    CancelledNotBest((short)9),


    /**
     * Cancel On Disconnect
     */
    CancelOnDisconnect((short)100),


    /**
     * Self Match Prevention Oldest Order Cancelled
     */
    SelfMatchPreventionOldestOrderCancelled((short)103),


    /**
     * Cancel On Globex Credit Controls Violation
     */
    CancelOnGlobexCreditControlsViolation((short)104),


    /**
     * Cancel From Firmsoft
     */
    CancelFromFirmsoft((short)105),


    /**
     * Cancel From Risk Management API 
     */
    CancelFromRiskManagementAPI((short)106),


    /**
     * Self Match Prevention Newest Order Cancelled
     */
    SelfMatchPreventionNewestOrderCancelled((short)107),


    /**
     * Cancel due to min qty violation
     */
    Cancelduetovolquotedoptionorderrestedqtylessthanminordersize((short)108),


    /**
     * Cancel RFC Order
     */
    CancelRFCOrder((short)109),


    /**
     * Cancel Upon Contract Expiration
     */
    CancelUponContractExpiration((short)110),


    /**
     * System Cancel
     */
    SystemCancel((short)111),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    ExecReason(final short value)
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
    public static ExecReason get(final short value)
    {
        switch (value)
        {
            case 8: return MarketExchangeOption;
            case 9: return CancelledNotBest;
            case 100: return CancelOnDisconnect;
            case 103: return SelfMatchPreventionOldestOrderCancelled;
            case 104: return CancelOnGlobexCreditControlsViolation;
            case 105: return CancelFromFirmsoft;
            case 106: return CancelFromRiskManagementAPI;
            case 107: return SelfMatchPreventionNewestOrderCancelled;
            case 108: return Cancelduetovolquotedoptionorderrestedqtylessthanminordersize;
            case 109: return CancelRFCOrder;
            case 110: return CancelUponContractExpiration;
            case 111: return SystemCancel;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
