package com.spring.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputUtil {
    public void getAChar() throws IOException {
        System.out.println("请输入一个字符:");
        int c=System.in.read();
        System.out.println(c);
    }

    public void getAString(){
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入你的名字:");
        String name="";
        try {
            name = bf.readLine();
        }catch (Exception e){
            e.printStackTrace();
        }
        String age="";
        System.out.println("请输入你的年龄:");
        try{
            age=bf.readLine();
        }catch (Exception e){
            e.printStackTrace();
        }
        String salary="";
        System.out.println("请输入你的工资:");
        try{
            salary=bf.readLine();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("your name:"+name+";your age:"+age+";your salary:"+salary+".");
    }

    public void getAStringByScanner(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的名字:");
        String name=sc.next();
        System.out.println("请输入你的年龄:");
        String age=sc.next();
        System.out.println("请输入你的工资:");
        String salary=sc.next();
        System.out.println("your name:"+name+";your age:"+age+";your salary:"+salary);
    }

    public static void main(String[] args) {
        InputUtil iu=new InputUtil();
//        try {
//            iu.getAChar();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        iu.getAString();
        iu.getAStringByScanner();
    }
}
