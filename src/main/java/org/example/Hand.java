package org.example;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> hand;

    public Hand(){
        hand = new ArrayList<Card>();
    }

    //uses method in deck to add a card to hand and remove from deck
    public void takeCardFromDeck(Deck deck){
        hand.add(deck.dealNextCard());
    }

    public void clearHand() {
        if (this.hand != null) {
            this.hand.clear();
        }
    }

    public int calculatedValue() {
        int value = 0;
        int aceCount = 0;

        for(Card card : hand){
            value += card.getRank().getRankValue();
        }

        for(Card card : hand){
            if(card.getRank().getRankName() == "Ace"){
                aceCount++;
            }
        }

        if(aceCount > 0 && value > 21) {
            while (aceCount > 0 && value > 21) {
                value -= 10;
                aceCount--;
            }
        }
        return value;
    }

    //calculates value of all the cards in the hand besides the last one
    public int calculatedValueOfVisibleCards() {
        int value = 0;
        int aceCount = 0;

        // Iterate through all cards except the last one
        for(int i = 0; i < hand.size() - 1; i++){
            Card card = hand.get(i);
            value += card.getRank().getRankValue();
        }

        for(int i = 0; i < hand.size() - 1; i++){
            Card card = hand.get(i);
            if(card.getRank().getRankName().equals("Ace")){
                aceCount++;
            }
        }

        if(aceCount > 0 && value > 21) {
            while (aceCount > 0 && value > 21) {
                value -= 10;
                aceCount--;
            }
        }
        return value;
    }

    //makes a string of all the cards in the hand
    public String displayCards() {
        String output = "";
        int size = this.hand.size();
        for (int i = 0; i < size; i++) {
            output += this.hand.get(i).toString() + "\n";
        }
        return output;
    }

    //makes a string of all the cards in the hand besides the last one
    public String hideLast() {
        String output = "";
        int size = this.hand.size();
        for (int i = 0; i < size - 1; i++) {
            output += this.hand.get(i).toString() + "\n";
        }
        return output;
    }

}