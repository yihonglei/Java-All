package com.jpeony.collection.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * set是继承Collection的一个接口，元素无放入顺序，元素不可重复，如果重复，将去重后存放
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        set.add("e");
        set.add("e");
        set.add("e");
        set.add("e");

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}