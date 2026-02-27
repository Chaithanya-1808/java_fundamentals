import java.util.Scanner;
public class PositiveOrNot{
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        if(num >= 0){
            System.out.println("Positive Number");
        }
        else{
            System.out.println("Negative Number");
        }
    }
}