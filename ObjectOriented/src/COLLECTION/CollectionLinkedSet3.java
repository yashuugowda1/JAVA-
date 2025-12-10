package COLLECTION;

import java.util.LinkedList;

public class CollectionLinkedSet3 {
    static void main(String[] args) {

        LinkedList<Integer> num1=new LinkedList<>();

        num1.add(7);
        num1.add(8);
        num1.add(99);
        num1.add(55);
        num1.add(88);
        num1.add(77);

        System.out.println(num1);
        System.out.println(num1.contains(88));
        System.out.println(num1.remove(5));
        System.out.println(num1.size());

        System.out.println(num1);
    }
}
