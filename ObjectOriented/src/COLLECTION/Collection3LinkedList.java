package COLLECTION;

import java.util.LinkedList;

public class Collection3LinkedList {
    static void main(String[] args) {
        LinkedList<String>fruits1= new LinkedList<>();

        fruits1.add("apple");
        fruits1.add("mango");
        fruits1.add("orange");
        fruits1.add("jackfruit");

        System.out.println(fruits1);

        fruits1.addFirst("dragon fruit");
        fruits1.addLast("guava");

        System.out.println(fruits1);
       System.out.println(fruits1.peek());
        System.out.println(fruits1);
       System.out.println(fruits1.poll());
        System.out.println(fruits1);

    }
}
