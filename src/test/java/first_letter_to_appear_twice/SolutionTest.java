package first_letter_to_appear_twice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    @ParameterizedTest
    @CsvSource({
            "abcdd, d",
            "abccbaacz, c",
            "abba, b"
    })
    void repeatedCharacter(String s, char c) {
        Assertions.assertEquals(c, Solution.repeatedCharacter(s));
    }
}
