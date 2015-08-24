import org.junit.*;
import static org.junit.Assert.*;

public class TaskTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void all_listIsEmptyAtFirst() {
    assertEquals(Task.all().size(), 0);
  }
  @Test
  public void equals_returnsTrueIfDescriptionsAreTheSame() {
    Task firstTask = new Task("Buy Foods");
    Task secondTask = new Task("Buy Foods");

    assertTrue(firstTask.equals(secondTask));
  }
  @Test
  
}
