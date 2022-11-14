package com.ocp.day9_2;

public class Test3 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();
        Supervisor supervisor = new Supervisor();
        
        employee.job();
        manager.job();
        supervisor.job();
        
        /*
        Employee employee = new Employee();
        Employee manager = new Manager();
        Employee supervisor = new Supervisor();
        
        employee.job(); >撰寫程式
        manager.job(); >專案管理
        supervisor.job(); >策略經營
        */
    }
}
