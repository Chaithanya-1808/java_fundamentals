import java.util.*;
/* NUMBER OF PARAMETERS,TYPE OF PARAMETERS
class Addition{
    int a,b;
    void add(){
        int c = a+b;
        System.out.println("add= "+c);
    }
    void add(int a){
        System.out.println(a+10);
    }
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(double a,double b){
        System.out.println(a+b);
    }
    int add(int a,int b,int c){
        return a+b+c;
    }

}
public class MethodOverloading{
    public static void main(String[] args){
        Addition ob1 = new Addition();
        ob1.a = 10;
        ob1.b = 20;
        ob1.add();
        ob1.add(10);
        ob1.add(10,20);
        ob1.add(10.0,20.0);
        System.out.println(ob1.add(10,20,30));
    }
}
*/
// ORDER OF PARAMETERS
class Person{
    void display(String name,int age){
        System.out.println("name= "+name+" "+"age= "+age);
    }
    void display(int age,String name){
        System.out.println("name= "+name+" "+"age= "+age);
    }
}
public class MethodOverloading{
    public static void main(String[] args){
        Person ob1 = new Person();
        ob1.display("ram",19);
        ob1.display(19,"ram");
    }
}