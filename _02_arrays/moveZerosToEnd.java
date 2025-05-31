package _02_arrays;

import java.util.Arrays;

public class moveZerosToEnd {

    public static int[] zerosToEnd(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }if (arr[j] != 0)
                j++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0,5,6,0,4,0,0,7,9,22,0};
        System.out.println(Arrays.toString(zerosToEnd(arr)));
    }
}