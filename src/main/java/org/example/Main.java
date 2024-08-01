package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Blackjack");

    Card card = new Card(Suit.HEARTS, Rank.ACE);
    System.out.println(card);

        Deck testDeck = new Deck(true);

        Hand testHand = new Hand();
        testHand.takeCardFromDeck(testDeck);
        System.out.println(testHand);
        testHand.takeCardFromDeck(testDeck);
        testHand.takeCardFromDeck(testDeck);
        System.out.println(testHand);
        System.out.println(testHand.calculatedValue());

        Dealer testDealer = new Dealer();
        testDealer.initialDeal(testDeck);
        System.out.println(testDealer.getHand());
        testDealer.hit(testDeck);
        System.out.println(testDealer.getHand());
        System.out.println(testDealer.hasBlackjack());
        testDealer.printHand();


    }
}
