
public class StringCalculator {

    public int add(String numbers) throws Exception {

        if (numbers.isEmpty()) {
            return 0;
        }

        DelimiterParser delimiterParser = new DelimiterParser();

        delimiterParser.parse(numbers);

        int nums[] = delimiterParser.split();

        int sum = 0;
        for (int i=0; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum;
    }
}
