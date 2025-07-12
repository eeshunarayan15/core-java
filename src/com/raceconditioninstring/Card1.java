package com.raceconditioninstring;

public class Card1 extends Thread {
    private Account account;
    public Card1(Account account) {
        this.account = account;
    }
    public Card1(String cardName){}
    @Override
    public void run() {
        for(int i=0;i<100000;i++){
            account.deduct("a",Thread.currentThread().getName());

        }
    }
}
