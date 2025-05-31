package _02_arrays;

public class findMinVal {

    public static int getMinValue(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i: arr) {
            if (i < min)
                min = i;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {3,7,1,77,32,0,-4,8,5,3};
        System.out.println("min value = " + getMinValue(arr));
    }
}