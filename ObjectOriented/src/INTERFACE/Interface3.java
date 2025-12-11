package INTERFACE;

interface demo99{

    default int demo_d(int a, int b){
        return a+b;

    }

}

public class Interface3 implements demo99{
    static void main() {

        Interface3 obj = new Interface3 ();

        System.out.println(obj.demo_d(22,11));

    }
}
