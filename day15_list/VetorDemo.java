package com.ocp.day15_list;

import java.util.Vector;

public class VetorDemo {
    public static void main(String[] args) {
    //symchronize(同步)一次只允許一條thread(執行緒)進入操作
    //三大原始集合(stack、vetor、hashtable)
    
    Vector<Integer> v = new Vector<>(641, 10); //一次增加10個空間
        System.out.println("capacity(總共空間):"+v.capacity());
        System.out.println("size(以使用空間):"+v.size());
        
        for(int i =1;i<=641;i++){
            v.add(i);
        }
        v.add(99);
        System.out.println("capacity(總共空間):"+v.capacity());
        System.out.println("size(以使用空間):"+v.size());
    }
}
