import java.util.*;
public class Palindrome{
    public static void main(String[] args){
        int n;       //121
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int temp = n; //121
        int res=0; //1 , 12
        while(n>0){  // 121>0, 12>0 ,1 >0
            int rem = n % 10;  //1 , 2 , 1
            res = res *10+rem;  // 0*10+1 ,1*10+2 = 12 ,12*10+1=121
            n=n/10; //121/10 = 12 , 12/10=1
        }
        if(temp == res){  //121 == 121
            System.out.println("Palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}