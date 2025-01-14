package remove_duplicates_from_sorted_array;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Solution {
    /**
     * Solution for 26.Remove Duplicates from Sorted Array Leetcode Challenge
     * BigO:
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param nums Given array of integer numbers
     * @return k --> Number of unique elements, nums[] --> modified(sorted) array based on unique elements
     */
    public static Object[] removeDuplicatesFromSortedArray(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return new Object[]{k, nums};
    }
}
