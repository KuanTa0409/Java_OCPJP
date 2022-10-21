package com.ocp;

public class BMIUtil { //類別
    public static void calcAndPrintBMI(double height, double weight){
        double bmiValue = weight / Math.pow(height/100,2);
        System.out.printf("身高: %1.f 體重 : %1.f BMI: %.2f\n", height, weight, bmiValue);
    }
}
