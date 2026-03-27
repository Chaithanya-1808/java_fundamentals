import java.util.*;
final class Animal{
    final int age = 12;
    final void move(){
        System.out.println("Animal class");
    }
}
class Cat extends Animal{ //error: cannot inherit from final Animal
    @Override void move(){
        System.out.println("Cat class");
    }
}
public class FinalKeyword{
    public static void main(String[] args){
        Animal ob1 = new Animal();
        System.out.println(ob1.age);
        ob1.age = 20; //error: cannot assign a value to final variable age
        Cat ob2 = new Cat();
        ob2.move(); //error: move() in Cat cannot override move() in Animal
    }
}
