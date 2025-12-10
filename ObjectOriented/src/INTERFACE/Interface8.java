package INTERFACE;

interface Bird{

    void bird(String colour, int age);

}
interface parrot{

    void PA( String colour);
}

interface peacock{

   void PC(String colour);
}

class Bird_class implements Bird{

    public void bird(String colour, int age)
    {
        System.out.println("BIRD COLOUR IS : " + colour);
        System.out.println("BIRD AGE IS : " + age);
    }

    public void parrot(String colour)
    {
        System.out.println("\nPARROT COLOUR IS : " + colour);
    }

    public void peacock(String colour)
    {
        System.out.println("\nPEACOCK COLOUR IS : " + colour);
    }
}

public class Interface8 {
    static void main() {

        Bird_class obj =new Bird_class();

        obj.bird("RED",3);
        obj.parrot("WHITE");
        obj.peacock("RED");

    }
}