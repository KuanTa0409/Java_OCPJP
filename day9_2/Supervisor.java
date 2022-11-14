package com.ocp.day9_2;

public class Supervisor extends Manager{
    public int stockoption = 12_0000;
    public void job() { //方法會有覆寫機制
       System.out.println("策略經營"); 
   }
}
