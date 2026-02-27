import java.util.Scanner;
public class Fibonocci{
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        int i;
        if(num == 0){
           System.out.print("0");
        }
        if(num == 1){
            System.out.print("0 1");
        }
        else{
            int prev1 = 0;
            int prev2 = 1;
            System.out.print(prev1 + " " + prev2 + " ");
            for(i=2;i<num;i++){
                int prev3 = prev1 + prev2;
                System.out.print(prev3 + " ");

                prev1 = prev2;
                prev2 = prev3;
            }
            
        }
    }
}