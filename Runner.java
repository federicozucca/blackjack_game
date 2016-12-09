import blackjack_management.*;
import java.util.*;

class Runner{

  public static void main(String[] args) {

    Deck deck = new Deck();
    deck.createDeck();
    ArrayList<Card> cards = deck.getDeck();

    for(Card card : cards){
      System.out.println( card.getNumber()+" of "+ card.getSuit());
    }

  }
}