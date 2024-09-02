package GroupAnagrams;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> solution(List<String> strs) {
        Map<String, List<String>> storage = new HashMap<>();
        for (var word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedChars = String.valueOf(chars);
            storage.computeIfAbsent(sortedChars, _ -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(storage.values());
    }
}
