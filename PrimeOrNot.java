import java.util.Scanner;
public class PrimeOrNot{
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        int i=1;
        int count = 0;
        for(i=1;i<=num;i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count == 2){ //devision by 1 and number itself
            System.out.println("prime number " + num);
        }else{
            System.out.println("Not a prime number " + num);
        }
    }
}