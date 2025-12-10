package CONSTRUCTOR;

class person12{

    String name1;
    int age1;
    person12(String name , int age)
    {
        name1=name;
        age1=age;
    }
    public void Details()
    {
        System.out.println(name1+" "+age1);
    }
}
public class ConstructorAssign2 {
    static void main() {

        person12 obj=new person12("yash",55);
        obj.Details();

    }
}