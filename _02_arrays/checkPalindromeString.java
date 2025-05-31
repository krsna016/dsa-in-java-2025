package _02_arrays;

public class checkPalindromeString {
    public static boolean checkPalindrome(String arr) {
        char[] chars = arr.toLowerCase().toCharArray();
        int start = 0;
        int end = chars.length -1;
        while (start<end) {
            if (chars[start] != chars[end])
                return false;
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String name = "Madam";
        String name1 = "Hello";
        System.out.println(checkPalindrome(name1));
    }
}