import java.util.*;
public class SumOfArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array number : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for(i=0;i<n;i++){
            sum = sum + arr[i];
        }
        System.out.print("sum = "+sum);
        
    }
}