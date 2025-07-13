package com.synchronisation;

public class User extends Thread {
    private  Resource resource;
    public  User(Resource resource){
        this.resource=resource;
    }
    @Override
    public void run() {
        String name=Thread.currentThread().getName();
        resource.printer(name);
        resource.printer2(name);
        resource.printer3(name);
    }
}
