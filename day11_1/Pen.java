package com.ocp.day11_1;

public class Pen {
    private String color;
    private int price;
    
    public Pen(String color, int price) {
        this.color = color;
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Pen: " + color + ", " + price;
    }

   
    @Override
    public int hashCode() { //索引(相同物件資源在哪裡)
        return 7*17*price + color.hashCode(); //自己創造(把要比較的因素放進來)
    }
    
    @Override
    public boolean equals(Object obj) {
        if(this == obj) { //當自己跟自己比
            return true;
        }
        if(!(obj instanceof Pen)){ //不能轉
            return false;
        } //instanceof實例就是物件
        Pen pen = (Pen)obj; //轉型
        
        if(color.equals(pen.color)&&price == pen.price) {
            return true;
        }
            return false;
        
        //return color.equals(pen.color) && price == pen.price;
        
        //hashCode()跟equals(Object obj) 系統可精靈自動生成
        //hashCode相同，則object可能相同(不同物件可以是同個hashCode)
        //hashCode不同，則object必不同
    }
}
