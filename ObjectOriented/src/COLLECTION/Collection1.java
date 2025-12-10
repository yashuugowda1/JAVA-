package COLLECTION;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {
    static void main(String[] args) {

        Collection<String> name = new ArrayList<>();

        name.add("yash");//add
        name.add("gowda");//add
        name.add("sharpblade");//add
        name.add("sharpblade1");

        name.remove("gowda");             //remove(removing "gowda" by using predefined key remove)
        //name.clear();                     //to clear every element

        System.out.println(name.size());    // to check the element size
        System.out.println(name);

    }
}
