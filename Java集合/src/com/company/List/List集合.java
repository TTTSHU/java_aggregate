package com.company.List;

import java.util.ArrayList;
import java.util.List;

public class List集合 {
    public static void main(String[] args) {
        List list = new ArrayList();
        List list02 = new ArrayList();

        //将指定的元素追加到此列表
        list.add("tom");
        list.add("Admin");
        list.add(null);
        System.out.println("list:"+list);
        //将指定的元素插入此列表中的指定位置（可选操作）。
        list.add(0,"JieXi");
        System.out.println("list:"+list);
        //按指定集合的迭代器（可选操作）返回的顺序将指定集合中的所有元素附加到此列表的末尾。
        list02.add("西游记");
        list02.add("红楼梦");
        //list.addAll(list02);
        System.out.println("list:"+list);
        //将指定集合中的所有元素插入到此列表中的指定位置（可选操作）。
        list.add(1,list02);
        System.out.println("list:"+list);
        //从此列表中删除所有元素（可选操作）。
        System.out.println("list02:"+list02);
        //list02.clear();
        System.out.println("list02:"+list02);
       // 如果此列表包含指定的元素，则返回 true 。
        System.out.println(list02.contains("红楼梦"));
        //如果此列表包含指定 集合的所有元素，则返回true。
        System.out.println(list.contains(list02));
        //将指定的对象与此列表进行比较以获得相等性。
        System.out.println(list.equals(list02));
        //返回此列表中指定位置的元素。
        System.out.println(list.get(0));
        //返回此列表的哈希码值。
        System.out.println(list.hashCode());
        //返回此列表中指定元素的第一次出现的索引，如果此列表不包含元素，则返回-1。
        System.out.println(list.indexOf("JieXi"));
       // 如果此列表不包含元素，则返回 true 。判断是否为空
        System.out.println(list.isEmpty());

    }
}
