import models.enemies.Moblin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoblinTest {

    Moblin moblin;
    
    @Before
    public void before(){
    moblin = new Moblin(200.00);
}

    @Test
    public void canTakeDamage(){
    moblin.takeDamage(40.00);
    assertEquals(160.00, moblin.getHealthPoints(), 00.00);
    }
}


