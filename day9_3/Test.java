package com.ocp.day9_3;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat(); //型別 變數名稱 = new 型別();
        Cat tiger = new Tiger();
        
        cat.叫聲();
        tiger.叫聲(); //即使是多型 但方法會覆寫
        
        System.out.println(cat.name); //貓
        System.out.println(tiger.name); //貓(因為屬性會直接抓 型別的值)
        
        System.out.println("========");
        System.out.println(cat.getName()); //貓
        System.out.println(tiger.getName()); //老虎
    }
}
