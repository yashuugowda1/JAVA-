package ARRAY;

public class Array4 {
    static void main() {

        char array[] = {'Y', 'A', 'S', 'H', 'W'};
        //array[4]='U';

        for (char y : array) {

            System.out.print(y);
        }
        System.out.println("  " );

        array[4] = 'U';
        for (char y : array) {

            System.out.print(y);

        }
    }}