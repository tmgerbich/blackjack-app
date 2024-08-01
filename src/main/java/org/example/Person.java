package org.example;

abstract class Person {
    private String name;
    private Hand hand;

    public Person(){
        this.hand = new Hand();
        this.name = "";
    }

    public Hand getHand(){
        return this.hand;
    }

    public void setHand(Hand hand){
        this.hand = hand;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;

    }

    public void initialDeal(Deck deck){
        this.hand.takeCardFromDeck(deck);
        this.hand.takeCardFromDeck(deck);
    }

    public void hit(Deck deck) {
        this.hand.takeCardFromDeck(deck);
    }

    public boolean hasBlackjack(){
        if (this.hand.calculatedValue() == 21) {
            return true;
        } else {
            return false;
        }
    }
}
