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
        System.out.println("Maximum int in array: " + ArrayUtils.findMax(intArray));
        System.out.println("Minimum int: " + ArrayUtils.findMin(intArray));
        System.out.println("Count of instances of 5: " + ArrayUtils.count(intArray, 5));
        System.out.println("Most frequent number: " + ArrayUtils.getMostFrequent(intArray));
        System.out.println("Count greater than 5: " + ArrayUtils.countGreater(intArray, 5));
        System.out.println("Count greater than average: " + ArrayUtils.countGreaterThanAverage(intArray));

        String[] stringArray = new String[0];
        for (int i = 0; i < 10; i++) {
            stringArray[i] = input.nextLine();
        }

        System.out.println(ArrayUtils.findMax(stringArray));
        System.out.println(ArrayUtils.findMin(stringArray));
    }
}
