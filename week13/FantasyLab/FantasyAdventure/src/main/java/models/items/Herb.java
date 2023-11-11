package models.items;

import interfaces.IHeal;
import models.players.Player;

public class Herb implements IHeal {
    private double potency = 10.00;

    @Override
    public void heal(Player player) {
        player.setHealthPoints(player.getHealthPoints()+this.potency);

    }
}
