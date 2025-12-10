package STATIC_NESTED_CLASSES;

class outer4{

    void demo(){

        class inner4{

            void demo1(){
                System.out.println("Hello Mate !");

            }
        }

        inner4 obj = new inner4();
        obj.demo1();

    }
}

public class inner3 {
    public static void main(String[] args) {

        outer4 obj = new outer4();
        obj.demo();
    }
}
