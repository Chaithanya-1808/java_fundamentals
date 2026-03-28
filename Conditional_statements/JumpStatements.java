import java.util.*;
public class JumpStatements{
    public static void main(String[] args){
        /* even numbers
        int i;
        for(i=0;i<=100;i++){
            if(i % 2!= 0){
                continue;
            }
            System.out.println(i);
        }
        */
       /*
       int num;
       Scanner sc = new Scanner(System.in);
       while(true){
        num = sc.nextInt();
        if(num == 10){
            break;
        }    
       }
       */
      int num;
      Scanner sc = new Scanner(System.in);
      while(true){
            num = sc.nextInt();
            if(num!=0 && num % 10 == 0){
                break;
            }
            System.out.println(num);
      }
    }
}