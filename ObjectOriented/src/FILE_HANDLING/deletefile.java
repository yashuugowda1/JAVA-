package FILE_HANDLING;

import java.io.File;

public class deletefile {
    static void main(String[] args) {

        File obj = new File("pra.txt");
        if(obj.exists())
        {
            if(obj.delete())
            {
                System.out.println("file deleted successfully");
            }

            else
            {

                System.out.println("file not deleted");
            }
        }

        else
        {
            System.out.println("file not found");
        }
    }
}