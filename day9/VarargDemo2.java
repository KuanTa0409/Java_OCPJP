package com.ocp.day9;

public class VarargDemo2 {
    public static void test(int ... values) {
        System.out.println("A");
    }
    
    public static void test(int x, int y) {
        System.out.println("B");
    }
    
    public static void main(String[] args) {
        test(1, 2); //當衝突時，以能匹配到為主
    }
    }
//一個class只會有"最多1個"類別變數(static) 編譯時，記憶體會配置一塊空間去存放類別變數

