package com.company.List;

public class LinkedList_ {
    public static void main(String[] args) {
        Node node1 = new Node("Jack");
        Node node2 = new Node("Tom");
        Node node3 = new Node("TM");
        //从头到尾连接
        node1.next=node2;
        node2.next=node3;
        //从尾到头连接
        node3.pre=node2;
        node2.pre=node1;
        //定义列表的头尾结构
        Node first = node1;
        Node last = node3;
        System.out.println("============>从头到尾遍历");
        //遍历双向链表,从头到尾遍历
        while (true){
            if (first==null){
                break;
            }
            System.out.println(first.item);
            first = first.next;
        }
        System.out.println("============>从尾到头遍历");
        //遍历双向链表,从尾到头遍历
        while (true){
            if (last==null){
                break;
            }
            System.out.println(last);
            last = last.pre;
        }
        //演示链表的插入
        Node node4 = new Node("Kto");
        node2.next=node4;
        node4.next=node3;
        node3.pre=node4;
        node4.pre=node2;
        first = node1;
        last = node3;
        System.out.println("============>从头到尾遍历");
        //遍历双向链表,从头到尾遍历
        while (true){
            if (first==null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }
    }
    static class Node{
        public Object item;
        public Node next;
        public Node pre;

        public Node(Object item) {
            this.item = item;
        }

        @Override
        public String toString() {
            return "NodeName="+item;
        }
    }
}
