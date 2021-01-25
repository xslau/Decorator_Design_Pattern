/**
 * Creates a new Sedan Vehicle that extends Vehicle with description
 * @author Xzavian Slaughter
 */
public class Sedan extends Vehicle{

    public static final double COST = 20000; 

    /**
     * Constructor: Initializes Sedan(Vehicle) description
     */
    Sedan() {

        this.description = "Sedan"; 
    }

    /**
     * Returns Sedan(Vehicle) cost
     * @return Sedan(Vehicle) cost
     */
    public double getCost() {

        return COST; 
    }
}
