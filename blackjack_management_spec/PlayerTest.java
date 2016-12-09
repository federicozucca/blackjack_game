import static org.junit.Assert.*;
import org.junit.*;
import blackjack_management.*;

public class PlayerTest {

  Player player;
  Hand hand;

  @Before
  public void before(){
    player = new Player("Federico",hand);
    hand = new Hand();
  }

  @Test
  public void canGetName(){
    assertEquals("Federico",player.getName());
  }

}
  