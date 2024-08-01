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

    @Override
    public String toString(){
        String output = "";
        for(Card card: this.hand){
            output += card.toString() + "\n";
        }
        return output;
    }

}