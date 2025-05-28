public class sumOfFirstNNaturals {
   public static int sumNNaturals(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
   } 

   public static int sumNaturals(int n) { // More Faster than above algorithm
        return n * (n+1)/2;
   }

   public static void main(String[] args) {
        int n = 10;
        System.out.println("The sum of first "+n+" numbers is : "+sumNNaturals(n));
        System.out.println("The sum of first "+n+" numbers is : "+sumNaturals(n));
   }
}
