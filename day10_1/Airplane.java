package com.ocp.day10_1;

public abstract class Airplane {
    //抽象類別可以有自己的方法
    public void printName() {
        System.out.println("我是飛機");
    }
    // 抽象類別中的抽象方法一定要加上 abstract
    public abstract void speed();
}
