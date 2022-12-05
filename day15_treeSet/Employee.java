package com.ocp.day15_treeSet;

import java.util.Objects;


public class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private int salary;
    private static boolean sort = true; // true: 小到大, false: 大到小
        
    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static void setSort(SortType type) {
        Employee.sort = type.getValue();
    }
    
    @Override
    public int hashCode() { //如此set能避免放入 相同元素
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + this.age;
        hash = 97 * hash + this.salary;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.age != other.age) {
            return false;
        }
        if (this.salary != other.salary) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", age=" + age + ", salary=" + salary + '}';
    }

    @Override
    public int compareTo(Employee o) { //有此 才可比較
        //return age-o.age; 按年紀由小到大
        //return salary-o.salary;
        //return o.age-age; //按年紀由大到小
        return (age - o.age) * (sort ? 1 : -1);
    }
}
