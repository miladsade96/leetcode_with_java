package MissingNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    void missingNumberTest() {
        int[] input1 = {3, 0, 1};
        int[] input2 = {0, 1};
        int[] input3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        int expected1 = 2;
        int expected2 = 2;
        int expected3 = 8;

        Assertions.assertEquals(expected1, Solution.missingNumberV1(input1));
        Assertions.assertEquals(expected2, Solution.missingNumberV1(input2));
        Assertions.assertEquals(expected3, Solution.missingNumberV1(input3));

        Assertions.assertEquals(expected1, Solution.missingNumberV2(input1));
        Assertions.assertEquals(expected2, Solution.missingNumberV2(input2));
        Assertions.assertEquals(expected3, Solution.missingNumberV2(input3));

    }
}
