package com.atguigu.d_category;

import java.util.ArrayList;

public interface Categoryinterface {
    /*
    添加商品分类
     */

    boolean addCategory(String... arr);

    //查询所有种类功能

    ArrayList<String> queryAllcategory();
}
