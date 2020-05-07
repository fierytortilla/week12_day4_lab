package Vehicles;
import Behaviors.IEngine;
import Components.Tyres;
import Components.Windows;

public abstract class Vehicle {
    private String brand;
    private String model;
    private double price;
    private String color;
    private int numberSeats;
    private Windows windows;
    private Tyres tyres;
    private IEngine engine;

    public Vehicle(String brand, String model, double price, String color, int numberSeats, IEngine engine) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
        this.numberSeats = numberSeats;
        this.engine = engine;

    }

    public void designCar(Windows windows, Tyres tyres){
        this.windows= windows;
        this.tyres= tyres;
    }

    public double getPrice() {
        return price;
    }

    public IEngine getEngine(){
        return this.engine;
    }

    public String turnOnEngine(){
        return this.engine.turnOn();
    }
}
