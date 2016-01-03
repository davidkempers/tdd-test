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
        assertArrayEquals(new String[]{";"}, delimiters.parse("//;\n1;2"));
        assertArrayEquals(new String[]{"*"}, delimiters.parse("//*\n1;2"));
    }

    @Test
    public void testSplitDelimiters() {

        DelimiterParser delimiters = new DelimiterParser();
        // assert statements
        assertArrayEquals(new String[]{"1", "2", "3"}, delimiters.split("//;\n1;2;3"));
    }
}
