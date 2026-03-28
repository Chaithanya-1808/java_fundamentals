import java.util.*;
/*
class Car{
    String color;
    int seating;
    int model;
    void displaydetails(){
        System.out.println("color: "+color);
        System.out.println("seating: "+seating);
        System.out.println("model: "+model);
    }
}
public class ClassExample2{
    public static void main(String[] args){
        Car obj1 = new Car();
        obj1.color = "Black";
        obj1.seating = 5;
        obj1.model = 2025;
        obj1.displaydetails();
    }
}
*/
class Person{
    String name;
    char Gender;
    int age;
    float height;
    int weight;
    void Walking(){
        System.out.println(name +" "+"is walking");
    }
    void Talking(){
        System.out.println(name +" "+"is Talking");
    }
}
public class ClassExample2{
    public static void main(String[] args){
        Person obj1 = new Person();
        obj1.name = "Chaithanya";
        obj1.Gender = 'F';
        obj1.age = 19;
        obj1.height = 5.2f;
        obj1.weight = 46;
        obj1.Walking();
        obj1.Talking();
    }
}