import org.junit.*;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        // Arrange
        account = new BankAccount(100);
    }

    @After
    public void tearDown() {
        account = null;
    }

    @Test
    public void testDeposit() {
        // Act
        account.deposit(50);

        // Assert
        assertEquals(150, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        // Act
        account.withdraw(30);

        // Assert
        assertEquals(70, account.getBalance());
    }
}
