package models.players.fighters;

import interfaces.IWeapon;
import models.players.Player;
import models.weapons.Sword;

public abstract class Fighter extends Player {

    IWeapon weapon;

    public Fighter(String name, double healthPoints, IWeapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }
}
