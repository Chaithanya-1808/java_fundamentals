import java.lang.Math;
import java.util.*;
public class Sum{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i = 1,add = 0,avg;
        for(i=1;i<=n;i++){
            add = add + i;
        }
        System.out.println("sum = " + add);
        avg = add / n;
        System.out.println("avg = " + avg);
        
    }
}