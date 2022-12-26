
/**
 * 
 * NB: DO NOT MODIFY THIS CLASS IN ANY WAY
 * 
 * A record of a test of infection.
 * The status of the test is unknown initially.
 * Whether the test is positive or negative is
 * only meaningful if its status is known.
 *
 * @author David J. Barnes
 * @version 2021.11.01
 */
public class InfectionTest
{
    // The test ID.
    private String id;
    private boolean statusKnown;
    private boolean positive;

    /**
     * Constructor for objects of class InfectionReport
     */
    public InfectionTest(String id)
    {
        this.id = id;
        statusKnown = false;
        positive = false;        

    }
    
    /**
     * Get the ID of the test.
     * @return the ID.
     */
    public String getID()
    {
        return id;
    }
    
    /**
     * Get whether the test status is known or not.
     * @return true if the status is known,
     *         false otherwise.
     */
    public boolean isKnown()
    {
        return statusKnown;
    }
    
    /**
     * Get whether the test is positive or not.
     * NB: This method must only be called if the status
     * is known, otherwise the result would be undefined.
     * @return true if the result is positive, false otherwise.
     */
    public boolean isPositive()
    {
        if(!statusKnown) {
            throw new IllegalStateException("The status is not valid.");
        }
        return positive;
    }
    
    /**
     * Set the status to be known and the positive/negative
     * status to the given value.
     */
    public void setStatus(boolean positive)
    {
        statusKnown = true;
        this.positive = positive;
    }
    
    /**
     * Return whether the test is positive or negative
     * if the result is known.
     * @return details of the test.
     */
    public String getDetails()
    {
        StringBuilder details = new StringBuilder();
        details.append(id).append(' ');
        if(statusKnown) {
            details.append("is ");
            details.append(positive ? "positive" : "negative");
        }
        else {
            details.append("status unknown");
        }
        return details.toString();
    }
}
