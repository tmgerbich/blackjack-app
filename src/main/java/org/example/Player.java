package org.example;

import java.util.Scanner;

// Implementation of blackjack player
public class Player extends Person {
    Scanner scanner = new Scanner(System.in);
    private int bet;

    public Player(String name) {
        super.setName(name);
        this.bet = 0;
    }

    public int getBet() {
        return this.bet;
    }

    public void setBet() {
        while (true) {
            System.out.println("What's your bet?");
            int tryBet = scanner.nextInt();
            if (tryBet % 5 == 0) {
                this.bet = tryBet;
                System.out.println("Your bet is: " + bet);
                break;
            } else {
                System.out.println("Please bet in increments of 5");
            }
        }
    }

    public void doubleDown() {
        while (true) {
            System.out.println("Do you want to double down? y/n");
            scanner.nextLine();
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("y")) {
                this.bet *= 2;
                break;

            } else if (response.equalsIgnoreCase("n")) {
                System.out.println("Goodbye!");
                break;

            } else {
                System.out.println("Invalid input");
            }
        }
    }

    public void makeDecision(Deck deck) {
        while (true) {
            System.out.println("Hit or stand?");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("stand")) {
                return;
            } else if (input.equalsIgnoreCase("hit")) {
                super.hit(deck);
                System.out.println("You hit!");
                super.printHand();
                if (super.isBusted()) {
                    return;
                }
            } else {
                System.out.println("Invalid input");
            }
        }
    }
}
