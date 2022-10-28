package com.ocp.day4;

public class MultiArrayDemo2 {
    public static void main(String[] args) {
        //二維陣列給定初始值
        int[][] x = {{100,90,80},{70,60,50}};
        //印出所有內容
        //計算全部加總的值
        int s = 0;
        for(int[] y : x){
            for(int value : y){
                System.out.println(value);
                s += value;
            }
        }
        System.out.printf("全部加總 = %d\n", s);
        System.out.println("======");
        
        //老師版本:
        print(x); //請把所有內容印出
        int total = getSum(x);
        System.out.println(total);
        }

        //印出二維陣列內容的方法
    private static void print(int [][] arrays){
        for(int[] array : arrays){
            for(int value : array){
                System.out.println(value);
            }
        }
    }
    //計算二維陣列內容 全部加總值的方法
    private static int getSum(int [][] arrays){
        int sum = 0;
        for(int[] array : arrays){
            for(int value : array){
                sum += value;
            }
        }
        return sum;
    }
}


