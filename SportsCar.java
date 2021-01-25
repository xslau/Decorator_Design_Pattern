/**
 * Creates a new Sports Car Vehicle that extends Vehicle with description
 * @author Xzavian Slaughter
 */
public class SportsCar extends Vehicle{

    public static final double COST = 30000; 
    
    /**
     * Constructor: Initializes Compact(Vehicle) description
     */
    SportsCar() {

        this.description = "Sports Car"; 
    }

     /**
     * Returns SportsCar(Vehicle) cost
     * @return SportsCar(Vehicle) cost
     */
    public double getCost() {

        return COST; 
    }
}
