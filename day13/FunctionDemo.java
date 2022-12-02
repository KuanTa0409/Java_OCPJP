package com.ocp.day13;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionDemo { //泛型之二
    public static void main(String[] args) {
        // Function
        /*
            public interface Function<T, R> {
                R apply(T t);
            }
        */
        Function<String, Integer> func = (words) -> { //標準寫法
            return words.split(" ").length;
        };
        System.out.println(func.apply("she sell sea shell on the sea shore"));
        
        Function<String, Integer> func2 = (words) -> words.split(" ").length;
        System.out.println(func2.apply("she sell sea shell on the sea shore"));
        
        //BiFunction
        /*
        public interface BiFunction<T, U, R> { //T, U, R表示任意
            R.apply{T t,U u};
        }
        */
        BiFunction<String, Integer, Double> biFunction = (name, value) -> {
            double result = 0.0;
            switch (name) {
                case "正方形":
                    result = Math.pow(value, 2);
                    break;
                case "圓形":
                    result = Math.pow(value, 2) * Math.PI;
                    break;
            }
            return result;
        };
        System.out.println("正方形面積: " + biFunction.apply("正方形", 10));
        System.out.println("圓形面積: " + biFunction.apply("圓形", 10));
        
        //BinaryOperator
        /*
            public interface BiFunction<T, U, R> {
                R apply(T t, U u);
            }
            public interface BinaryOperator<T> extends BiFunction<T, T, T> {
                
            }
        */
        BinaryOperator<Double> binaryOperator = (h,w) -> w/Math.pow(h/100,2);//BiFunction<Double, Double, Double>
         BiFunction<Double, Double, Double> biFunction2 = (h, w) -> w / Math.pow(h/100, 2);
        // 利用 BinaryOperator<Double> 取代 BiFunction<Double, Double, Double>
        System.out.println(binaryOperator.apply(170.0, 60.0));
        System.out.println(biFunction2.apply(170.0, 60.0));     
        
        // UnaryOperator 輸入參數與回傳值的型別一致
        /*
        public interface Function<T, R> {
            R apply(T t);
        }
        public interface UnaryOperator<T> extends Function<T, T> {
        }
        */
        UnaryOperator<Double> unaryOperator = (r) -> r * r * 3.14; // Math.pow(r, 2) * Math.PI
        System.out.println(unaryOperator.apply(10.0));
        
        //DoubleBinaryOperator/IntBinaryOperator...與Function相似
        /*
        public interface DoubleBinaryOperator {
            double applyAsDouble(double left, double right)
        } 
        */
        //DoubleBinaryOperator doubleBinaryOperator = (x,y) -> Math.max(x,y);
        DoubleBinaryOperator doubleBinaryOperator = Math::max;
        System.out.println("最大值: "+doubleBinaryOperator.applyAsDouble(30,50));
        //System.out.println("最大值: "+doubleBinaryOperator.apply(30,50)); //錯誤的
    }
}        
//https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
//https://docs.oracle.com/javase/tutorial/java/generics/types.html

/* API
BiFunction<Double, Double, Double> ===> BinaryOperator<Double>
UnaryOperator<Double> ===> Function<Double, Double>
*/

