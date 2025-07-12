package com.raceconditioninstring;

public class Launch {
    public static void main(String[] args) {
        Account account = new Account();
        Card1 card1 = new Card1(account);
        Card2 card2 = new Card2(account);
        card1.start();
        card2.start();
        try {
            card1.join();
        card2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        account.get();
    }
}
