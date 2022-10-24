package com.ocp.day3;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = new String("jAvA");
        
        System.out.println(s1==s2); 
        // false(==:比較所在的記憶體位置。不同物件位置)
        System.out.println(s1.equals(s2)); //true(大小寫均符合)
        System.out.println(s1.equals(s3)); //false(大小寫不符合)
        System.out.println(s1.equalsIgnoreCase(s3)); //true(忽略大小寫)  
        
        //String pool機制 
        //literal 字面值定義字串內容，會將字串物件配置在String pool中共用(Java1.4版開始支援)
        String a1 = "Java";
        String a2 = "Java";
        System.out.println(a1 == a2); //true(a1、a2在stack所存的記憶體位址 兩位址所指到內容相同)
        System.out.println(a1.equals(a2)); //true
    }
}


