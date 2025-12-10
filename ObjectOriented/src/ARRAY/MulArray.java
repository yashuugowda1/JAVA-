package ARRAY;

public class MulArray {
    static void main(String[] args) {
        int Array[][] = {
                {3, 4, 2},
                {5, 4, 8},
                {7, 5, 6}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Array[i][j]);
            }
            System.out.println();
        }
    }
    }
