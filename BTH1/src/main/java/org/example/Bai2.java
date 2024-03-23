package org.example;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Nhap vao bac da thuc ");
        int n = sc.nextInt();
        System.out.print("Nhap vao gia tri x ");
        int x =sc.nextInt();
        int result = 0;
        System.out.print("Nhap vao he so a cua da thuc ");
        for(int i =0;i<=n;++i){
            int a = sc.nextInt();
            result += (int) (a * Math.pow(x,i));
        }
        System.out.printf("Ket qua la %d" , result);
    }
}
