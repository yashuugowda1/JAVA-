package FILE_HANDLING;

import java.io.File;

public class FILE2 {
    public static void main(String[] args) {
        try {
            File file = new File("raj.txt");        // create File object

            if (file.createNewFile()) {         // try to create file

                System.out.println("File created successfully");
            } else {

                System.out.println("Failed to create file");
            }

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}