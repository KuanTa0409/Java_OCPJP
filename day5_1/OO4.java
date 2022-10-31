package com.ocp.day5_1;

public class OO4 {
    public static void main(String[] args) {
        student s1 = new student("John", 90);
        student s2 = new student("Mary", 80);
        student s3 = new student("Helen", 95);
       
        s1.printStudentData();
        s2.printStudentData();
        s3.printStudentData();
    }
}
