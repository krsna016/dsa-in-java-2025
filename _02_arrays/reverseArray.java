package _02_arrays;

public class reverseArray {

    public static void printElements(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] reverseTheArr(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

//    // We can also use two pointers: start and end, to reverse the array.
//    public static int[] reverseTheArr(int[] arr) {
//        int start = 0, end = arr.length - 1;
//        while (start < end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//        return arr;
//    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        int[] result = reverseTheArr(arr);
        printElements(result);
    }
}