
public class DelimiterParser {

    public String[] parse(String str) {

        if (str.startsWith("//") && str.indexOf("\n") >= 0) {
            return new String[] {str.substring(2, str.indexOf("\n"))};
        }
        //return defaults
        return new String[] {",", "\n"};
    }

    public String[] split(String str) {

        return new String[] {};
    }
}
