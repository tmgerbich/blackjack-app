package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Blackjack");

 Card card = new Card(Suit.HEARTS, Rank.ACE);
 System.out.println(card);

        Deck testDeck = new Deck(true);

        System.out.println(testDeck);

    }
}
