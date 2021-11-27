package com.company.HashSet练习;

import java.util.HashSet;

public class HashSet_ {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();
        set.add(new Employee("Tom","19"));
        set.add(new Employee("Tm","19"));
        set.add(new Employee("Tom","19"));
        System.out.println(set);
        set = new HashSet<>();
        set.add(new Employee_01("Tom","12",new MyDate("2010","9","4")));
        set.add(new Employee_01("Tm","12",new MyDate("2010","9","4")));
        set.add(new Employee_01("Tom","12",new MyDate("2010","9","4")));
        System.out.println(set);
    }
}
