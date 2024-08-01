package org.example;

import java.util.Scanner;

public class Dealer extends Person {

    public Dealer() {
        super.setName("Dealer");
    }
    public void makeDecision(Deck deck) {
        while(true) {
            if (super.getHand().calculatedValue() >16) {
                System.out.println("Dealer Hits");
                super.hit(deck);
            } else {
                System.out.println("Dealer Stands");
                break;
            }
        }
    }
}
