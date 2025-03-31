package majority_element;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {

    private static Stream<Object> provideTestCasesForMajorityElement() {
        return Stream.of(
                new Object[]{new int[]{3, 2, 3}, 3},
                new Object[]{new int[]{2, 2, 1, 1, 1, 2, 2}, 2}
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCasesForMajorityElement")
    void testMajorityElementV1(int[] nums, int expected) {
        int result = Solution.majorityElementV1(nums);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("provideTestCasesForMajorityElement")
    void testMajorityElementV2(int[] nums, int expected) {
        int result = Solution.majorityElementV2(nums);
        Assertions.assertEquals(expected, result);
    }
}
