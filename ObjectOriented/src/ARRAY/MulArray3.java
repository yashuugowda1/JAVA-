package ARRAY;

import java.util.Scanner;

public class MulArray3 {
    static void main(String[] args) {                    //ADDITION OF 2 MATRIX

                Scanner sc = new Scanner(System.in);
                System.out.println("enter no of rows and cols for 1st matrix");

                int row1 = sc.nextInt();
                int col1 = sc.nextInt();

        System.out.println("enter no of rows and cols for 2nd matrix");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();

        int[][] A = new int[row1][col1];
        int[][] B = new int[row2][col2];
        int[][] C = new int[row1][col2];

        System.out.println("enter the elements of 1st matrix");

                //the below loop is for input
                for (int i = 0; i < row1; i++) {
                    for (int j = 0; j < col1; j++) {
                        A[i][j] = sc.nextInt();
                    }
                }

        System.out.println("enter the elements of 2nd matrix");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++)
            {
                B[i][j] = sc.nextInt();
            }
        }

        System.out.println("adddition of 2 matrix");

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                C[i][j] = sc.nextInt();
                {
                    C[i][j] = A[i][j] + B[i][j];
                }
            }
        }

                for (int i = 0; i < row1; i++) {
                    for (int j = 0; j < col2; j++)
                    {

                        System.out.print(C [i][j]+" ");
                    }
                    System.out.println();
                }
            }
        }