import java.util.*;
public class TwoDArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols]; //intilization of the array
        for(int i=0;i<rows;i++){
            for(int j=0 ;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array elements are : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sum = sum + arr[i][j];
            }
        }
        System.out.println("sum = "+sum);
        int max = arr[0][0];
        int min = arr[0][0];
        for(int i=0;i<rows;i++){
            for(int j=0 ;j<cols;j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);
        
    }
}