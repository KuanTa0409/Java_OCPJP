package com.ocp.day11_1;

public class EqualsTest {
    public static void main(String[] args) {
        //==,equals()
        String s1 = "Java";
        String s2 = new String("Java");
        System.out.println(s1 == s2);//==是比較物件位址
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2)); //不分大小寫
        
        //兩物件相等，兩物件hashCode也須相等
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        
                
    }
}
