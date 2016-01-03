import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertArrayEquals;

public class DelimiterParserTest {


    DelimiterParser delimiterParser;

    @Before
    public void setup() {

        delimiterParser = new DelimiterParser();
    }

    @Test
    public void testCreateDelimiterParserObject() {

        // assert statements
        assertNotNull(delimiterParser);
    }

    @Test
    public void testParseDelimiters() {

        delimiterParser.parse("//;\n1;2");

        // assert statements
        assertArrayEquals(new String[]{";"}, delimiterParser.getDelimiters());
    }

    @Test
    public void testParseDelimitersBody() {

        String body = delimiterParser.parse("//;\n1;2");

        // assert statements
        assertEquals("Parse delimiters and return body", "1;2", body);
    }

    @Test
    public void testSplitDelimiters() throws Exception {

        delimiterParser.parse("//;\n1;2;3");

        // assert statements
        assertArrayEquals(new int[]{1, 2, 3}, delimiterParser.split());
    }
    @Test
    public void testSplitDelimitersAnyLength() throws Exception {

        delimiterParser.parse("//[**]\n1**2**3");

        // assert statements
        assertArrayEquals(new int[]{1, 2, 3}, delimiterParser.split());
    }
}
