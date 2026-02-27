import java.util.Scanner;
public class Loops{
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        int i=0;
        // while loop
        while(i<=num){
            System.out.println(i);
            i++;
        }
        /*
        // do while loop
        do{
            System.out.println(i);
            i++;
        }while(i<=num);
       for(i=0;i<=num;i++){
            System.out.println(i);
       }
       */
    }
}