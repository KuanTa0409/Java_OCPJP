package com.ocp.day15_list;

import java.util.Scanner;
import java.util.Stack;
/*
Lab
利用 java.util.Stack 做字串反轉
說明 : 使用者輸入 "Java" 則會顯示 "avaJ"
*/
public class StackDemo2 {
    public static void main(String[] args) {
        System.out.println("請輸入文字: ");
        Scanner input = new Scanner(System.in);
        String word = input.next();
        
        char[] chars = word.toCharArray();
             
        Stack<Character> stack = new Stack<>();
        for(Character c: chars) {
            stack.push(c);
        }
        
        System.out.println(stack);
        while(!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
