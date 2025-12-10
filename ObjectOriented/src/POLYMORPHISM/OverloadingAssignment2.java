package POLYMORPHISM;

class maths{

    public double interest(double p, double r)
    {
       return p*r/100;
    }
    public double interest(double p, double r, double t)
    {
        return p*r*t/100;
    }
}

public class OverloadingAssignment2 {
    static void main() {
        maths obj1 =new maths();
       
        System.out.println("RATE OF INTEREST :"+ obj1.interest(20,30));
        System.out.println("RATE OF INTEREST WITH RIME :"+ obj1.interest(30,40,50));

    }
}
