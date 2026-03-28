import java.util.*;
public class Arrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        /*
        int n = sc.nextInt();
        int arr[] = new int[n]; //intilization of the array
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are : ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        */
       int i;
       int n = sc.nextInt();
       float arr[] = new float[n];
       for(i=0;i<n;i++){
            arr[i] = sc.nextFloat();
       }
       System.out.println("Array elements are : ");
       for(i=0;i<n;i++){
            System.out.println(arr[i]);
       }
    }
}

