package POLYMORPHISM;

class square {

        public int area(int a) {
            return a*a;
        }


    public int area(int l, int b) {
        return l*b;

    }
    public double area(double r) {
        return 3.14*r*r;

    }

}

public class Overloading2 {
    static void main(String [] args) {

        square obj=new square();
        obj.area(5);
    }
}
