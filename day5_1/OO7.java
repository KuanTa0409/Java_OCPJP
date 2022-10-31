package com.ocp.day5_1;

import java.util.Arrays;

public class OO7 {
    public static void main(String[] args) {
        student[] students = {
            new student("John", 80),
            new student("Mary", 40),
            new student("Bobo", 90),
            new student("Jack", 70),
            new student("Kita", 50)
        };
        //印出及格者的平均分數
        int sum = 0,count =0;
        double avg = 0;
        for(int i=0,len=students.length ; i<len ; i++){
            if(students[i].score >= 60){
                sum += students[i].score;
                count++;
            }        
         }
        avg = sum / count;
        System.out.println(avg);
        
        //老師版本-Java stream:
        double avge = Arrays.stream(students)
                            .mapToInt(stu->stu.score)// 80, 40, 90, 70, 50
                            .filter(score->score>=60)
                            .average()
                            .getAsDouble();
        System.out.println(avge);
    }
}
