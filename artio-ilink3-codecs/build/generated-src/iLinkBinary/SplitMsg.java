/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum SplitMsg
{

    /**
     * Split Message Delayed
     */
    SplitMessageDelayed((short)0),


    /**
     * Out of Order Message Delayed
     */
    OutofOrderMessageDelayed((short)1),


    /**
     * Complete Message Delayed
     */
    CompleteMessageDelayed((short)2),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    SplitMsg(final short value)
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
    public static SplitMsg get(final short value)
    {
        switch (value)
        {
            case 0: return SplitMessageDelayed;
            case 1: return OutofOrderMessageDelayed;
            case 2: return CompleteMessageDelayed;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
