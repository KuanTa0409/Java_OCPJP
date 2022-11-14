package com.ocp.day9_2;

public class Test4 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();
        Supervisor supervisor = new Supervisor();
        
        Employee[] employees = {employee, manager, supervisor}; //is-a
        for(Employee emp:employees) {
            System.out.println(emp.salary);
            System.out.println(emp.getClass().getSimpleName());
            //若emp是Manager 則可以轉型成Manager並且可以得到budget
            //此寫法不好 if(emp.getClass().getSimpleName().equals("Manager")){
            if(emp instanceof Manager) { //emp是否可以轉型成Manager    
                System.out.println("budget: " + ((Manager)emp).budget);
            }
            //System.out.println("stockoption: " + ((Supervisor)emp).stockoption);
            //失敗
            
            if(emp instanceof Supervisor) { //看實體當初是new什麼
                System.out.println("stockoption: " + ((Supervisor)emp).stockoption);
            }
            
            emp.job();
            System.out.println("======");
        }
        Manager[] managers = {manager, supervisor}; //陣列宣告 會看左邊的型別
    }
}
