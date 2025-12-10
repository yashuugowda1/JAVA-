package MULTITHREADING;

class java3 implements Runnable{
    public void run() {
        for (int i = 0; i < 4; i++)
        {
            try                     // by using interface method and using Runnable
            {
                Thread.sleep(4000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            System.out.println("java developers");
        }
    }
}
class python3 implements Runnable{
    public void run() {
        for (int i = 0; i < 4; i++)
        {
            try
            {
                Thread.sleep(2000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            System.out.println("python developers");
        }
    }
}
public class MultiThreading4 {
    static void main(String[] args) {

        java3 obj1=new java3();
        python3 obj2=new python3();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();

    }
}
