package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;

public class Deck implements DeckActions{
    private ArrayList<Card> deck;
    private int numCards;

    //make a deck with all 52 cards
    public Deck(boolean makeDeck){
        deck = new ArrayList<Card>();
        if(makeDeck){
            for(Suit suit : Suit.values()){
                for(Rank rank : Rank.values()){
                    deck.add(new Card(suit, rank));
                }
            }
        }
    }

    @Override
    public void shuffle() {
        Collections.shuffle(deck);
    }

    //deal card and remove from deck
    @Override
    public Card dealNextCard() {
        Random rand = new Random();
        int randomNum = rand.nextInt(deck.size());
        Card card = deck.get(randomNum);
        deck.remove(randomNum);
        return card;
    }

    @Override
    public void printDeck(int numToPrint) {

    }

    //print all remaining cards in the deck
    @Override
    public String toString(){
        String output = "";

        for(Card card: this.deck){
            output += card.toString() + "\n";
        }
        return output;
    }
}
