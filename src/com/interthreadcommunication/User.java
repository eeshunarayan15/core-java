package com.interthreadcommunication;

public class User extends Thread{
    private  Message message;
    public  User (Message message){
        this.message=message;

    }

    @Override
    public void run(){
        String name = Thread.currentThread().getName();
        if(name.equals("raju")||name.equals("kaju")){
            int i=0;
            while (i<100){
                message.sendMessage("Good Morning "+i+name, name);
                i++;
            }
        }else {
            int i=0;
            while (i<100){
                message.readMessage(name);
                i++;
            }
        }
    }
}
