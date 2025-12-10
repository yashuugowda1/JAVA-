package INTERFACE;

interface demo77{
    default int demo_d(int a, int b){
        return a-b;
    }

    static void B(){
        System.out.println("hellooo");

    }
        }



public class Interface4 implements demo77 {
    static void main() {

        Interface4 obj = new Interface4();
        obj.demo_d(21,44);

        System.out.println(obj.demo_d(21,44));

        demo77.B();
    }
}