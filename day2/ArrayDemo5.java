package com.ocp.day2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
public class ArrayDemo5 {
    public static void main(String[] args) {
        //計算個數、總和、平均、最大值、最小值
        //使用Java Stream 利用int統計函式 來解決
        int[] scores = new int[]{100,88,85,96,66};
        IntSummaryStatistics stat = Arrays.stream(scores).summaryStatistics();
        System.out.println(stat);
        System.out.printf("個數: %d\n", stat.getCount());
        System.out.printf("總和: %d\n", stat.getSum());
        System.out.printf("平均: %.1f\n", stat.getAverage());
        System.out.printf("最大: %d\n", stat.getMax());
        System.out.printf("最小: %d\n", stat.getMin());
        
    }
}
