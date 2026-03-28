import java.util.*;
class Box{
    double h,w,l;
    Box(){
        h=w=l=0.0;
    }
    Box(double h,double w){
        this.h=h;
        this.w=w;
        this.l=1.0;
    }
    Box(double h,double w,double l){
        this.h = h;
        this.w = w;
        this.l = l;
    }
    void display(){
        System.out.println("height="+h+" "+"width= "+w+" "+"length= "+l);
    }
}
public class ConstructorOverloading{
    public static void main(String[] args){
        Box ob1 = new Box();
        Box ob2 = new Box(5.0,7.0);
        Box ob3 = new Box(1.0,3.0,5.0);
        ob1.display();
        ob2.display();
        ob3.display();
    }
}