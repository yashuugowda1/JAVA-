import java.util.Scanner;

public class leap {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year !");
        int Year= sc.nextInt();

        if(Year%4==0 && Year%100==00 || (Year%400==0)){
            System.out.println("Leap Year BUDDY!");
        }
        else{
            System.out.println("Oops! Not a Leap Year DUDE|");
    }



}
}