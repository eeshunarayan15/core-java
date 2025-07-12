package com.mulltithreading.runnable;

public class Seven implements Runnable {
    @Override
  public  void  run(){
        Thread.currentThread().setName("Seven Thread");
        String name = Thread.currentThread().getName();
        System.out.println(name);
        if(name.equals("Seven Thread")){

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
}
