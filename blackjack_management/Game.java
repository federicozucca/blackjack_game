package blackjack_management;
import java.util.*;
import java.io.*;

public class Game {

      private Deck deck;
      private ArrayList<Player> players;

      public Game(){
        this.players = new ArrayList<Player>();
    }

public void populatePlayer(Player player){
    this.players.add(player);
}

public void initialize(){    
    deck = new Deck();
    deck.createDeck();
    Hand hand1 = new Hand();
    Player player1 = new Player("Dealer", hand1);
    Hand hand2 = new Hand();
    Player player2 = new Player("George", hand2);
    populatePlayer(player1);
    populatePlayer(player2);
}


public void firstTurnDealer(){
    Card card1 = deck.dealCard();
    Card card3 = deck.dealCard();
    this.players.get(0).getHand().addCard(card1);
    System.out.println( players.get(0).getName() + "'s first card is: " + card1.getValue());
    this.players.get(0).getHand().addCard(card3);
    System.out.println( players.get(0).getName() + "'s second card is: " + card3.getValue());
}


public void firstTurnPlayer(){
    Card card2 = deck.dealCard();
    Card card4 = deck.dealCard();
    this.players.get(1).getHand().addCard(card2);
    System.out.println( players.get(1).getName() + "'s first card is: " + card2.getValue());
    this.players.get(1).getHand().addCard(card4);
    System.out.println( players.get(1).getName() + "'s second card is: " + card4.getValue());
}

public void playerScore(){
    System.out.println( players.get(0).getName() + "'s score is: " + players.get(0).getHand().getHandValue());
    System.out.println( players.get(1).getName() + "'s score is: " + players.get(1).getHand().getHandValue());
}


public void nextTurnPlayer(){
    System.out.print(players.get(1).getName() +" your score is: "+ players.get(1).getHand().getHandValue()+", would you like to add a card? (yes/no):");
    String input = System.console().readLine();
    if ("yes".equals(input)){
        Card card5 = deck.dealCard();
        this.players.get(1).getHand().addCard(card5);
        int score1 = players.get(1).getHand().getHandValue();
        System.out.println( players.get(1).getName() + "'s score is: " + score1 );
    } 
    else System.out.println( players.get(1).getName() + "'s score is: " + players.get(1).getHand().getHandValue());
}

public void keepGoingPlayer(){
int score1 = players.get(1).getHand().getHandValue();
if (score1 <21) {nextTurnPlayer();}
}


public void nextTurnDealer(){
    System.out.print(players.get(0).getName() +" your score is: "+ players.get(0).getHand().getHandValue()+", would you like to add a card? (yes/no):");
    String input = System.console().readLine();
    if ("yes".equals(input)){
        Card card6 = deck.dealCard();
        this.players.get(0).getHand().addCard(card6);
        int score2 = players.get(0).getHand().getHandValue();
        System.out.println( players.get(0).getName() + "'s score is: " + score2 );
    } 
    else System.out.println( players.get(0).getName() + "'s score is: " + players.get(0).getHand().getHandValue());
}

public void keepGoingDealer(){
int score2 = players.get(0).getHand().getHandValue();
if (score2 <21) {nextTurnDealer();}
}

// public void nextTurnDealer(){
//     int score1 = players.get(1).getHand().getHandValue();
//     if(score1<22){
//     System.out.print(players.get(0).getName() +", would you like to add a card? (yes/no):");
//     String input = System.console().readLine();
//     if ("yes".equals(input)){
//         Card card7 = deck.dealCard();
//         this.players.get(0).getHand().addCard(card7);
//         int score2 = players.get(0).getHand().getHandValue();
//         System.out.println( players.get(0).getName() + "'s score is: " + score2 );
//     } 
//     else System.out.println( players.get(0).getName() + "'s score is: " + players.get(0).getHand().getHandValue());
// }
//     else System.out.println( players.get(0).getName() + " Wins!");
// }

// public void keepGoingDealer(){
// int score2 = players.get(0).getHand().getHandValue();
// if (score2 <21) {nextTurnDealer();}
// else System.out.println( players.get(0).getName() + " is bust! The winner is: " + players.get(1).getName());
// }


public String getWinner(){
    Player player1 = this.players.get(0);
    Player player2 = this.players.get(1);
    int player1Score = player1.getHand().getHandValue();
    int player2Score = player2.getHand().getHandValue();

    if(player1Score > 21) {
        return "The winner is "+ player2.getName();
    } else if(player2Score > 21) {
        return "The winner is "+ player1.getName();
    }
    
    if (player1Score > player2Score){
        return "The winner is "+ player1.getName();
    }
    else if (player1Score < player2Score){
        return "The winner is "+ player2.getName();
    }

    else{
        return player1.getName() +" and "+ player2.getName() +" drew!";

    }

}


public void play(){
    System.out.println("Welcome to Black Jack");
    System.out.println("*****************************");

    initialize();
    firstTurnDealer();
    System.out.println("*****************************");
    initialize();
    firstTurnPlayer();
    System.out.println("*****************************");
    playerScore();
    System.out.println("*****************************");
    nextTurnPlayer();
    keepGoingPlayer();
    System.out.println("*****************************");
    nextTurnDealer();
    keepGoingDealer();
    System.out.println("*****************************");
    getWinner();
    System.out.println( getWinner() );

}
}