package longest_common_prefix;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Solution {
    /**
     * Solution for 14.longest Common Prefix LeetCode Challenge
     * </br>
     * Big O: </br>
     * Time complexity: O(n * m) </br>
     * Space complexity: O(1)
     *
     * @param strs List of strings to check the longest common prefix
     * @return The longest common prefix string
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
