package com.mainapp;

import java.util.Scanner;

public class Array2DUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int roll=sc.nextInt();

        int arr[][]=new int [size][roll];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){

           arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
