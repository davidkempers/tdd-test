
public class StringCalculator {

    public int add(String numbers) throws Exception {

        if (numbers.isEmpty()) {
            return 0;
        }

        DelimiterParser delimiterParser = new DelimiterParser();

        delimiterParser.parse(numbers);

        int nums[] = filterNumbers(delimiterParser.split());

        int sum = 0;
        for (int i=0; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum;
    }

    private int[] filterNumbers(int[] numbers) throws NegativesNotAllowedException{
        String errors = "";
        for (int i=0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                errors +=  ", " + new Integer(numbers[i]).toString();
            } else if (numbers[i] > 1000) {
                numbers[i] = 0;
            }
        }
        if (!errors.isEmpty()) {
            throw new NegativesNotAllowedException("Invalid negative numbers: " + errors.substring(2));
        }

        return numbers;
    }
}
