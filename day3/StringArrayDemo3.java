package com.ocp.day3;

import java.util.Arrays;

public class StringArrayDemo3 {
    public static void main(String[] args) {
        String str = "90, 85, 35, 53, 76";
        //請計算 及格人數的平均分數 ?
        String[] scores = str.split(", ");
        //字串轉數字
        int x = Integer.parseInt("90"); //將字串"90"轉成數字
        
        int[] score = new int[5];
        int sum = 0,count=0;
        for(int i=0;i<5;i++){
            score[i] = Integer.parseInt(scores[i]);
            if(score[i]>=60){
                sum += score[i];
                count++;
            }
        }
        double avg = (double)sum / count;
        System.out.printf("及格人數%d人的 總平均= %.1f\n", count, avg);
    }
 }
/*
老師版本: Java 7
 String[] scores = str.split(", "); // ["90", "85", "35", "53", "76"]
        int sum = 0; // 及格累計分數
        int count = 0; // 及格人數
        for(String score : scores) {
            int x = Integer.parseInt(score);
            if(x >= 60) {
                sum += x;
                count++;
            }
        }
        double avg = (double)sum / count;
        System.out.printf("avg = %.1f\n", avg);
*/
