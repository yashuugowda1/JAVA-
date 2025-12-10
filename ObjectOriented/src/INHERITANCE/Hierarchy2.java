package INHERITANCE;

class cars{
    String fuel;
    int no_of_seats;

    cars(String fuel, int no_of_seats){

    this.fuel=fuel;
    this.no_of_seats=no_of_seats;
}
        public void car_D(){

            System.out.println(fuel+" "+no_of_seats);
        }
    }
class Bmw extends cars{
    String color;
    int price;
    String model;

    Bmw(String color, int price, String model,String fuel,int no_of_seats ){

        super(fuel, no_of_seats);
        this.color=color;
        this.price=price;
        this.model=model;

    }
    public void Bmw_D(){

        System.out.println(color+" "+price+" "+model+" "+fuel+" "+no_of_seats);

    }
}
class Ford extends cars{

    String color;
    int price;
    String model;

    Ford(String color, int price, String model, String fuel, int no_of_seats ){

        super(fuel, no_of_seats);
        this.color=color;
        this.price=price;
        this.model=model;

    }
    public void Ford_D(){
        System.out.println(color+" "+price+" "+model+" "+fuel+" "+no_of_seats);

    }
}

public class Hierarchy2 {
    static void main() {
        cars obj = new cars("diesel", 2);
        Bmw obj2=new Bmw("black",87898798,"YG1234","PD",5);
        Ford obj1 = new Ford("white", 2222, "yg1234","petrol", 12);
        obj1.Ford_D();
        obj2.Bmw_D();
        obj.car_D();


    }
}
