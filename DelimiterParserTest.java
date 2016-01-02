import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class DelimiterParserTest {

    @Test
    public void testCreateDelimiterParserObject() {

        DelimiterParser delimiters = new DelimiterParser();
        // assert statements
        assertNotNull(delimiters);
    }
}
