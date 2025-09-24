package apps;

import numberInput.InputUtility;
import utils.ArrayUtils;

import javax.management.BadStringOperationException;
import java.util.Scanner;

public class ArrayManipulation {
    static void main() {
        Scanner input = new Scanner(System.in);
        int[] intArray = new int[0];
        for (int i = 0; i < 10; i++) {
            intArray[i] = InputUtility.getValidInteger("Please enter an integer:", 1, 100);
        }
        ArrayUtils.displayArray(intArray);
        System.out.println(ArrayUtils.findMax(intArray));
        System.out.println(ArrayUtils.findMin(intArray));

        String[] stringArray = new String[0];
        for (int i = 0; i < 10; i++) {
            stringArray[i] = input.nextLine();
        }

        System.out.println(ArrayUtils.findMax(stringArray));
        System.out.println(ArrayUtils.findMin(stringArray));

    }
}
