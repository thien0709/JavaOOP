package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =  (int) (Math.random()*100);
        int n ;
       do
        {
            System.out.print("Nhap vao so ban muon doan\t");
            n = sc.nextInt();
            if(n!= x){
                if(n>x) System.out.println("So ban doan lon hon");
                else System.out.println("So ban doan nho hon");
            }
            else {
                System.out.println("Ban da doan chinh xac");
            }
        } while(n!=x);
    }
}