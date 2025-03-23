package concatenation_of_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    private static Stream<Object[]> provideConcatenationTestCases() {
        return Stream.of(
                new Object[]{new int[]{1}, new int[]{1, 1}},
                new Object[]{new int[]{1, 2}, new int[]{1, 2, 1, 2}},
                new Object[]{new int[]{1, 2, 1}, new int[]{1, 2, 1, 1, 2, 1}},
                new Object[]{new int[]{1, 3, 2, 1}, new int[]{1, 3, 2, 1, 1, 3, 2, 1}}
        );
    }

    @ParameterizedTest
    @MethodSource("provideConcatenationTestCases")
    void testConcatenation(int[] nums, int[] expected) {
        int[] result = Solution.getConcatenation(nums);
        Assertions.assertArrayEquals(expected, result);
    }
}
