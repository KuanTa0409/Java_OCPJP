package com.ocp.day7;

public class Student extends Person {
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    //覆寫 Person 的方法
    @Override  //不是自訂的，而是覆寫 父類別的方法
    public void job(){
        super.job(); //呼叫 父類別
        System.out.println("讀書");
    }

    //覆寫 toString()
    @Override
    public String toString() {
        return "Student{" + "score=" + score + '}';
    }
    
    
    
    
}
