package com.ocp.day15_list;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入: \"h 170.0 w 60 請計算 bmi = ?\" ");
        
        String word1 = input.next();
        double h = input.nextDouble();
        String word2 = input.next();
        int w = input.nextInt();
        String otherwords = input.nextLine();
        
        System.out.println(word1);
        System.out.println(h);
        System.out.println(word2);
        System.out.println(w);
        System.out.println(otherwords);
        
    }
}

