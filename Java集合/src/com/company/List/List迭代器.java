package com.company.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class List迭代器 {


    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add("红楼梦");
        list.add("水浒传");
        //通过对象的到迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        //增强for,
        for (Object o :list) {
            System.out.println(o);
        }

    }
}
