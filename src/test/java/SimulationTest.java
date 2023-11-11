import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimulationTest {

    @Test
    public void testSimulationConstructor(){
        int numberOfDice = 2;
        int numberOfTosses = 10;
        Simulation simulation = new Simulation(numberOfDice, numberOfTosses);
        Assert.assertNotNull(simulation);
    }

}