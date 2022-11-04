package com.ocp.day6;

import java.awt.Toolkit;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListDemo2 {
    //單工系統
    //利用類別變數來存放 所有的簽到資料
    static ArrayList<String> names = new ArrayList<>(); //公用變數
    
    //程式進入點
    public static void main(String[] args) {
        while(true){
            menu();
        }
    }
    
    //系統功能目錄
    public static void menu(){
        System.out.println("簽到系統");
        System.out.println("---------------");
        System.out.println("1. 簽到");
        System.out.println("2. 修改");
        System.out.println("3. 刪除");
        System.out.println("4. 單筆查詢");
        System.out.println("5. 全部查詢");
        System.out.println("6. 多筆新增");
        System.out.println("7. 根據人名來修改");
        System.out.println("8. 根據人名來刪除");
        System.out.println("9. 清空打卡資訊");
        System.out.println("0. Exit");
        System.out.println("---------------");
        
        System.out.println("請輸入編號:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                add();
                break;
            case 2:
                update();
                break;
            case 3:
                delete();
                break;
            case 4:
                findOne();
                break;
            case 5:
                findAll();
                break;
            case 6:
                batchAdd();
                break;  
            case 7:
                updateByName();
                break; 
            case 8:
                deleteByName();
                break;
            case 9:
                clear();
                break;
            case 0:
                exit();
                break;
            default: //輸入錯誤選單號碼，發出聲音示警
                Toolkit.getDefaultToolkit().beep();
                System.out.println("無此選單, 請重新輸入...");
        }
        System.out.println("請按下 任意鍵 繼續...");
        scanner.next();
    }
    
    //輸入1:簽到
    public static void add(){
        System.out.println("簽到，請輸入人名: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        names.add(name); //將name加入到 集合names中
        System.out.println("簽到完成");
    }
    
    //輸入2:修改
    public static void update(){
        System.out.println("修改");
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入index: ");
        int index = scanner.nextInt();
        System.out.print("請輸入修改後的人名: ");
        String updateName = scanner.next();
        names.set(index, updateName);
        System.out.println("修改完成");
    }
    
    //輸入3:刪除
    public static void delete(){
        System.out.println("刪除");
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入index: ");
        int index = scanner.nextInt();
        names.remove(index);
        System.out.println("刪除完成");
    }
    
    //輸入4:單筆查詢
    public static void findOne(){
        System.out.println("單筆查詢");
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入 index: ");
        int index = scanner.nextInt();
        String name = names.get(index);
        System.out.println("人名: " + name);
    }
    
    //輸入5:全部查詢
    public static void findAll(){
        System.out.println("全部查詢");
        System.out.println(names);
        System.out.println("資料筆數: " + names.size());
    }
    
    //輸入6:多筆(批次)新增
    public static void batchAdd(){
        System.out.println("多筆新增，請用空白隔開人名");
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入人名(名字間請用空白隔開): ");
        String allname = scanner.nextLine(); //讀取一整列 (如.next()只有讀至空白 即停止)
        String[] array = allname.split(" ");
        //透過for-each逐筆新增到names中
        for(String name:array){
            names.add(name);
        }
        System.out.println("多筆新增，完成紀錄");
    }
    
    //輸入7:根據人名來修改
    public static void updateByName() {
        System.out.println("根據人名來修改");
        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入要修改的人名(修改前 修改後): ");
        String pairName = scanner.nextLine();
        String[] array = pairName.split(" ");
        if(array.length == 2) {
            String beforeName = array[0];
            String afterName = array[1];
            for(int index=0;index<names.size();index++) {
                if(names.get(index).equals(beforeName)) {
                    names.set(index, afterName);
                    System.out.println("修改完成");
                    return; // 方法結束
                }
            }
        }
        System.out.println("修改失敗/查無此人");
    }
    
    //輸入8:根據人名來刪除
    public static void deleteByName(){
        System.out.println("根據人名來刪除");
        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入欲刪除的人名: ");
        String delName = scanner.next();
       
        for(int index=0;index<names.size();index++) {
                if(names.get(index).equals(delName)) {
                    names.remove(index);
                    System.out.println("刪除完成");
                    return; // 方法結束
            }
        }
        /*
        老師版本
        if(names.remove(delName)) {//根據元素作刪除
            System.out.println("刪除成功");
        } else {
            System.out.println("刪除失敗");
        }
        */
    }
    
    //輸入9:清空打卡資訊
    public static void clear(){
        System.out.println("是否清空打卡資訊(y/n: )");
        Scanner scanner = new Scanner(System.in);
        String check = scanner.next();
        if(check.equalsIgnoreCase("y")) { //忽略大小寫
            names.clear();
            System.out.println("清空打卡資訊成功");
        }
    }
           
    //輸入0:離開系統
    public static void exit(){
        //status 0: 表示結束當前正在運行的程式
        //status 1: 表示非正常結束 
        System.out.println("離開系統");
        System.exit(0); 
    }
}
