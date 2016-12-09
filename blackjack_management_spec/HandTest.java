import static org.junit.Assert.*;
import org.junit.*;
import blackjack_management.*;

public class HandTest {

  Hand hand;
  Card card;

  @Before
  public void before(){
    hand = new Hand();
    card = new Card(NumberType.ACE, SuitType.HEARTS);
  }

  @Test
  public void canCreateHand(){
    hand.addCard(card);
    hand.addCard(card);
    assertEquals(2, hand.countCards());
  }

}
