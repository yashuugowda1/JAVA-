class one{
    public void parent()
    {
        System.out.println("parent");
    }
}

class two extends one{
    public void child1 ()
    {
        System.out.println("child1");
    }
}

class three extends one{
    public void child2 ()
    {
        System.out.println("child2");
    }
}

public class Hierarchy1 {
    static void main() {

        one obj =  new one();
        obj.parent();
    }
}
