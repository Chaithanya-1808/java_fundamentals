import java.util.*;
public class RowSum{
    public static void main(String[] args){
        int r,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Rows :");
        r = sc.nextInt();
        System.out.println("Columns :");
        c = sc.nextInt();
        int arr[][] = new int[r][c];
        int i,j;
        System.out.println("Enter the Array element:");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array elements are:");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Rows addition :");
        for(i=0;i<r;i++){
            int sum= 0;
            for(j=0;j<c;j++){
                sum = sum + arr[i][j];
            }
            System.out.println("Sum of Rows"+" "+ i +" "+ "="+" "+sum);
        }
        System.out.println("columns addition :");
        for(j=0;j<c;j++){
            int sum= 0;
            for(i=0;i<r;i++){
                sum = sum + arr[i][j];
            }
            System.out.println("Sum of Columns"+" "+ j +" "+ "="+" "+sum);
        }
    }
}