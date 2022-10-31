package com.ocp.day5_1;

public class OO3 {
    public static void main(String[] args) {
        student s1 = new student("John", 90);
        student s2 = new student("Mary", 80);
        student s3 = new student("Helen", 95);
        
        System.out.println(s1.name+" "+s1.score);
        System.out.println(s2.name+" "+s2.score);
        System.out.println(s3.name+" "+s3.score);
        }
}
