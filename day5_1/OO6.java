package com.ocp.day5_1;

import java.util.Arrays;

public class OO6 {
    public static void main(String[] args) {
        student[] students = {
            new student("A", 90),
            new student("B", 80),
            new student("C", 70),
            new student("D", 75),
            new student("E", 66),
        };
         System.out.println(students);
         //for-loop
         for(int i=0,len=students.length ; i<len ; i++){
         students[i].printStudentData();
         }
         
         //for-each
         for(student stu : students){
             stu.printStudentData();
         }
         
         //Java Stream
         Arrays.stream(students)
                 .forEach (stu -> stu.printStudentData());
         
         //Java Stream + ::(方法參考)
         Arrays.stream(students).forEach(student::printStudentData);//printStudentDataz方法在student類別裡
         
         /*Arrays.stream(students)
                 .forEach (stu -> stu.printStudentData());
                           stu重複，可省略 
         */    
}
}
