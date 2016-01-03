import org.junit.Test;

import static org.junit.Assert.assertEquals;
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

        DelimiterParser delimiterParser = new DelimiterParser();

        delimiterParser.parse("//;\n1;2");

        // assert statements
        assertArrayEquals(new String[]{";"}, delimiterParser.getDelimiters());
    }

    @Test
    public void testParseDelimitersBody() {

        DelimiterParser delimiters = new DelimiterParser();

        String body = delimiters.parse("//;\n1;2");

        // assert statements
        assertEquals("Parse delimiters and return body", "", body);
    }

    @Test
    public void testSplitDelimiters() {

        DelimiterParser delimiters = new DelimiterParser();
        // assert statements
        assertArrayEquals(new String[]{"1", "2", "3"}, delimiters.split("//;\n1;2;3"));
    }
}
