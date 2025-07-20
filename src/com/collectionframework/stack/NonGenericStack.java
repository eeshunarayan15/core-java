package com.collectionframework.stack;

import java.util.Stack;

public class NonGenericStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(6564);
        stack.push("sjfkjds");
        stack.push(false);
        stack.push(true);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        Object peek = stack.peek();
        System.out.println(stack.search(6564));
    }
}
