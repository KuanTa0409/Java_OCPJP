package com.ocp.day4_2;
import java.util.Arrays;
public class MultiArrayDemo6 {
    public static void main(String[] args) {
        //A班有三位學生[國文, 數學]成績如下
        int[][] scores = {{100, 90},{85, 70},{95, 40}};
        //所有成績的加總 = ?
        //利用 Java 8 stream 來進行分析
        // {{100, 90}, {85, 70}, {95, 40}} -> {100, 90, 85, 70, 95, 40};
       int sum = Arrays.stream(scores) //二維陣列串流
                       .flatMapToInt(array -> Arrays.stream(array)) //一維陣列串流
                       .sum();
        System.out.println(sum);  
        
        // A 班的班平均是多少 ? 將 3 個學生的每一個人平均算出來之後再加總除以 3
        // {{100, 90}, {85, 70}, {95, 40}} -> { 95.0, 77.5, 67.5 } -> 80.0
        double avg = Arrays.stream(scores) // {{100, 90}, {85, 70}, {95, 40}}
                           .mapToDouble(score -> Arrays.stream(score).average().getAsDouble()) // { 95.0, 77.5, 67.5 }
                           .average().getAsDouble(); // 80.0
        System.out.println(avg);
    }
}
