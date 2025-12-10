import java.util.Scanner;

public class ifelse {

    //1

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age= sc.nextInt();

        if(age>18){
            System.out.println("Great, Eligible for Voting !");
        }

        else{
            System.out.println("Ooops, sorry better try next YEAR !");
    }

}

}