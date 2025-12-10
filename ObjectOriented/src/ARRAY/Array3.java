package ARRAY;

public class Array3 {
    static void main() {

        int array[] = {4, 5, 12, 8};
        int large = array[0];           //

        for (int i = 1; i < array.length; i++) {

            if (array[i] > large) {

                large = array[i];
            }

        }
        System.out.println(large);

    }
}