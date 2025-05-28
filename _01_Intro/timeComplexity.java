public class timeComplexity {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        timeComplexity tc = new timeComplexity();
        System.out.println("sum = " + tc.findSum1(99999));
        System.out.println("Time taken = " + (System.currentTimeMillis() - now) + " milliseconds for findSum1()");

        now = System.currentTimeMillis();
        System.out.println("sum  = " + tc.findSum2(99999));
        System.out.println("Time taken = " + (System.currentTimeMillis() - now) + " milliseconds for findSum2()");
    }
    public long findSum1(int n){
        return (long)n* (n+1)/2;
    }
    public long findSum2(int n){
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
