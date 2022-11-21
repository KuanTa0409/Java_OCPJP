package com.ocp.day11.decorator;

public class Tomato extends SideDish {
    
    public Tomato(Food food) {
        super(food);
        name = "番茄";
        price = 15;
    }
    
}
