package com.deadlock;

public class Resource extends Thread{
private String res1="RES1";
private String res2="RES2";
private String res3="RES3";
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+" name");
        if(name.equals("raju")){
            rajuAccess(name);
        }else if(name.equals("kaju")){
            kajuAccess(name);
        }

    }

    private void kajuAccess(String name) {
        synchronized (res3){
            timewait();
            System.out.println(name+" using res1");
            synchronized (res2){
                timewait();
                System.out.println(name+" using res1");
                synchronized (res1){
                    timewait();

                    System.out.println(name+" using res1");

                }

            }
        }
    }

    private static void timewait() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void rajuAccess(String name) {
        synchronized (res1){
            timewait();
            System.out.println(name+" using res1");
            synchronized (res2){
                timewait();
                System.out.println(name+" using res1");
                synchronized (res3){
                    timewait();

                    System.out.println(name+" using res1");

                }

            }
        }


    }
}
