import java.util.Scanner;

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
    public static int getValidInteger(String prompt){
        Scanner input = new Scanner(System.in);

        int value = 0;
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

    public static int findMax(int input1,  int input2,  int input3) {


        int max = 0;
        if (input1 > input2 && input1 > input3) {
            max = input1;
        } else if (input2 > input1 && input2 > input3) {
            max = input2;
        } else if (input3 > input1 && input3 > input2) {
            max = input3;
        }
        System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
        int num1 = getValidInteger("Please enter an integer:");
        int num2 = getValidInteger("Please enter an integer:");
        int num3 = getValidInteger("Please enter an integer:");

        findMax(num1, num2, num3);
    }
}