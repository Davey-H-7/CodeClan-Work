package models.players.fighters;

import interfaces.IWeapon;
import models.players.fighters.Fighter;

public class Swordsman extends Fighter {

    private int speed;


    public Swordsman(String name, double healthPoints, IWeapon weapon) {
        super(name, healthPoints, weapon);
        this.speed = 5;
    }
}
