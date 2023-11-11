import models.defenders.Moogle;
import models.enemies.Moblin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DefenderTest {

    Moblin moblin;
    Moogle moogle;

    @Before
    public void before(){

        moblin = new Moblin(200.00);
        moogle = new Moogle();

    }


    @Test
    public void canDefend(){
        moogle.defend(moblin);
        assertEquals(190.00, moblin.getHealthPoints(), 00.00);
    }
}

