package INTERFACE;

interface father{

    void F (String name);
}

interface son extends father{

    void S (String name);
}

interface son2 extends son {
    void S2 (int age);
}
class final_r{

    void F(String name) {

        System.out.println("NAME IS :" + name);
    }
    void S (String name) {

        System.out.println("SON NAME IS :" + name);
    }
    void S2 (int age) {

        System.out.println("SON2 AGE IS :" + age);
    }

}
public class Interface7 {
    static void main() {

        final_r obj = new final_r();

        obj.F("yash");
        obj.S("shiva");
        obj.S2(21);

    }
}
