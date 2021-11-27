package com.company.HashMap练习;

import java.util.*;

/*
* 输入一个字符串，统计每一个字符出现的个数
* */
public class HashMapPractice {
    public static void main(String[] args){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        //从键盘输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String next = scanner.next();
        //将字符变成字符数组
        char[] chars = next.toCharArray();
        //将数组遍历出来
        for (Character o :chars) {
            if (hashMap.get(o)==null){
                hashMap.put(o,1);
            }else {
                Integer integer = hashMap.get(o);
                integer=integer+1;
                hashMap.put(o,integer);
            }
        }
        //遍历总数
        int sum = 0;
        for (Integer o :hashMap.values()) {
                int a = o;
                sum = sum+a;
                a=0;
        }
        System.out.println("总字符数为："+sum);
        //
        Set<Map.Entry<Character, Integer>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<Character, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> map =  iterator.next();
            System.out.println(map.getKey()+"出现的次数为："+map.getValue());
        }

    }
}
