package GroupAnagrams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class GroupAnagramsTest {
    @Test
    void solution() {
        List<String> input1 = List.of("eat", "tea", "ate", "bat", "tan", "nat");
        List<List<String>> expected1 = new ArrayList<>();
        expected1.add(Arrays.asList("eat", "tea", "ate"));
        expected1.add(List.of("bat"));
        expected1.add(Arrays.asList("tan", "nat"));
        Assertions.assertEquals(expected1, GroupAnagrams.solution(input1));

        List<String> input2 = List.of("a");
        List<List<String>> expected2 = new ArrayList<>();
        expected2.add(List.of("a"));
        Assertions.assertEquals(expected2, GroupAnagrams.solution(input2));

        List<String> input3 = List.of("");
        List<List<String>> expected3 = new ArrayList<>();
        expected3.add(List.of(""));
        Assertions.assertEquals(expected3, GroupAnagrams.solution(input3));
    }
}
