package com.ocp.day7;

public class Teacher extends Person {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    //覆寫 Person 的方法
    @Override
    public void job(){
        System.out.println("教書");
    }

    //覆寫 toString()
    @Override
    public String toString() {
        return "Teacher{" + "salary=" + salary + '}';
    }
    
    
    
}
