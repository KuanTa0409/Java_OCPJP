package com.ocp.day11.decorator;

public class Bread extends AFood{
    
    public Bread() { //建構子
    name = "麵包";
    price = 40;
    } //繼承Food，可以使用Food的name跟price

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
    
}
