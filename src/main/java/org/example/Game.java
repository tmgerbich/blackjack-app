package org.example;

public class Game {
    private Player player;
    private Dealer dealer;
    private int wins;
    private int losses;
    private int draws;

    public Game(Dealer dealer, Player player) {
        this.dealer = dealer;
        this.player = player;
        this.wins = 0;
        this.losses = 0;
    }

    public void playRound() {
        Deck deck = new Deck(true);
        deck.shuffle();
        dealer.initialDeal(deck);
        player.initialDeal(deck);
        if(dealer.hasBlackjack() && player.hasBlackjack()) {

        }
        if(player.hasBlackjack())
        dealer.printHiddenHand();
        player.printHand();
        player.makeDecision(deck);
        dealer.makeDecision(deck);


    }

}
