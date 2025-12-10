package COLLECTION;

import java.util.Stack;

public class Collection5Stack {
    static void main(String[] args) {
        Stack<Integer>marks1=new Stack<>();

        marks1.push(98);
        marks1.push(99);
        marks1.push(95);
        marks1.push(28);
        marks1.push(66);
        marks1.push(78);
        marks1.push(55);
        marks1.push(5);
        marks1.push(99);

        System.out.println(marks1);

        marks1.pop();                //remove the last element

        System.out.println(marks1);

        System.out.println(marks1.capacity()); // checks the capacity
        System.out.println(marks1.removeFirst());// removes the first element

        System.out.println(marks1);

    }
}
