package com.ocp.day14;

// enum 列舉
public enum USCurrency {
    // PENNY: 1美分, NICKLE: 5美分, 
    // DIME: 10美分, QUARTER: 25美分
    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
    
    private int value;
    
    private USCurrency(int value) { //列舉時，建構子預設為private，不可是public
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
    
}
