/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum SecRspTyp
{

    /**
     * Accept Security Proposal as is
     */
    AcceptSecurityProposalasis((short)1),


    /**
     * Accept Security proposal with revisions as indicated in the message
     */
    AcceptSecurityproposalwithrevisionsasindicatedinthemessage((short)2),


    /**
     * Reject Security Proposal
     */
    RejectSecurityProposal((short)5),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    SecRspTyp(final short value)
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
    public static SecRspTyp get(final short value)
    {
        switch (value)
        {
            case 1: return AcceptSecurityProposalasis;
            case 2: return AcceptSecurityproposalwithrevisionsasindicatedinthemessage;
            case 5: return RejectSecurityProposal;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
