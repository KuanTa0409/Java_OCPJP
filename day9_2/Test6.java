package com.ocp.day9_2;

public class Test6 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();
        Supervisor supervisor = new Supervisor();
        printBudget(employee);
    }
    
    // 印出 budget 資源
    public static void printBudget(Employee employee) { //public時 不要任意更改方法簽章(因共同使用)
        if(employee instanceof Manager) { //利用instanceof過濾
            System.out.println(((Manager)employee).budget);
        }
    }
}
