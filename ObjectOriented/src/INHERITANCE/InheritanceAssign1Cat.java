package INHERITANCE;

class Parent_Cat {

    String name;
    String breed;
    int age;

    Parent_Cat(String name, String breed, int age) {

        this.name=name;
        this.breed=breed;
        this.age=age;
    }

    public void PCat_D()
    {
        System.out.println(name+" "+breed+" "+age);
    }

}
class Baby_cat extends Parent_Cat{

    String color;
    String gender;
    Baby_cat (String color, String gender, String name, String breed, int age)
    {
        super(name,breed,age);
        this.color=color;
        this.gender=gender;
    }
    public void Baby_D(){

        System.out.println(color +" "+gender + " "+ name+" " + breed +" "+age);
    }
}
public class InheritanceAssign1Cat {

    static void main() {

        Baby_cat obj=new Baby_cat("blue","male", "alex", "Persian", 2);
        obj.Baby_D();
    }
}