package ENCAPSULATION;

class encap{

    private String name="yash";          ///we are using GETTER method (Write only Method)
    private int age=21;

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}
public class Encapsulation {
    static void main() {

        encap obj=new encap();
        System.out.println(obj.getAge());
        System.out.println(obj.getName());

    }
}
