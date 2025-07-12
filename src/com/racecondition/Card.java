package com.racecondition;

public class Card extends Thread {
    private Account account;
    public Card(Account account) {
        this.account = account;
    }
    public Card(String cardName){}
    @Override
    public void run() {
        for(int i=0;i<100000;i++){
            account.deduct(2,Thread.currentThread().getName());

        }
    }
}
