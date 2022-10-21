package com.ocp.day2;

import java.util.Arrays; //一些好用的陣列工具
public class ArrayDemo2 {
    public static void main(String[] args) {
        //陣列自訂初始資料
        int[] scores = new int[]{100,88,85,96};
        //int[] scores = {100,88,85,96,76};
        
        System.out.println(scores); 
        //[I@762efe5d 
        //[一維陣列,I表示int,@在,762efe5d就是物件的雜湊值(hash code)...可想成記憶體位址
        //雜湊值(hash code)...加速查找物件的利器
        
        //1. 印出每個元素內容 for-loop(命令式寫法)
        for(int i =0;i<scores.length;i++){
            System.out.print(scores[i]+", " );
        }
        System.out.println(); //換行
        
        //2. 印出每個元素內容 for-each
        for(int x : scores){ //隨便給予變數名稱:母體集合
            System.out.print(x +", ");
        }
        System.out.println(); //換行
        
        //3. 印出每個元素內容 for-loop(加強版)
        for(int i = 0, len = scores.length ; i < len ; i++){
            System.out.print(scores[i]+", " );
        }
        System.out.println(); //換行
        
        //4. 印出每個元素內容 使用Arrays類別所提供的toString()方法
        System.out.print(Arrays.toString(scores));
        System.out.println(); //換行
        
        //5. 印出每個元素內容 Java8 stream串流(聲明式寫法)
        Arrays.stream(scores).forEach(score -> System.out.print(score + ", "));
        System.out.println(); //換行
        
        //6. 方法參考
        Arrays.stream(scores).forEach(System.out::println);
    }
}
