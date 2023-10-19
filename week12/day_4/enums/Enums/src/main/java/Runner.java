import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {
        Car car = new Car(200, "Vauxhall Nova");
        Person person = new Person("Rab", 100);

        ArrayList<IMove> moveableObjects = new ArrayList<>();
        moveableObjects.add(car);
        moveableObjects.add(car);
        moveableObjects.add(car);
        moveableObjects.add(person);
        moveableObjects.add(person);
        moveableObjects.add(person);

        for (IMove element : moveableObjects) {
            if (element instanceof Person) {
                Person castedPerson = (Person) element;
                System.out.println(castedPerson.getName());
            }
        }
    }
}
