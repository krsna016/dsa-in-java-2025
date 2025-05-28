public class findAvgOfThreeNums {

    public float findAvg(int a, int b, int c) { // This is a non static method
        int sum = a + b + c;
        float avg = sum / 3.0f; // Ensure floating-point division
        return avg;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        findAvgOfThreeNums main = new findAvgOfThreeNums(); // create object to call non-static method
        float average = main.findAvg(num1, num2, num3);
        System.out.println("Average: " + average);
    }
}