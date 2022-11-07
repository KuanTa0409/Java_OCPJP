package com.ocp.day7;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setAge(18);
        student.setScore(90);
        
        Teacher teacher = new Teacher();
        teacher.setName("Helen");
        teacher.setAge(30);
        teacher.setSalary(70000);
        
        System.out.println(student.getName() + ", " + student.getAge() + ", " + student.getScore());
        student.job();
        System.out.println("============");
        System.out.println(teacher.getName() + ", " + teacher.getAge() + ", " + teacher.getSalary());
        teacher.job();
        
        System.out.println(student); 
        //com.ocp.day7.Student@5b1d2887
        //相當於 student.toString()
        System.out.println(teacher); //com.ocp.day7.Teacher@46f5f779
        
        System.out.println(student.toString()); 
        //com.ocp.day7.Student@5b1d2887
        //Java會自動幫你往上繼承 Object
    }
}
