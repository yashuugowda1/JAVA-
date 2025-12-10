class Dog {

    String name;
    int age;
    Dog(String name, int age) {

        this.name=name;
        this.age=age;
    }

        public void DogD()
        {
            System.out.println(name+" "+age);
        }

}
class baby extends Dog{

    String color;
    baby (String color,String name, int age)
    {
        super(name,age);
        this.color=color;
    }
    public void babyd(){

        System.out.println(color+" "+name+" " +age);
    }
    }
public class Inheritance2 {
    static void main() {

        baby obj=new baby("blue", "yash",12);
        obj.babyd();
    }
}
