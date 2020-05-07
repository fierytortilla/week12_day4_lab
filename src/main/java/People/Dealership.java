package People;
import Behaviors.IEngine;
import Components.ElectricEngine;
import Vehicles.ElectricCar;
import Vehicles.Vehicle;
import java.util.ArrayList;

public class Dealership {
    private double till;
    private ArrayList<Vehicle> vehiclesForSale;

    public Dealership(double till, ArrayList<Vehicle> vehiclesForSale) {
        this.till = till;
        this.vehiclesForSale = vehiclesForSale;
    }

    public void buyCar(Vehicle vehicle){
        this.till+=vehicle.getPrice();
        this.vehiclesForSale.add(vehicle);
    }

    public void sellCarBasedOnEngineType(Customer customer, Boolean fuelBased, Boolean electricBased){
        for(Vehicle vehicle: this.vehiclesForSale){
            IEngine engine= vehicle.getEngine();
            if(engine.isElectricBased()==electricBased && engine.isFuelBased()==fuelBased) {
                vehiclesForSale.remove(vehicle);
                customer.buyCar(vehicle);
                till += vehicle.getPrice();
            }
        }

    }
}
