package MULTITHREADING;

class java2 extends Thread{
    public void run() {
        for (int i = 0; i < 4; i++)
        {
            try                 // by using normal class and by using Thread
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
    class python2 extends Thread{
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
    public class MultiThreading3 {
        static void main(String[] args) {

            java2 obj1=new java2();
            python2 obj2=new python2();

            obj1.start();
            obj2.start();

        }
    }
