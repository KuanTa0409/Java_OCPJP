package com.ocp.day10;

import java.util.ArrayList;

public class PetStore {
    public static void main(String[] args) {
        //介面 變數名稱 = 實體類; 彈性比較大 
        Dog dog = new Dog(); //多型 Animal dog = new dog();
        Cat cat = new Cat(); //多型 Animal cat = new cat();
        dog.eat();
        dog.play();
        cat.eat();
        cat.play();
        //動態陣列
        ArrayList<Animal>animals = new ArrayList<>(); 
        //List<Animal>animals = new ArrayList<>();
        /*
        ArrayList<E> extends AbstractList<E>
        implements List<E>
        */
        animals.add(cat);
        animals.add(dog);
        System.out.println(animals);
    }
}
