import java.util.*;
public class MaxMinArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array number : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(i=1;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);
    }
}