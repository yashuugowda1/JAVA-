package COLLECTION;

import java.util.HashSet;
import java.util.Set;

public class CollectionHashSet1 {
    static void main(String[] args) {
        Set<Integer> num=new HashSet<>();
        num.add(7);
        num.add(8);
        num.add(11);
        num.add(99);
        num.add(88);
        num.add(77);

        System.out.println(num);

        num.remove(8);     // remove
        System.out.println(num.contains(99));
        System.out.println(num.size());
        num.iterator();
        //num.clear();

        System.out.println(num);

    }
}
