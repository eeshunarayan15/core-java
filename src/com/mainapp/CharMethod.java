package com.mainapp;

public class CharMethod {
    public static void main(String[] args) {
        String s="hello";
        char arr []= new char[s.length()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.charAt(i);
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
