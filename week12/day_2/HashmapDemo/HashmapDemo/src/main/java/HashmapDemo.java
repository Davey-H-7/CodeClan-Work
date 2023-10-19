import java.util.HashMap;

public class HashmapDemo {

    public static void main(String[] args) {

        HashMap favouriteFruits = new HashMap<>();
        favouriteFruits.put("Alice", "Apple");
        favouriteFruits.put("Sarah", "Banana");
        favouriteFruits.put("Bob", "Strawb");

        System.out.println(favouriteFruits.get("Alice"));




        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 24);
        ages.put("Bob", 96);
        ages.put("Leah", 31);

        Integer aliceAge = ages.get("Alice");

        System.out.println(aliceAge);
//        adds key value pair to hashmap
        favouriteFruits.put("key","value");
//        returns value for a given key
        favouriteFruits.get("Alice");
//        returns size of array as Integer
        favouriteFruits.size();
//        deletes everything
        favouriteFruits.clear();
//        returns true if key given is present
        favouriteFruits.containsKey();
//        returns true if value given is present
        favouriteFruits.containsValue();
//        removes value from given key
        favouriteFruits.remove();
    }
}
