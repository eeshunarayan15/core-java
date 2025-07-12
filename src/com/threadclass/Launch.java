package com.threadclass;

public class Launch {
    public static void main(String[] args) {
        Database1 database1 = new Database1();
        Database2 database2 = new Database2();
        database1.start();
        database2.start();
        try {
            database1.join();
        database2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        database1.setPriority(Thread.MIN_PRIORITY);
        database2.setPriority(Thread.MAX_PRIORITY);
//        database1.setPriority(1);
//        System.out.println(database1.getPriority());
//        System.out.println(database2.getPriority());
        process(database1.collect2,database2.collect);
        //join()
        //it will passe the current thread until other threads finishes their execution


    }

    private static void process(String[] collect2, String[] collect) {
        for(String str:collect2){
            System.out.println(str);
        }
        for(String str:collect){
            System.out.println(str);
        }
    }
}
