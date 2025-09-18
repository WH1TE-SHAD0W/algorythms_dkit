package numberInput;

public class CalcMax {
    /**
     * Finds the highest value in array.
     * Takes in an array and loops through to find out the value of highest number.
     * @param numbers The prompt text displayed to the user
     * @return The max value
     */
    public static int findMax(int[] numbers) {
        int max = 0;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    static void main() {
        int num1 = InputUtility.getValidInteger("Please enter an integer:", 1, 20);
        int num2 = InputUtility.getValidInteger("Please enter an integer:");
        int num3 = InputUtility.getValidInteger("Please enter an integer:");

        int[] nums = {num1, num2, num3};

        System.out.println(findMax(nums));

    }
}