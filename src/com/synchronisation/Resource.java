package com.synchronisation;

public class Resource {
//with static keyword here we can achieve the classs level locking
    public static synchronized void  printer(String name){
        for(int i=0;i<10;i++){
            try {
                System.out.println(name+" using the printer");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public  synchronized void  printer2(String name){
        for(int i=0;i<10;i++){
            try {
                System.out.println(name+" using the printer2");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public  void  printer3(String name){
//        synchronized (this){
//            for(int i=0;i<10;i++){
//                try {
//                    System.out.println(name+" using the printer3");
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
        synchronized (Resource.class){
            for(int i=0;i<10;i++){
                try {
                    System.out.println(name+" "+i+" "+" using the printer3");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
