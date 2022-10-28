package com.ocp.day4;

import java.util.Arrays;

public class MultiArrayDemo3 {
    public static void main(String[] args) {
        //甲乙丙三人的身高體重如下:
        double[][] x = {
            {170.0, 60.0},  //甲
            {185.0, 75.5},  //乙
            {165.5, 43.5}}; //丙
        double[] h_m = new double[3]; 
        double[] bmi = new double[3];
        //請計算三人個別BMI值 = (小數點後一位)?
        for(int i=0; i<x.length ; i++){
            for(int j=0 ; j<x[j].length ; j++){
                h_m[i] = x[i][0] / 100.0;
                bmi[i] = x[i][j] / Math.pow(h_m[i],2);
            }
        }
        for(int i=0 ; i<bmi.length ; i++){
            System.out.printf("BMI值: %.1f\n", bmi[i]);
        }
        System.out.printf("\n老師版本:\n");
        for(double[] array : x){
            System.out.print(Arrays.toString(array)); 
            //依序印出[170.0, 60.0][185.0, 75.5][165.5, 43.5]
            double h = array[0];
            double w = array[1];
            double BMI = w / Math.pow(h/100, 2);
            System.out.printf("BMI: %.1f\n", BMI);
        }
    }
}
