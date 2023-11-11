package models.weapons;

import interfaces.IWeapon;
import models.enemies.Enemy;

public class Bow implements IWeapon {

    private double damage = 20.00;

    public Bow() {
        this.damage = damage;
    }

    @Override
    public void attack(Enemy enemy) {
        enemy.setHealthPoints(enemy.getHealthPoints()-this.damage);
    }
}
