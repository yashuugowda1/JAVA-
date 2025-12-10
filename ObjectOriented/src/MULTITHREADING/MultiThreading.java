package MULTITHREADING;

class multi extends Thread{
    public void run(){
        System.out.println("implementation of thread 1");
    }
}
class multi1 extends Thread{
    public void run()
    {
        System.out.println("implementation of thread 2");
    }
}
public class MultiThreading {
    static void main(String[] args) {
        Thread obj = new multi();
        obj.start();

        Thread obj1 = new multi1();
        obj1.start();
    }
}
