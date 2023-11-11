package models.players.healers;

import interfaces.IHeal;
import models.players.Player;

public class Cleric extends Player {

    IHeal healingItem;

    public Cleric(String name, double healthPoints, IHeal healingItem) {
        super(name, healthPoints);
        this.healingItem = healingItem;
    }

    public IHeal getHealingItem() {
        return healingItem;
    }

    public void setHealingItem(IHeal healingItem) {
        this.healingItem = healingItem;
    }
}
