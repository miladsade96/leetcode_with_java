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
     * @return array which contains the length of the new array(except val) and the new array
     */
    public static Object[] removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        Object[] result = new Object[2];
        result[0] = k;
        result[1] = nums;
        return result;
    }
}
