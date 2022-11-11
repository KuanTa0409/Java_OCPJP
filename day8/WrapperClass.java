package com.ocp.day8;

public class WrapperClass {
    public static void main(String[] args) {
        //要印出 int 的最大值
        int x = Integer.MAX_VALUE; //Integer為外包類別
        System.out.println(x);
        
        String a = "100";
        String b = "90";
        System.out.println(a + b);
        
        //Integer.parseInt(字串) 字串轉數字
        String a1 = "100";
        String b1 = "90";
        System.out.println(Integer.parseInt(a1)+Integer.parseInt(b1));
    }
}
