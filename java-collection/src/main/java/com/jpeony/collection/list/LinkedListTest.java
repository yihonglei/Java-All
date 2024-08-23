package com.jpeony.collection.list;

import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList 基于双向链表实现
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        // add
        list.add("one");
        list.add("two");
        list.add("three");
        // offer 的底层是 add
        list.offer("four");
        // pop 出队
        // list.pop();

        for (int i = 0; i < list.size(); i++) {
            System.out.println("element[" + i + "] " + list.get(i));
        }
    }
}
