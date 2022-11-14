package com.ocp.day9_2;

public class Test2 {
    public static void main(String[] args) {
        Employee employee = new Employee(); //型別(角色) 名稱 = new 本體
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
