import java.util.*;
class Cellphone{
    String name;
    int mfd;
    String color;
    String type;
    double price;
    void phoneinfo(){
        System.out.println("The phone name is "+name);
    }
}
public class ClassExample3{
    public static void main(String[] args){
        System.out.println("Cellphone information1: ");
        Cellphone obj1 = new Cellphone();
        obj1.name = "VIVO Y28s 5G";
        obj1.mfd = 2025;
        obj1.color = "Blue";
        obj1.type = "Smart phone";
        obj1.price = 20000.00;
        obj1.phoneinfo();
        System.out.println();//space in nextline
        System.out.println("Cellphone information2: ");
        Cellphone obj2 = new Cellphone();
        /*
        obj2.name = "Iphone";
        obj2.mfd = 2026;
        obj2.color = "Orange";
        obj2.type = "Smart phone";
        obj2.price = 150000.00;
        */
        obj2 = obj1;   //both are addressing at same memory
        obj2.phoneinfo();
        obj1.name = "Iphone";
        obj1.phoneinfo();
        obj2.phoneinfo();

        obj1 = null;
        obj2.phoneinfo();


    }
}