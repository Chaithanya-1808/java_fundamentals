import java.util.*;
class Vehicle{
    int wheels;
    String type;
    void display(){
        System.out.println("This is vehicle class");
    }
}
class Car extends Vehicle{
    void display(){
        System.out.println("Car class Number of wheels "+wheels);
    }
}
class Bus extends Vehicle{
    void display(){
        System.out.println("Bus class Number of wheels "+wheels);
    }
}
class Mini extends Bus{
    void display(){
        System.out.println("Mini class Number of wheels "+wheels);
    }
}
public class HybridInheritance{
    public static void main(String[] args){
        Mini ob1 = new Mini();
        ob1.display();
    }
}
