package STATIC_NESTED_CLASSES;

class outer3{

    private int age=21;

    public class inner3 {

        int getValue() {
           return age;
        }
    }
    }
public class inner2 {
    public static void main(String[] args) {

        outer3 obj = new outer3();
        outer3.inner3 obj2=obj.new inner3();

        System.out.println(obj2.getValue());

    }
    }

