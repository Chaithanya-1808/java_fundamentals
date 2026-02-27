import java.lang.Math;
import java.util.Scanner;
public class Practice{
    public static void main(String[] args){
        float num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextFloat();
        float res = Math.abs(num);
        if(num == 0){
            System.out.println("Zero");
        }
        else if(num < 0){
            if(res < 1){
                System.out.println("small Negative");
            }
            else{
                 System.out.println("Negative");
            }
            
        }
        else{
            if(res > 100000){
                 System.out.println("larger positive");
            }
            else{
                 System.out.println("Positive");
            }

        }

    }
}