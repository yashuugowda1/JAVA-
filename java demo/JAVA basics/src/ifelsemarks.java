import java.util.Scanner;

public class ifelsemarks {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks:\n");
        int marks = sc.nextInt();

        if(marks>90 && marks<101){
            System.out.println("A");
        } else if (marks>=80 && marks<101) {
            System.out.println("B");

        } else if (marks>=70 && marks<101) {
            System.out.println("C");
        }
        else if (marks>=60 && marks<101) {
            System.out.println("D");
        }
        else if (marks>=50 && marks<101) {
            System.out.println("e");
        }
        else if(marks>100 ){
            System.out.println("Error");
  }
}

}