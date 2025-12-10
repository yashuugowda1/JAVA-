package CONSTRUCTOR;

class assign1 {
    public int addition(int a,int b)
    {
        return a+b;
    }

    public int multiplication(int a,int b)
    {
        return a*b;
    }

    public int sub(int a,int b)
    {
        return a-b;
    }

    public int div(int a,int b)
    {
        return a/b;
    }


}
public class ConstructorAssign1 {
    static void main() {

        assign1 obj1=new assign1();
        assign1 obj2=new assign1();
        assign1 obj3=new assign1();
        assign1 obj4=new assign1();

        System.out.println("ADDITION :" + obj1.addition(12, 5));
        System.out.println("MULTIPLICATION :" + obj2.multiplication(12, 5));
        System.out.println("SUBTRACTION :" + obj3.sub(12, 5));
        System.out.println("DIVISION :" + obj4.div(12, 5));

    }
}
