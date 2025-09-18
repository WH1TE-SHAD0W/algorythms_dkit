package utils;

public class ArrayUtils {
    /**
     * Displays all values within the array.
     * Loops through with a for loop and displays the index with value.
     * @param arr An array of integers
     */
    static void displayArray(int[] arr) {
        for (int index : arr) {
            System.out.print(index + " ");
        }
    }
}
