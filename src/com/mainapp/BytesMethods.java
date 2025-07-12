package com.mainapp;

import java.util.Arrays;

public class BytesMethods {
    public static void main(String[] args) {
        String s="this is my car";
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));
    }
}
