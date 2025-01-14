package two_sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    private static Stream<Object[]> provideTwoSumTestCases() {
        return Stream.of(
                new Object[]{new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}},
                new Object[]{new int[]{3, 2, 4}, 6, new int[]{1, 2}},
                new Object[]{new int[]{3, 3}, 6, new int[]{0, 1}}
        );
    }


    @ParameterizedTest
    @MethodSource("provideTwoSumTestCases")
    void twoSumTest(int[] nums, int target, int[] expected) {
        int[] result = Solution.twoSum(nums, target);
        Assertions.assertArrayEquals(expected, result);
    }
}
