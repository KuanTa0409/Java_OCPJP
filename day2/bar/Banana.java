package com.ocp.day2.bar;

public class Banana {
    public static void baba(){
        Apple.a1();
        Apple.a2(); 
//不能呼叫Apple的a3 因為a3是private
    }
}
