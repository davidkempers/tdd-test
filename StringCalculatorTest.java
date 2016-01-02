import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class StringCalculatorTest {

    @Test
    public void testCreateStringCalculatorObject() {

        StringCalculator calculator = new StringCalculator();
        // assert statements
        assertNotNull(calculator);
    }

}

