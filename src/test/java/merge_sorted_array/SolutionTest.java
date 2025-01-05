package merge_sorted_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {

    private static Stream<Object[]> provideMergeSortedArrayTestCases() {
        return Stream.of(
                new Object[]{new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3, new int[]{1, 2, 2, 3, 5, 6}},
                new Object[]{new int[]{1}, 1, new int[]{}, 0, new int[]{1}},
                new Object[]{new int[]{0}, 0, new int[]{1}, 1, new int[]{1}}
        );
    }

    @ParameterizedTest
    @MethodSource("provideMergeSortedArrayTestCases")
    void mergeSortedArray(int[] nums1, int m, int[] nums2, int n, int[] expected) {
        int[] result = Solution.mergeSortedArray(nums1, m, nums2, n);
        Assertions.assertArrayEquals(expected, result);
    }
}
