package org.example;


public class Dealer extends Person {

    public Dealer() {
        super.setName("Dealer");
    }
    public void makeDecision(Deck deck) {
        while(true) {
            if (super.getHand().calculatedValue() <= 16) {
                System.out.println("Dealer Hits");
                super.hit(deck);
                if (super.isBusted()) {
                    super.printHand();
                    return;
                }
            } else {
                System.out.println("Dealer Stands");
                break;
            }
        }
    }
}
