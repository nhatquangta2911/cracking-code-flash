package collection.MapDemo;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> myHashMap = new HashMap<>();
        myHashMap.put("Math", 9);
        myHashMap.put("Physic", 8);
        myHashMap.put("Chemistry", 10);
        myHashMap.put("English", 5);
        System.out.println(myHashMap.size());

        if (myHashMap.containsKey("Math")) {
            int a = myHashMap.get("Math");
            System.out.println(a);
        }

        myHashMap.clear();
        System.out.println(myHashMap);
    }
}
