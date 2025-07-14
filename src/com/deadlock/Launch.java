package com.deadlock;

public class Launch {
    public static void main(String[] args) {
        Resource resource = new Resource();
        Resource resource1 = new Resource();
        resource1.setName("kaju");
        resource.setName("raju");
        resource.start();
        resource1.start();
    }
}
