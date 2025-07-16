package com.collectionframework.arrayList;

import java.util.ArrayList;

public class NonGenericArrayList {
    public static void main(String[] args) {
        // JAVA 5 Collection (Generics)
        ArrayList arrayList;
    arrayList=new ArrayList();
        arrayList.add("raju");
        arrayList.add(123);
        arrayList.add(false);
        arrayList.add(true);
        arrayList.add('c');
        System.out.println(arrayList);


    }
}
