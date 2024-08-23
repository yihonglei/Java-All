package com.jpeony.collection.list;

import java.util.Stack;

/**
 * 后进先出
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // 入栈
        stack.push("one");
        stack.push("two");

        // 出栈
        System.out.println(stack.pop());
    }
}
