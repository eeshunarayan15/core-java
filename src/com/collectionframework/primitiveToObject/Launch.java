package com.collectionframework.primitiveToObject;

public class Launch {
    public static void main(String[] args) {
        int a=10;
        Integer i =new Integer(a);//manual boxing
        String string = i.toString();//manual inboxing
        System.out.println(string);
        int c=20;
        Integer d=c; //auto boxing
        int k=d;//auto unboxing
        System.out.println(d);


    }
}
