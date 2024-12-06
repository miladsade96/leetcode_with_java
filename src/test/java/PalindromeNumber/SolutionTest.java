package PalindromeNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isPalindrome() {
        int value1 = 123;
        boolean expected1 = false;
        Assertions.assertEquals(expected1, Solution.isPalindrome(value1));

        int value2 = -11;
        boolean expected2 = false;
        Assertions.assertEquals(expected2, Solution.isPalindrome(value2));

        int value3 = 123321;
        boolean expected3 = true;
        Assertions.assertEquals(expected3, Solution.isPalindrome(value3));
    }
}
