import java.util.*;
public class MatrixMul{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of matrix1: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Enter number of rows and columns of matrix2: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int arr1[][] = new int[r1][c1];
        int arr2[][] = new int[r2][c2];
        int arr3[][] = new int[r1][c2];
        System.out.println("Enter Matrix 1 elements :");
        for(int i=0;i<r1;i++){
            for(int j=0 ;j<c1;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Matrix 2 elements :");
        for(int i=0;i<r2;i++){
            for(int j=0 ;j<c2;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array elements of matrix1 are : ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Array elements of matrix2 are : ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    arr3[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println("Matrix multiplication: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}