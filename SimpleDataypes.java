import java.util.Scanner;
public class SimpleDataypes{
    public static void main(String[] args){
        int age;
        String name;
        float cgpa;
        Scanner sc = new Scanner(System.in);
        //sc.nextLine();
        name = sc.nextLine();
        age = sc.nextInt();
        cgpa = sc.nextFloat();
        System.out.println("Name = "+ name +" "+ "Age = "+ age +" "+ "CGPA = "+cgpa);
       /*
       System.out.println("Employee Detais ");
       String empName;
       int age;
       long phone;
       double salary;
       char Gender;
       String department;
       int experience;
       Scanner sc = new Scanner(System.in);
       empName = sc.nextLine();
       age = sc.nextInt();
       phone = sc.nextLong();
       salary = sc.nextDouble();
       Gender = sc.next().charAt(0);
       department = sc.next();
       experience = sc.nextInt();
       System.out.println("Employee Name : "+empName);
       System.out.println("Age : "+age);
       System.out.println("Mobile no : "+phone);
       System.out.println("Salary : "+salary);
       System.out.println("Gender : "+Gender);
       System.out.println("Department : "+department);
       System.out.println("Experience : "+experience);
       */

    }
}
