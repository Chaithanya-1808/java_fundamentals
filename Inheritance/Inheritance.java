import java.util.*;
class Animal{ //parent/super class
    void sound_animal(){
        System.out.println("This is animal class");
    }
}
class Cat extends Animal{ //child/subclass 
    void sound(){
        System.out.println("This is Cat class");
    }
}
class Dog extends Animal{ //child/subclass 
    void sound(){
        System.out.println("This is Dog class");
    }
}
class Cow extends Animal{ //child/subclass 
    void sound(){
        System.out.println("This is Cow class");
    }
}
public class Inheritance{
    public static void main(String[] args){
        Dog ob1 = new Dog();
        ob1.sound();
        ob1.sound_animal(); //animal class 
        Animal obj = new Animal();
        obj.sound_animal();
        System.out.println();
        Cat ob2 = new Cat();
        ob2.sound();
        ob2.sound_animal();
        System.out.println();
        Cow ob3 = new Cow();
        ob3.sound();
        ob3.sound_animal();
        
    }
}