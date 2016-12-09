package blackjack_management;

public class Card {

  private NumberType number;
  private SuitType suit;

  public Card(NumberType number, SuitType suit){
    this.number = number;
    this.suit = suit;
  }

  public NumberType getNumber(){
    return this.number;
  }

  public SuitType getSuit(){
    return this.suit;
  }

  public int getValue(){
    int value = this.number.ordinal()+1;
    if(value >10){
      return 10;
    }
    return value;
  }

  
}