import java.util.*;
class Box{
    static int h; //class variables
    int w,l;
    void display(){
        System.out.println("height = "+ h +" "+"width= "+ w +" "+"length= "+l);
    }
    static void display_def(){
        System.out.println("It's a static ");
    }
}
public class Methods{
    public static void main(String[] args){
        Box ob1 = new Box();
        ob1.h = 20;
        ob1.w = 30;
        ob1.l = 40;
        Box ob2 = new Box();
        ob2.h = 24;
        ob2.w = 40;
        ob2.l = 90;
        ob1.display();
        ob2.display();
        Box.display_def();
    }
}