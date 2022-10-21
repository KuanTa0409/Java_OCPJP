package com.ocp.day2;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] scores = new int[]{100,88,85,96,66};
        //計算個數、總和、平均、最大值、最小值
        System.out.printf("個數: %d\n",scores.length);
        System.out.printf("總和: %d\n", getSum(scores));
        System.out.printf("平均: %.2f\n", getAvg(scores));
        System.out.printf("最大值: %d\n", getMax(scores));
        System.out.printf("最小值: %d\n", getMin(scores));
    }
    
    //設計一個方法-計算總和
    public static int getSum(int[] array) {
    int sum = 0 ;
    for(int value : array){
    sum += value; //相當於 sum = sum + value 累加
    }
    return sum;
    }
    //設計一個方法-計算平均
    public static double getAvg(int [] array){
        int sum = getSum(array);
        double avg = (double)sum / array.length;
        return avg;
    }
    
    //設計一個方法-計算出最大值
    public static int getMax(int[] array){
    int max = 0;
    for(int value:array){
    if(value > max){
    max = value;
            }
        }
    return max;
    }
    
    //設計一個方法-計算出最小值
    public static int getMin(int[] array){
    int min = 100;
    for(int value:array){
    if(value < min){
    min = value;
            }
        }
    return min;
    }
}

