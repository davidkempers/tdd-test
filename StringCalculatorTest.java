import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void testCreateStringCalculatorObject() {

        StringCalculator calculator = new StringCalculator();
        // assert statements
        assertNotNull(calculator);
    }

    @Test
    public void testEmptyStringShouldReturnZero() {

        StringCalculator calculator = new StringCalculator();
        // assert statements
        assertEquals("\"\" must be 0", 0, calculator.add(""));
    }

    @Test
    public void testAddSingleNumber() {

        StringCalculator calculator = new StringCalculator();
        // assert statements
        assertEquals("\"1\" must be 1", 1, calculator.add("1"));
    }
}

