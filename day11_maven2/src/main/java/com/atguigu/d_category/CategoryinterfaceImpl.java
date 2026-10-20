package com.atguigu.d_category;

import java.util.ArrayList;

public class CategoryinterfaceImpl implements Categoryinterface {
    @Override
    public boolean addCategory(String... arr) {
        //创建一个集合
        ArrayList<String> list = new ArrayList<>();
        for (String element : arr) {
            //将数组中的元素放到集合当中
            list.add(element);
        }
        if (list.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public ArrayList<String> queryAllcategory() {
        ArrayList<String> list = new ArrayList<>();
        list.add("天空");
        list.add("白云");
        list.add("鲜花");
        return list;

    }
}
