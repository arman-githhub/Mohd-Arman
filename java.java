import java.util.Scanner;
public class java{
    public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);
        int n1=sc1.nextInt();
        int[][]matrix1=new int[n1][n1];
         int[][]matrix2=new int[n1][n1];
         System.out.println("enter elements of the first matrix");
         for(int i=0;i<n1;i++){
             for(int j=0;j<n1;j++){
                 matrix1[i][j]=sc1.nextInt();}}
         System.out.println("enter elements of the second matrix");
         for(int i=0;i<n1;i++){
             for(int j=0;j<n1;j++){
                 matrix2[i][j]=sc1.nextInt();}}
         int[][]matrix3=new int[n1][n1];
         for(int i=0;i<n1;i++){
             for(int j=0;j<n1;j++){
                 matrix3[i][j]=matrix1[i][j]+matrix2[i][j];}}
         System.out.println("the sum of two matrices is");
         for(int i=0;i<n1;i++){
             for(int j=0;j<n1;j++){
                 System.out.print(matrix3[i][j]+"\t");}
             System.out.println();}}}
