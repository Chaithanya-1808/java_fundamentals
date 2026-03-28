import java.util.*;
public class TwoDForArray{
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
        for(int i[]:arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}