import java.util.*;
abstract class Animal{ //abstract class
    abstract void show(String animal_name); //abstract method
    void display(){ //concrete method
        System.out.println("Abstract class");
    }
}
class Cat extends Animal{ //concrete class
    void show(String animal_name){ //abstract method implemented in the concrete class 
        System.out.println("Animal name is "+animal_name);
    }
}
public class AbstractKeyword{
    public static void main(String[] args){
        /*
        Animal ob1 = new Animal(); 
        ob1.show("Kitten"); error: Animal is abstract; cannot be instantiated
        */
    }
}