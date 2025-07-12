package com.mainapp;

import java.util.Scanner;

public class Array2DJaggedInputByUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int arr[][]=new int [sc.nextInt()][];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the elements of the array:"+i);
            arr[i]=new int[sc.nextInt()];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter the elements of array:"+i+j );
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" " );

            }
            System.out.println();
        }
    }
}
