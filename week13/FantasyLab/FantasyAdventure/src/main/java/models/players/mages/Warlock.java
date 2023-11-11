package models.players.mages;

import interfaces.IDefend;
import interfaces.ISpell;
import models.players.mages.Mage;

public class Warlock extends Mage {

    public Warlock(String name, double healthPoints, IDefend defender, ISpell spell) {
        super(name, healthPoints, defender, spell);
    }
}

