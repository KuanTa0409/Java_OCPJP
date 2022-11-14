package com.ocp.day9_2;

public class Test {
    public static void main(String[] args) {
        //多型宣告: 父 變數名稱 = new 子;
        Employee employee = new Employee();
        Manager manager = new Manager();
        Supervisor supervisor = new Supervisor();
        
        System.out.println(employee.salary);
        System.out.println(manager.salary);
        System.out.println(manager.budget);
        System.out.println(supervisor.salary);
        System.out.println(supervisor.budget);
        System.out.println(supervisor.stockoption);
    }
}
