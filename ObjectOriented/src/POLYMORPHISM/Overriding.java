package POLYMORPHISM;

class A1{

    public void mobile()
    {
        System.out.println("moto");
    }

}
class A2 extends A1{
    public void mobile()
    {
        System.out.println("SAMSUNG");
    }

}

public class Overriding {
    static void main() {

        A1 obj=new A1();
        obj.mobile();
    }
}
