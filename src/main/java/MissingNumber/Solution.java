package MissingNumber;

import java.util.Arrays;

public class Solution {
    public static int missingNumberV1(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for (var item : nums) {
            if (count != item) return count;
            else count++;
        }
        return count;
    }
}
