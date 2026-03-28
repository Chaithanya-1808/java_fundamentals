import java.util.*;
class Parent{
    int age;
    String name;
    Parent(){
        //age = 60; //remove using super
        //name = "Something"; //remove using super
    }
    Parent(int age,String name){ // it should be a non parametrized constructor
        this.age = age;
        this.name = name;
    }
}
class Child extends Parent{
    int age;
    Child(){
        //super(50,"Ravi");
        age = 20;
        //super(50,"Ravi"); error:call to super must be first statement in constructor
    }
    void display(){
        System.out.println("Child age = "+age);
        System.out.println("Parent age = "+super.age);
        System.out.println("Child name is "+name);
    }
}
public class SuperConstructor{
    public static void main(String[] args){
        Child ob1 = new Child();
        ob1.display();
    }
}
