package com.ocp.day7_2;

//繼承:是指類別物件的資源延伸和重複使用，利用extend來表達類別的繼承關係
public class Teacher extends Person {
    private int salary;
        
    public Teacher(String name, int age, int salary){
        super(name, age); //來自於Person
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" + "salary=" + salary + '}' + super.toString();
    }
    
}
