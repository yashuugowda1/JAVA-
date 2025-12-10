package POLYMORPHISM;

class Parent{
    public void mobile(String name, int RAM, String processor)

    {
        System.out.println("\nMOBILE NAME IS : "+ name +"\nMOBILE RAM IS : "+ RAM +"\nMOBILE PROCESSOR IS : "+ processor );
    }

}
class Child extends Parent{

    public void mobile(String name, int RAM, String processor, String storage){
        System.out.println( "\nMOBILE NAME :" +name +"\nMOBILE RAM IS : "+ RAM +"\nMOBILE PROCESSOR IS "+ processor+"\nSTORAGE IS "+ storage );
    }

    public void laptop(String name, int RAM, String processor, String storage)
    {

        System.out.println("\nLAPTOP NAME IS :"+name+"\nLAPTOP RAM IS : "+ RAM +"\nLAPTOP PROCESSOR IS : "+ processor+"\nSTORAGE IS : "+ storage );
    }

}

public class Overriding2 {
    static void main() {

        Parent obj=new Parent();
        obj.mobile("MOTO",6,"DIMENSITY");

        Child obj1=new Child();
        obj1.mobile("realme",6,"snapdragon","ufs4");
        obj1.laptop("asus",8,"RYZEN7SERIES","DDR5");

    }
}
