package org.example;

public class Game {
    private Player player;
    private Dealer dealer;
    private int wins;
    private int losses;
    private int draws;
    private int bet;
    private int winnings;

    public Game(Dealer dealer, Player player) {
        this.dealer = dealer;
        this.player = player;
        this.wins = 0;
        this.losses = 0;
        this.draws = 0;
        this.bet = 0;
        this.winnings = 0;
    }

    public void playRound() {
        Deck deck = new Deck(true);
        deck.shuffle();
        dealer.initialDeal(deck);
        player.initialDeal(deck);

        // Handle Blackjack scenarios
        if (dealer.hasBlackjack() && player.hasBlackjack()) {
            System.out.println("It's a tie!");
            this.draws++;
        } else if (dealer.hasBlackjack() && !player.hasBlackjack()) {
            System.out.println("You lose!");
            this.losses++;
        } else if (!dealer.hasBlackjack() && player.hasBlackjack()) {
            System.out.println("You win!");
            this.wins++;
        } else {
            dealer.printHiddenHand();
            player.printHand();

            player.makeDecision(deck);
            if (player.isBusted()) {
                System.out.println(this.player.getName() + " busted!");
                System.out.println("You lose!");
                this.losses++;
            } else {
                dealer.makeDecision(deck);
                if (dealer.isBusted()) {
                    System.out.println(this.dealer.getName() + " busted!");
                    System.out.println("You win!");
                    this.wins++;
                } else {
                    // Compare hands if neither busted
                    int playerValue = player.getHand().calculatedValue();
                    int dealerValue = dealer.getHand().calculatedValue();

                    if (playerValue > dealerValue) {
                        System.out.println("You win!");
                        this.wins++;
                    } else if (playerValue < dealerValue) {
                        System.out.println("You lose!");
                        this.losses++;
                    } else {
                        System.out.println("It's a tie!");
                        this.draws++;
                    }
                }
            }
        }
        printScore();
    }

    public void printScore() {
        System.out.println("At the end of this round you have " + this.wins + " Wins, " + this.losses + " Losses, and " + this.draws + " Draws");
    }
}
