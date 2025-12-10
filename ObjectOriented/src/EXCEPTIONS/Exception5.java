package EXCEPTIONS;

public class Exception5 {
    public static void main(String[] args) {
        try {
            int[] marks = {100, 99, 90};

            // This will cause ArrayIndexOutOfBoundsException
            System.out.println(marks[4]);

            // This will cause ArithmeticException
            int result = 100 / 0;
            System.out.println(result);

        } catch (Exception e) {
            System.out.println(e);

        } catch (ExceptionInInitializerError e) {
            System.out.println(e);
        }
    }
}