package models.players.fighters;

import interfaces.IWeapon;
import models.players.fighters.Fighter;

public class Archer extends Fighter {

    private int speed;

    public Archer(String name, double healthPoints, IWeapon weapon) {
        super(name, healthPoints, weapon);
        this.speed = 10;
    }
}
