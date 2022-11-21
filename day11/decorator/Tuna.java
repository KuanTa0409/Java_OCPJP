package com.ocp.day11.decorator;

public class Tuna extends SideDish {
    
    public Tuna(Food food) {
        super(food);
        name = "鮪魚";
        price = 25;
    }
    
}
