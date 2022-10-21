package com.ocp;

public class CalcBMI {
    public static void main(String[] args) {
        double  h = 170;
        double w = 60;
        double bmi = w / Math.pow(h/100,2);
        System.out.printf("身高: %1.f 體重 : %1.f BMI: %.2f\n", h, w, bmi);
        
        double h2 = 180;
        double w2 = 75;
        double bmi2 = w2 / Math.pow(h2/100,2);
        System.out.printf("身高: %1.f 體重 : %1.f BMI: %.2f\n", h2, w2, bmi2);
        //-------------------------------------
        calcAndPrintBMI(170,60); //或CalcBMI.calcAndPrintBMI(170,60);
        calcAndPrintBMI(180,75); //或CalcBMI.calcAndPrintBMI(180,75);
        //-------------------------------------
        BMIUtil.calcAndPrintBMI(170,60);
        BMIUtil.calcAndPrintBMI(180,75);
    }

    //static類別方法
    public static void calcAndPrintBMI(double height, double weight){ 
        double bmiValue = weight / Math.pow(height/100,2);
        System.out.printf("身高: %1.f 體重 : %1.f BMI: %.2f\n", height, weight, bmiValue);
    }
}
