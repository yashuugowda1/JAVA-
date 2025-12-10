package POLYMORPHISM;

class bank{
    public void bank1(String name, String address)
    {
        System.out.println("NAME OF THE BANK :"+ name +"\nBANK ADDRESS "+address);
    }
    public void bank2(String name, String IFSC, int ACC_no)
    {
        System.out.println("\nNAME OF THE BANK : "+name +"\nBANK IFSC : "+IFSC+"\nBANK ACCOUNT NUMBER: "+ACC_no);
    }

}

public class MethodOverloadingAssignment {
    static void main() {
        bank obj=new bank();
        obj.bank1("CANARA BANK","BENGALURU KARNATAKA");
        obj.bank2("KOTAK BANK","KMB20100",1234567891);
    }
}
