package collection.MapDemo;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Integer> myTreeMap = new TreeMap<>();
        myTreeMap.put("CUPID", 78);
        myTreeMap.put("CLOSER", 64);
        myTreeMap.put("ONE STEP TWO STEP", 34);
        myTreeMap.put("LIAR LIAR", 31);
        myTreeMap.put("WINDY DAY", 24);
        myTreeMap.put("LISTEN TO MY WORD", 9);
        myTreeMap.put("COLORING BOOK", 40);
        myTreeMap.put("SECRET GARDEN", 2);
        myTreeMap.put("BANANA ALLERGY MONKEY", 53);
        myTreeMap.put("REMEMBER ME", 16);
        myTreeMap.put("2019 COMEBACK IN MAY", null);

        for(Map.Entry item : myTreeMap.entrySet()) {
            System.out.println(item);
        }
    }
}
