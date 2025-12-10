package ARRAY;

import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");

        int size= sc.nextInt();
        int[] array=new int[size];

        System.out.println("enter the array :");

        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        for(int i=array.length-1;i>=0;i--){
            System.out.println(array[i]);
 }
}
}