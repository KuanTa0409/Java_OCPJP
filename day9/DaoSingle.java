package com.ocp.day9;

import java.util.Random;

public class DaoSingle {
    //單例模式(singleTon)
    //建立 private 類別物件
    private static DaoSingle _instance = new DaoSingle(); //類別變數 一個class只會有1個
    //加底線 => 非商用邏輯變數
    private int number;
    
    private DaoSingle() { //將建構子 private
        number = new Random().nextInt(100_000);
    }
    //建立 public 類別方法讓外界可以得到_instance
    public static DaoSingle getInstance() {
    return _instance;
    }
    
    @Override
    public String toString() {
        return "DaoSingle{" + "number=" + number + '}';
    }
}
