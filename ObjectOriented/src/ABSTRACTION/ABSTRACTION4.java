package ABSTRACTION;

abstract class bird{
    String color;
    String name;
    bird(String color,String name){

        this.color=color;
        this.name=name;

    }
    abstract void Bird1 ();

    abstract void Bird2 (String name, String breed, int age );

    void dog (String name, String breed,String color)

    {
        System.out.println("\nDOG NAME IS :"+name+"\n DOG BREED IS :"+breed+"\nDOG COLOR IS : "+color);

    }
}
class Details extends bird{

    Details(String color,String name){
        super(name,color);
    }
    void Bird1()
    {
        System.out.println("\nBIRD NAME IS :"+name+"\nBIRD COLOR IS :"+color);
    }
    void Bird2(String name, String breed, int age)
    {
        System.out.println("\nBIRD NAME IS :"+name+"\nBIRD BREED IS :" +breed+"\nBIRD AGE IS : "+ age);
    }

}

public class ABSTRACTION4 {
    static void main() {

        Details obj=new Details("white","brat");

        obj.Bird1();

        obj.Bird2("beast","german",21);
        obj.dog("DANGER","RETRIEVER","BLACK");

    }
}
