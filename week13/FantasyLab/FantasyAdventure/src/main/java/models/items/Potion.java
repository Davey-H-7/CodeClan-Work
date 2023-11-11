package models.items;

import interfaces.IHeal;
import models.players.Player;

public class Potion implements IHeal {

    private double potency = 30.00;

    @Override
    public void heal(Player player) {
        player.setHealthPoints(player.getHealthPoints()+this.potency);

    }
}
