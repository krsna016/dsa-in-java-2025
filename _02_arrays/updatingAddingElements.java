package _02_arrays;

public class updatingAddingElements {
    public void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        updatingAddingElements u = new updatingAddingElements();


        int[] arr = new int[5];
        u.printArray(arr); // Default value is 0
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[2] = 100; // Updating the value at index 2
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Also
        u.printArray(arr);
        // ArrayIndexOutOfBoundsException is thrown if you try to access an index that is out of bounds

        // To access the length of the array we can use the length property
        System.out.println("Length of the array: " + arr.length);
        // and last index is length - 1
        System.out.println("Last index of the array: " + (arr.length - 1));
        // Also:
        int[] arr1 = {6,7,3,2,1,8};
        u.printArray(arr1);
    }    
}
