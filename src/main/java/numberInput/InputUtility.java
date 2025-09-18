package numberInput;

import java.util.Scanner;


public class InputUtility {
    /**
     * Gets a number from the user.
     * The user is required to keep entering data until a valid integer is supplied
     * @param prompt The prompt text displayed to the user
     * @return The first valid integer entered by the user
     */
    public static int getValidInteger(String prompt){
        Scanner input = new Scanner(System.in);

        int value;
        while(true) {
            System.out.println(prompt);
            if (input.hasNextInt()) {
                value = input.nextInt();
                break;
            } else {
                System.out.println("Please enter an _integer_");
                input.nextLine();
            }
        }
        return value;
    }
    /**
     * Gets a number from the user within specific boundaries
     * The user is required to keep entering data until a valid integer is supplied of int data and within the specified
     * limitations.
     * @param prompt The prompt text displayed to the user
     * @return The first valid integer entered by the user
     */
    public static int getValidInteger(String prompt, int lowerBound, int upperBound) {
        Scanner input = new Scanner(System.in);

        int value;
        while(true) {
            System.out.println(prompt);
            if (input.hasNextInt() ) {
                value = input.nextInt();
                if (value < lowerBound || value > upperBound) {
                    break;
                }
            } else {
                System.out.println("Please enter an _integer_");
                input.nextLine();
            }
        }
        return value;
    }
}
