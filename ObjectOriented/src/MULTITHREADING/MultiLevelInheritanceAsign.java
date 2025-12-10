package MULTITHREADING;

class college {

    String college_name;
    String address;

    college(String college_name, String address){

        this.college_name=college_name;
        this.address=address;
    }

    public void College_D()

    {
        System.out.println(college_name+" "+address);
    }
}

class department extends college{

    String dept_name;
    //String college_name;
    // String  address;

    department(String dept_name, String college_name, String address){

        super(college_name, address);
        this.dept_name=dept_name;

    }

    public void dept_D()

    {
        System.out.println(dept_name+" "+ college_name +" "+ address);
    }
}

class student extends department{

    String S_name;
    int usn;

    student(String S_name, int usn, String dept_name, String college_name, String address){

        super(dept_name, college_name,address);
        this.S_name=S_name;
        this.usn=usn;

    }
    public void S_Details()
    {
        System.out.println(S_name+" "+usn+" "+dept_name+" "+ college_name +" "+ address );
    }
}

public class MultiLevelInheritanceAsign {
    static void main() {


        student obj=new student("yash",11, "AI","EAST POINT","HOSKOTE");
        //  obj.S_Details;

    }
}
