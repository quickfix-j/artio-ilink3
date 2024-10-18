/* Generated SBE (Simple Binary Encoding) message codec. */
package iLinkBinary;

@SuppressWarnings("all")
public enum ReqResult
{

    /**
     * Valid Request
     */
    ValidRequest((short)0),


    /**
     * No Data Found That Matched Selection Criteria
     */
    NoDataFoundThatMatchedSelectionCriteria((short)2),


    /**
     * Not Authorized to Retrieve Data
     */
    NotAuthorizedtoRetrieveData((short)3),


    /**
     * Data Temporarily Unavailable
     */
    DataTemporarilyUnavailable((short)4),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    ReqResult(final short value)
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
    public static ReqResult get(final short value)
    {
        switch (value)
        {
            case 0: return ValidRequest;
            case 2: return NoDataFoundThatMatchedSelectionCriteria;
            case 3: return NotAuthorizedtoRetrieveData;
            case 4: return DataTemporarilyUnavailable;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
