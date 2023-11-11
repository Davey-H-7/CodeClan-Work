package models.players.fighters;

import interfaces.IWeapon;
import models.players.fighters.Fighter;

public class Maniac extends Fighter {

    private int speed;

    public Maniac(String name, double healthPoints, IWeapon weapon) {
        super(name, healthPoints, weapon);
        this.speed = 1;
    }
}
