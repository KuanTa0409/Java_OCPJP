package com.ocp.day16_map;

import java.util.Enumeration;
import java.util.Hashtable;

public class MapDemo7 {
    public static void main(String[] args) {
        //建立200個空間，用到80%就會自動增長
        Hashtable<String, Integer> tables = new Hashtable<>(200, 0.8f);
        tables.put("A", 100);
        tables.put("B", 80);
        tables.put("C", 70);
        tables.put("B", 60);
        System.out.println(tables);
        //走訪器 Enumeration
        Enumeration<Integer> values = tables.elements();
        while(values.hasMoreElements()) {
            Integer value = values.nextElement();
            System.out.println(value);
        }
    }
}/*
Collections: Arrays 、工具類程式
Collectors:  Java8 stream
*/
