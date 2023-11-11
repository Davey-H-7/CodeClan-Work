package models.players.mages;

import interfaces.IDefend;
import interfaces.ISpell;
import models.enemies.Enemy;
import models.players.Player;

public abstract class Mage extends Player {


    private IDefend defender;
    private ISpell spell;

    public Mage(String name, double healthPoints, IDefend defender, ISpell spell) {
        super(name, healthPoints);
        this.defender = defender;
        this.spell = spell;
    }

    public IDefend getDefender() {
        return defender;
    }

    public void setDefender(IDefend defender) {
        this.defender = defender;
    }

    public ISpell getSpell() {
        return spell;
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }
}
