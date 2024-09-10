package FirstLetterToAppearTwice;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * Solution for 2351.First Letter to Appear Twice Challenge
     * Big O:
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param s consisting of lowercase English letters
     * @return the first letter to appear twice
     */
    public static char repeatedCharacter(String s) {
        Map<Character, Boolean> store = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char character : chars) {
            if (store.containsKey(character)) return character;
            else store.put(character, true);
        }
        return 0;
    }
}
