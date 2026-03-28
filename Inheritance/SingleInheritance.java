import java.util.*;
class Vehicle{
    String name;
    Vehicle(){
        System.out.println("The constructor of vehicle class");
    }
}
class Car extends Vehicle{
    Car(){
        System.out.println("The constructor of Car class");
    }
}
public class SingleInheritance{
    public static void main(String[] args){
        Car ob1 = new Car();
        
    }
}