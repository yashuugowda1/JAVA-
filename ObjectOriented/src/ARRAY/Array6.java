package ARRAY;

import java.util.Scanner;

public class Array6 {
    static void main(String[] args) {

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Size Of Array");

                int size=sc.nextInt();
                int [] array= new int[size];

                System.out.println("Enter the array elements");
                for (int i=0; i<size; i++)
                {
                    array[i] = sc.nextInt();
                }

                    int sum=0;
                    for (int i=0;i<size;i++)

                    {
                        sum+=array[i];
                    }
                    System.out.println("sum is : "+sum);
                    int avg=sum/size;
                    System.out.println("avg is :"+ avg);
    }
}










































