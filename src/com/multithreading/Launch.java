package com.multithreading;

public class Launch {
    public static void main(String[] args) {
        Five five = new Five();
        Seven seven = new Seven();
        five.start();
        seven.start();
    }
}
