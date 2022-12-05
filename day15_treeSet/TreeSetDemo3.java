package com.ocp.day15_treeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        Employee.setSort(SortType.小到大);
        Employee emp1 = new Employee("Alan", 25, 66000);
        Employee emp2 = new Employee("A", 20, 36000);
        Employee emp3 = new Employee("B", 35, 45000);
        Set<Employee> employees = new TreeSet<>();
        employees.add(emp3);
        employees.add(emp1);
        employees.add(emp2);
        System.out.println(employees);
        
    }
}
