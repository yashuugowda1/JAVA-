package ARRAY;

import java.util.Scanner;

public class TWO_D_array {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows");
        int rows = sc.nextInt();

        System.out.println("enter no of cols");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];
        System.out.println("enter the array elements");

        //the below loop is for input
        for (int i = 0; i < rows; i++) {                //for rows
            for (int j = 0; j < cols; j++) {      //for cols
                numbers[i][j] = sc.nextInt();

            }
        }
        //the below loop is for output

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers [i][j]+" ");
            }
            System.out.println();
        }
    }
}
