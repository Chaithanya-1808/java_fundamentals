import java.util.*;
class Vehicle{
    int wheels;
    String type;
    Vehicle(){
        wheels = 10;
        type = "Goods";
    }
    void display(){
        System.out.println("I am inside the vehicle constructor");
    }
}
class Car extends Vehicle{
    Car(){ //if constructor created in class Car it calls this only otherwise it calls constructor in parent class 
        //super();
        wheels = 4;
        type = "passenger";
    }
    void display_car(){
        System.out.println("No of wheels = "+wheels);
        System.out.println("Type = "+type);
    }
}
class Bus extends Vehicle{
    void display_bus(){
        System.out.println("No of wheels = "+wheels);
        System.out.println("Type = "+type);
    }
}
public class Heirarchial{
    public static void main(String[] args){
        Car c1 = new Car(); // car() constructor is created
        //c1.wheels = 4;
        //c1.type = "Thar";
        c1.display_car();
        Bus b1 = new Bus(); // bus() it is a default constructor
        b1.display_bus();
    }
}