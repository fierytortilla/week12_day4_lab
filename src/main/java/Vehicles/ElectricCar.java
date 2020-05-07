package Vehicles;
import Components.ElectricEngine;

public class ElectricCar extends Vehicle{

    public ElectricCar(String brand, String model, double price, String color, int numberSeats, ElectricEngine electricEngine) {
        super(brand, model, price, color, numberSeats, electricEngine);
    }
}
