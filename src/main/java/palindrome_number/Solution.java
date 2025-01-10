package palindrome_number;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
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
}
