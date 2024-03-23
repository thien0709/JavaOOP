package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;


public class Bai4 {
    public static boolean isSNT(int x ){
        if(x <2){
            return false;
        }
        for(int i =2;i<=Math.sqrt(x);++i){
            if(x% i == 0){
                return false;
            }
        }
        return true;
    }
    public static int[] randomArray(int x){
        int[] arr = new int[x];
        System.out.print("Day so n: ");
        for(int i =0;i<x;i++){
            arr[i] = (int) (Math.random()*100);
            System.out.printf("%d\t",arr[i]);
        }
        System.out.println();
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao n ");
        int n = sc.nextInt();
        int[] arrayRandom = randomArray(n);
        System.out.println("Tong cac so nguyen to la "+ IntStream.of(arrayRandom).filter(Bai4::isSNT).sum());
        System.out.println("So duong lon nhat " + ((IntStream.of(arrayRandom).max().getAsInt() > 0)? (IntStream.of(arrayRandom).max().getAsInt()): "*"));
        System.out.println("So duong lon nhat "+IntStream.of(arrayRandom).filter(x -> x >0).max().orElse(-1));
        System.out.println("So am be nhat " + ((IntStream.of(arrayRandom).min().getAsInt() < 0)? (IntStream.of(arrayRandom).min().getAsInt()): "*"));
        System.out.println("So nguyen to nho nhat "+ (IntStream.of(arrayRandom).filter(Bai4::isSNT).min().orElse(-1)));
        int[] arraySntSorted = IntStream.of(arrayRandom).filter(Bai4::isSNT).sorted().toArray();
       System.out.print("Cac So nguyen to");
       for(var i : arrayRandom){
           if(isSNT(i)){
               System.out.print(i + " ");
           }
       }
        System.out.print("\nSo nguyen to tang dan con lai giu nguyen");
        int dem=0;
        for(int i = 0;i<arrayRandom.length;i++){
            if(isSNT(arrayRandom[i])){
                System.out.print(arraySntSorted[dem++] + " ");
            }else {
                System.out.print(arrayRandom[i] + " ");
            }
        }
        System.out.print("\nNhap vao so x can tim");
        int x = sc.nextInt();
//        System.out.println("Vi tri xuat hien cua x  %d", arrayRandom. );

    }
}
