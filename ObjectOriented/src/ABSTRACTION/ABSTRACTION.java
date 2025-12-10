package ABSTRACTION;

abstract class Demo{

    abstract void yash();

}
class Demo1 extends Demo{
    public void yash()
    {
        System.out.println("Hello Yashwanth !");
        System.out.println("Good Morning !");
    }
}

public class ABSTRACTION {
    static void main() {

        Demo1 obj=new Demo1();
        obj.yash();
    }
}
