package COLLECTION;

import java.util.PriorityQueue;

public class CollectionPriorityQueue1 {
    static void main(String[] args) {
        PriorityQueue<Integer> names=new PriorityQueue<>();

        names.offer(22); // offer keyword here is used to add values
        names.offer(55);
        names.offer(24);
        names.offer(25);
        names.offer(28);
        names.offer(27);
        names.offer(28);
        names.offer(29);
        names.offer(30);

        System.out.println(names);
        System.out.println(names.poll());  //to remove the header of PriorityQueue


        System.out.println(names);
        System.out.println(names.peek());   // prints the 1st element
    }
}
