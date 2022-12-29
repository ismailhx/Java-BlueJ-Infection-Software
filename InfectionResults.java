import java.util.HashSet;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * NB: DO NOT MODIFY THE METHOD NAMES, RETURN TYPES OR
 * PARAMETERS IN THIS CLASS IN ANY WAY.
 * 
 * Manage a collection of infection test results.
 * An InfectionResults class that is intended to store a collection of 
 * InfectionTest objects.
 *
 * @author Ismail Hendryx
 * @version (11/11/2021)
 */
public class InfectionResults
{
    // An ArrayList for storing the InfectionTest objects.
    private ArrayList<InfectionTest> testResults;

    /**
     * Constructor for objects of class InfectionResults
     */
    public InfectionResults()
    {
        testResults = new ArrayList<>(); 

    }

    /**
     * Add the given test to the collection.
     * @param test The test to be added.
     * Takes InfectionTest objects as parameters and adds it to the collection.
     */
    public void addTest(InfectionTest test)
    {
        testResults.add(test);
    }

    /**
     * Get the number of tests currently stored.
     * @return the number of tests.
     */
    public int getNumberOfTests()
    {
        return testResults.size();
    }

    /**
     * List the tests in the collection.
     */
    public void list()
    { 
        for(InfectionTest listthing:testResults) {
            listthing.getDetails();
            System.out.println(listthing.getDetails());
        }
    }

    /**
     * Set the status of the given test.
     * If a test with the id is not found no action is required
     * and no error message should be printed.
     * @param id The id of the test.
     * @param positive Whether the test is positive or not.
     */
    public void setStatus(String id, boolean positive)
    {
        //Searches for the inputted test id and calls its setStatus method
        int index = 0;
        boolean searching = true;
        while(index<testResults.size() && searching){
            if(testResults.get(index).getID().equals(id)) {
                searching = false;
                testResults.get(index).setStatus(positive);
                index++;
            }
            else { 
                index++;} 
        }
    }

    /**
     * Find the test (if any) with the given id.
     * @return The test with the given id, or null if
     *         none matches.
     */
    public InfectionTest findTest(String id)
    {
        for(InfectionTest index: testResults) {
            if (index.getID() == id) {
                return index;
            } 
        }
        return null;
    }

    /**
     * Return all the positive tests.
     * @return the positive tests.
     */
    public HashSet<InfectionTest> getPositiveTests()
    {
        HashSet<InfectionTest> getPositiveTests = new HashSet <InfectionTest>();
        for (InfectionTest p:testResults) {
            if (p.isKnown()==true){
                if (p.isPositive()==true){
                    getPositiveTests.add(p);}
            }
        }
        return getPositiveTests;
    }

    /**
     * Remove all the tests with unknown status and return
     * those that were removed.
     * @return the removed tests.
     */
    public LinkedList<InfectionTest> removeUnknownStatus()
    {
        LinkedList<InfectionTest> removeUnknownStatus = new LinkedList <InfectionTest>();
        Iterator<InfectionTest> it = testResults.iterator();
        while(it.hasNext()) {
            InfectionTest r = it.next();
            if(r.isKnown() == false){
                it.remove();
                removeUnknownStatus.add(r);}
        }
        return removeUnknownStatus;
    }
}
