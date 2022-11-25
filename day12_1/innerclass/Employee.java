package com.ocp.day12_1.innerclass;
    
// 員工類別(外部類別)
public class Employee { 
    //封裝
    private String name; //員工姓名
    static int score = 100; // 外部類別可以定義類別成員
    public Employee(String name) {
        this.name = name;
    }
    
    // 不可以有 static  類別成員(屬性/方法 )
    // 員工的工作類別(內部類別)
    public class Job { //innerclass 內部類別
        //static int score = 100; // 內部類別不可以定義類別成員
        String name; //工作名稱
        int level; //工作難易度(1~10)
        
        public Job(String name, int level) {
            this.name = name;
            this.level = level;
        }
        public void printJob() {
            String name = "程式設計";
            System.out.printf("員工姓名: %S\n", Employee.this.name); //Employee.this.name
            System.out.printf("%s: %s, 員工姓名: %s, level: %d\n", name, this.name, Employee.this.name, level);
        }
    }
}
