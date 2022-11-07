package com.ocp.day7_2;

public class Person {
    private String name;
    private int age;

    //建構子封裝 
    //建構子:建構物件的方式  
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
       
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }
    
}
