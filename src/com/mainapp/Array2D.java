package com.mainapp;

public class Array2D {
    public static void main(String[] args) {

        int arr[][]={
                {11,22,33,44,55},
                {12,13,14,15},
                {122,111,},
                {122}

        };
//        System.out.println(arr.length);
//        System.out.println(arr[0].length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].length+" "+i);



        }

    }
}
