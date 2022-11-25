package com.ocp.day12_1.anonymous;

//一個介面只有一個抽象方法，可以定義成 @FunctionalInterface
//@FunctionalInterface 支援Lambda的語法實作
@FunctionalInterface
public interface Calc {
    int submit(int x,int y);
}
