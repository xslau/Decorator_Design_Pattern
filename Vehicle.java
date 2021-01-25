/**
 * Abstract Class for extending Vehicle
 * @author Xzavian Slauhgter
 */
public abstract class Vehicle {

    protected String description; 

    /**
     * Returns description for Vehicle
     * @return Vehicle description
     */
    public String toString() {

        return description;  
    }

    /**
     * Abstract method to return Vehicle costs for extending classes
     * @return Vehicle cost
     */
    public abstract double getCost(); 

}