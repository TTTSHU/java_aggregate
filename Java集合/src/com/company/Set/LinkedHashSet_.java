package com.company.Set;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSet_ {
    public static void main(String[] args) {
        LinkedHashSet list = new LinkedHashSet();
        list.add("Tom");
        list.add("Jack");
        list.add("Tom");
        list.add("Tm");
        System.out.println("LinkedList:"+list);
    }
}
