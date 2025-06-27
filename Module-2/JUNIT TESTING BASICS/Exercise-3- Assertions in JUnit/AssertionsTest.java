import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        assertEquals(5, 2 + 3);          // Check equality
        assertTrue(5 > 3);               // Check true condition
        assertFalse(5 < 3);              // Check false condition
        assertNull(null);               // Null check
        assertNotNull(new Object());    // Not null check
    }
}
