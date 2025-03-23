package concatenation_of_array;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Solution {
    /**
     * Solution for 1929.Concatenation of Array
     * Big O:
     * Time complexity: O(n)
     * Space complexity: O(2n) --> O(n)
     *
     * @param nums an integer array
     * @return an array with nums concatenated to itself
     */
    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[i + nums.length] = nums[i];
        }
        return result;
    }
}
