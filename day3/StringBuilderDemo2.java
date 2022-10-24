package com.ocp.day3;

// 透過自訂方法來改變字串內容
public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder language = new StringBuilder("Java");
        add11(language); //不用寫成language = add11(language);
        System.out.println(language); //印出Java
      
        }
    private static void add11(StringBuilder sb){
    sb.append("11");
    //因為是同一塊記憶體變動，直接在該字串後增加，不用回傳值
    }
}
