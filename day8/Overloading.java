package com.ocp.day8;

public class Overloading { //超(多)載
    /* KEY:
    printPower(10);
    匹配順序: int >　float > double > Integer
    */
           public static void printPower(int x) { //Integer物件型整數
        System.out.println("A");
        System.out.println(Math.pow(x, 2));
        
    } 
    
    public static void main(String[] args) {
        printPower(10);
    }
}
