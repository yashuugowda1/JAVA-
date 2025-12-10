package EXCEPTIONS;

public class Exception3 {

    static void main(String[] args) {
        try {

            String name = "null";              //its a null value
            System.out.println(name.length());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("hello good noon !!");
        }
    }
}