import static org.junit.Assert.*;
import org.junit.*;
import blackjack_management.*;

public class PlayerTest {

  Player player;

  @Before
  public void before(){
    player = new Player("Federico");
  }

  @Test
  public void canGetName(){
    assertEquals("Federico",player.getName());
  }

}
  