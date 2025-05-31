package _02_arrays;

public class removeEvens {

    public static void printElements(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int countOdds(int[] arr) {
        int oddCount = 0;
        for (int i: arr){
            if (i%2 != 0)
                oddCount++;
        }
        return oddCount;
    }

    public static int[] removeEvenFromArr(int[] arr) {
        int oddCount = countOdds(arr);

        int[] odds = new int[oddCount];

        int count = 0;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] % 2 != 0) {
                odds[count] = arr[i];
                count ++;
            }
        }
        return odds;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4,7,10,6,5};
        int[] result = removeEvenFromArr(arr);
        printElements(result);
    }
}