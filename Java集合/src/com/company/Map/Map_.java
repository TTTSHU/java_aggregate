package com.company.Map;

import java.util.*;

public class Map_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no_01","唐明");
        map.put(2,"唐美丽");
        map.put(2,"Tm");
        map.put(null,null);
//        LinkedHashMap
        System.out.println("map:"+map);
        System.out.println(map.values());
        System.out.println(map.get(2));

        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        Set set1 = map.keySet();
        Iterator iterator1 = set1.iterator();
        Collection values = map.values();
        Iterator iterator2 = values.iterator();
        System.out.println("============values:"+values);
        System.out.println("===============key:"+set1);
        //Map的六种遍历方法
        //1、
        for (Object o : set) {
           //先把o向下转型为entry,就可以调用entry里面的get方法了
            Map.Entry entry = (Map.Entry) o;
            System.out.println("key:"+entry.getKey()+"value:"+entry.getValue());
        }
        //2、
        for (Object o :set1) {
            System.out.println("key:"+o+"value"+map.get(o));
        }
        //3、
        for (Object o :values) {
            System.out.println("values:"+o);
        }
        //4、
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next.getClass());
            System.out.println(next);
        }
        //5
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            System.out.println(next+"value:"+map.get(next));
        }
        //6
        while (iterator2.hasNext()) {
            Object next =  iterator2.next();
            System.out.println(next);
        }
    }
}
