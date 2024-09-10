package FirstLetterToAppearTwice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    void repeatedCharacter() {
        String input1 = "abcdd";
        char expected1 = 'd';
        Assertions.assertEquals(expected1, Solution.repeatedCharacter(input1));

        String input2 = "abccbaacz";
        char expected2 = 'c';
        Assertions.assertEquals(expected2, Solution.repeatedCharacter(input2));

        String input3 = "abba";
        char expected3 = 'b';
        Assertions.assertEquals(expected3, Solution.repeatedCharacter(input3));
    }
}
