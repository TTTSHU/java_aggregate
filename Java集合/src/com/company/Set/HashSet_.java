package com.company.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_ {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("3");
        set.add("Tom");
        set.add("Tom");
        set.add(new Dog("二哈"));
        set.add(new Dog("二哈"));
        set.add("1");
        set.add("2");
        System.out.println("=======");
        System.out.println("set:"+set);
        System.out.println("迭代器遍历");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        System.out.println("增强for遍历");
        for (Object o :set) {
            System.out.println(o);
        }

    }
    static class Dog{
        private String name;

        public Dog(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
