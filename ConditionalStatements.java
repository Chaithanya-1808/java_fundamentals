import java.util.Scanner;
public class ConditionalStatements{
    public static void main(String[] args){
        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        /*
        if((num1 > num2) && (num1 > num3)){
            System.out.println("num1 is max");
            
        }
        if((num2 > num1) && (num2 > num3)){
            System.out.println("num2 is max");
        }
        if((num3 > num1) && (num3 > num2)){
            System.out.println("num3 is max");
        }
        */
       /*
       if((num1 > num2) && (num1 > num3)){
            System.out.println("num1 is max");
            
        }
        if((num2 > num1) && (num2 > num3)){
            System.out.println("num2 is max");
        }
        else{
            System.out.println("num3 is max");
        }
        */
       if(num1 > num2){
            if(num1 > num3){
                System.out.println("num1 is max");
            }
            else{
                System.out.println("num3 is max");
            }
       }
       else if(num2 > num1){
            if(num2 > num3){
                System.out.println("num2 is max");
            }
            else{
                System.out.println("num3 is max");
            }
       }
       else{
            System.out.println("num3 is max");
       }
        
    }
}