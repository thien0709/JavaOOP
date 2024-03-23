package org.example;

import java.util.Scanner;

public class Bai5 {
    public static int[][] randomArr (int m , int n){
        int [][] arrayR  = new int[m][n];
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                arrayR[i][j] = (int) (Math.random()*100);
            }
        }
        return arrayR;
    }
    public static void outPut (int [][] array){
        for(var i : array){
            for(var j : i){
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
    // Tính tổng trên dòng
    public static int sumRo ( int [][] array ,int c ){
            int sumRo = 0;;
            for(int j = 0;j<array[0].length;j++){
                sumRo += array[c][j];
            }
        return sumRo;
    }
    // Tính tổng trên cột
    public static int sumCol( int [][] array , int i){
        int sum = 0;
            for(int j =0;j< array.length;j++){
                sum += array[j][i];
            }
        return sum;

    }
    public static void main(String[] args) {
        System.out.print("Nhap vao lan luot m ,n ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = randomArr(m,n);
        System.out.println("Ma tran ");
        outPut(matrix);
        for(int i = 0 ; i<matrix.length;i++) {
            System.out.printf("Tong tren dong %d la %d \n",i , sumRo(matrix,i));
        }
        for(int i =0;i< matrix[0].length;i++){
            System.out.printf("Tong tren cot %d la %d \n", i , sumCol(matrix,i));
        }
        int minCol = sumCol(matrix,0) , indC =0;
        for(int i =0; i < matrix[0].length;i++){
         if(sumCol(matrix,i) < minCol){
             minCol = sumCol(matrix,i);
             indC = i;
         }
        }
        System.out.printf("Cot co chi so nho nhat la %d voi chi so %d \n" ,minCol, indC);
        int maxRow = sumRo(matrix,0) , indR =0;
        for(int i =0; i < matrix.length;i++){
           if(sumRo(matrix,i) > maxRow){
               maxRow = sumRo(matrix,i);
               indR = i ;
           }
        }
        System.out.printf("Dong co chi so lon nhat la %d voi chi so %d \n" ,maxRow, indR);
        System.out.println("Nhap chi so dong can tinh tong");
        int rSc = sc.nextInt();
        int minValR = matrix[rSc][0];
        for(int i =0;i<matrix[0].length;i++){
            minValR = (matrix[rSc][i] < minValR) ? matrix[rSc][i] : minValR;
        }
        System.out.printf("Gia tri nho nhat dong %d la %d \n", rSc,minValR);
        System.out.printf("Tong dong %d la %d \n",rSc, sumRo(matrix,rSc));
        System.out.println("Nhap chi so cot can tinh tong");
        int cSc = sc.nextInt();
        int maxValC = matrix[0][cSc];
        for(int i =0;i<matrix.length;i++){
            maxValC = (matrix[i][cSc] > maxValC) ? matrix[i][cSc] : maxValC;
        }
        System.out.printf("Gia tri nho nhat cot %d la %d \n", cSc,maxValC);
        System.out.printf("Tong dong %d la %d ",cSc, sumCol(matrix,cSc));
    }
}
