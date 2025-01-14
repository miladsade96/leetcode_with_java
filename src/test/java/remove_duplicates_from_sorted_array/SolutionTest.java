package remove_duplicates_from_sorted_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    private static Stream<Object[]> provideRemoveDuplicatesFromSortedArray() {
        return Stream.of(
                new Object[]{new int[]{1, 1, 2}, new Object[]{2, new int[]{1, 2, 2}}},
                new Object[]{new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, new Object[]{5,
                        new int[]{0, 1, 2, 3, 4, 2, 2, 3, 3, 4}}}
        );
    }

    @ParameterizedTest
    @MethodSource("provideRemoveDuplicatesFromSortedArray")
    void removeDuplicatesFromSortedArray(int[] nums, Object[] expected) {
        Object[] result = Solution.removeDuplicatesFromSortedArray(nums);
        int actualNumberOfUniqueElements = (int) result[0];
        int[] actualModifiedNums = (int[]) result[1];
        int expectedNumberOfUniqueElements = (int) expected[0];
        int[] expectedModifiedNums = (int[]) expected[1];
        Assertions.assertEquals(expectedNumberOfUniqueElements, actualNumberOfUniqueElements);
        Assertions.assertArrayEquals(expectedModifiedNums, actualModifiedNums);
    }
}
