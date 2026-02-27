import java.util.*;
public class Pattern{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i,j;
        /*
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
       /*
       int k=1;
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print(k);
                k++;
            }
            k=1;
            System.out.println();
        }
        */
       /*
       int k;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
                
            }
            for(k=1;k<=i;k++){
                System.out.print("*");
                
            }
            System.out.println();
        }
        */
       for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
}
