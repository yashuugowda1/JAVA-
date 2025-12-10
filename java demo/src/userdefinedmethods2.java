class defined {
    public void greet() {
        System.out.println(" Hello Developers ");
    }

    public int add(int a, int b)
    {
        return a+b;
    }

}
public class userdefinedmethods2 {
    static void main() {
        defined obj= new defined();
        obj.greet();

        int r=obj.add(56,5);

        System.out.println(r);

    }
}
