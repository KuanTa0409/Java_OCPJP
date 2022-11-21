package com.ocp.day11.decorator;

public abstract class Food { 
    protected String name; //此屬性只有子類別才可取用
    protected int price;
    
    public abstract String getName();
    public abstract int getPrice();
}
