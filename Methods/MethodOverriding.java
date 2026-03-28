import java.util.*;
class Animal{
    void move(){ //
        System.out.println("Inside Animal");
    }
    static void sound(int decible){
        System.out.println("Animal sounds upto "+decible+" mdecibles");
    }
}
class Cat extends Animal{
    @Override void move(){ //@Override correct the spelling mistake ,and corected by java compiler
        //super.move();
        System.out.println("Inside Cat class");
    }
    static void sound(int dec){ //when we using static keyword child class suppress ,executes only parent class sound method
        System.out.println("Cat can sound upto 10 decibles"); //if not mentioned static the child class executes by overriding the parent class
    }
}
/*
class Dog extends Animal{

}
*/
public class MethodOverriding{
    public static void main(String[] args){
        //Animal ob1 = new Cat();
        Cat ob1 = new Cat(); 
        ob1.move();
        ob1.sound(10);
        //ob1 = new Dog();
    }
}
