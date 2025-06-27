import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    EvenCheckerTest.class,
    ExceptionThrowerTest.class
})
public class AllTests {
    // Runs all tests from selected classes
}
