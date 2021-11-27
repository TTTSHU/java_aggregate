package com.company.Conllections;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("admin");
        list.add("bec");
        list.add("etc");
        list.add("cor");
        System.out.println(list);
        //排序翻转.reverse
        java.util.Collections.reverse(list);
        System.out.println(list);
        //根据字符串的大小排序
        java.util.Collections.sort(list);
        System.out.println(list);

    }
}
