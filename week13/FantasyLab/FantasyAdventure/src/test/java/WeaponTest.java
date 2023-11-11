import interfaces.IWeapon;
import models.enemies.Moblin;
import models.weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Moblin moblin;
    IWeapon sword;

    @Before
    public void before() {
        moblin = new Moblin(200.00);
        sword = new Sword();
    }


    @Test
    public void canInflictDamage(){
        sword.attack(moblin);
        assertEquals(150.00, moblin.getHealthPoints(), 00.00);

    }
}
