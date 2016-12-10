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
    this.players.get(0).getHand().addCard(card3);
}


public void firstTurnPlayer(){
    Card card2 = deck.dealCard();
    Card card4 = deck.dealCard();
    this.players.get(1).getHand().addCard(card2);
    this.players.get(1).getHand().addCard(card4);
}

public void playerScore(){
    System.out.println( players.get(0).getName() + "'s score is: " + players.get(0).getHand().getHandValue());
    System.out.println( players.get(1).getName() + "'s score is: " + players.get(1).getHand().getHandValue());
}

public void nextTurnPlayer(){
    System.out.print(players.get(1).getName() +", would you like to add a card? (yes/no):");
    String input = System.console().readLine();
    if ("yes".equals(input)){
        Card card5 = deck.dealCard();
        this.players.get(1).getHand().addCard(card5);
        int score1 = players.get(1).getHand().getHandValue();
        System.out.println( players.get(1).getName() + "'s score is: " + score1 );
    } 
    else System.out.println( players.get(1).getName() + "'s score is: " + players.get(1).getHand().getHandValue());
}
public void nextTurnDealer(){
    System.out.print(players.get(0).getName() +", would you like to add a card? (yes/no):");
    String input = System.console().readLine();
    if ("yes".equals(input)){
        Card card6 = deck.dealCard();
        this.players.get(0).getHand().addCard(card6);
        int score2 = players.get(0).getHand().getHandValue();
        System.out.println( players.get(0).getName() + "'s score is: " + score2 );
    } 
    else System.out.println( players.get(0).getName() + "'s score is: " + players.get(0).getHand().getHandValue());
}

public String getWinner(){
    Player player1 = this.players.get(0);
    Player player2 = this.players.get(1);
    int player1Score = player1.getHand().getHandValue();
    int player2Score = player2.getHand().getHandValue();

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
    initialize();
    firstTurnDealer();
    firstTurnPlayer();
    playerScore();
    nextTurnPlayer();
    nextTurnDealer();
    getWinner();
    System.out.println( getWinner() );

}
}