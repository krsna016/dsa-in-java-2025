package _02_arrays;

public class moveZerosToEnd {

    public static void getElements(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] zerosToEnd(int[] arr) {
        return new int[]{0};
    }

    public static void main(String[] args) {
        int[] arr = {0,5,6,0,4,0,0,7,9,22,0};
        getElements(zerosToEnd(arr));
    }
}