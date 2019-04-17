package collection.ListDemo;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();

        myList.add("A");
        myList.add("B");
        myList.addLast("C");
        myList.addFirst("D");
        myList.add(2, "E");
        myList.add("F");
        myList.add("G");

        myList.remove("C");
        myList.remove(4);
        myList.removeFirst();
        myList.removeLast();

        boolean isExist = myList.contains("D");

        if (isExist)
            System.out.println("EXIST");
        else
            System.out.println("NOT EXIST");

        int size = myList.size();
        System.out.println("SIZE: " + size);

        String myPrecious = myList.get(1);
        System.out.println("My Precious: " + myPrecious);

        myList.set(2, "DULL");
        System.out.println(myList);
    }

}
