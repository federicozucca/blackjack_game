package blackjack_management;
import java.util.*;

public class Game {

  private Deck deck;
  private ArrayList<Player> players;

  public Game(){
    this.players = new ArrayList<Player>();
  }

  public void populatePlayer(Player player){
    this.players.add(player);
  }

  public String getWinner(){
    Player player1 = this.players.get(0);
    Player player2 = this.players.get(1);
    int player1Score = player1.getHand().getHandValue();
    int player2Score = player2.getHand().getHandValue();

    if (player1Score > player2Score){
        return "the winner is "+ player1.getName();
    }
    else if (player1Score < player2Score){
        return "the winner is "+ player2.getName();
    }

    else{
        return player1.getName() +" and "+ player2.getName() +" drew!";

     }
    }

    public void createDeck(){

    deck = new Deck();
    deck.createDeck();
    ArrayList<Card> cards = deck.getDeck();
    }


    public void dealCardsToPlayersAndStartGame(){
    Card card1 = deck.dealCard();
    Card card2 = deck.dealCard();
    Card card3 = deck.dealCard();
    Card card4 = deck.dealCard();

    Hand hand1 = new Hand();
    hand1.addCard(card1);
    hand1.addCard(card3);

    Hand hand2 = new Hand();
    hand2.addCard(card2);
    hand2.addCard(card4);


    Player player1 = new Player("Dealer", hand1);
    int score1 = player1.getHand().getHandValue();
    System.out.println( player1.getName() + "'s score is: " + score1 );

    Player player2 = new Player("George", hand2);
    int score2 = player2.getHand().getHandValue();
    System.out.println( player2.getName() + "'s score is: " + score2 );

    populatePlayer(player1);
    populatePlayer(player2);
    System.out.println( getWinner() );
    }

    public void play(){   
    createDeck();
    dealCardsToPlayersAndStartGame();
  
}



}