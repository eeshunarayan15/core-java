package com.collectionframework.arrayList;

import java.util.ArrayList;

public class WildCardArrayList {
    public static void main(String[] args) {
        //read only later
        ArrayList<?> al = new ArrayList<>();
        al.add(null);
    }
}
