package com.ocp.day5_1;

public class student {
    //物件變數
    String name;
    int score;
    //建構子(在new的時候 會執行的東西，可寫可不寫-> 沒寫時Java編譯時 會預設加)
    public student(){ //無參數建構子
        System.out.println("建立 student 物件");
        
    }
    //實作有參數的建構子
    public student(String myName, int myScore){
       name = myName;
       score = myScore;
    }
    
    //物件方法
    //印出學生資料的方法
    public void printStudentData(){
    System.out.println(name +" "+ score);
    }
}
