import java.util.*;
class Box{
    //instance variables
    double height;
    double width;
    double breadth;
    //instance method
    void volume(){
        System.out.println(height*width*breadth);
    }
}
public class ClassExample{
    public static void main(String[] args){
        System.out.print("object 1: ");
        Box obj1 = new Box(); //object for class box
        obj1.height = 2.0;
        obj1.width = 5.0;
        obj1.breadth = 3.0;
        System.out.println(obj1.height+" "+obj1.width+" "+obj1.breadth);
        //double volume1 = obj1.height*obj1.width*obj1.breadth;
        //System.out.println("volume 1: "+volume1);

        System.out.print("object 2: ");
        Box obj2 = new Box();
        obj2.height = 10.0;
        obj2.width = 20.0;
        obj2.breadth = 30.0;
        System.out.println(obj2.height+" "+obj2.width+" "+obj2.breadth);
        //double volume2 = obj2.height*obj2.width*obj2.breadth;
        //System.out.println("volume 2: "+volume2);

        System.out.print("volume 1: ");
        obj1.volume();
        System.out.print("volume 2: ");
        obj2.volume();
    }
}