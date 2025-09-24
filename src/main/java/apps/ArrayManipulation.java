package apps;

import numberInput.InputUtility;
import utils.ArrayUtils;

import javax.management.BadStringOperationException;

public class ArrayManipulation {
    static void main() {
        int[] intArray = new int[0];
        for (int i = 0; i < 10; i++) {
            intArray[i] = InputUtility.getValidInteger("Please enter an integer:", 1, 100);
        }
        ArrayUtils.displayArray(intArray);

    }
}
