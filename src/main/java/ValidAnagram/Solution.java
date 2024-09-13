package ValidAnagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
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

    public static boolean isAnagramV2(String s, String t) {
        if (s.length() != t.length()) return false;
        var sChars = s.toCharArray();
        var tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return new String(sChars).equals(new String(tChars));
    }

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
