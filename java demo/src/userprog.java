import java.util.Scanner;

class person1{
    public void details(String name, int age)
    {

        System.out.println(name+" "+age);
    }
}
public class userprog {
    static void main() {
        person1 obj=new person1();
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter all the details ");
        String name =sc.nextLine();
        int age =sc.nextInt();
        obj.details(name,age);
        obj.details(name="yash",age= 21);




    }
}
