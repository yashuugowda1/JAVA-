package ARRAY;

import java.util.Scanner;

public class MulArray2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows and columns");

        int r=sc.nextInt();
        int c=sc.nextInt();

        int[][] matrix = new int[r][c];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix [i][j]=sc.nextInt();

            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                {
                    System.out.print(matrix[i][j]);
                }
            }
            }
        System.out.println();

    }
}
