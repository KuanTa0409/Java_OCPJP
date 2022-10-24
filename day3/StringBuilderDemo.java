package com.ocp.day3;

/*
StringBuffer 用在多執行緒環境-Java1.0
StringBuilder 用在單工環境(在方法內)-Java5.0
*/
public class StringBuilderDemo {
    public static void main(String[] args) {
        //StringBuffer/StringBuilder 可變字串
        //String 不可變字串
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb);
        sb.append("11"); //最左邊不需要加 sb=
        System.out.println(sb);
    }
}
