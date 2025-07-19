package com.collectionframework.linkedList;

import java.util.LinkedList;

public class WildCardGenericLinkedList {
    public static void main(String[] args) {
        LinkedList<?> objects = new LinkedList<>();
        objects.add(null);

    }
}
