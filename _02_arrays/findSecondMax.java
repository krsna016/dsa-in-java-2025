package _02_arrays;

public class findSecondMax {
    public static int findSecondMaxNum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        for (int i: arr) {
            if (i > max) {
                second_max = max;
                max = i;
            } else if (i > second_max && i != max) {
                // e.g. for arr = {5, 3, 8, 6}, when i = 6, max = 8, second_max = 5 and i > second_max but less than or not equals to max, Hence this condition is necessary
                // e.g. for arr = {1, 5, 3, 9}, when i = 3, max = 5, second_max = 1 and i > second_max but less than or not equals to max, so second_max becomes 3
                second_max = i;
            }
        }
        return second_max;
    }
    public static void main(String[] args) {
        int[] arr = {22,34,55,11,33,53,121,63};
        System.out.println("Second Max = " + findSecondMaxNum(arr));
    }
}
