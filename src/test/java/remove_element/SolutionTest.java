package remove_element;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static Stream<Object[]> provideRemoveElementTestCases() {
        return Stream.of(
                new Object[]{new int[]{3, 2, 2, 3}, 3, 2},
                new Object[]{new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, 5},
                new Object[]{new int[]{1}, 1, 0},
                new Object[]{new int[]{1}, 2, 1},
                new Object[]{new int[]{1, 1, 1, 1, 1}, 1, 0},
                new Object[]{new int[]{1, 1, 1, 1, 1}, 2, 5}
        );
    }

    @ParameterizedTest
    @MethodSource("provideRemoveElementTestCases")
    void testRemoveElement(int[] nums, int val, int expected) {
        int result = Solution.removeElement(nums, val);
        assertEquals(expected, result);
    }
}
