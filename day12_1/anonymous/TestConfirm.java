package com.ocp.day12_1.anonymous;

public class TestConfirm {
    public static void main(String[] args) {
        int[] scores = {90, 40, 60, 30, 50, 100};
        
        //及格60,高標70,低標40
        Confirm pass = (value) -> value >=60; //回傳布林值
        Confirm pass1 = (value) -> {return value >=60;};
        
        Confirm high = (value) -> value>=70;
        Confirm low = (value) -> value>=40;
        printCheck(scores, pass);
        System.out.println("======");
        printCheck(scores, low);
    }
    
    public static void printCheck(int[] scores, Confirm confirm) {
        for(int score : scores) {
            if(confirm.check(score)) {
                    System.out.println(score);
            }
        }
    }
}
