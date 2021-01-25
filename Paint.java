public class Paint extends VehicleDecorator{

    public static final double COST = 150; 

    private Vehicle vehicle; 

    Paint(Vehicle vehicle){

        this.vehicle = vehicle; 

    }

    public String toString() {

        return vehicle.toString() + ", fancy paint"; 
    }

    public double getCost() {

        return vehicle.getCost() + COST; 
    }
}
