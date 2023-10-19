import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle bottle = new WaterBottle();



    @Test
    public void bottleHasVolumeOf100(){
        assertEquals(100, bottle.volume);
    }

    @Test
    public void canDrinkFromBottle(){
        bottle.drink();
        assertEquals(90, bottle.volume);
    }

    @Test
    public void canEmptyBottle(){
        bottle.empty();
        assertEquals(0, bottle.volume);
    }

    @Test
    public void canFillBottle(){
        bottle.fill();
        assertEquals(100, bottle.volume);
    }
}
