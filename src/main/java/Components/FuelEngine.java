package Components;

import Behaviors.IEngine;

public class FuelEngine implements IEngine {

    public FuelEngine() {

    }

    public String turnOn() {
        return "vroom vroom";
    }

    public Boolean isElectricBased() {
        return false;
    }

    public Boolean isFuelBased() {
        return true;
    }
}
