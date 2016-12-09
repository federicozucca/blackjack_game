package blackjack_management;
import java.util.*;

public class Hand {

  private ArrayList<Card> hand;

  public Hand(){
    this.hand = new ArrayList<Card>();
  }

  public int countCards(){
    return hand.size();
  }

  public void addCard(Card card){
    this.hand.add(card);
  }

  public int getHandValue(){
    int sum = 0;
    for(Card card: hand ){
      sum += card.getValue();
    }
    return sum;
  }


}