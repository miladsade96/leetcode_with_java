package remove_element;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Solution {

    /**
     * Solution for 27.RemoveElement LeetCode Challenge
     * BigO:
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     *
     * @param nums array of integers
     * @param val  integer
     * @return int k
     */
    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
