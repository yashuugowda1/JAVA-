import java.util.Locale;

public class PreDefinedMethods2 {
    static void main() {

        String name = "java full stack developer";

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.charAt(1));
        System.out.println(name.replace("Y","y"));
        System.out.println(name.repeat(5));
        System.out.println(name.contains("yashwanth"));
        System.out.println(name.contains("Yashwanth"));
        System.out.println(name.equals("Yashwanth"));
        System.out.println(name.equals(" Yashwanth Gowda "));
        System.out.println(name.equalsIgnoreCase("Yashwanth Gowda"));
        System.out.println(name.startsWith("yashwanth"));
        System.out.println(name.startsWith(" Yashwanth"));
        System.out.println(name.endsWith("Gowda "));
        System.out.println(name.substring(3,7));
        System.out.println(name.concat("is good"));


    }
}
