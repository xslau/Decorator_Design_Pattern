/**
 * Creates new Vehicle Decoration extending VehicleDecorator
 * @author Xzavian Slaughter
 */
public class Paint extends VehicleDecorator{

    public static final double COST = 150;
    public static final String DESCRIPT = "fancy paint";  

    private Vehicle vehicle; 

    /**
     * Constructor: Initializes new Vehicle instance for Paint(VehicleDecorator)
     * @param vehicle Vehicle vehicle
     */
    Paint(Vehicle vehicle){

        this.vehicle = vehicle; 

    }

    /**
     * Returns statement that represents Vehicle with Paint(VehicleDecorator)
     * @return Representation of Vehicle with Paint(VehicleDecorator)
     */
    public String toString() {

        return vehicle.toString() + ", " + DESCRIPT; 
    }

    /**
     * Returns Vehicle and Paint(VehicleDecorator) cost sum
     * @return Vehicle and Paint(VehicleDecorator) cost sum
     */
    public double getCost() {

        return vehicle.getCost() + COST; 
    }
}
