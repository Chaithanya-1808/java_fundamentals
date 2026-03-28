import java.util.*;
class Student{
    String name;
    int age;
    int m1,m2,m3;
    //default constructor
    Student(){

    }
    //parameterized constructor
    Student(String n,int a,int mar1,int mar2,int mar3){
        name = n;
        age = a;
        m1 = mar1;
        m2 = mar2;
        m3 = mar3;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(m1+" "+m2+" "+m3);
    }
    void avg(){
        System.out.println("avg : "+(m1+m2+m3)/3);
    }
}
public class StudentConstructor{
    public static void main(String[] args){
        Student obj1 = new Student();
        obj1.name = "Chai";
        obj1.age = 19;
        obj1.m1 = 20;
        obj1.m2 = 30;
        obj1.m3 = 40;
        obj1.display();
        obj1.avg();
        Student obj2 = new Student("raki",19,20,20,20);
        obj2.display();
        obj2.avg();
    }
}