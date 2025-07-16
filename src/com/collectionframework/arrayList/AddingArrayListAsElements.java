package com.collectionframework.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AddingArrayListAsElements {
    public static void main(String[] args) {
        ArrayList<Object> al1 = new ArrayList<>();
        al1.add("rahul");
        al1.add(false);
        ArrayList<Object> al2 = new ArrayList<>();
        al2.add("sohan");
        al2.add(true);
        al1.addAll(al2);
        System.out.println(al1);
        String k = "rahul";
        al1.remove(k);
        System.out.println(al1);
        System.out.println(al1.contains("rahul"));//method to check if the element exists in arraylist

        int sohan = al1.indexOf("sohan");
        System.out.println(sohan+" index");
        int sohan1 = al1.lastIndexOf("sohan");
        System.out.println(sohan1);
        System.out.println(al1.isEmpty()+"  is empty method use");
        Object clone = al1.clone();
        System.out.println(clone+"  clone");
        Object[] array = al1.toArray();
        String string = Arrays.toString(array);
        System.out.println(string+" String");
        System.out.println(al1.size()+"  checking the size");
        for(int i=0;i<al1.size();i++){
            System.out.print(al1.get(i)+"  ");
        }
        System.out.println();
        for(Object n: al1){
            System.out.println(n);
        }
        System.out.println("******************************");
        Iterator<Object> iterator = al1.iterator();
     while (iterator.hasNext()){
         System.out.println(iterator.next());
     }
        System.out.println(al1);

        List<Object> objects = al1.subList(1, 2);
        System.out.println(objects+" sublist");
    }
}
