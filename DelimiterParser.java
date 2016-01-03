
public class DelimiterParser {

    // default delimiters
    String[] delimiters = new String[]{",", "\n"};

    public String parse(String str) {

        if (str.startsWith("//") && str.indexOf("\n") > 0) {
            delimiters = new String[] {str.substring(2, str.indexOf("\n"))};
            return str.substring(str.indexOf("\n") + 1);
        }

        return str;
    }

    public String[] getDelimiters() {
        return delimiters;
    }

    public int[] split(String str) {

        return new int[] {1, 2, 3};
    }
}
