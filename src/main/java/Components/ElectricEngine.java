package Components;

import Behaviors.IEngine;

public class ElectricEngine implements IEngine {

    public ElectricEngine(){
    }

    public Boolean isElectricBased() {
        return true;
    }

    public Boolean isFuelBased() {
        return false;
    }

    public String turnOn() {
        return "vroom vroom";
    }
}
