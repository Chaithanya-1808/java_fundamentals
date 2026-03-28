import java.util.*;
class Parent{
    int age = 50;
    String name = "Ravi";
    void display(){
        System.out.println("Parent age "+age);
        System.out.println("Parent name is "+name);
    }
}
class Child extends Parent{
    int age;
    void display(){
        super.display(); //calls the parent class
        System.out.println("Child age = "+age);
        System.out.println("Parent age = "+super.age);
        System.out.println("Child name is "+name);
    }
}
public class SuperVariable{
    public static void main(String[] args){
        Child ob1 = new Child();
        ob1.age = 19;
        ob1.display();
    }
}