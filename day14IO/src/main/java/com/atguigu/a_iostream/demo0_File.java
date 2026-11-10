package com.atguigu.a_iostream;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class demo0_File {
    @Test
    public void test1(){
        //win和linux以及mac的路径表达是不一样的，所以我们在写File路径的时候不能写死
        /*
        如D:\java_obj\oop
        这样是win的写法，放mac和linux是不行的
        所以引出separator
         */

        String f_path="D:"+ File.separator+"java_obj"+File.separator+"oop";
        System.out.println(f_path);//D:\java_obj\oop 自动匹配win
    }

    //File的构造方法
    @Test
    public void test2(){
        File demo_file = new File("D:\\javalearn_phase2\\一些自己补充的笔记\\record类解读.md");
        System.out.println(demo_file);//D:\javalearn_phase2\一些自己补充的笔记\record类解读.md

    }

    //File的获取方法
    @Test
    public void test3(){
        File demo_file = new File("D:\\javalearn_phase2\\一些自己补充的笔记\\record类解读.md");

        //获取绝对路径getAbsolutePath()
        String abs_path = demo_file.getAbsolutePath();

        System.out.println(abs_path);//D:\javalearn_phase2\一些自己补充的笔记\record类解读.md

        //获取封装路径getPath(),new File的时候写的啥路径，获取的就是啥路径
        System.out.println(demo_file.getPath());//D:\javalearn_phase2\一些自己补充的笔记\record类解读.md

        //获取文件或者文件夹名称
        System.out.println(demo_file.getName());//record类解读.md

        //获取文件的长度,字节数
        System.out.println(demo_file.length());//9194

    }


    //创建文件或文件夹
    @Test
    public void test4() throws IOException {
        //创建文件createNewFile()
        File demo_file=new File("D:\\javalearn_phase2\\一些自己补充的笔记\\demo.txt");
        boolean res = demo_file.createNewFile();//存在则返回false,不存在则新建并返回true
        System.out.println(res);


        //创建文件夹mkdirs()
        File demo_file2=new File("D:\\javalearn_phase2\\一些自己补充的笔记\\demodir");
        boolean res2 = demo_file2.mkdirs();
        System.out.println(res2);

    }

    //删除文件或文件夹(完全删除)
    @Test
    public void test5(){
        File demo_file2=new File("D:\\javalearn_phase2\\一些自己补充的笔记\\demodir");
        boolean res2 = demo_file2.delete();
        System.out.println(res2);


        File demo_file=new File("D:\\javalearn_phase2\\一些自己补充的笔记\\demo.txt");
        boolean res = demo_file.delete();
        System.out.println(res);
    }

    //判断是不是文件或者文件夹以及判断文件是否存在
    @Test
    public void test6(){
        File demo_file2=new File("D:\\javalearn_phase2\\一些自己补充的笔记\\demodir");
        boolean res1 = demo_file2.isFile();//false
        boolean res2 = demo_file2.isDirectory();//true
        System.out.println(res1);
        System.out.println(res2);

        boolean res3 = demo_file2.exists();
        System.out.println(res3);//true
    }

    //遍历文件夹
    @Test
    public void test7(){
        File demo_file = new File("D:\\javalearn_phase2\\一些自己补充的笔记\\");
        File[] f_lst =demo_file.listFiles();
        System.out.println(f_lst);

        for (File file : f_lst) {
            System.out.println(file.getName());
        }
        /*
        [Ljava.io.File;@4520ebad
        demo.txt
        demodir
        record类解读.md
         */
    }
}
