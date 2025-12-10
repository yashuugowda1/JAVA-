package FILE_HANDLING;

import java.io.FileOutputStream;

public class binaryfile {
    static void main(String[] args) {
        String s ="yash.jpg";

        try( FileOutputStream obj=new FileOutputStream(s))
        {

            System.out.println("File created sucessfully");

        }
        catch (Exception e) {
            System.out.println("File failed to create");
}
}
}