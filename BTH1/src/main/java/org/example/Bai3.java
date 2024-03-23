package org.example;

import java.io.*;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao su lua chon cua ban a->e");
        char x = sc.nextLine().charAt(0);
        switch (x){
            case 'a':
                System.out.println("Nhap vao chuoi ");
                String s = sc.nextLine();
                s = s.substring(0,s.indexOf('@'));
                System.out.println(s);
                break;
            case 'b':
                System.out.println("Nhap vao chuoi ");
                String sB = sc.nextLine();
                int countUpper=0;
                for (int i =0;i<sB.length();i++){
                    if(Character.isUpperCase(sB.charAt(i))){
                        countUpper++;
                    }
                }
                System.out.printf("%d ky tu hoa",countUpper);
                break;
            case 'c':
                File inputFile = new File("src/main/resources/input.txt");
                Scanner fileScanner = new Scanner(inputFile);
                String sFile = fileScanner.nextLine();
                sFile = sFile.replaceAll("\\{file}", "tập tin");
                try (PrintWriter f = new PrintWriter(inputFile)) {
                    f.println(sFile);
                }
                break;
            case 'd':
                System.out.println("Nhap vao chuoi");
                String stringLongest = sc.nextLine();
                String [] arrayString = stringLongest.trim().split("[\\s,;]+");
                int max = arrayString[0].length();
                String longestWord = arrayString[0];
                for(var strLongest : arrayString){
                    if(strLongest.length() > max){
                        max = strLongest.length();
                        longestWord = strLongest;
                    }
                }
                System.out.printf("Tu dai nhat la %s voi so tu la %d", longestWord, max);
                break;
            case 'e':
                System.out.println("Nhap vao chuoi ");
                String stringConvert = sc.nextLine();
                stringConvert = stringConvert.trim();
                String[] stringArray = stringConvert.split("[\\s,;]+");
                StringBuilder  builderString = new StringBuilder();
                String result ;
                for(var sA : stringArray) {
                    builderString.append(sA.substring(0, 1).toUpperCase()).append(sA.substring(1).toLowerCase()).append(" ");
                }
                result = builderString.toString();
                System.out.println(result.trim());
                break;
            default:
                break;
        }

    }
}
