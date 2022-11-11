package com.ocp.day8;

class Father {
    Father() {
        System.out.println("A");
    }
    
    Father(int x) {
        this();
        System.out.println("B");
    } 
}

class Son extends Father{
    Son() {
        this(10); //呼叫自己的建構子(第18行)
        //this()與super()一定要放在方法中第一行
        //實作方法中，不可同時存在this()與super()
        System.out.println("C");
    }
    Son(int x) {
        super(x); //呼叫父類別 參數對應的建構子
        System.out.println("D");
        
    }
}

public class Demo1 { //多個class在同個package，只能有一個public
    public static void main(String[] args) {
        Son son = new Son();
    }
}
//因為 兒繼承父，就一定要指到父的建構子(不管有無參數)
