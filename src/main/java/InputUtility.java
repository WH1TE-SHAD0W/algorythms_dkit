import java.util.Scanner;


public class InputUtility {
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

    public static int getValidInteger(String prompt, int lowerBound, int upperBound) {
        Scanner input = new Scanner(System.in);

        int value = 0;
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
