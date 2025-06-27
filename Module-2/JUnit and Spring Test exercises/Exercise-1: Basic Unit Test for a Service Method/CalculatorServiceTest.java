import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void testAdd() {
        assertEquals(5, calculatorService.add(2, 3));
        assertEquals(0, calculatorService.add(-2, 2));
        assertEquals(-5, calculatorService.add(-2, -3));
    }
}
