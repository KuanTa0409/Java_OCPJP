package com.ocp.day5_1;

import java.util.Arrays;

public class OO8 {
    public static void main(String[] args) {
        student[] stu1 = {
            new student("John", 80),
            new student("Mary", 40)
        };
        student[] stu2 = {
            new student("Bobo", 90),
            new student("Jack", 70),
            new student("Kita", 50)
        };
        student[][] studentses = {stu1,stu2};
        System.out.println(studentses);
        
        //印出及格者的平均分數?
        double avg = Arrays.stream(studentses) // student 二維陣列 stream
                           .flatMap(studs -> Arrays.stream(studs)) // student 一維陣列 stream
                           .mapToInt(stud -> stud.score) // 元素轉成int值[80, 40, 90, 70, 50] int stream
                           .filter(score -> score >= 60) // 過濾
                           .average() // 平均
                           .getAsDouble(); // 取得平均的 double 值
        System.out.println(avg);
        }
}
