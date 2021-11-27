package com.company.Map;

import java.util.Properties;

public class Properties_ {
    public static void main(String[] args) {
        //properties类继承HashTable类,所以它的key和value也不能为空
        //properties类的扩容机制与HashTable类一致
        Properties properties = new Properties();
        properties.put("1","Tom");
        String property = properties.getProperty("1");
        System.out.println(property);
    }
}
