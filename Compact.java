/**
 * Creates a new Compact Vehicle that extends Vehicle with description
 * @author Xzavian Slaughter
 */
public class Compact extends Vehicle{

    public static final double COST = 15000; 

    /**
     * Constructor: Initializes Compact(Vehicle) description
     */
    Compact() {

        this.description = "Compact Car"; 
    }
    
    /**
     * Returns Compact(Vehicle) cost
     * @return Compact(Vehicle) cost
     */
    public double getCost() {

        return COST; 
    }
}
