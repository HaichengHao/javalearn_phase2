package com.atguigu.a_exception;


import java.io.FileNotFoundException;

public class Demo10Exception {

    public static void main(String[] args){
        String s = "abc.txt1";
        try {
            insert(s);
        }catch(FileNotFoundException e){
            System.out.println(e.toString());//java.io.FileNotFoundException: 文件未找到
        }
    }

    public static void insert(String s) throws FileNotFoundException{
        if(!s.endsWith(".txt")){
            throw new FileNotFoundException("文件未找到");
        }
    }


}


