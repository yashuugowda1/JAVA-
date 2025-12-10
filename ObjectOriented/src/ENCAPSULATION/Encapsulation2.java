package ENCAPSULATION;

class encap1{

    private String name="yash";          ///we are using SETTER method (Read only Method)
    private int age=21;

    public String setName(String name1){

        name=name1;
        return name;
    }

    public String getName()
    {
        return name;
    }
    public int setAge(int age1){

        age=age1;
        return age;
    }

    public int getAge()
    {
        return age;
    }
}
public class Encapsulation2 {
    static void main() {

        encap1 obj=new encap1();
        obj.setName("raj");
        obj.setAge(22);
        System.out.println(obj.getAge());
        System.out.println(obj.getName());

    }
}
