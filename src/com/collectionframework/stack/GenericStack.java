package com.collectionframework.stack;

import java.util.Stack;

public class GenericStack {
    public static void main(String[] args) {
        Stack<String> strings = new Stack<>();
        Stack<Integer> integers = new Stack<>();
        strings.add("hello");
        strings.add("hello");
        System.out.println(strings);

        integers.add(54);
        integers.add(60);
        System.out.println(integers);
    }
}
