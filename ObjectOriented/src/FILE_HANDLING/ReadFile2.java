package FILE_HANDLING;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile2 {
    static void main(String[] args) {

        try {

        List<String> obj = Files.readAllLines(Paths.get("gowdru.txt"));
            for(String s: obj){
                System.out.println(s);
            }
        }
        catch (Exception e){

        }
    }
}