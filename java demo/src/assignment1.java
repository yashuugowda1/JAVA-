import java.util.Scanner;

class student_data {
    public void info(String name, int usn, String dept, int yop) {
        System.out.println(name + " " + usn + " " + dept + " " + yop);

    }
}

public class assignment1 {
    static void main() {

        student_data obj=new student_data();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Details");

        String name =sc.nextLine();
        int usn= sc.nextInt();
        String dept =sc.next();
        int yop= sc.nextInt();

        obj.info(name,usn,dept,yop);
        System.out.println("Student name is :" + name + "\nStudent usn is :"+ usn + "\nStudent dept is :" +dept+ "\nStudent yop is :" + yop);

    }
}
