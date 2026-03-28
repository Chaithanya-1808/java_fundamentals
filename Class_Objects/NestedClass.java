import java.util.*;
class Outer{
    int age = 19;
    String name = "Chaithanya C";
    class Inner{
        double cgpa = 9.55;
        void display(){
            System.out.println("Inside Inner Class");
            System.out.println("Age : "+age);
            System.out.println("Name : "+name);
            System.out.println("CGPA : "+cgpa);
        }
    }
    
}

public class NestedClass{
    public static void main(String[] args){
        Outer.Inner ob1 = new Outer().new Inner();
        ob1.display();
    }
}
/*
import java.util.*;
class Outer{
    int age = 19;
    String name = "Chaithanya C";
    void display(){
        Inner ob1 = new Inner();
        ob1.display();
    }
    class Inner{
        double cgpa = 9.55;
        void display(){
            System.out.println("Inside Inner Class");
            System.out.println("Age : "+age);
            System.out.println("Name : "+name);
            System.out.println("CGPA : "+cgpa);
        }
    }
    void show(){//error: symbol: variable cgpa ,location: class Outer
        System.out.println("CGPA : "+cgpa);
    }
    
}

public class NestedClass{
    public static void main(String[] args){
        Outer ob2 = new Outer();
        ob2.display();
        ob2.show();
    }
}
*/