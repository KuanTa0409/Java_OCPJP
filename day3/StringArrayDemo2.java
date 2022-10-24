package com.ocp.day3;

import java.util.Arrays;

public class StringArrayDemo2 {
    public static void main(String[] args) {
       String str = "John, Mary, Vincent, Jo, Helen";
        System.out.println(str);
        // 利用 字串所提供的函式  切割split() 來切割字串變成 String[]字串的陣列樣式
        String[] names = str.split(", "); //, 來去切分每個元素
        System.out.println(Arrays.toString(names));
        System.out.println(str.length()); //字串長度
        System.out.println(names.length); //陣列長度
        
        //請問平均名字有幾個字(取到小數點一位)?
        //Java 8
        //將原本陣列資料[John, Mary, Vincent, Jo, Helen]
        //透過mapToInt()轉成[4, 4, 7, 2, 5] 並計算平均
        //陣列先變串流再去分析
        double avg = Arrays.stream(names) //將原本陣列資料[John, Mary, Vincent, Jo, Helen]
                           .mapToInt(name -> name.length()) //透過mapToInt()轉成[4, 4, 7, 2, 5] 並計算平均
                           .average() //計算平均
                           .getAsDouble(); //取值
        System.out.printf("avg = %.1f\n", avg);
        
    }
 
}
