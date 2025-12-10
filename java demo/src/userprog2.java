import java.util.Scanner;
class company{
    public void details(String name, String dept, int salary)
    {

        System.out.println(name+" "+ salary +" "+ dept);

    }

    public void information(String Department, int ID)
    {
        System.out.println(Department+" "+ ID);
    }

}
public class userprog2 {
    static void main() {
        company obj=new company();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter OOPS.Employee Details ");

        String name =sc.nextLine();
        int salary =sc.nextInt();
        String dept =sc.next();

        System.out.println("Enter Department Details");

        String Department =sc.next();
        int ID =sc.nextInt();


        obj.details(name,dept,salary);
        obj.information(Department,ID);


        System.out.println("OOPS.Employee name is :" + name + "\nOOPS.Employee salary is :" + salary+ "\nOOPS.Employee dept is :" + dept);
        System.out.println("\nDepartment name is :" + Department + "\nDepartment ID is :" + ID);


    }
}
