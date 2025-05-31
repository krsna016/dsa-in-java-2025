package _02_arrays;

// Given an array of n distinct numbers in the range from 1 to n, we need to find the missing number.
public class findMissingNum {
    public static int findMissingNumber(int[] arr) {
        int grandTotal = (arr.length+1) * ((arr.length+1) + 1)/2; // That is sum of first n naturals, We did +1 since 1 value is already missing
        int total = 0;
        for (int i: arr)
            total += i;
        return grandTotal - total;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,1,8,6,3,7};
        System.out.println("Missing Value = " + findMissingNumber(arr));
    }
}