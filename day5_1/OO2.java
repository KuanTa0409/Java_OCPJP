package com.ocp.day5_1;

public class OO2 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "John";
        s1.score = 90;
        
        student s2 = new student();
        s2.name = "Mary";
        s2.score = 80;
        
        student s3 = new student();
        s3.name = "Helen";
        s3.score = 95;
        
        //分別印出3者不同的記憶體位址
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        System.out.println(s1.name+" "+s1.score);
        System.out.println(s2.name+" "+s2.score);
        System.out.println(s3.name+" "+s3.score);
    }
}
