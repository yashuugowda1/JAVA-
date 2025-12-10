package ABSTRACTION;

abstract class shop{

    String name;
    String type;

    shop(String name, String type){

        this.name=name;
        this.type=type;

    }
    abstract void shop_d();

}

class shop1 extends shop{



    shop1(String name, String type, String address)
    {
        super(name, type);

    }
    void shop_d(){

        System.out.println(name+" "+ type);

    }
}

public class ABSTRACTION3 {
    static void main() {
        shop1 obj = new shop1("yash","provision","BLR");
        //obj.shop_info();

    }
}
