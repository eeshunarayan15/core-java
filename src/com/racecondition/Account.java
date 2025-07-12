package com.racecondition;

public class Account  extends Thread{
    private  int balance=500000;
    public  synchronized void deduct(int amount,String cardName){
//        this.balance=balance-amount;
        this.balance -= amount;
        System.out.println("Debit card Successfully  "+cardName);
    }
    public void get(){
        System.out.println(balance);
    }
}
