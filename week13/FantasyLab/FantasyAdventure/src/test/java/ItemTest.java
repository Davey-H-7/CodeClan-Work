import models.items.Potion;
import models.players.fighters.Swordsman;
import models.weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Swordsman player;
    Sword sword;
    Potion potion;

    @Before
    public void before(){

        sword = new Sword();
        player = new Swordsman("Dave", 500.00, sword);
        potion = new Potion();
    }

    @Test
    public void canAddHealth(){
        potion.heal(player);
        assertEquals(530.00, player.getHealthPoints(), 0.00);
    }
}
