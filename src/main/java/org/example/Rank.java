package org.example;

//Enum representing the 13 cards.
public enum Rank {
    ACE("Ace", 11), //value set to 11 for now, can add logic later for when it is 1
    TWO("Two", 2),
    THREE("Three", 3),
    FOUR("Four", 4),
    FIVE("Five", 5),
    SIX("Six", 6),
    SEVEN("Seven", 7),
    EIGHT("Eight", 8),
    NINE("Nine", 9),
    TEN("Ten", 10),
    JACK("Jack", 10),
    QUEEN("Queen", 10),
    KING("King", 10);

    private final String rankName;
    private final int rankValue;

    Rank(String rankName, int rankValue) {
        this.rankName = rankName;
        this.rankValue = rankValue;
    }

    public String getRankName() {
        return rankName;
    }

    public int getRankValue() {
        return rankValue;
    }
}