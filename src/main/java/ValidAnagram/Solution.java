package ValidAnagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * Solution for 242.Valid Anagram - Approach #1
     * BigO:
     * Time complexity: O(n log n)
     * Space complexity: O(n)
     *
     * @param s first given string to check
     * @param t second given string to check
     * @return true or false, whether s and t are valid anagrams
     */
    public static boolean isAnagramV1(String s, String t) {
        if (s.length() != t.length()) return false;
        var sChars = s.toCharArray();
        var tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        for (int i = 0; i < sChars.length; i++) {
            if (sChars[i] != tChars[i]) return false;
        }
        return true;
    }

    /**
     * Solution for 242.Valid Anagram - Approach #2
     * BigO:
     * Time complexity: O(n log n)
     * Space complexity: O(n)
     *
     * @param s first given string to check
     * @param t second given string to check
     * @return true or false, whether s and t are valid anagrams
     */
    public static boolean isAnagramV2(String s, String t) {
        if (s.length() != t.length()) return false;
        var sChars = s.toCharArray();
        var tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return new String(sChars).equals(new String(tChars));
    }

    /**
     * Solution for 242.Valid Anagram - Approach #3
     * BigO:
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param s first given string to check
     * @param t second given string to check
     * @return true or false, whether s and t are valid anagrams
     */
    public static boolean isAnagramV3(String s, String t) {
        var counts1 = calculateCountsHelper(s);
        var counts2 = calculateCountsHelper(t);
        return counts1.equals(counts2);
    }

    private static Map<Character, Integer> calculateCountsHelper(String str) {
        Map<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ithChar = str.charAt(i);
            if (counts.containsKey(ithChar)) {
                counts.put(ithChar, counts.get(ithChar) + 1);
            } else {
                counts.put(ithChar, 1);
            }
        }
        return counts;
    }
}
