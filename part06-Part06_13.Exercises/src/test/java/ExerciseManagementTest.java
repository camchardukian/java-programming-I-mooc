import static org.junit.Assert.assertEquals;
import org.junit.Test;

// I don't understand what I'm supposed to be doing for this exercise so I'm skipping it for now.
// I write tests with Jest and RTL at my day job so I know the basics of unit testing, just the instructions for this exercise aren't clear.
public class ExerciseManagementTest {
    @Test
    public void exerciseListEmptyAtBeginning() {
        ExerciseManagement management = new ExerciseManagement();
        assertEquals(0, management.exerciseList().size());
    }
}
