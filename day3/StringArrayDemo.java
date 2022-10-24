package com.ocp.day3;

import java.util.Arrays;

public class StringArrayDemo {
    public static void main(String[] args) {
        String str = "John, Mary, Vincent, Jo, Helen";
        System.out.println(str);
        // 利用 字串所提供的函式  切割split() 來切割字串變成 String[]字串的陣列樣式
        String[] name = str.split(", "); //, 來去切分每個元素
        System.out.println(Arrays.toString(name));
        System.out.println(str.length()); //字串長度
        System.out.println(name.length); //陣列長度
        
        //請問平均名字有幾個字?
        int[] num = new int[5];
        int sum = 0;
        double avg = 0;
        for(int i=0;i<5;i++){
        num[i]= name[i].length();
        sum = sum + num[i];
        }
        avg = sum / 5.0;
        System.out.println(avg);
    }
}
/*
老師版本:
// 請問名字平均有幾個字(取到小數點一位)?
        // Java 7
        int total = 0;
        for(String name : names) {
            total += name.length();
        }
        System.out.printf("total = %d\n", total);
        double avg = (double)total / names.length;
        System.out.printf("avg = %.1f\n", avg);
*/
