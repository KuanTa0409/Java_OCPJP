package com.ocp.day7;

public class Person {
    private String name;
    private int age;
    
    //建構子封裝
    //建構子:建構物件的方式   
    
    //getter / setter(方法封裝)
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
    
    //自訂方法
    public void job(){
        System.out.println("工作");
    }
}
