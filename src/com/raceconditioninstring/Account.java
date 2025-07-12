package com.raceconditioninstring;

public class Account {
    private  String s="pqrs";
    public  synchronized void deduct(String a,String cardName){
           this.s+=a;
        System.out.println("Debit card Successfully  "+cardName);
    }
    public void get(){
        int count=0;
        char[] charArray = s.toCharArray();
        for(char c : charArray){
            if(c=='a'){
                count++;

            }

        }
            System.out.println(count);
    }

}
