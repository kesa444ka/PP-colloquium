import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class FibonacciGeneratorTest {

    @Test
    public void testGenerateFibonacci_ValidInput() {
        List<Integer> result = FibonacciGenerator.generateFibonacci(1);
        assertEquals(List.of(0), result);

        result = FibonacciGenerator.generateFibonacci(2);
        assertEquals(List.of(0, 1), result);

        result = FibonacciGenerator.generateFibonacci(5);
        assertEquals(List.of(0, 1, 1, 2, 3), result);

        result = FibonacciGenerator.generateFibonacci(10);
        assertEquals(List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34), result);
    }

    @Test
    public void testGenerateFibonacci_NegativeInput() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> FibonacciGenerator.generateFibonacci(-1));
        assertEquals("n должно быть натуральным числом (n > 0).", exception.getMessage());
    }

    @Test
    public void testGenerateFibonacci_ZeroInput() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> FibonacciGenerator.generateFibonacci(0));
        assertEquals("n должно быть натуральным числом (n > 0).", exception.getMessage());
    }
}