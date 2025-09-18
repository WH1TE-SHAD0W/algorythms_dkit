public class CalcMax {
    /**
     * Gets a number from the user.
     *
     * The user is required to keep entering data until a valid integer is supplied
     * @param prompt The prompt text displayed to the user
     * @return The first valid integer entered by the user
     */
    // @staticmethod
    // def getValidInteger(prompt: str) -> int:


    public static int findMax(int[] numbers) {
        int max = 0;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }



    public static void main(String[] args) {
        int num1 = InputUtility.getValidInteger("Please enter an integer:", 1, 20);
        int num2 = InputUtility.getValidInteger("Please enter an integer:");
        int num3 = InputUtility.getValidInteger("Please enter an integer:");

        int[] nums = {num1, num2, num3};

        System.out.println(findMax(nums));

    }
}