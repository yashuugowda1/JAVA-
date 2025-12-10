package ABSTRACTION;

abstract class sample{

    abstract void yash();
    abstract void gowda();

}

class shiva extends sample {

    public void yash() {

        System.out.println("Hello Yashwanth !");
        System.out.println("Good Morning !");
    }
    public void gowda() {
        System.out.println("\nHow are you !");
        System.out.println("Have A Good Day !");
    }
}


public class ABSTRACTION2 {
    static void main() {

        shiva obj = new shiva();
        obj.yash();
        obj.gowda();
    }
}