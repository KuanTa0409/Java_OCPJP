package com.ocp.day10_1;

public interface Weapon { 
    //Java8後 可利用default修飾方法，就可以有實作
    public default void printName() {
        System.out.println("我是飛機");
    }
    
    public abstract void shoot();
}
