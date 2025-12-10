package OOPS;

class EastPoint
{
    String college = "East Point College";
    String Sname = "Yash";
    int usn = 11;

}
public class Oops2 {
    static void main() {
        EastPoint obj = new EastPoint();
        System.out.println("college name is : "+ obj.college+" "+ "\nstudent name is : "+ obj.Sname+" "+ "\nstudent usn is : "+obj.usn);
    }
}
