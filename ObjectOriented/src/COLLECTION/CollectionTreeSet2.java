package COLLECTION;

import java.util.TreeSet;

public class CollectionTreeSet2 {
    static void main(String[] args) {
        TreeSet<Integer> num1=new TreeSet<>();
        num1.add(7);
        num1.add(8);
        num1.add(11);
        num1.add(99);
        num1.add(88);
        num1.add(77);

        System.out.println(num1);
       // System.out.println(num.contains(88));
        System.out.println(num1.remove(7));  //remove

        System.out.println(num1.ceiling(11)); // greater than or equal to
        System.out.println(num1.floor(20));  // lower than or equal to

        System.out.println(num1.higher(77));   // greater
        System.out.println(num1.lower(77));   //lower

        System.out.println(num1);
    }
}
