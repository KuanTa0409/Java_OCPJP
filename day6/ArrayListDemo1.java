package com.ocp.day6;

import java.util.ArrayList;
public class ArrayListDemo1 {
    public static void main(String[] args) {
        //動態陣列<元素資料型別>
        ArrayList<String> names = new ArrayList<String>();
        //ArrayList<String> name = new ArrayList<>(); //Java7之後也可以<>...自動推斷
        System.out.println(names); //印出動態陣列所有元素內容
        System.out.println(names.size()); //元素個數
        
        //加入元素
        names.add("John");
        names.add("Mary");
        names.add("Jack");
        System.out.println(names); 
        System.out.println(names.size());
        
        //取得元素
        System.out.println(names.get(1));
        
        //刪除元素
        names.remove(1);
        System.out.println(names);
        System.out.println(names.size());
        
        //利用for-each逐一印出所有元素
        for(String name:names){
            System.out.println(name);
        }
        //修改內容 利用set(index,欲修改的資料內容)
        //[John, Jack] -> [Helen, Jack]
        System.out.println("修改前"+names);
        names.set(0, "Helen");
        System.out.println("修改後"+names);
    }
}
/*
陣列:
1. 靜態 []...速度快
2. 動態 (ArrrayList)集合...彈性佳、好維護
     建立元素: add(x)
     查詢元素: get(index)
     長度(元素個數): size()
     刪除元素: remove(x) / remove(index)
*/
