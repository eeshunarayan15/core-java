package com.threadclass;

public class Database1 extends Thread {
    public String [] collect2=new String [4];
    public void run (){
        String data2 []={"xd1","xd2","xd3","xd4"};
        int i=0;
        for(String str:data2){
            collect2[i]=str;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("DATA"+i+"Collected from DB 1");
        }
    }
}
