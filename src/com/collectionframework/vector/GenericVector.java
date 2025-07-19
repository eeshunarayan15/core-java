package com.collectionframework.vector;
import  java.util.Vector;
public class GenericVector {
    public static void main(String[] args) {
        Vector<Object> objects = new Vector<>();
        Vector<String> strings = new Vector<>();
        Vector<Integer> integers = new Vector<>();
        Vector<Double> doubles = new Vector<>();
        objects.add(1);
        objects.add(2);
        strings.add("a");
        strings.add("b");
        integers.add(1);
        integers.add(2);
        doubles.add(1.0);
        doubles.add(2.0);
        System.out.println(objects);
        System.out.println(strings);
        System.out.println(integers);
        System.out.println(doubles);

    }
}
