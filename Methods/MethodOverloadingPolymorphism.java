import java.util.*;
class Calculation{
    void mult(int a,int b){
        System.out.println("multiplication: "+a*b);
    }
    void mult(double a,double b){
        System.out.println("multiplication: "+a*b);
    }
    int mult(int a,int b,int c){
        return a*b*c;
    }
    double mult(double a){
        return a*5.0;
    }
}
public class MethodOverloadingPolymorphism{
    public static void main(String[] args){
        Calculation ob1 = new Calculation();
        System.out.println("multilplication: "+ob1.mult(5.0));
        ob1.mult(3,4);
        ob1.mult(4.0,8.0);
        System.out.println("multilplication: "+ob1.mult(5,7,9));
    }
}