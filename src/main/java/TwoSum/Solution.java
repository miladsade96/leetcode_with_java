package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * Solution for 1.TwoSum challenge
     * BigO:
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param nums   Given an array of integers
     * @param target an integer value  - nums[i] + nums[j] will be target
     * @return An array of integers - [i, j]
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> data = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (data.containsKey(complement)) {
                return new int[]{data.get(complement), i};
            } else {
                data.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
