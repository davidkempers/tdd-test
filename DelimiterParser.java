import java.util.ArrayList;

public class DelimiterParser {

    // default delimiters
    private String[] delimiters = new String[]{",", "\n"};
    private String body = null;

    private enum States {
        NONE, START, OPEN, CLOSE
    }
    private States state  = States.NONE;

    public String parse(String str) {

        body = str;
        String delimiter = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch(state) {
                case NONE:
                    if (c == '/') {
                        state = States.START;
                    } else {
                        // delimiter not set
                        return str;
                    }
                    break;
                case START:
                    if (c == '/') {
                        state = States.OPEN;
                    } else {
                        // invalid
                    }
                    break;
                case OPEN:
                    if (c == '[') {
                        // ignore open bracket
                    } else if (c == ']') {
                        state = States.CLOSE;
                    } else if (c == '\n') {
                        state = States.CLOSE;
                    } else {
                        delimiter += c;
                    }
                    break;
                case CLOSE:
                    // we are finished
                    delimiters = new String[] {delimiter};
                    if (c == '\n') {
                        body = str.substring(i + 1);
                    } else {
                        body = str.substring(i);
                    }
                    return body;
            }
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
        String regex = "";
        for (int j = 0; j < delimiters.length; j++) {
            String delimiter = "";
            for (int i = 0; i< delimiters[j].length(); i++) {
                delimiter += "\\" + delimiters[j].charAt(i);
            }
            regex = "|" + delimiter;
        }
        String[] result = body.split(regex.substring(1));

        int[] numbers = new int[result.length];
        for (int i = 0; i < result.length; i++) {
            if (!result[i].isEmpty()) {
                numbers[i] = Integer.parseInt(result[i]);
            }
        }

        return numbers;
    }
}
