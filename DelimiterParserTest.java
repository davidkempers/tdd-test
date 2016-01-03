import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertArrayEquals;

public class DelimiterParserTest {

    @Test
    public void testCreateDelimiterParserObject() {

        DelimiterParser delimiters = new DelimiterParser();
        // assert statements
        assertNotNull(delimiters);
    }

    @Test
    public void testParseDelimiters() {

        DelimiterParser delimiters = new DelimiterParser();
        // assert statements
        assertArrayEquals(new String[]{"1","2","3"}, delimiters.parse("1,2\n3"));
    }

}
