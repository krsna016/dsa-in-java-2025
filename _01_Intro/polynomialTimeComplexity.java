public class polynomialTimeComplexity {
    public static void main(String[] args) {
        print(3);
    }
    public static void print(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println("i = "+i+", j = "+j);   
            }
            System.out.println("End of Inner For-Loop");
        }
        System.out.println("End of outer For-Loop");
    }
}