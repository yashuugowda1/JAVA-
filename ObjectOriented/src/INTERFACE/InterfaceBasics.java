package INTERFACE;

interface A{

    public void yash ();

}

class B implements A{

    public void yash(){

        System.out.println("Hello Good Morning !");
    }
}

public class InterfaceBasics {
    static void main() {
        B obj = new B ();
        obj.yash();


    }
}
