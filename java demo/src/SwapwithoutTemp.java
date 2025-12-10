public class SwapwithoutTemp {
    static void main() {

        int a=10;
        int b=20;

        System.out.println("before swapping "+a+" "+b);

       a=a+b;
       b=a-b;
       a=a-b;

        System.out.println("after swapping "+a+" "+b);

    }
};
