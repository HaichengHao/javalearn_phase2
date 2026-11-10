package com.atguigu.b_charstream;

import java.io.FileWriter;
import java.io.IOException;

public class demo3_exception {
    public static void main(String[] args) {
        method_11();
    }

    private static void method_11() {
        FileWriter fw1 = null;
        try {
            fw1 = new FileWriter("day14IO/2.txt");
            fw1.write("hello java");
        }catch (IOException e){
            e.getStackTrace();
        }finally {
            if(fw1!=null){
                try {
                    fw1.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
