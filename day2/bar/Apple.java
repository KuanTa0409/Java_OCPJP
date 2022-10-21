package com.ocp.day2.bar; 
//package名稱不能有空格，可用底線_

public class Apple { //class只有2種權限(public及預設)
    public static void a1(){
        System.out.println("a1()");
    }
    static void a2(){ //沒寫就是 預設default
        System.out.println("a2()");
    }
    private static void a3(){ //此方法只有類別Apple可以用
        System.out.println("a3()");
        a1(); //在同一個class
        a2(); //在同一個class
    } 
}

/*
+  public
#  protected
~  default 無修飾字(預設)。同一個package才可存取
-  private
*/

/*
基本資料型別: 功能性較少，速度快
整數byte(8bits)、short(16bits)、int(32bits)、long(64bits)
浮點數float(32bits)、double(64bits)
字元char(16bits)、布林值boolean
*/
