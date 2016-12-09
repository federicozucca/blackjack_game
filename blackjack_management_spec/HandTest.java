import static org.junit.Assert.*;
import org.junit.*;
import blackjack_management.*;

public class HandTest {

  Hand hand;

  @Before
  public void before(){
    hand = new Hand();
  }

  @Test
  public void canCreateHand(){
    hand.addCard();
    hand.addCard();
    assertEquals(2, hand.countCards());
  }

}
