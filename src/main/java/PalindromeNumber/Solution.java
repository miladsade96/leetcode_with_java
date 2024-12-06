package PalindromeNumber;

public class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversedNumber = 0;
        int originalNumber = x;

        while (x > 0) {
            reversedNumber = reversedNumber * 10 + x % 10;
            x = x / 10;
        }

        return originalNumber == reversedNumber;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(1234321));
    }
}
