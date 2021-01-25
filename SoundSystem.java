public class SoundSystem extends VehicleDecorator{

    public static final double COST = 350;  
    private Vehicle vehicle; 

    public SoundSystem(Vehicle vehicle) {

        this.vehicle = vehicle; 
    }

    public String toString() {

        return vehicle.toString() + ", awesome sound"; 
    }
    
    public double getCost() {

        return vehicle.getCost() + COST; 
    }
}
