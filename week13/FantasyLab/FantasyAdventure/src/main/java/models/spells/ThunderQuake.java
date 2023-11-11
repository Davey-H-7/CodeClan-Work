package models.spells;

import interfaces.ISpell;
import models.enemies.Enemy;

public class ThunderQuake implements ISpell {

    private double damage = 75.00;

    @Override
    public void cast(Enemy enemy) {
        enemy.setHealthPoints(enemy.getHealthPoints()-this.damage);
    }
}
