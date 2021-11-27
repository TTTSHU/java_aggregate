package com.company.Map;

import java.util.Hashtable;

public class HashTable_ {
    public static void main(String[] args) {
        //当新建一个HashTable对象的时候，会创建一个Hashtable$Entry的内部类，大小为11
        Hashtable hashtable = new Hashtable<>();
        //当调用.put的方法后会走判断value是否为空的方法，如果为空则会抛出异常
       // hashtable.put("1","Tom");
        //判断key的hashCold时如果为0则会抛出异常
       // hashtable.put(null,"Tm");
       // hashtable.put("1","Jack");
        //当添加数据时会根据hash值算出索引值如果索引值定位的数组坐标为空那么就直接添加
       // hashtable.put("2","Tm");
        for (int i = 0; i < 30; i++) {
            hashtable.put(new Tm("1",5),"value");
        }

    }
    static class Tm{
        private String name;
        private int age;

        public Tm(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
