package com.company.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_ {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("Tom");
        set.add("Jack");
        set.add("Tm");
        set.add(null);
        set.add(null);
        set.add("Tom");
        System.out.println("set======"+set);
        //通过迭代器遍历
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        //通过增强for遍历
        System.out.println("======>");
        for (Object o :set) {
            System.out.println(o);
        }
        //返回一个包含此集合中所有元素的数组
        System.out.println("======返回一个包含此集合中所有元素的数组");
        Object[] toArray = set.toArray();
        for (int i = 0; i < toArray.length; i++) {
            System.out.println(toArray[i]);
        }

    }
}
