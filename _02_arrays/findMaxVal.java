package _02_arrays;

public class findMaxVal {
    public static int findMaxValInArr(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i: arr) {
            if (i > max)
                max = i;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,33,232,5,8,12,44};
        System.out.println("Max value = " + findMaxValInArr(arr));
    }
}