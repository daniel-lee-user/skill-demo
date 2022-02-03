import static org.junit.Assert.*;
import org.junit.*;
public class AdditionClassTest {
    @Test
    public void testAdd() {
        assertEquals(5, AdditionClass.add(1,4));
        // should pass because 5 = 5
        // 1 failure 1 test, time to commit and push
        // time  to run on ssh server
        // fails all the same.
        // time to change the test so it passes
    }
}
