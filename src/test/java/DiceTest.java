import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {

    @Test
    public void testDiceConstructor() {
        int numberOfDice =2;
        Dice dice = new Dice(numberOfDice);

        Assert.assertNotNull(dice);
    }

    @Test
    public void testTossAndSum(){
        int numberOfDice = 2;
        Dice dice = new Dice(numberOfDice);
        Integer actual = dice.tossAndSum();
        // this is for the max value for the number of dice used
        Assert.assertTrue(actual <= numberOfDice *6);
        // this is for the min value for the number of dice used
        Assert.assertTrue(actual >= numberOfDice);

    }
}