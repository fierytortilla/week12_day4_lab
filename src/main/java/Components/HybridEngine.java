package Components;
import Behaviors.IEngine;

public class HybridEngine implements IEngine {

    public HybridEngine() {

    }

    public String turnOn() {
        return "vroom vroom";
    }

    public Boolean isElectricBased() {
        return true;
    }

    public Boolean isFuelBased() {
        return true;
    }
}
