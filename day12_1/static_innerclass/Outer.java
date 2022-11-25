package com.ocp.day12_1.static_innerclass;

public class Outer {
    int x = 7; 
    static int y = 100;
    
    //一般內部類別(不可有類別(static)成員)
    public class Inner {
        public void printA() {
            System.out.println("print A");
            System.out.println(x); //x, Outer.this.x皆可
            System.out.println(y); //y, Outer.y皆可    
        }
    }
    
    //靜態(static)內部類別
    public static class SInner {
        public static void printS() {
            System.out.println("print S");
            //System.out.println(Outer.this.x); // 不可存取外部類別的物件變數
            System.out.println(Outer.y); // y, Outer.y
        }
    }
}
