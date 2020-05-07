import Components.HybridEngine;
import Vehicles.HybridCar;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HybridCarTest {
    private HybridCar hybridCar;

    @Before
    public void before(){
        HybridEngine hybridEngine = new HybridEngine();
        hybridCar= new HybridCar("Volkswagen","The Hippie",60000,"blue",5, hybridEngine);
    }

    @Test
    public void canEngineStart(){
        String result= hybridCar.turnOnEngine();
        assertEquals("vroom vroom", result);
    }

}
