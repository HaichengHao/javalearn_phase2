package com.atguigu.b_charstream;
/*
JDK7之后io异常处理方式
1.格式:
  try(newIO流对象){
      可能出现异常的代码
  }catch(异常类型 对象名){
      异常处理
  }

2.自动关流
 */

import java.io.FileWriter;
import java.io.IOException;

public class demo4_exception_new {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("day14IO/2.txt")){
            fw.write("bonjour");
        }catch (Exception e){
            e.printStackTrace();
        }
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
