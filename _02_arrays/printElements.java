package _02_arrays;

public class printElements {
    public static void printElement(int[] arr) {
        for (int i : arr) { // Using enhanced for loop also known as for-each loop
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        printElement(arr);
    }
}