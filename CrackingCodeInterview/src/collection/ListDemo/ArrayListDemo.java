package collection.ListDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        final short SIZE = 10;
        List<Integer> myNumbers = new ArrayList<Integer>(SIZE);
        List<Integer> myBackUpNumbers = new ArrayList<Integer>();

        myNumbers.add(0, 100);
        myNumbers.add(1, 101);
        myNumbers.add(2, 102);
        myNumbers.add(3, 103);
        myNumbers.add(4, 104);
        myNumbers.set(2, 2911);
        myNumbers.remove(0);

        // from 2 (including) to 4 (excluding)
        myBackUpNumbers = myNumbers.subList(2, 4);

        System.out.println(myNumbers.get(1));
        System.out.println(myNumbers.indexOf(101));
        System.out.println(myBackUpNumbers);

    }

}
