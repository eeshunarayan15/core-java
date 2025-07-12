package com.racecondition;

public class Card2 extends Thread {
    private Account account;
    public Card2(Account account) {
        this.account = account;
    }
    @Override
    public void run() {
        for(int i=0;i<100000;i++){
            account.deduct(2,Thread.currentThread().getName());

        }
    }
}
