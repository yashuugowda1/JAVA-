package OOPS;

class car{
    String name = "BenzAMG";
    int id =1234;
    String color = "Black";
    String model = "Yash123";
    String Reg_no = "KA 11 YG 1111";

}
class bike1 {
    String name = "TriumphScrambller";
    int id = 777;
    String color = "Black";
    String model = "YG123";
    String Reg_no = "KA 77 YG 7777";
}



public class objectoriented {
    static void main() {


        car obj =new car();
        bike1 obj2 =new bike1();
        System.out.println("Car Name is  : "+ obj.name+" "+ "\nid is : "+ obj.id+" "+ "\nModel is : "+obj.model + "\nReg_no is : "+obj.Reg_no);
        System.out.println("\nBike Name is  : "+ obj2.name+" "+ "\nid is : "+ obj2.id+" "+ "\nModel is : "+obj2.model + "\nReg_no is : "+obj2.Reg_no);



    }
}
