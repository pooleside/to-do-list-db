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
  public void save_returnsTrueIfDescriptionsAreTheSame()  {
    Task myTask = new Task("go to the gym");
     myTask.save();
     assertTrue(Task.all().get(0).equals(myTask));
  }
  @Test
  public void save_AssignsIdToObject() {
    Task myTask = new Task ("deposit check");
    myTask.save();
    Task savedTask = Task.all().get(0);
    assertEquals(myTask.getId(), savedTask.getId());
  }
  @Test
  public void find_findsTaskInDatabase_true() {
    Task myTask = new Task("buy vitamins");
    myTask.save();
    Task savedTask = Task.find(myTask.getId());
    assertTrue(myTask.equals(savedTask));
    }
}
