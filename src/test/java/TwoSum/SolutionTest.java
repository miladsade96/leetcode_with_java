package TwoSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    void twoSumTest() {
        var nums1 = new int[]{2, 7, 11, 15};
        var target1 = 9;
        var expected1 = new int[]{0, 1};
        Assertions.assertArrayEquals(expected1, Solution.twoSum(nums1, target1));

        var nums2 = new int[]{3, 2, 4};
        var target2 = 6;
        var expected2 = new int[]{1, 2};
        Assertions.assertArrayEquals(expected2, Solution.twoSum(nums2, target2));

        var nums3 = new int[]{3, 3};
        var target3 = 6;
        var expected3 = new int[]{0, 1};
        Assertions.assertArrayEquals(expected3, Solution.twoSum(nums3, target3));
    }
}
