package collection.SetDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> myHashSet = new HashSet<>();
        myHashSet.add("Java");
        myHashSet.add("C++");
        myHashSet.add("Javascript");
        myHashSet.add("PHP");
        myHashSet.add("Ruby");
        myHashSet.add("Python");
//        System.out.println(myHashSet.contains("Python"));
        System.out.println(myHashSet);

        Iterator<String> i = myHashSet.iterator();
        do {
            System.out.println(i.next());
        } while (i.hasNext());

        for(String item : myHashSet) {
            System.out.println(item);
        }
    }
}
