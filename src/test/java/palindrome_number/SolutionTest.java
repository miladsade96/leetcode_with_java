package palindrome_number;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    private static Stream<Object[]> provideIsPalindromeTestCases() {
        return Stream.of(
                new Object[]{123, false},
                new Object[]{-11, false},
                new Object[]{123321, true}
        );
    }

    @ParameterizedTest
    @MethodSource("provideIsPalindromeTestCases")
    void isPalindrome(int input, boolean expected) {
        Assertions.assertEquals(expected, Solution.isPalindrome(input));
    }
}
