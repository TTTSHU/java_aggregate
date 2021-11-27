package com.company.HashMap练习;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EmpHashMap {


    public static void main(String[] args) {
        Map map = new HashMap();
        Employee employee1 = new Employee("唐明1", "1900", "1");
        Employee employee2 = new Employee("唐明2", "19000", "2");
        Employee employee3 = new Employee("唐明3", "19000", "3");
        Employee employee4 = new Employee("唐明4", "1900", "4");
        map.put(employee1.getName_id(),employee1);
        map.put(employee2.getName_id(),employee2);
        map.put(employee3.getName_id(),employee3);
        map.put(employee4.getName_id(),employee4);
        //for遍历
        Set entrySet = map.entrySet();
        for (Object o :entrySet) {
            //将o转换成Entry类
            Map.Entry entry = (Map.Entry) o;
            //然后调Entry的getvalue方法获取value值
            Object value = entry.getValue();
            //然后再将value值转换成Employee
            Employee employee = (Employee) value;
            String wages = employee.getWages();
            int i = Integer.valueOf(wages).intValue();
            if (i>18000){
                System.out.println(o);
            }
        }

        //通过迭代器遍历
        entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            //将next转换成Entry类
            Map.Entry entry = (Map.Entry) next;
            //然后调Entry的getvalue方法获取value值
            Object value = entry.getValue();
            //然后再将value值转换成Employee
            Employee employee = (Employee) value;
            String wages = employee.getWages();
            int i = Integer.valueOf(wages).intValue();
            if (i>18000){
                System.out.println(next);
            }
        }

    }
}
