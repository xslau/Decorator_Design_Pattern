public class Rims extends VehicleDecorator{

    public static final double COST = 200; 

    private Vehicle vehicle; 

    public Rims(Vehicle vehicle) {

        this.vehicle = vehicle; 
    }

    public String toString() {

        return vehicle.toString() + ", cool rims"; 
    } 

    public double getCost() {

        return vehicle.getCost() + COST; 
    }   
}
