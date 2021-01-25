/**
 * Creates new Vehicle Decoration extending VehicleDecorator
 * @author Xzavian Slaughter
 */
public class Rims extends VehicleDecorator{

    public static final double COST = 200; 

    private Vehicle vehicle; 

    /**
     * Constructor: Initializes new Vehicle instance for Rims(VehicleDecorator)
     * @param vehicle Vehicle vehicle
     */
    public Rims(Vehicle vehicle) {

        this.vehicle = vehicle; 
    }

    /**
     * Returns statement that represents Vehicle with Rims(VehicleDecorator)
     * @return Representation of Vehicle with Rims(VehicleDecorator)
     */
    public String toString() {

        return vehicle.toString() + ", cool rims"; 
    } 

    /**
     * Returns Vehicle and Rims(VehicleDecorator) cost sum
     * @return Vehicle and Rims(VehicleDecorator) cost sum
     */
    public double getCost() {

        return vehicle.getCost() + COST; 
    }   
}
