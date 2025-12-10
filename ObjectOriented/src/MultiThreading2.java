class java{
    public void details() {
        for (int i = 0; i < 4; i++)
        {
            System.out.println("java developers");
            try                           // by using normal thread method but without using multithreading
            {
                Thread.sleep(3000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class python{
    public void details() {
        for (int i = 0; i < 4; i++)
        {
            System.out.println("python developers");
            try
            {
                Thread.sleep(3000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
public class MultiThreading2 {
    static void main(String[] args) {

        java obj1=new java();
        python obj2=new python();

        obj1.details();
        obj2.details();

    }
}



