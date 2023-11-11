package models.players.mages;

import interfaces.IDefend;
import interfaces.ISpell;
import models.players.mages.Mage;

public class Wizard extends Mage {

    public Wizard(String name, double healthPoints, IDefend defender, ISpell spell) {
        super(name, healthPoints, defender, spell);
    }
}
