package com.threadclass;

public class Database2 extends Thread {
    public String [] collect=new String [4];
    public void run (){
        String data []={"d1","d2","d3","d4"};
        int i=0;
        for(String str:data){
            collect[i]=str;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("DATA"+i+"Collected from DB 2");
        }
    }

}
