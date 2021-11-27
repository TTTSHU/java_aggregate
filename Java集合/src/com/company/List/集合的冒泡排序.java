package com.company.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class 集合的冒泡排序 {



    public static void main(String[] args) {
        Book book = new Book("红楼梦",19.0,"曹雪芹");
        Book book2 = new Book("红楼梦",29.0,"曹雪芹");
        Book book3 = new Book("红楼梦",89.0,"曹雪芹");
        Book book4 = new Book("红楼梦",79.0,"曹雪芹");
        //创建集合：LIST
        List list = new ArrayList();
        list.add(book);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        Iterator iterator = list.iterator();
        //遍历list
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        System.out.println("=============>排序后：");
        集合的冒泡排序.test(list);
        Iterator iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            System.out.println(next);
        }

    }
    //冒泡排序法
    public static void test(List name){
        //name.size()-1是因为类比的话就是-1
        for (int i = 0; i < name.size()-1; i++) {
           Book book5 = (Book) name.get(i);
           Book book6 = (Book) name.get(i+1);
           if (book5.getPrice()>book6.getPrice()){
               name.set(i,book6);
               name.set(i+1,book5);
           }
        }
    }
}
