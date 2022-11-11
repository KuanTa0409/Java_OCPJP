package com.ocp.day8;

import java.util.Arrays;
public class WrapperClass3 {
    public static void main(String[] args) {
        int[] nums = {100, 90, 80};
        //利用 Arrays.stream() 計算sum()
        int sum = Arrays.stream(nums) //IntStream
                        .sum(); //基本資料型別的串流才有
        System.out.println(sum);
        
        Integer[] nums2 = {80, 70, 60};
        //利用 Arrays.stream() 計算sum()
        //int sum2 = Arrays.stream(nums2).sum(); 物件串流沒有sum()
        int sum2 = Arrays.stream(nums2)
                         .mapToInt(n->n.intValue()) 
                         //或.mapToInt(Integer::intValue) 方法參考
                         //或.mapToInt(n->n) auto-unboxing
                         .sum();
        System.out.println(sum2);
        // boxed() 可以將 int 轉 Integer
    }
}
