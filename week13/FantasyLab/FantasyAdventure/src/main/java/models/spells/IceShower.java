package models.spells;

import interfaces.ISpell;
import models.enemies.Enemy;

public class IceShower implements ISpell {
    private double damage = 40.00;

    @Override
    public void cast(Enemy enemy) {
        enemy.setHealthPoints(enemy.getHealthPoints()-this.damage);
    }
}
