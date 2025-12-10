package CONSTRUCTOR;

class const1{
    const1()
    {
        System.out.println("hello mate !");
    }
    const1(String name, int age)
    {
        System.out.println(name +" "+age);
    }
    const1(String name)
    {
        System.out.println(name);
    }

}
public class ConstructorBasics2 {
    static void main() {

        const1 obj=new const1();
        const1 obj1=new const1("shiva ",21);
        const1 obj2=new const1("yash");


    }
}
