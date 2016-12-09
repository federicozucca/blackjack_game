import static org.junit.Assert.*;
import org.junit.*;
import blackjack_management.*;

public class DeckTest {

  Deck deck;

  @Before
  public void before(){
    deck = new Deck();
  }

  @Test
  public void canCreateDeck(){
    deck.createDeck();
    assertEquals(52, deck.countCards());
  }



}
