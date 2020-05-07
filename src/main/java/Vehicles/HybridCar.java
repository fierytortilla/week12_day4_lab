package Vehicles;
import Components.ElectricEngine;
import Components.FuelEngine;
import Components.HybridEngine;
import com.sun.xml.internal.ws.api.pipe.Engine;

public class HybridCar extends Vehicle {

    public HybridCar(String brand, String model, double price, String color, int numberSeats, HybridEngine hybridEngine) {
        super(brand, model, price, color, numberSeats, hybridEngine);
    }
}
