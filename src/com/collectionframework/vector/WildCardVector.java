package com.collectionframework.vector;

import java.util.Vector;

public class WildCardVector {
    public static void main(String[] args) {
        Vector<?> objects1 = new Vector<>();
        objects1.add(null);
        objects1.add(null);
        System.out.println(objects1);
    }
}
