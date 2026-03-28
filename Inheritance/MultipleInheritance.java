import java.util.*;
interface Landvehicle{
    void display();
}
interface Watervehicle{
    void display();
}
class Amphivehicle implements Landvehicle,Watervehicle{
    public void display(){
        System.out.println("Multiple inheritance");
    }
}
public class MultipleInheritance{
    public static void main(String[] args){
        Amphivehicle ob1 = new Amphivehicle();
        ob1.display();
    }
}