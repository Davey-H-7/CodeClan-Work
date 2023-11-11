package models.enemies;

public abstract class Enemy {

    private double healthPoints;

    public Enemy(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public double takeDamage(double damage){
        this.healthPoints -= damage;
        return healthPoints;
    }


}
