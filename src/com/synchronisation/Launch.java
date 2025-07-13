package com.synchronisation;

public class Launch {
    public static void main(String[] args) {
        Resource resource=new Resource();
        Resource resource1=new Resource();

        User user1 = new User(resource);
        User user2 = new User(resource1);

user1.setName("USER 1");
user2.setName("USER 2");
user1.start();
user2.start();
    }
}
