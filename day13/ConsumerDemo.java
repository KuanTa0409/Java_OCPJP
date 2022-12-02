package com.ocp.day13;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ConsumerDemo { //泛型之一
    public static void main(String[] args) {
        //Consumer(馬上消耗1個參數，無回傳值)
        Consumer<String> consumer = (String x) -> System.out.println("Hello"+x);
        consumer.accept("John");
                    
        //Consumer(多參數)
        Consumer<Integer[]> consumer2 = (values) -> {
            int sum = Arrays.stream(values).mapToInt(Integer::intValue).sum();
            //int sum = Arrays.stream(values).mapToInt(x -> x.intValue()).sum();
            System.out.println(sum);
        };
        consumer2.accept(new Integer[]{100, 90, 80});
        
        Consumer<int[]> consumer3 = (values) -> {
            int sum = Arrays.stream(values).sum();
            System.out.println(sum);
        };
        consumer3.accept(new int[]{70, 60, 50});    
        
        //BiConsumer(2個參數)
        /*
        public interface BiConsumer<T, U>
            public void accept(T t, U u);
        }
        */
        BiConsumer<String,Integer> biConsumer = (name,age)->System.out.println(name+"的年紀是"+age);
        biConsumer.accept("John", 20);
        
        //ObjIntConsumer(第二個參數一定是int也只能是int)
        /*
        public interface ObjIntConsumer<T>
            public void accept(T t, int x);
        }
        */
        ObjIntConsumer<String> objIntConsumer = (name, age) -> System.out.println(name+"的年紀是"+age);
        objIntConsumer.accept("Allen", 23);
        
        
    }
}
