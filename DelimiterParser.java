import java.util.ArrayList;

public class DelimiterParser {

    // default delimiters
    String[] delimiters = new String[]{",", "\n"};
    String body = null;

    public String parse(String str) {

        if (str.startsWith("//") && str.indexOf("\n") > 0) {
            delimiters = new String[] {str.substring(2, str.indexOf("\n"))};
            body = str.substring(str.indexOf("\n") + 1);
        } else {
            body = str;
        }

        return body;
    }

    public String[] getDelimiters() {
        return delimiters;
    }

    public int[] split() throws Exception{

        if (body == null) {
            throw new Exception("Delimiters have not been parsed");
        }

        ArrayList<String> result = new ArrayList<>();
        int offset = 0;
        for (int i = 0; i < body.length(); i++) {
            char c = body.charAt(i);
            for (int j = 0; j < delimiters.length; j++) {
                if (delimiters[j].indexOf(c) == 0) {
                    result.add(body.substring(offset, i));
                    offset = i+1;
                }
            }
        }
        result.add(body.substring(offset));

        int[] numbers = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            numbers[i] = Integer.parseInt(result.get(i));
        }

        return numbers;
    }
}
