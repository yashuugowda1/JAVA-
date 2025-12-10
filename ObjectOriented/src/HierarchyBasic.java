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

public class HierarchyBasic {
    static void main() {

        two obj =  new two();
        obj.parent();
        obj.child1();

        three obj1 = new three();
        obj1.child2();
    }
}
