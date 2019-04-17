package collection.SetDemo;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> myTreeSet = new TreeSet<String>();
        myTreeSet.add("D");
        myTreeSet.add("A");
        myTreeSet.add("2");
        myTreeSet.add("C");
        myTreeSet.add("B");
        myTreeSet.add("B");
        System.out.println(myTreeSet);
    }
}
