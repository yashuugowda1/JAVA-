package FILE_HANDLING;

import java.io.File;
import java.io.FileWriter;

public class File3 {
    public static void main(String[] args) {
        try{

        File obj = new File("gowdru.txt");

        if(obj.createNewFile())
        {

            System.out.println("file is created");
        }
        else
        {

            System.out.println("file is not cretaed");
        }

            FileWriter obj1 = new FileWriter("gowdru.txt");

        obj1.write("hello !, how are you");
            obj1.write("\nhey !, i am fine");
            obj1.write("\nhey !, i am fine");
            obj1.write("\nhey !, i am fine");
        obj1.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}