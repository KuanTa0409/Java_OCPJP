package com.ocp.day15_treeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
       Set<Integer> sortedSet = new TreeSet<>(); 
       sortedSet.add(5);
       sortedSet.add(8);
       sortedSet.add(1);
       sortedSet.add(3);
       sortedSet.add(4);
       sortedSet.add(9);
       sortedSet.add(6);
       sortedSet.add(6);
       System.out.println(sortedSet);
        //[80, 90, 100]元素內容會小->大排序
        //[1, 3, 4, 5, 6, 8, 9]重複元素 只顯示一次
    }
           
}
