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

}
