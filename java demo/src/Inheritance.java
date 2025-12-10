class parent {

    public void demo1() {
        System.out.println("hello");
    }
}
class kid1 extends parent {

        public void demo2()
        {
            System.out.println("hello, good morning !");
        }
    }


public class Inheritance {
    static void main() {


        kid1 obj = new kid1();

        obj.demo1();
        obj.demo2();


    }
}