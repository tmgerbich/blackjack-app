package org.example;

import java.util.Scanner;

public class GameRunner {


    public static void main(String[] args) {
        // play some music
        String filepath = "CasinoJazz.wav";
        PlayMusic music = new PlayMusic();
        music.playMusic(filepath);


        Scanner sc = new Scanner(System.in);

        //sets up variables for the game
        Player player;
        Dealer dealer = new Dealer();


        System.out.println("Welcome to Blackjack!");
        System.out.println("What's your name?");
        String name = sc.nextLine();
        player = new Player(name);

        while(true){
            Game game = new Game(dealer, player);
            System.out.println("Do you want to play blackjack? (y/n)");
            String response = sc.nextLine();
            if(response.equalsIgnoreCase("y")){
                game.playRound();
                player.clearHand();
                dealer.clearHand();

            } else if (response.equalsIgnoreCase("n")) {
                System.out.println("Goodbye!");
                break;

            } else {
                System.out.println("Invalid input");
            }
        }








    }
}

