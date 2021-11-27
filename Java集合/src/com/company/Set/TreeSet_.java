package com.company.Set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //通过字符串的大小比较
                return ((String)o1).compareTo((String)o2);
                //通过字符串的长度比较
                //return ((String)o1).length()-((String)o2).length();
            }
        });
        treeSet.add("Tom");
        //
        treeSet.add("to");
        treeSet.add("o");
        System.out.println("treeSet:"+treeSet);
    }
}
