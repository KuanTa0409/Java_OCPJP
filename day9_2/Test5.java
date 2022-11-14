package com.ocp.day9_2;

public class Test5 {
    public static void main(String[] args) {
        Manager manager = new Supervisor(); //本體是Supervisor 但角色是Manager
        System.out.println(manager.salary);
        System.out.println(manager.budget);
        System.out.println(((Supervisor)manager).stockoption);
        
        //程式不會顯示錯誤 但無法執行
        Manager manager1 = new Manager(); 
        System.out.println(manager1.salary);
        System.out.println(manager1.budget);
        System.out.println(((Supervisor)manager1).stockoption);
        
        Manager manager2 = new Manager(); 
        System.out.println(manager2.salary);
        System.out.println(manager2.budget);
        if(manager instanceof Supervisor) {
        System.out.println(((Supervisor)manager2).stockoption);
        }
        
        Employee employee = new Manager();
        System.out.println(employee.salary);
        if(employee instanceof Manager) {
            System.out.println(((Manager)employee).budget);
        }
        if(employee instanceof Supervisor) {
            System.out.println(((Supervisor)employee).stockoption);
        }
    }
}
