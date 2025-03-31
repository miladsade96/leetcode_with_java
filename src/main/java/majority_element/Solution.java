package majority_element;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Solution {
    /**
     * Solution for 169.Majority Element LeetCode Challenge
     * </br>
     * Big O: </br>
     * Time complexity: O(n) </br>
     * Space complexity: O(n)
     *
     * @param nums array of integers
     * @return majority element
     */
    public static int majorityElementV1(int[] nums) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int num : nums) {
            if (!occurrences.containsKey(num)) occurrences.put(num, 1);
            else occurrences.put(num, occurrences.get(num) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() > (nums.length / 2)) return entry.getKey();
        }
        return -1;
    }

    /**
     * Solution for 169.Majority Element LeetCode Challenge
     * </br>
     * Big O: </br>
     * Time complexity: O(n) </br>
     * Space complexity: O(1)
     *
     * @param nums array of integers
     * @return majority element
     */
    public static int majorityElementV2(int[] nums) {
        int count = 0;
        int result = 0;

        for (int num : nums) {
            if (count == 0) {
                result = num;
            }
            if (num == result) count++;
            else count--;
        }

        return result;
    }
}
