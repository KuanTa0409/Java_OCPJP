package com.ocp.day8;

public class WrapperClass2 {
    public static void main(String[] args) {
        //Java 5 以前的寫法
        int x = 100;
        Integer y = Integer.valueOf(100);
        System.out.println(x);
        System.out.println(y);
        System.out.println(y.intValue());
        int z = x + y.intValue();
        System.out.println(z);
        System.out.println("============");
        
        //Java 5 以後引進了 auto-boxing/unboxing 技術
        //讓int與Integer可以更直觀的應用
        int a = 100; //資料型別
        Integer b = 100; //此物件背後所代表的語法 Integer.valueOf(100)
                         //auto-boxing
        int c = a + b; //auto-unboxing
        System.out.println(c);
        
        Integer i = null; //int不能宣告為null
    }
}
