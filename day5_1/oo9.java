package com.ocp.day5_1;

public class oo9 {
    public static void main(String[] args) {
        Account ac1 = new Account("John", 10000);
        Account ac2 = new Account("Mary", 10000 );
        ac1.printAccount();
        
        //存款$500
        ac1.deposit(500);
        ac1.printAccount();
        
        //提款$3000
        ac1.withDraw(3000);
        ac1.printAccount();
        System.out.println(" ");
        //John轉給Mary$4000
        ac1.transfer(ac2,4000);
        ac1.printAccount();
        ac2.printAccount();
    }
}
