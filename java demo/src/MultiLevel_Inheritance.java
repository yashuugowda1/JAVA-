class a{
    public void demo1()
    {
        System.out.println("grand parent");
    }

}
class b extends a{
    public void demo2()
    {
        System.out.println("parent");
    }

}
class c extends b{
    public void demo3()
    {
        System.out.println("child");
    }

}
public class MultiLevel_Inheritance {
    static void main() {

        c obj = new c();

        obj.demo1();
        obj.demo2();
        obj.demo3();

    }
}
