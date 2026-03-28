import java.util.*;
class Vehicle{
    String name;
    Vehicle(){
        System.out.println("The constructor of vehicle class");
    }
}
class fourwheeler extends Vehicle{
    fourwheeler(){
        System.out.println("The constructor of fourwheeler class");
    }
}
class Car extends fourwheeler{
    Car(){
        System.out.println("The constructor of Car class");    
    }
}
public class MultilevInheritance{
    public static void main(String[] args){
        Car ob1 = new Car();
        
    }
}