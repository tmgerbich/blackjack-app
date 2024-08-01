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
        System.out.println("You hit!");
    }

    public boolean hasBlackjack(){
        if (this.hand.calculatedValue() == 21) {
            return true;
        } else {
            return false;
        }
    }

    public void printHand(){
        System.out.println(this.name + " has:");
        System.out.println(this.hand.displayCards() + "For a total of: " + this.hand.calculatedValue());
    }

    public void printHiddenHand() {
        System.out.println(this.name + " has:");
        System.out.println(this.hand.hideLast() + "The last card is hidden.");
        System.out.println("Total of the dealer's visible cards: " + this.hand.calculatedValueOfVisibleCards());
    }


}
