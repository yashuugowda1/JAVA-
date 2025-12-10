package INTERFACE;

interface parent1 {

    void add(int a, int b);

}
interface parent2{

    void sub ( int c, int d);
}

class demo000 implements parent1, parent2{
    public void add (int a, int b)
    {
        System.out.println("addition of : " + (a+b));
    }

    public void sub (int c, int d)
    {
        System.out.println("subtraction of : "+ (c-d));
    }

}

public class Interface5 {
    static void main() {
        demo000 obj =new demo000();
        obj.add(11,21);
        obj.sub(21,12);
    }
}
