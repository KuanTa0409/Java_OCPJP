package com.ocp.day2;

import java.awt.FlowLayout;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] x = new int[3];
        int len = x.length; //陣列長度
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println("x的陣列長度=" + len);
        x[0] = 100;
        x[1] = 88;
        x[2] = 96;
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        //陣列的最小維度 = 0
        //陣列的最大維度 = 陣列長度-1
    }
}
