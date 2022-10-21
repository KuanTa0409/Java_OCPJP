package com.ocp;

public class CalMath {
    //主方法
    public static void main(String[] args) {
        //三位學生成績 100,95,80
        //計算總分與平均
        int x = 100, y = 95, z = 80;
        int sum = calcSum(x, y, z);
        double avg = calcAvg(x, y, z);
        // double ex = 1/3.0 * (Math.pow(x-avg, 2)+Math.pow(y-avg, 2)+Math.pow(z-avg, 2));
        double sd = calcSD(x, y, z); // 標準差 。 Math.sqrt()開根號
        double cv = calcCV(x, y, z); // 變異係數
        System.out.printf("總分: %d 平均: %.2f 標準差: %.2f 變異係數: %.2f",sum,avg,sd,cv);
    }
    //將方法拆分成 計算總分之方法,計算平均之方法,計算標準差之方法,計算變異係數之方法
    public static int calcSum(int x,int y,int z){
        int sum = x+y+z;
        return sum; //回傳總分的結果
    }
    /*
    public static void calcSum(int x,int y,int z){
        int sum = x+y+z;
        System.out.println("總分: "+sum);
    */    
    // 計算平均的方法
    public static double calcAvg(int x, int y, int z) {
        int sum = calcSum(x, y, z);
        double avg = sum / 3.0;
        return avg; // 回傳平均的結果
    }
    // 計算標準差的方法
    public static double calcSD(int x, int y, int z) {
        double avg = calcAvg(x, y, z);
        double dx = 1/3.0 * (Math.pow(x-avg, 2) + Math.pow(y-avg, 2) + Math.pow(z-avg, 2));
        double sd = Math.sqrt(dx); // 標準差: Math.sqrt 開根號
        return sd;
    }
    // 計算變異係數的方法
    public static double calcCV(int x, int y, int z) {
        double sd = calcSD(x, y, z);
        double avg = calcAvg(x, y, z);
        double cv = sd / avg;
        return cv;
    }
}
