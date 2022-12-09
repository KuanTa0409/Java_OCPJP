package com.ocp.day16_map;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo6 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new TreeMap<>(); //按照key排序
        map.put(3, 100);
        map.put(1, 80);
        map.put(2, 70);
        System.out.println(map);
        
        Map<Exam, String> exams = new TreeMap<>();
        exams.put(new Exam("Java", 100), "A");
        exams.put(new Exam("Java", 80), "B");
        exams.put(new Exam("Java", 70), "C");
        System.out.println(exams);
    }
}
