package com.company.List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_02 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Tom");
        linkedList.add("Jack");
        linkedList.add("Tm");
        Iterator iterator = linkedList.iterator();
        //遍历双向链表,从头到尾遍历
        for (Iterator it = iterator; it.hasNext(); ) {
            System.out.println(it.next());
        }
        linkedList.remove();
        System.out.println("=========>删除后");
        //迭代器遍历
        Iterator iterator1 = linkedList.iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            System.out.println(next);
        }
        //修改某个值
        linkedList.set(0,"TTTTm");
        //增强for循环遍历
        System.out.println("===========>修改第一个值后：");
        for (Object o :linkedList) {
            System.out.println(o);
        }
        System.out.println("==============>获取第一个值：");

        System.out.println(linkedList.get(0));

    }
}
