package models.weapons;

import interfaces.IWeapon;
import models.enemies.Enemy;

public class Chainsaw implements IWeapon {

    private double damage = 100.00;

    public Chainsaw() {
        this.damage = damage;
    }

    @Override
    public void attack(Enemy enemy) {
        enemy.setHealthPoints(enemy.getHealthPoints()-this.damage);
    }
}
