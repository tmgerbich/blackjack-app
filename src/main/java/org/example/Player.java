package org.example;

import java.util.Scanner;


//implementation of blackjack player
public class Player extends Person {

    public Player(String name) {
        super.setName(name);
    }

    public void makeDecision(Deck deck) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Hit or stand?");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("stand")) {
                return;
            } else if (input.equalsIgnoreCase("hit")) {
                super.hit(deck);
                super.printHand();
            } else {
                System.out.println("Invalid input");
            }
        }
    }

    }


