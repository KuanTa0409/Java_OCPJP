package com.ocp.day4;

public class MultiArrayDemo1 {
    public static void main(String[] args) {
        int[][] x = new int[2][3]; //2x3二維陣列
        System.out.printf("x.lenght = %d\n", x.length );
        System.out.printf("x[0].lenght = %d\n", x[0].length );
        System.out.printf("x[1].lenght = %d\n", x[1].length );
        
        System.out.println(x[0][0]); //預設值是0
        System.out.println(x); //印出記憶體位置 [[I@1888ff2c
        System.out.println(x[0]); //印出記憶體位置 [I@35851384
        System.out.println(x[0][1]); //印出 預設值
        
        // 印出二維資料
        System.out.println("利用for-loop印出");
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
            //分析一維陣列x[i]
            for(int k=0;k<x[i].length;k++){
                System.out.println(x[i][k]);
            }
        }
        System.out.println("利用for-each印出");
        for(int[] y : x){ //x裡面是int陣列
            System.out.println(y); //一維陣列
            for(int value : y){
                System.out.println(value);
            }
        }
    }
}
