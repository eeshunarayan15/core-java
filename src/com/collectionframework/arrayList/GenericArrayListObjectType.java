package com.collectionframework.arrayList;

import java.util.ArrayList;

public class GenericArrayListObjectType {
    public static void main(String[] args) {
        ArrayList<Object> arrayList=new ArrayList<>();
        arrayList.add("heloo");
        arrayList.add(false);
        arrayList.add(5.4F);
        arrayList.add(434243);
        arrayList.add('5');
        arrayList.remove(1);
        System.out.println(arrayList);
    }
}
