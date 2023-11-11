package models.defenders;

import interfaces.IDefend;
import models.enemies.Enemy;

public class Moogle implements IDefend {

    private double damage = 10.00;

    @Override
    public void defend(Enemy enemy) {
        enemy.setHealthPoints(enemy.getHealthPoints()-this.damage);

    }
}
