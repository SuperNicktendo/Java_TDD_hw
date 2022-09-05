import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTests {

    @Test
    public void hasDrink(){
        WaterBottle haveDrink = new WaterBottle(100);
        assertEquals(90, haveDrink.drink());
    }

    @Test
    public void canEmpty(){
        WaterBottle emptyBottle = new WaterBottle(100);
        assertEquals(0, emptyBottle.empty());
    }

    @Test
    public void canFill(){
        WaterBottle fillBottle = new WaterBottle(0);
        assertEquals(100, fillBottle.fill());
    }

}
