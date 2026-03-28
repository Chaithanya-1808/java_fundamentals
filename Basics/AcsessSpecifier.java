/*
//Private
import java.util.*;
class Box{
    private double height; //private
    Box(){
        height = 1.0;
    }
    private void display(){ //private
        System.out.println("height = "+height);
    }
}
public class AcessSpecifier{
    public static void main(String[] args){
        Box ob1 = new Box();
        ob1.height = 30.0; //height has private access in Box,cannot modify the height bcz it is private
        ob1.display(); //display() has private access in Box
    }
}
*/

//Default
import java.util.*;
class Box{
    double height; 
    Box(){
        height = 1.0;
    }
    void display(){ 
        System.out.println("height = "+height);
    }
}
public class AcsessSpecifier{
    public static void main(String[] args){
        Box ob1 = new Box();
        ob1.display();
        ob1.height = 30.0; 
        ob1.display(); 
    }
}

/*
// Protected
import java.util.*;
class Box{
    protected double height; 
    Box(){
        height = 1.0;
    }
    protected void display(){ 
        System.out.println("height = "+height);
    }
}
public class AcsessSpecifier{
    public static void main(String[] args){
        Box ob1 = new Box();
        ob1.display();
        ob1.height = 30.0; 
        ob1.display(); 
    }
}
*/
/*
// Public
import java.util.*;
class Box{
    public double height; 
    Box(){
        height = 1.0;
    }
    public void display(){ 
        System.out.println("height = "+height);
    }
}
public class AcsessSpecifier{
    public static void main(String[] args){
        Box ob1 = new Box();
        ob1.display();
        ob1.height = 30.0; 
        ob1.display(); 
    }
}
*/