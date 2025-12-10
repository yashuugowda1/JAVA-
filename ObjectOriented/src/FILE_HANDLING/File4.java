package FILE_HANDLING;

import java.io.FileOutputStream;

public class File4 {
    public static void main(String[] args) {
        String s= "goood noon";
        try( FileOutputStream obj=new FileOutputStream("yassssshh.txt")){
            {

                byte[] bytes=s.getBytes();
                obj.write(bytes);

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}