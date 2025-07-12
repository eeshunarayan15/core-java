package com.multithreading;

public class Five extends Thread    {
    @Override
    public  void run (){
        for (int i = 1; i<=10; i++){
            System.out.println(5*i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
