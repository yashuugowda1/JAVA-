package STATIC_NESTED_CLASSES;

class yash1{

    static class gowda1{

        void YG_D(){
                                                    //( NESTED STATIC )
            System.out.println(" GOOD NOON !");
            System.out.println(" HOW ARE YOU !");
        }
    }
}

public class NestedStatic {
    static void main() {
        yash1.gowda1 obj=new yash1.gowda1();
        obj.YG_D();
    }
}
