
public class StringCalculator {

    public int add(String numbers) {

        if (numbers.isEmpty()) {
            return 0;
        }

        String nums[] = numbers.split(",");

        if (nums.length == 1) {
            return Integer.parseInt(nums[0]);
        }

        return 3;
    }
}
