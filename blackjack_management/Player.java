package blackjack_management;

public class Player {

  private String name;
  private int hands;

  public Player(String name){
    this.name = name;
    this.hands = 0;
  }

  public String getName(){
    return this.name;
  }

  
}