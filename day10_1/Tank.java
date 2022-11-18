package com.ocp.day10_1;

public class Tank extends Car implements Weapon {
    
    @Override
    public void move() {
        System.out.println("坦克用履帶移動");
    }
    
    @Override
    public void shoot() {
        System.out.println("坦克發射砲擊!!!");
    }

}
