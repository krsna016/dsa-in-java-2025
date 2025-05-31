package _02_arrays;

import java.util.Arrays;

public class moveZerosToEnd {

    /**
     * This function moves all zeros in the array to the end.
     * It keeps the order of the other numbers the same.
     * It uses two pointers: one to find non-zero numbers,
     * and one to track where to put the next non-zero number.
     * When a non-zero is found, it is swapped with a zero at the tracked position.
     */
    public static int[] zerosToEnd(int[] arr) {
        int j = 0; // Pointer to place the next non-zero element
        for (int i = 0; i < arr.length; i++) { // Pointer to traverse the array
            if (arr[i] != 0 && arr[j] == 0) {
                // Swap non-zero at i with zero at j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0)
                j++; // Move j to the next zero
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0,5,6,0,4,0,0,7,9,22,0};
        System.out.println(Arrays.toString(zerosToEnd(arr)));
    }
}