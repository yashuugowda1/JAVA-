package INTERFACE;

interface grandparent{

    void gf(int age);

}
interface father123 extends grandparent {

   void F(int age);

}

class child123 implements grandparent{

    public void gf(int age)
    {
       System.out.println("Age Of Grandfather is :" +age );
    }

    public void F(int age)
    {
        System.out.println("Age Of Father is :" +age );
    }

    }

public class Interface6 {
    static void main() {
        child123 obj=new child123();
        obj.gf(68);
        obj.F(54);
    }
}
