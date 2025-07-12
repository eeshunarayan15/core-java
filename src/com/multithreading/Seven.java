package com.multithreading;

public class Seven extends Thread{
    @Override
  public  void  run(){
        for (int i = 1; i<=10;i++){
            System.out.println(7*i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
