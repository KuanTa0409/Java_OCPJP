package com.ocp.day5_1;

public class OO5 {
    public static void main(String[] args) {
        student[] students = new student[10];
        //建立一個陣列物件，預設每個元素是null
        students[0] = new student("John", 90);//配置student物件
        students[1] = new student("Mary", 80);
        //須一個一個配置
        
        System.out.println(students[0]); 
        System.out.println(students[9]);
    }
 
}
