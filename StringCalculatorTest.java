import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class StringCalculatorTest {

    StringCalculator calculator;

    @Before
    public void setup() {

        calculator = new StringCalculator();
    }

    @Test
    public void testCreateStringCalculatorObject() {

        // assert statements
        assertNotNull(calculator);
    }

    @Test
    public void testEmptyStringShouldReturnZero() {

        // assert statements
        assertEquals("\"\" must be 0", 0, calculator.add(""));
    }

    @Test
    public void testAddSingleNumber() {

        // assert statements
        assertEquals("\"1\" must be 1", 1, calculator.add("1"));
        assertEquals("\"2\" must be 2", 2, calculator.add("2"));
    }

    @Test
    public void testAddSingleNumberFalse() {

        // assert statements
        assertNotEquals ("\"1\" must not be 0", 0, calculator.add("1"));
        assertNotEquals ("\"2\" must not be 1", 1, calculator.add("2"));
    }

    @Test
    public void testAddTwoNumbers() {

        // assert statements
        assertEquals("\"1,2\" must be 3", 3, calculator.add("1,2"));
    }

    @Test
    public void testOnePositiveAndOneNegativeNumbers() {

        // assert statements
        assertEquals("\"1,-2\" must be -1", -1, calculator.add("1,-2"));
    }

    @Test
    public void testAddTwoNegativeNumbers() {

        // assert statements
        assertEquals("\"-1,-2\" must be -3", -3, calculator.add("-1,-2"));
    }

    @Test
    public void testAddMultipleNumbers() {

        // assert statements
        assertEquals("\"1,2,3\" must be 6", 6, calculator.add("1,2,3"));
    }

    @Test
    public void testAddMultipleNumbersMultipleDelimiters() {

        // assert statements
        assertEquals("\"1,2\n3\" must be 6", 6, calculator.add("1,2\n3"));
    }
}

