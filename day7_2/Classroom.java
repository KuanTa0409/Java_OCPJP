package com.ocp.day7_2;

import java.net.SecureCacheResponse;
import java.util.ArrayList;

//組合模式
public class Classroom {
    private int id; //教室編號
    private Teacher teacher;
    private ArrayList<Student> students = new ArrayList<>();
    
    public Classroom(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    
    //新增學生
    public void addStudent(Student student){
        students.add(student);
    }
    
    //移除學生
    public void removeStudent(int index){
    students.remove(id);
    }
    
    //清除所有學生
    public void removeAllStudents(){
        students.clear();
    }

    //計算學生平均成績之方法
    public double getAvgOfScore(){
        if(students.size() == 0){return 0.0;}
        return students.stream()
                       .mapToInt(Student::getScore)
                       //.mapToInt(student -> student.getScore())
                       .average()
                       .getAsDouble(); //動態陣列本身就支援串流
    }
    
    //計算此班級平均年齡
    public double getAvgOfAge(){
        double avg = 0.0;
        if(teacher == null && students.size() == 0){return 0.0;}
        if(teacher != null && students.size() == 0){return teacher.getAge();}
        //先計算出學生平均年齡
        double studentAvgOfAge = students.stream()
                                         .mapToInt(Student::getAge)
                                         .average()
                                         .getAsDouble();
        if(teacher == null) //有學生沒老師
        {return studentAvgOfAge;}
        
        //有學生有老師
        //先計算出學生年齡總和 + 老師年齡
        int sumOfAge = students.stream().mapToInt(Student::getAge).sum()+teacher.getAge();
        avg = sumOfAge / (double)(students.size() + 1);
        return avg;         
    }
    
    @Override
    public String toString() {
        return "Classroom{" + "id=" + id + ", teacher=" + teacher + ", students=" + students + '}';
    }
    
    
}
