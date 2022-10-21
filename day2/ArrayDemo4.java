package com.ocp.day2;

import java.util.Arrays;
import java.util.stream.IntStream;
public class ArrayDemo4 {
    public static void main(String[] args) {
        int[] scores = new int[]{100,88,85,96,66};
        //計算個數、總和、平均、最大值、最小值
        //使用Java Stream 來解決
        //串流用完之後不得重複使用，所以每次都要重新建立串流
        // 不然會拋出 stream has already been operated upon or closed
        System.out.printf("個數: %d\n",Arrays.stream(scores).count());
        System.out.printf("總和: %d\n", Arrays.stream(scores).sum());
        System.out.printf("平均: %.2f\n", Arrays.stream(scores).average().getAsDouble());
        System.out.printf("最大值: %d\n", Arrays.stream(scores).max().getAsInt());
        System.out.printf("最小值: %d\n", Arrays.stream(scores).min().getAsInt());
    }
 
}
