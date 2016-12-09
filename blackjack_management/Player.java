package blackjack_management;
import java.util.*;

public class Player {

  private String name;
  private Hand hand;

  public Player(String name, Hand hand){
    this.name = name;
    this.hand = hand;
  }

  public String getName(){
    return this.name;
  }

  public Hand getHand(){
    return this.hand;
    
  }

  
}