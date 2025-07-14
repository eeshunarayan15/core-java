package com.interthreadcommunication;

public class Message {
    private  boolean messageSent;
    private String message;
    public synchronized void sendMessage(String message, String name) {
        System.out.println("MSG SEND :- "+name+" method");

        while (messageSent){
    try {
        System.out.println(name+"SEND method while");


        wait();
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}
        System.out.println("MSG SENT :- "+message+" by "+name   );
        this.message=message;
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        messageSent=true;
        notify();
        //here we are using the notify to notify the other thread
        //readmessage to read the message
}
public synchronized void readMessage(String name) {
        //here using wait because we dont want readmessage to read until the message is sent
    System.out.println("MSG READ :- "+name+" method");
    while(!messageSent){
            try {
                System.out.println(name+"read method while");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    System.out.println("MSG READ :-"+"message"+" by "+name);
//    try {
//        Thread.sleep(1000);
//    } catch (InterruptedException e) {
//        throw new RuntimeException(e);
//    }
}


}
