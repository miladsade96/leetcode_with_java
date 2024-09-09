package GroupAnagrams;

import java.util.*;

public class Solution {
    /**
     * Solution for 49.GroupAnagrams LeetCode Challenge
     *
     * Big O:
     *  Time complexity: O(n * m * log(m))
     *  Space complexity: O(n * m)
     *
     * @param strs List of strings to check and group the anagrams
     * @return List of list of string that considered as grouped anagrams
     */
    public static List<List<String>> groupAnagrams(List<String> strs) {
        Map<String, List<String>> storage = new HashMap<>();
        for (var word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedChars = String.valueOf(chars);
            storage.computeIfAbsent(sortedChars, unused -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(storage.values());
    }
}
