package com.collectionframework.primitiveToObject;

public class Launch {
    public static void main(String[] args) {
        int a=10;
        Integer i =new Integer(a);//manual boxing
        String string = i.toString();
        System.out.println(string);

    }
}
