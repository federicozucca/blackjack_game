package blackjack_management;
import java.util.*;

public class Deck {
  private ArrayList<Card> cards;

  public Deck(){
  this.cards = new ArrayList<Card>();
  }

  public int countCards(){
    return cards.size();
  }

  public void createDeck(){
    for(SuitType suit: SuitType.values()){
      for(NumberType number : NumberType.values()){
        cards.add(new Card(number, suit));
      }
    }
  Collections.shuffle(cards);
  }


public Card dealCard(){
  return cards.remove(0);
}

  

  
}