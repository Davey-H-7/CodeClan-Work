package models.weapons;

import interfaces.IWeapon;
import models.enemies.Enemy;

public class Sword implements IWeapon {

    private double damage = 50.00;

    public Sword() {
        this.damage = damage;
    }

    @Override
    public void attack(Enemy enemy) {
        enemy.setHealthPoints(enemy.getHealthPoints()-this.damage);
    }
}
