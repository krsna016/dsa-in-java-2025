package _02_arrays;

import java.util.Arrays;

public class resizeAnArray {
    public static int[] resizeTheArr(int[] arr, int capacity) {
        int[] resized = new int[capacity];
        for (int i = 0; i < arr.length; i++)
            resized[i] = arr[i];
        return resized;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        System.out.println("Resized = " + Arrays.toString(resizeTheArr(arr, 10)));
    }
}