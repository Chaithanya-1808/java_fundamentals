import java.util.*;
class Box{
    //instance variables
    double height;
    double width;
    double length;
    //instance method
    double volume(){
        return height*width*length;
    }
    double addedVolume(int a){ 
        return (height*width*length)+a;
    }
    void mulVolume(int b){
        System.out.println((height*width*length)*b);
    }
}
public class ClassExample4{
    public static void main(String[] args){
        Box obj1 = new Box(); //object for class box
        obj1.height = 2.0;
        obj1.width = 3.0;
        obj1.length = 5.0;
        System.out.println(obj1.volume());
        System.out.println(obj1.addedVolume(5));
        obj1.mulVolume(3);

    }
}