package com.ocp.day10;

public interface Animal {
    String COPY_RIGHT = "ABC.com"; //public final String COPY_RIGHT = "ABC.com";
    void eat(); //相當於public abstract void eat();
    void play(); //public abstract void play();
    
    default void CopyRight(){ //介面中有實作的方法(須加上default來修飾)
        System.out.println("ABC版權所有");
    }
}
