package COLLECTION;

import java.util.Vector;

public class Collection4VectorList {
    static void main(String[] args) {
        Vector<Integer>marks=new Vector<Integer>();
        marks.add(99);
        marks.add(98);
        marks.add(97);
        marks.add(96);
        marks.add(95);
        marks.add(94);

        System.out.println(marks);
        System.out.println(marks.size());   //size of element
        System.out.println(marks.contains("95"));    // we are asking if it contains in element
        System.out.println(marks.get(0));    //get() fetches the data from particular index
        System.out.println(marks);


    }
}
