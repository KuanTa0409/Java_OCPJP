package com.ocp.day9;

import java.util.Random;

public class Dao { //單例模式
    private int number;
    public Dao() {
        number = new Random().nextInt(100_000);
    }
    @Override
    public String toString() {
        return "Dao{" + "number=" + number + '}';
    }
}
