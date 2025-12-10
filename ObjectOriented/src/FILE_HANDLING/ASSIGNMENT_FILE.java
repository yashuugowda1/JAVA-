package FILE_HANDLING;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

public class ASSIGNMENT_FILE {
    static void main(String[] args)throws Exception {
        String s= "How are you mate !";

            //create file
            File obj = new File("SharpBlade.txt");
            if (obj.createNewFile())
            {
                System.out.println("file created");
            }
            else
            {
                System.out.println("not created");
            }
            // write file
            FileOutputStream obj1 = new FileOutputStream("SharpBlade.txt");
            {

                byte[] bytes = s.getBytes();
                obj1.write(bytes);

            }
            //read file
            FileReader obj2 = new FileReader("SharpBlade.txt");
            {
                int c;
                while ((c = obj2.read()) != -1) {
                    System.out.print((char) c);
                }
            }
            //delete file
            File obj4 = new File("SharpBlade.txt");

            if (obj4.exists()){
              if(obj.delete()){
                  System.out.println("the file is been deleted");
              }
              else{
                  System.out.println("the file is been deleted");
              }
          }
          else {
              System.out.println("file not found");
          }

        }
    }
