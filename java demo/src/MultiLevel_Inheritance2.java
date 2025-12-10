class vehicle{


    public void vehicle_d()
    {
        System.out.println("RED");
    }

}

class car1 extends vehicle{
    String regno;
    int price;
    //String color;

    car1(String regno, int price){

        //super(color);
        this.regno=regno;
        this.price=price;


    }
    public void car_d()
    {
        System.out.println(regno +" "+ price);
    }

}

class bike2 extends car1{
    String name;

    bike2(String name, String regno, int price, String color){

        super(regno, price);
        this.name=name;

    }

    public void bike_d()

    {
        System.out.println(name +" "+ regno +" " + price +" ");
    }

}
public class MultiLevel_Inheritance2 {
    static void main() {

        bike2 obj = new bike2("BMW","KA12YG7777", 120000,"RED");


       // obj.car_d();
        //obj.bike_d();

        System.out.println("BIKE NAME IS : " + obj.name +"\nBIKE REGISTER NUMBER IS : "+obj.regno+"\nBIKE PRICE IS : " + obj.price);
        obj.vehicle_d();

    }
}
