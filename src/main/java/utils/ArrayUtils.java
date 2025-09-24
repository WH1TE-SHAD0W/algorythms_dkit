package utils;

public class ArrayUtils {
    /**
     * Displays all values within the array.
     * Loops through with a for loop and displays the index with value.
     * @param arr An array of integers
     */
    public static void displayArray(int[] arr) {
        for (int index : arr) {
            System.out.print(index + " ");
        }
        System.out.print("\n");
    }

    /**
     * Displays all values within the array.
     * Loops through with a for loop and displays the index with value.
     * @param arr An array of strings
     */
    static void displayArray(String[] arr) {
        for (String index : arr) {
            System.out.print(index + " ");
        }
        System.out.print("\n");
    }

    /**
     * Calculates the average.
     * Creates the sum with a for loop and the divides it with the length of input array.
     * @param arr An array of integers
     */
    static int calcArray(int[] arr) {
        int avg;
        int sum = 0;
        for (int index : arr) {
            sum += index;
        }
        avg = sum / arr.length;
        return avg;
    }

    static int  findMax(int[] arr) {
        int max = 0;
        for (int index : arr) {
            if(index > max)
                max = index;
        }
        return max;
    }

    static void main() {
        displayArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        displayArray(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"});
        System.out.println(calcArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        System.out.println('\n');

    }
}
