public class Person implements IMove {

    private String name;
    private int health;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Person(String name, int health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public String move() {
        return "the person moved";
    }
}
