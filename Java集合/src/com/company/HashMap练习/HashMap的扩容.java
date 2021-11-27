package com.company.HashMap练习;

import java.util.HashMap;
import java.util.Objects;

public class HashMap的扩容 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 12; i++) {
            hashMap.put(new Dog("Tom",12),"1");
        }
        hashMap.put("1","1");
        for (int i = 0; i < 11; i++) {
            hashMap.put(new Dog("Tom",12),"1");
        }

        hashMap.put("2","1");
        System.out.println(hashMap);

    }
   static class Dog{
        private String name;
        private int age;

       public Dog(String name, int age) {
           this.name = name;
           this.age = age;
       }



       @Override
       public int hashCode() {
           return 100;
       }
   }
}
