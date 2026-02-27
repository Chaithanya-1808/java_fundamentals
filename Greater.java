import java.util.Scanner;
public class Greater{
    public static void main(String[] args){
        int num1,num2,num3;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter 1st number : ");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        num2 = sc.nextInt();
        System.out.print("Enter 3rd number : ");
        num3 = sc.nextInt();
        if((num1 > num2) && (num1>num3) ){
            System.out.printf("The greater : %d" , num1);
        }
        else if((num2 > num1) && (num2>num3) ){
            System.out.printf("The greater : %d" , num2);
        }
        else if((num3 > num1) && (num3>num2) ){
            System.out.printf("The greater : %d" , num3);
        }
        else{
            System.out.printf("May be two or more numbers are equal");
        }
    }
}