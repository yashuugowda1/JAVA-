package OOPS;

class EastPoint1
{
    String college = "East Point College";
    String Sname = "Yash";
    int usn = 011;

}
class seshadripura
{
    String college = "SCPUC";
    String Sname = "Yashwanth";
    int Register = 47;

}
public class Oops3 {
    static void main() {
        EastPoint1 obj = new EastPoint1();
        seshadripura obj2 = new seshadripura()
;
        System.out.println("college name is : "+ obj.college+" "+ "\nstudent name is : "+ obj.Sname+" "+ "\nstudent usn is : "+obj.usn);
        System.out.println("\ncollege name is : "+ obj2.college+" "+ "\nstudent name is : "+ obj2.Sname+" "+ "\nstudent usn is : "+obj2.Register);

    }
}
