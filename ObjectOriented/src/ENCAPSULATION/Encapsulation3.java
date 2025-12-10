package ENCAPSULATION;

class encap3{

    private String c_name="east point";
    private String name="yash";
    private int usn =11;

    public String setc_name(String c_name1){

        name=c_name1;
        return name;
    }

    public String getName()
    {
        return name;
    }

    public String setname(String name1){

        name=name1;
        return name;
    }

    public String getnamme()
    {
        return name;
    }



    public int setusn(int usn1){

        usn=usn1;
        return usn;
    }

    public int getUsn()
    {
        return usn;
    }
}
public class Encapsulation3 {
    static void main() {

        encap3 obj=new encap3();
        obj.setc_name("YASH ");
        obj.setusn(11);

        System.out.println("USN IS :"+obj.getUsn());
        System.out.println("NAME IS :"+obj.getName());
        System.out.println("COLLEGE IS :"+obj.setc_name("EAST_POINT"));



    }
}
