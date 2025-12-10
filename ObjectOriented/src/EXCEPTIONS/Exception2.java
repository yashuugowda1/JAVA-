package EXCEPTIONS;

public class Exception2 {
    static void main(String[] args) {
        int [] marks = {99,97,98};
        try {

            System.out.println(marks [6]);        //Array
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
