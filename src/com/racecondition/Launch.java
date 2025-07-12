package com.racecondition;

public class Launch {
    public static void main(String[] args) {
        Account account = new Account();
        Card card = new Card(account);
        Card2 card2 = new Card2(account);
        card.start();
        card2.start();
        card.setName("card1");
        card2.setName("card2");
        try {
            card.join();
        card2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        account.get();
    }
}
