package com.mulltithreading.runnable;

public class Launch {
    public static void main(String[] args) {
        Five five = new Five();
        Seven seven = new Seven();
//        new Thread(five).start();
//        new Thread(seven).start();
        Thread thread = new Thread(five);
        Thread thread1 = new Thread(seven);
        thread.start();
        thread1.start();

    }
}
