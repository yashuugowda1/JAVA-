package COLLECTION;

import java.util.ArrayList;
import java.util.List;

public class Collection2ArrayList {
    static void main(String[] args) {
        List<String>fruits= new ArrayList<>();
        fruits.add("apple");
        fruits.add("mango");

        System.out.println(fruits);

        fruits.add("orange");
        fruits.add("jackfruit");

        System.out.println(fruits);
        System.out.println(fruits.size());   //size of element
        System.out.println(fruits.contains("orange"));    // we are asking if it contains in element
        System.out.println(fruits.get(1));    //get() fetches the data from particular index

        fruits.set(0,"watermelon");   // to replace element
        fruits.addFirst("apple");   //to add element at first
        fruits.addLast("green apple");   //to add element at last
        fruits.remove(0);   // used to remove element
        fruits.remove(4);
        System.out.println(fruits);
        fruits.remove(0);
        System.out.println(fruits);
    }
}
