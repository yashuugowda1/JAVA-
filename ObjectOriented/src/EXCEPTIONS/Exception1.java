package EXCEPTIONS;

public class Exception1 {
    static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;                 //Arthimetic
            System.out.println(c);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
