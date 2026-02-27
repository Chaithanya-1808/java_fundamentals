import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        int res = 1;
        for(int i=num;i>=1;i--){
            res = res * i;
        }
        System.out.printf("The result of the factorial number is : " + res);
    }
}