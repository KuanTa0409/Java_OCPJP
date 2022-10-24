package com.ocp.day3;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = "Java"; //在String pool裡面
        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //ture
        
        System.out.println(s1.intern() == s2); 
        //ture(intern() -> 放到String pool中)
        
        
    }
}
