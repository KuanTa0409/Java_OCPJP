package com.ocp.day12_1.methodclass;

public class Student {
    private String name; //學生姓名
    public Student(String name) {
        this.name = name;
    }
    public void printExam() {
        String subject = "Java"; //考試科目(區域變數) 
        //如果此變數要給方法內部類別使用，則該變數須具備final特性。(一經定義不能再修改)
        //最前面須加final > final String subject = "Java";
        class Exam { //方法內部類別(不須加權限修飾)
            int score = 90; // 考試成績
            @Override
            public String toString() {
                return name + ", " + subject + ", " + score;
            }
        }
        Exam exam = new Exam();
        System.out.println(exam);
    }
}
