/**
 * Creates new Vehicle Decoration extending VehicleDecorator
 * @author Xzavian Slaughter
 */
public class SoundSystem extends VehicleDecorator{

    public static final double COST = 350; 
    public static final String DESCRIPT = "awesome sound";  
    private Vehicle vehicle; 

     /**
     * Constructor: Initializes new Vehicle instance for SoundSystem(VehicleDecorator)
     * @param vehicle Vehicle vehicle
     */
    public SoundSystem(Vehicle vehicle) {

        this.vehicle = vehicle; 
    }

    /**
     * Returns statement that represents Vehicle with SoundSystem(VehicleDecorator)
     * @return Representation of Vehicle with SoundSystem(VehicleDecorator)
     */
    public String toString() {

        return vehicle.toString() + ", " + DESCRIPT; 
    }
    
    /**
     * Returns Vehicle and SoundSystem(VehicleDecorator) cost sum
     * @return Vehicle and SoundSystem(VehicleDecorator) cost sum
     */
    public double getCost() {

        return vehicle.getCost() + COST; 
    }
}
