package missing_number;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    private static Stream<Object[]> provideMissingNumberTestCases() {
        return Stream.of(
                new Object[]{new int[]{3, 0, 1}, 2},
                new Object[]{new int[]{0, 1}, 2},
                new Object[]{new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}, 8}
        );
    }


    @ParameterizedTest
    @MethodSource("provideMissingNumberTestCases")
    void missingNumberTest(int[] input, int expected) {
        Assertions.assertEquals(expected, Solution.missingNumberV1(input));
        Assertions.assertEquals(expected, Solution.missingNumberV2(input));
    }
}
