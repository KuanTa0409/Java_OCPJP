package com.ocp.day12_1.static_innerclass;

public class Test {
    public static void main(String[] args) {
        //一般內部類別調用
        //法一
        Outer outer = new Outer();
        Outer.Inner in = outer.new Inner();
        in.printA();
        
        //法二
        Outer.Inner in2 = new Outer().new Inner();
        in2.printA();
        
        //法三
        new Outer().new Inner().printA();
        
        System.out.println("======");
        //靜態(static)內部類別調用
        Outer.SInner sin = new Outer.SInner();
        sin.printS();
    }
}
