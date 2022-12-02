package com.ocp.day14_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        // HashSet, LinkedHashSet
        Set subject = new HashSet();//多型
        subject.add("國文");
        subject.add("數學");
        subject.add("英文");
        System.out.println(subject); //[國文, 英文, 數學]。不是根據加入順序印出
        
        Set subject1 = new LinkedHashSet();//多型
        subject1.add("國文"); //String
        subject1.add(70); //是Integer非int
        subject1.add("數學");
        subject1.add(100);
        subject1.add("英文");
        subject1.add(100); //重覆元素無法加入
        System.out.println(subject1); //[國文, 數學, 英文]
        
        // 走訪器: Iterator, 可以走訪每一個元素
        Iterator iter = subject.iterator(); // 得到 subject的走訪器
        while (iter.hasNext()) { // 是否還有元素
            Object next = iter.next();
            System.out.println("元素: " + next);
        }
        
        // 將 subject 中的所有數字加總 = ?(Part1)
        int sum = 0;
        iter = subject1.iterator(); // 重新得到 subject 的 走訪器
        while (iter.hasNext()) {
            Object next = iter.next();
            if(next instanceof Integer) {
                sum += (Integer)next; // 將 Object 轉型 Integer
            }
        }
        System.out.println(sum);
        
        // 將 subject 中的所有數字加總 = ?(Java8-Part2)
        int sum2 = subject1.stream()
                          .filter(next -> next instanceof Integer)
                          .mapToInt(next -> Integer.valueOf(next.toString())) // Object -> String -> int
                          .sum();
        System.out.println(sum2);           
    }
}
/*集合(容器)
Set 項目元素不可重覆，單向走訪
List 項目元素可重覆 (有索引值)，雙向走訪
Map 項目元素不可重覆 (key值不可重覆 / value可重覆。
Entry=key+value / EntrySet=Entry+...+Entry
                  根據"key"走訪)
*/
