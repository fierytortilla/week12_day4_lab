package People;
import Vehicles.Vehicle;
import java.util.ArrayList;

public class Customer {
    private double money;
    private ArrayList<Vehicle> vehicles;

    public Customer(double money){
        this.money= money;
        this.vehicles= new ArrayList<Vehicle>();
    }

    public void buyCar(Vehicle vehicle){
        if(this.money>=vehicle.getPrice()){
            this.vehicles.add(vehicle);
            this.money-=vehicle.getPrice();
        }
    }
}
