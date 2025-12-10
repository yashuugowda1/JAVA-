package POLYMORPHISM;

class over {
     public void add(int a, int b)
     {
         System.out.println(a+b);
     }

public void add(int a, int b, int c)
{
    System.out.println(a+b+c);
}
}

public class Overloading {
    static void main() {
        over obj=new over();
        obj.add(54,5,5);
        obj.add(54,5);

    }
}
