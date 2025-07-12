package com.mainapp;

import java.util.Scanner;

public class Array3DUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter collge");
       int clg= sc.nextInt();
        System.out.println("Enter department");
        int dep= sc.nextInt();
        System.out.println("Enter student");
        int std= sc.nextInt();
        int arr[][][]=new int[clg][dep][std];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
                    System.out.println("Enter Roll number for college "+i+"of department "+j+"student "+k);
                arr[i][j][k]=sc.nextInt();
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
